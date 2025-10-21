pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Sh37-Ai/Ecole-Backend.git'
            }
        }
        stage('Build') {
            steps {
                sh './mvnw clean package -DskipTests'
            }
        }
        stage('Run') {
            steps {
                // Lance le backend en arrière-plan
                sh 'java -jar target/demo-0.0.1-SNAPSHOT.jar &'
            }
        }
    }
}
