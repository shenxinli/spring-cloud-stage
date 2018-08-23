FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY service-ribbon-0.0.1-SNAPSHOT.jar service-ribbon.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service-ribbon.jar"]