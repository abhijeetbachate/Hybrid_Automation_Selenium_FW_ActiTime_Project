set projectLocation=E:\Java Softwares\eclipse\New folder\Hybrid_Automation_Selenium_FW_ActiTime_Project
echo %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
echo %classpath%
java org.testng.TestNG %projectLocation%\testng.xml
pause

