FROM alpine

RUN apk --update add openjdk17

WORKDIR /java_app/src

COPY src/ /java_app/src/

RUN javac Main.java

CMD java Main