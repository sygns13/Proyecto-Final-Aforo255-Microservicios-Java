FROM openjdk:13
EXPOSE 8888
ADD ./target/app-configserver-0.0.1.jar    app-configserver.jar
ENTRYPOINT ["java","-jar","/app-configserver.jar"]