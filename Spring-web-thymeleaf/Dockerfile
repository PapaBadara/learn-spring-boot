FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY target/*.jar /app/techstore.jar

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "/app/techstore.jar"]