# Use an official JDK runtime as a parent image
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the Maven wrapper and other files to the container
COPY . .

# Build the project using Maven
RUN ./mvnw clean package -DskipTests

# Run the JAR file
CMD ["java", "-jar", "target/ai-ransomware-backend.jar"]
