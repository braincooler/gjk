FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} gjk.jar
ENTRYPOINT ["java","-jar","/gjk.jar"]