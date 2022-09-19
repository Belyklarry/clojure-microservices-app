FROM clojure:temurin-8-boot-2.8.3-alpine

WORKDIR /

COPY /target/uberjar/front-end.jar ./

LABEL app=front-end

EXPOSE 8080

CMD java -jar front-end.jar

