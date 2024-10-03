FROM jelastic/maven:3.8.6-openjdk-19
ARG JAR_FILE=target/fooddelivery-order-logger-0.0.1.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
