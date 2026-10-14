pipeline {
    agent any

    tools {
        jdk 'JDK 17'
        maven 'Maven 3'
    }

    stages {
        stage('Build and test') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'mvn -B clean verify'
                    } else {
                        bat 'mvn -B clean verify'
                    }
                }
            }
            post {
                always {
                    junit 'target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}
