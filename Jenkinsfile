node ("windows"){
	stage ('SCM checkout'){
		git url: "https://github.com/scharbhai/Repository2.git"
		}
	stage ('Build'){
    	{
	   sh "mvn clean install"
       }
      
		}
}
