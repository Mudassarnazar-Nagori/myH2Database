pipeline {
    agent any // Specifies that the pipeline can run on any available agent

    stages {
        stage('Build') {
            steps {
                // Execute Maven clean install command on Windows
                bat 'mvn clean install'
            }
        }
        stage('Docker Build') {
                steps {
                    script {
                        docker.build("my-h2-database-image:${env.BUILD_NUMBER}")
                    }
                }
            }

          stage('Deploy') {
                steps {
                    script {
                        bat "docker run -d -p 8082:8081 my-h2-database-image:${env.BUILD_NUMBER}"
                    }
                }
            }
    }
}