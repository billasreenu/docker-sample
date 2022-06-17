
docker image build -t dockerworld:1.0 .

docker run -d -p 8085:8085 dockerworld:1.0

http://localhost:8085/DockerWorld

