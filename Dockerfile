FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY target/siri-makeovers-warangal-0.0.3-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
