# Use lightweight, secure Java 17 runtime
FROM eclipse-temurin:17-jre

# Create app directory
WORKDIR /app

# Copy the jar built by Maven
COPY target/*.jar app.jar
RUN mvn clean package -DskipTests

# Expose Spring Boot port
EXPOSE 8099

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]