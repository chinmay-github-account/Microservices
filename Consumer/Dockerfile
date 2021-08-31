# FROM openjdk:11.0.7-jre-slim
FROM openjdk:8-alpine
COPY ./target/Consumer-v1.jar Consumer.jar
ENTRYPOINT ["java","-jar","/Consumer.jar"]