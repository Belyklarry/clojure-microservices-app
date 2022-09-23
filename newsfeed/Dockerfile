FROM clojure:temurin-8-boot-2.8.3-alpine

WORKDIR /

COPY /target/uberjar/newsfeed.jar ./

EXPOSE 8080

ENV APP_PORT 8080

CMD java -jar newsfeed.jar

