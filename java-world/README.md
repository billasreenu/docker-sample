
## Build and run docker image

    docker image build -t dockerdemo:1.0 .

    docker run -d --name dockerdemo -p 8085:8085 dockerdemo:1.0

http://localhost:8085/dockerdemo

## Push to docker hub

    docker tag dockerdemo:1.0 <DockerHubId>/dockerdemo:1.0

    docker push <DockerHubId>/dockerdemo:1.0

