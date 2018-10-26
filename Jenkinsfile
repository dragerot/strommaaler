pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
              	sh 'ls -al'
              	sh 'chmod 755 gradlew'
                sh './gradlew clean'
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
               	sh './gradlew test'
              	sh 'ls -al'
            }
        }
    }
//   post {
//          always {
//              junit 'build/test-results/**/*.xml'
//          }
//         success{
//         		   archiveArtifacts artifacts: 'build/libs/*.jar', fingerprint: true
//         }
//      }
}