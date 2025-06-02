@Library('jenkins-shared-lib') _  // Name configured in Jenkins

pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Pradhisha-N/jenkins_Q2.git', branch: 'main'
            }
        }

        stage('Build with Shared Library') {
            steps {
                mavenBuild()  // This comes from mavenBuild.groovy in shared lib
            }
        }
    }
}
