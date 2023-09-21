#create a box
FROM openjdk:17-alpine
COPY target/delivery-service.jar delivery-service.jar
ENTRYPOINT ["java", "-jar", "/delivery-service.jar"]