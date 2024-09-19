FROM amazoncorretto:21-alpine-jdk
COPY target/helP-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 5432
ENTRYPOINT [ "java", "-jar", "app.jar" ]