FROM openjdk:19

WORKDIR /apps

COPY ./build/libs/MovieService-0.0.1-SNAPSHOT.jar .

EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/apps/MovieService-0.0.1-SNAPSHOT.jar"]