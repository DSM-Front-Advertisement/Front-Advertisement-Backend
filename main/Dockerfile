FROM openjdk:11-jre-slim
COPY ./build/libs/*.jar app.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=container", "-jar", "/app.jar"]
