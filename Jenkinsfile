pipeline {
    agent any
    
    // This tells Jenkins to use the Maven tool we configured earlier
    tools {
        maven 'Global-Maven' 
        jdk 'java-25'
    }
    
    // These are the exact stages your professor asked for
    stages {
        stage('Checkout') {
            steps {
                // Pulls the code from your GitHub
                git branch: 'main', url: 'https://github.com/rattttle22/VehicleRegistrationSystem.git'
            }
        }
        
        stage('Build') {
            steps {
                // Compiles the Java code (Using 'bat' because you are on Windows)
                bat 'mvn clean compile'
            }
        }
        
        stage('Test') {
            steps {
                // Runs your 5 JUnit test cases
                bat 'mvn test'
            }
        }
        
        stage('Package') {
            steps {
                // Packages the code into a JAR file
                bat 'mvn package -DskipTests'
            }
        }
        
        stage('Javadoc') {
            steps {
                // Generates the HTML documentation
                bat 'mvn javadoc:javadoc'
            }
        }
    }
}
