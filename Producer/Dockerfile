FROM maven:3.8.1-jdk-8 AS build
WORKDIR /home/app
COPY . /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:8-alpine
COPY --from=build /home/app/target/Producer-v1.jar Producer.jar
ENTRYPOINT ["java","-jar","/Producer.jar"]