@Library('sharedlib') _  

pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Pradhisha-N/jenkins_Q2.git'
            }
        }

        stage('Build with Maven') {
            steps {
                mavenBuild('clean install')
            }
        }
    }
}
