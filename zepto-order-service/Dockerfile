FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY target/zepto-order-service-0.0.1-SNAPSHOT.jar myapp.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "myapp.jar"]



