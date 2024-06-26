
FROM openjdk:21-jdk-slim
LABEL maintainer="Diego Rodriguez"

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

COPY target/MS-App.jar /app/MS-App.

EXPOSE 8085

CMD ["java", "-jar", "/app/MS-App.jar"]
