
FROM openjdk:21-jdk-slim
LABEL maintainer="Diego Rodriguez"

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

COPY target/MS-Transaction.jar /app/MS-Transaction.

EXPOSE 8084

CMD ["java", "-jar", "/app/MS-Transacton.jar"]
