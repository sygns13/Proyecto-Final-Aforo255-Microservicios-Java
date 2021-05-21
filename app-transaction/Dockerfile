FROM openjdk:13
EXPOSE 8082
ADD ./target/app-transaction-0.0.1.jar    app-transaction.jar
ENTRYPOINT ["java","-jar","/app-transaction.jar"]