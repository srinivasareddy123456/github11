package OrangeHRM;

public class LoginTest {
	log4j.rootLogger=INFO,CONSOLE,R,HTML,TTCC

			// Here we define the appender
			log4j.appender.CONSOLE=org.apache.log4j.ConsoleAppender
			log4j.appender.R=org.apache.log4j.RollingFileAppender
			log4j.appender.TTCC=org.apache.log4j.RollingFileAppender
			log4j.appender.HTML=org.apache.log4j.FileAppender

			// Here we define log file location
			log4j.appender.R.File=.\\OrangeHRMApplicationLogFiles\\testlog.log
			log4j.appender.TTCC.File=.\\OrangeHRMApplicationLogFiles\\testlog1.log
			log4j.appender.HTML.File=.\\OrangeHRMApplicationLogFiles\\OrangeHRM.html

			// Here we define the layout and pattern
			log4j.appender.CONSOLE.layout=org.apache.log4j.PatternLayout
			log4j.appender.CONSOLE.layout.ConversionPattern= %5p [%t] (%F:%L)- %m%n

			log4j.appender.R.layout=org.apache.log4j.PatternLayout
			log4j.appender.R.layout.ConversionPattern=%d - %c -%p - %m%n

			log4j.appender.TTCC.layout=org.apache.log4j.TTCCLayout
			log4j.appender.TTC.layout.DateFormat=ISO8601

			log4j.appender.HTML.layout=org.apache.log4j.HTMLLayout
			log4j.appender.HTML.layout.Title=Application log
			log4j.appender.HTML.layout.LocatioInfo=true


			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
