# Use the official OpenJDK base image
FROM openjdk:11

# Set the working directory
WORKDIR /app

# Copy the Java application files into the container
COPY ./src /app/src
COPY ./data.txt /app/data.txt

# Compile the Java application
RUN javac src/Main.java

# Command to run the application
CMD ["java", "-cp", "src", "Main"]