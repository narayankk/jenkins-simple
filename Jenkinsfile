pipeline {
    agent any

    stages {


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
