CURA-HEALTHCARE-SERVICE-Project_Using-Automation-Testing-Katalon

Step-1 : Create a project in Katalon Studio ; 
Step-2 : Create Test Cases,Object Repository,Test Suites,Data Files,CheckPoints,Keywords,Test Listeners in Katalon Studio ; 
Step-3 : Enable Git Integration
              Window >> Katalon Studio Preferences >> Git >> Mark Enable git Integration >> Apply&close ;
Step-4 : Enable Katalon TestOps & Katalon TestCloud - 
              Project Settings >> Katalon Platform >> Mark  1)Enable Katalon Platform Integration
                                                            2)Enable Katalon TestCloud Integration ;
Step-5 : Execute Test Cases,Test Suites,Test Suite Collections in Katalon Studio ;
Step-6 : After Executing,generates reports of Test Cases,Test Suites,Test Suite Collections,Test Listners in reports folder. 
          Note : Reports are generated and exported as html,csv as well as pdf. ;
Step-7 : Clone the project to git and commit & push the project. ;
Step-8 : Execution of CURA_Integration of Katalon with Katalon Runtime Engine(Execution Of Test Listener test cases through Katalon Runtime Engine(Katalon runtime engine(KRE) output generating using cmd))
          1) Download Katalon_Studio_Engine_Windows_64-9.3.1
          2) Click any test listner or test cases "Generate Command for Console Mode" and generate command and copy to clipboard
          3) Go to C:\Users\Katalon Studio\Katalon_Studio_Engine_Windows_64-9.3.1 >> Type cmd 
              Here paste copied command ;
Step-9 : Go to Command Prompt of Jenkins folder, Type cmd 
		            C:\Jenkin>java -jar jenkins.war ;
Step-10 : Go to https://localhost:8080/login?from=%2f to sign into jenkins home page ;
Step-11 : Dashboard >> Create new Item >> Confirgure item by providing build steps of execute windows batch command >> Apply and save. 
Step-12 : Run or Schedule Build Steps which genreates success console output.
