
## Build and run docker image

    docker image build -t dockerwebapp:1.0 .

    docker run -d --name dockerwebapp -p 8085:8085 dockerwebapp:1.0

http://localhost:8080/

## Push to docker hub

    docker tag dockerwebapp:1.0 <DockerHubId>/dockerwebapp:1.0

    docker push <DockerHubId>/dockerwebapp:1.0

