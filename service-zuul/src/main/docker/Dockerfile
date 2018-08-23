FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY service-zuul-0.0.1-SNAPSHOT.jar service-zuul.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service-zuul.jar"]