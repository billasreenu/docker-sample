
## Build and run docker image
docker image build -t dockerworld:1.0 .

docker run -d -p 8085:8085 dockerworld:1.0

http://localhost:8085/DockerWorld

## Push to docker hub
docker tag dockerworld:1.0 bilasreenu19/dockerworld:1.0

docker push bilasreenu19/dockerworld:1.0


## Build and push image using Google Jib

Add below lines to setings xml in maven

    <server>
      <id>registry.hub.docker.com</id>
      <username>DockerId</username>
      <password>Password</password>
    </server>

Add below lines to pom xml in project ( Already added in this project )

             <plugin>
				<groupId>com.google.cloud.tools</groupId>
				<artifactId>jib-maven-plugin</artifactId>
				<version>3.2.1</version>
				<configuration>
					<to>
						<image>registry.hub.docker.com/bilasreenu19/dockerworld</image>
					</to>
				</configuration>
			</plugin>

run below maven command
			
    mvn clean compile jib:build
