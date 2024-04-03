pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from Git
                git 'https://github.com/narayankk/jenkins-simple.git'
            }
        }

        stage('Build') {
            steps {
                // Build the project using Gradle
                sh './gradlew build'
            }
        }

        stage('Test') {
            steps {
                // Run tests using Gradle
                sh './gradlew test'
            }
        }

        stage('Archive') {
            steps {
                // Archive the built artifacts
                archiveArtifacts artifacts: 'build/libs/*.jar', fingerprint: true
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
