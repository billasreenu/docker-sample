pipeline {
    agent any 
    stages {
        stage('MavenClean') {
            steps {
               mvn clean
            }
        }
        stage('Build') {
            steps {
                mvn package -DskipTests 
            }
        }
        stage('UnitTests') {
            steps {
                mvn test
            }
        }
    }
}