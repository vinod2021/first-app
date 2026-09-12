FROM eclipse-temurin:21-jdk

WORKDIR /opt

COPY target/*.jar /opt/app.jar

ENV PORT 8080

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "/opt/app.jar" ]