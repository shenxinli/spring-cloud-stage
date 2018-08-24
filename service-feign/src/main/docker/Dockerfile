FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY service-feign-0.0.1-SNAPSHOT.jar service-feign.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service-feign.jar"]