FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY service-hi-0.0.1-SNAPSHOT.jar service-hi.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service-hi.jar"]