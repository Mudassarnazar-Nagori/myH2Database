pipeline {
    agent any // Specifies that the pipeline can run on any available agent

    stages {
        stage('Build') {
            steps {
                // Execute Maven clean install command on Windows
                bat 'mvn clean install'
            }
        }
    }
}