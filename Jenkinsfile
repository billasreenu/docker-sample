pipeline {
    agent any 
    stages {
        stage('Stage 1') {
            steps {
                sh 'mvn clean' 
            }
        }
        stage('Stage 2') {
            steps {
                 sh 'mvn package -DskipTests' 
            }
        }
        stage('Stage 3') {
            steps {
                sh 'mvn test' 
            }
        }
    }
}