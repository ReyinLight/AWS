FROM amazoncorretto:17
WORKDIR /app
COPY tarjet/*jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]