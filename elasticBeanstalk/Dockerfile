#!/bin/bash

FROM openjdk:17
ARG JAR_FILE_PATH=build/libs/*.jar
ADD ${JAR_FILE_PATH} app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=USE_ENVIRONMENT","app.jar"]
