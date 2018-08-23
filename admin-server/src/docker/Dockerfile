FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY admin-server-0.0.1-SNAPSHOT.jar admin-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/admin-server.jar"]