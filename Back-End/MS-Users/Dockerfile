
FROM openjdk:21-jdk-slim
LABEL maintainer="Diego Rodriguez"

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

COPY target/MS-Users.jar /app/MS-Users.

EXPOSE 8081

CMD ["java", "-jar", "/app/MS-Users.jar"]