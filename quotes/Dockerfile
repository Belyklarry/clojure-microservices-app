FROM clojure:temurin-8-boot-2.8.3-alpine

WORKDIR /

LABEL app=newsfeed

COPY /target/uberjar/quotes.jar ./

EXPOSE 8080

CMD java -jar quotes.jar

