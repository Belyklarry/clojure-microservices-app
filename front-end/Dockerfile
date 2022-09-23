#FROM clojure:temurin-8-boot-2.8.3-alpine

FROM circleci/python:3.9-node-browsers

WORKDIR /

COPY /target/uberjar/front-end.jar ./

COPY /public/ ./public/

LABEL app=front-end

ENV APP_PORT 8080

RUN /public/serve.py &

ENV STATIC_URL localhost:8000

EXPOSE 8080

CMD java -jar front-end.jar

