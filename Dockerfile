# Use a base image with Maven and JDK
FROM maven:3.8.5-openjdk-17 AS build

# Set the working directory
WORKDIR /app

# Copy the Maven build file and the source code
COPY pom.xml ./
COPY src ./src

# Build the application using Maven
RUN mvn clean package -DskipTests

# Create a new stage for the runtime
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the built JAR file from the previous stage
COPY --from=build /app/target/*.jar spring-boot-docker.jar  

# Expose the application port
EXPOSE 9192

# Run the application
ENTRYPOINT ["java", "-jar", "spring-boot-docker.jar"]
