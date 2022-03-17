FROM openjdk:14-jdk-alpine
EXPOSE 9090
ADD target/MailNotifier-0.0.1-SNAPSHOT.jar MailNotifier-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/MailNotifier-0.0.1-SNAPSHOT.jar"]