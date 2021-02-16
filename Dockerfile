FROM openjdk:11-jdk-oracle

EXPOSE 8080

ADD ./infrastructure/rest-client/target/*.jar app.jar

ENV MYSQL_HOST localhost

ENTRYPOINT ["java", "-jar", "/app.jar"]