# Google_search_Testing

This project is an example of UI automated functional test for Google home page and search using Selenium and Java. Using Google Chrome and Firefox driver.

Test case are also uploaded as per commit "TC-Google_Search.xlsx" to reflect Test Scenarios, comparing expected results and actual results, preconditions, data used and postconditions of the test run.

## Built with

* Java JDK 13
* Eclipse IDE 2019‑09
* Selenium Java Client 3.141.59

## Installation

You need to install Java JDK 13 in your system. Download <a href="https://www.oracle.com/technetwork/java/javase/downloads/index.html">here</a>
![image](https://www.guru99.com/images/2-2017/022017_1205_Guidetoinst1.png)

Next:
![image](https://www.guru99.com/images/2-2017/022017_1205_Guidetoinst2.png)

You also need to download latest version of <b>"Eclipse IDE for Java Developers"</b> <a href ="https://www.eclipse.org/downloads/">here</a>
![image](https://www.guru99.com/images/2-2017/022017_1205_Guidetoinst3.png)

You should be able to download an exe file named "eclipse-inst-win64" for Setup.

![image](https://www.guru99.com/images/2-2017/022017_1205_Guidetoinst4.png)

Double-click on file to Install the Eclipse. Click Eclipse IDE for Java Developers.
![image](https://www.guru99.com/images/2-2017/022017_1205_Guidetoinst5.png)

After that, a new window will open which click button marked 1 and change path to "C:\eclipse". Click on Install button marked 2
![image](https://www.guru99.com/images/2-2017/022017_1205_Guidetoinst6.png)

After completion of the installation procedure, a window will pops up. Just click on Launch
![image](https://www.guru99.com/images/2-2017/022017_1205_Guidetoinst7.png)

And download Selenium Java Client Driver <a href ="https://selenium.dev/">here</a>
![image](https://www.guru99.com/images/download_java_client_driver_1.png)

This download comes as a ZIP file named "selenium-2.25.0.zip". Extract the contents of this ZIP file on your C drive.

### Configure Eclipse with WebDriver

Launch the <b>"eclipse.exe"</b> file inside the "eclipse" folder.

Just accept work space as the default location.
![image](https://www.guru99.com/images/configure_eclipse_1b.png)

Create a new project File > New > Java Project. 
![image](https://www.guru99.com/images/cassandra/021316_1152_SeleniumIns1.png)

A new pop-up window will open enter details as follow

* Project Name
* Location to save project
* Select an execution JRE
* Select layout project option
* Click on Finish button
![image](https://www.guru99.com/images/cassandra/021316_1152_SeleniumIns2.png)

Right-click on the newly created project and
Select New. Package, and name that package "....".
![image](https://www.guru99.com/images/cassandra/021316_1152_SeleniumIns3.png)

Enter the name of the package.
Click on Finish button
![image](https://www.guru99.com/images/cassandra/021316_1152_SeleniumIns4.png)

Create a new Java class under newpackage by right-clicking on it and then selecting- New > Class, and then name it as "MyClass". 
![image](https://www.guru99.com/images/cassandra/021316_1152_SeleniumIns5.png)

Name of the class
Click on Finish button
![image](https://www.guru99.com/images/cassandra/021316_1152_SeleniumIns6.png)


### Now selenium WebDriver's into Java Build Path

* Right-click on "newproject" and select Properties.
* On the Properties dialog, click on "Java Build Path".
* Click on the Libraries tab, and then
* Click on "Add External JARs.."
![image](https://www.guru99.com/images/cassandra/021316_1152_SeleniumIns8.png)

It will open a pop-up window. Select the JAR files you want to add.
![image](https://www.guru99.com/images/cassandra/021316_1152_SeleniumIns9.png)

Click on OK button.

Select all files inside the lib folder.
![image](https://www.guru99.com/images/cassandra/021316_1152_SeleniumIns10.png)

Select files outside lib folder
![image](https://www.guru99.com/images/2-2017/022017_1205_Guidetoinst_24_7_2.png)

Once done, click "Apply and Close" button
![image](https://www.guru99.com/images/2-2017/022017_1205_Guidetoinst_24_7_3.png)

Add all the JAR files inside and outside the "libs" folder. 
![image](https://www.guru99.com/images/cassandra/021316_1152_SeleniumIns11.png)

## Test Run

### Run Clone Project

git clone git@github.com:JoseMMorales/Google_Search_Testing.git
cd Google_Search_Testing/

### Drivers used

To run the tests locally with Chrome, install ChromeDriver from <a href="http://chromedriver.chromium.org/">here</a> and add its location to your system PATH.

* chromedriver.exe

To run the tests locally with Firefox, install GeckoDriver from <a href="https://github.com/mozilla/geckodriver/releases">here</a> and add its location to your system PATH.

* geckodriver.exe

### Run an example test in Chrome and Firefox:

cd src/google_search
TC1Google_search_Chrome.java--browser=Chrome

cd src/google_search
TC2Google_search_Firefox.java --browser=firefox

### 
