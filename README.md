# Assignment_2_FlighSearch_
Flight Search Automation Framework is done using selenium with Java as programming language.

# Tools Used For This Framework 
		•	Eclipse
		•	Maven
		•	TestNg
		•	Selenium Webdriver

# Requirements – 
		•	Java – 1.8
		•	Chrome And Chrome Driver (Test Use Chrome By Default,  can be changed in .properties file)
		•	Maven- 3.8

# Folder Structure
•	In src/main/java folder, you can have base class file, page object class file, validation file and properties file. Base class file is used to initialize webdriver, to configure .properties file and to aplply implicit wait. Page object class file is used define all the required locators and it’s related methods. Properties.prop file is used to define all global values used in framework like URL, Brower version etc. 

•	In src/test.java folder, you can have all test case file.

•	In driver folder, you can find driver for Chrome and IE /Edge

•	For TestNG genrated report, you can navigate to test -output folder


# To Run Single Test Case from Maven
 Go to project directory -> cmd 
 			•	Mvn –clean
			•	Mvn compile
			•	Mvn test

			
# To Run Testng.xml file 
To Run Testng.xml file  (Default  is added in pom.xml)

# • Include below plugin in your pom.xml under <plugins> 
 	<plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.0.0-M6</version>
        <configuration>
          <suiteXmlFiles>
            <suiteXmlFile>testng.xml</suiteXmlFile>
          </suiteXmlFiles>
        </configuration
      </plugin>

	
				
					
# To Run from Eclipse with testng.xml
•	Launch eclipse with Flight Search Project
•	Navigate to testng.xml -> right click -> run as TestNg Suit
					
# To run Single test from Eclipse
•	Launch eclipse with FlightSearch Project
•	Right click  -> testCase File ->Run as TestNg Test


 
  
