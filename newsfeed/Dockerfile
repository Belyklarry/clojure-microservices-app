FROM clojure:temurin-8-boot-2.8.3-alpine

WORKDIR /

LABEL app=quotes

COPY /target/uberjar/newsfeed.jar ./

EXPOSE 8080

CMD java -jar newsfeed.jar

