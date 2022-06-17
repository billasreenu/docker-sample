FROM openjdk:11
COPY target/docker-demo-1.0.jar  dockerworld.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","dockerworld.jar"]
