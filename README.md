
## Build and run docker image
docker image build -t dockerworld:1.0 .

docker run -d -p 8085:8085 dockerworld:1.0

http://localhost:8085/DockerWorld

## Push to docker hub
docker tag dockerworld:1.0 bilasreenu19/dockerworld:1.0

docker push bilasreenu19/dockerworld:1.0


