FROM eclipse-temurin
ARG JAR_FILE=build/libs/app-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080