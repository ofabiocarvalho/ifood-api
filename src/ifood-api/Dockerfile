FROM openjdk:8u171-jdk-alpine3.8
LABEL maintainer="ofabiocarvalho@gmail.com"

ENV LANG C.UTF-8

RUN apk add --update bash

ADD target/ifood-api-0.0.1-SNAPSHOT.jar /app/app.jar
ADD src/main/resources/restaurante-data.json /app/restaurante-data.json

CMD java -jar /app/app.jar