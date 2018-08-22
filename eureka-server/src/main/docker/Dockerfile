FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom -Dspring.cloud.inetutils.preferred-networks: 172.17.0.","-jar","/eureka-server.jar"]