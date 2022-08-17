FROM --platform=linux/amd64 openjdk:8-jdk-alpine
ADD build/libs/helloworld-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar","/app.jar"]
