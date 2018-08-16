package de.codecentric.boot.admin.server.notify;

import de.codecentric.boot.admin.server.domain.entities.InstanceRepository;
import reactor.core.publisher.Mono;

public class MyRemindingNotifier extends RemindingNotifier {

    public MyRemindingNotifier(Notifier delegate, InstanceRepository repository) {
        super(delegate, repository);
    }

    @Override
    public Mono<Void> sendReminders() {
        return super.sendReminders();
    }
}
