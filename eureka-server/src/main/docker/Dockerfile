FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom -Dspring.cloud.inetutils.ignored-interfaces[0]=eth0","-jar","/eureka-server.jar"]