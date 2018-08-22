FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY config-server-0.0.1-SNAPSHOT.jar config-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom -Dspring.cloud.inetutils.preferred-networks: 172.18.","-jar","/config-server.jar"]