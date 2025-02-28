pipeline {
    agent any
    stages {
        stage('clone') {
            steps {
                git branch: 'main', url: 'https://github.com/Mayuri240999/E-Commerce-With-Java-Spring-MVC-jenkins-Deploy.git'
                sh 'echo "clone success"'
            }
        }
        stage('Build') {
            steps {
                sh '/opt/maven/bin/mvn clean package'
                sh 'echo "build success"'
            }
        }
        stage('Test') {
            steps {
                withSonarQubeEnv(installationName: 'sonar', credentialsId: 'sonar-cred') {
                    sh '''/opt/maven/bin/mvn sonar:sonar'''
                    sh 'echo "test success"'
                }
            }
        }
        stage('Deploy') {
            steps {
                deploy adapters: [tomcat9(credentialsId: 'tomcat', path: '', url: 'http://15.237.216.236:8080')], contextPath: '/shopieasy.war', war: '**/*.war'
                sh 'echo "deploy success"'
            }
        }
    }
}
