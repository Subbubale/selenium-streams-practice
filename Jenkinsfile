pipeline {
    agent any

    tools {
        jdk 'JDK21'
        maven 'Maven3'
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/Subbubale/selenium-streams-practice.git'
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn clean test -DsuiteXmlFile=testng.xml'
            }
        }
    }
}