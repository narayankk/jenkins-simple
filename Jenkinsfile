pipeline {
    agent any

    stages {
        stage('Check Branch') {
            steps {
                script {
                    def branch = sh(returnStdout: true, script: 'git rev-parse --abbrev-ref HEAD').trim()
                    if (branch != 'develop') {
                        error "Build can only be run on the 'develop' branch"
                    }
                }
            }
        }

        stage('Build') {
            steps {
                // Build the project using Gradle
                bat './gradlew build'
            }
        }

        stage('Test') {
            steps {
                // Run tests using Gradle
                bat './gradlew test'
            }
        }
    }

    post {
        success {
            // If the build is successful, print a message
            echo 'Build successful!'
        }
        failure {
            // If the build fails, print a message
            echo 'Build failed!'
        }
    }
}