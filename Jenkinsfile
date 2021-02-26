node{
	stage ('SCM checkout'){
		git "https://github.com/scharbhai/Repository2.git"
		}
		stage ('test'){
		   sh 'mvn clean test  -DsuiteXMLFile=testng.xml'
       }
      		}

