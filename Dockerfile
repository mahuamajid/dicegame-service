FROM maven:3.9.9-eclipse-temurin-21 AS build

RUN mkdir -p /usr/local/apps/dicegame-service
WORKDIR /usr/local/apps/dicegame-service

ADD target/dicegame-service-0.0.1.jar .
ENTRYPOINT ["java","-jar","dicegame-service-0.0.1.jar"]


# docker build -t dicegame-service .