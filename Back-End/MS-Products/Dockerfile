
FROM openjdk:21-jdk-slim
LABEL maintainer="Diego Rodriguez"

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

COPY target/MS-Products.jar /app/MS-Products.

EXPOSE 8082

CMD ["java", "-jar", "/app/MS-Products.jar"]
