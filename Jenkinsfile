pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        echo 'Execute Tests'
        echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
        echo "Jenkins Workspace ${env.WORKSPACE}"
                bat "mvn clean test -DsuiteXMLFile=testng.xml"
      }
    } 
  }
}
