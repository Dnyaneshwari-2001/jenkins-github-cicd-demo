pipeline {

    agent any

    tools {
        maven 'Maven-integration'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/Dnyaneshwari-2001/jenkins-github-cicd-demo.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Application deployed successfully!'
            }
        }
    }

    post {
        success {
            echo 'CI/CD Pipeline completed successfully!'
        }

        failure {
            echo 'CI/CD Pipeline failed!'
        }
    }
}