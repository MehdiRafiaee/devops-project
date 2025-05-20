# Use an official OpenJDK runtime as a parent image
FROM eclipse-temurin:17-jdk

#  the working directory in the container
WORKDIR /app

# Copy the jar file from target to the container
COPY target/mehdirafiei-0.0.1-SNAPSHOT.jar app.jar


# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
