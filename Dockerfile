FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} core-0.0.1-SNAPSHOT.jar
CMD mkdir /tmp/data
WORKDIR /tmp/data
ADD events.json /tmp/data
ENTRYPOINT ["java","-jar","/core-0.0.1-SNAPSHOT.jar"]
