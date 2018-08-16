package com.chinaway.springcloud.admin.server;

import de.codecentric.boot.admin.server.domain.entities.EventsourcingInstanceRepository;
import de.codecentric.boot.admin.server.domain.entities.InstanceRepository;
import de.codecentric.boot.admin.server.eventstore.InstanceEventStore;
import de.codecentric.boot.admin.server.notify.MyRemindingNotifier;
import de.codecentric.boot.admin.server.notify.Notifier;
import de.codecentric.boot.admin.server.notify.filter.FilteringNotifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.Duration;

@EnableScheduling
public class NotifierConfiguration {
    @Autowired
    private Notifier delegate;
    private InstanceEventStore eventStore;

    public NotifierConfiguration(InstanceEventStore eventStore){
        this.eventStore = eventStore;
    }

    @Bean
    public InstanceRepository instanceRepository(){
        return new EventsourcingInstanceRepository(eventStore);
    }

    @Bean
    public FilteringNotifier filteringNotifier() {
        return new FilteringNotifier(delegate, instanceRepository());
    }

    @Bean
    @Primary
    public MyRemindingNotifier remindingNotifier() {
        MyRemindingNotifier notifier = new MyRemindingNotifier(delegate, instanceRepository());
        notifier.setReminderPeriod(Duration.ofMillis(10));
        return notifier;
    }

    @Scheduled(fixedRate = 1_000L)
    public void remind() {
        remindingNotifier().sendReminders();
    }
}
