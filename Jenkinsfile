pipeline {
    agent any

    tools {
        jdk 'JDK21'
        maven 'Maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn -B clean install'
            }
        }

        stage('Checkstyle') {
            steps {
                bat 'mvn checkstyle:check'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }
        
        stage('Deploy') {
            steps {
                echo "Construyendo imagen Docker..."
                bat "docker build -t miapp:latest ."

                echo "Deteniendo contenedor anterior si existe..."
                bat "docker stop miapp || exit 0"
                bat "docker rm miapp || exit 0"

                echo "Levantando contenedor..."
                bat "docker run -d --name miapp -p 8081:8080 miapp:latest"
            }
        }
    }

    post {
        always {
            mail to: 'galarzabryan13@gmail.com',
                 subject: "Resultado del pipeline: ${currentBuild.currentResult}",
                 body: "El pipeline ha terminado. Resultado: ${currentBuild.currentResult}"
        }
    }
}