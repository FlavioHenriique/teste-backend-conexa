FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} star-wars-api.jar
ENTRYPOINT ["java","-jar","/star-wars-api.jar"]