
## Build and run docker image

    docker image build -t dockerwebapp:1.0 .

    docker run -d --name dockerwebapp -p 8080:80 dockerwebapp:1.0

http://localhost:8080/

## Push to docker hub

    docker tag dockerwebapp:1.0 <DockerHubId>/dockerwebapp:1.0

    docker push <DockerHubId>/dockerwebapp:1.0

## Kill container
   
   docker container kill ContainerID
   
   docker container prune
   
