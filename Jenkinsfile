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
    }

    post {
        always {
            mail to: 'galarzabryan@gmail.com',
                 subject: "Resultado del pipeline: ${currentBuild.currentResult}",
                 body: "El pipeline ha terminado. Resultado: ${currentBuild.currentResult}"
        }
    }
}