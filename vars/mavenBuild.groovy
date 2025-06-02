def call() {
    stage('Maven Build') {
        sh 'mvn clean install'
    }
}
