
FROM openjdk:21-jdk-slim
LABEL maintainer="Diego Rodriguez"

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

COPY target/MS-Orders.jar /app/MS-Orders.

EXPOSE 8083

CMD ["java", "-jar", "/app/MS-Orders.jar"]
