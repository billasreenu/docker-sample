pipeline {
    agent any 
    stages {
        stage('MavenClean') {
            steps {
                sh 'mvn clean' 
            }
        }
        stage('Build') {
            steps {
                 sh 'mvn package -DskipTests' 
            }
        }
        stage('UnitTests') {
            steps {
                sh 'mvn test' 
            }
        }
    }
}