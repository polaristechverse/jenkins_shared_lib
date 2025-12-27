def call() {
    stage('check software') {
        echo "checking the software"
        sh "java -version"
        sh "mvn -version"
        sh "docker ps"
    }
}
