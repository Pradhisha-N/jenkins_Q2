@Library('sharedlib') _  // Load shared library

pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Pradhisha-N/jenkins_Q2.git', branch: 'main'
            }
        }

        stage('Build with Maven') {
            steps {
                mavenBuild('clean install')  // Call function from shared library
            }
        }
        stage('Test') {
            steps {
                echo 'Running unit tests'
                sh 'mvn test'
                }
            }
        stage('Deploy') {
            steps {
                echo 'Deploying to development environment'
    }
}


    }
}
