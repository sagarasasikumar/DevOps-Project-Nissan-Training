
*********DevOps Project*******
 
Steps Of Execution:

1.Initialised the maven lifecycle to build an application followed by the maven validate command.

      mvn -B archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.mydevop.app -DartifactId=my-devops-project
The command will create a my-devops-project folder in the respective system which will contain src,target and pom files. Src file contains both main and test sub-folders.

2.Go inside the main folder and inside the App.java file write the code for number to word conversion.

3.Go inside the main folder and inside the AppTest.java file write the JUnit test cases for the application.

4.Go inside the pom file and configure settings for nexus deployment of the project.

5.Complete the lifecyle in maven by executing following commands,
                                mvn clean compile
				
				mvn clean test
				
				mvn clean package
				
				mvn install
				
				mvn deployment
				
6.Goto [localhost:8081/nexus](Depends on the port configuration), we can see the application being deployed there

7.Goto Jenkins [localhost:8090] and create a new project and start the build there.

8.Create a new repository in Github and push the code;

                                git init
				
				git add .
				
				git commit -m "Commit of Project"
				
				git remote -v
				
				git remote add origin https://github.com/sagarasasikumar/DevOps-Project.git (Varies according to your account)
				git push origin master
				

9.For any further changes to be added in code, push it to the github and configure build trigger settings in Jenkins to automatically trigger the build for any update happening in corressponding github repository



****Submitted By:Sagara Sasikumar*******
