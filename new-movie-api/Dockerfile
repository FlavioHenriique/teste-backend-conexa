FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} new-movie-api.jar
ENTRYPOINT ["java","-jar","/new-movie-api.jar"]