Prerequisites
Before running the project, ensure that you have the following installed on your system:
1. Java Development Kit (JDK)
	•	Install JDK (version 8 or above).
	•	You can download the latest JDK from the official Oracle website: https://www.oracle.com/java/technologies/javase-jdk-downloads.html
2. JavaFX SDK
	•	JavaFX is not bundled with JDK anymore, so you need to download and install it separately.
	•	Download JavaFX SDK from: https://gluonhq.com/products/javafx/
3. IDE (Optional)
	•	If you want to use an IDE, I recommend using IntelliJ IDEA or Eclipse with JavaFX support.
	•	Set up your IDE to use the JavaFX SDK.
	•	


Installation and Setup
1. Setting up JavaFX in your project
	•	Download and extract the JavaFX SDK.
	•	Add JavaFX libraries to your project's classpath or configure your IDE to use the JavaFX SDK.
For IntelliJ IDEA:
	1	Go to File -> Project Structure -> Libraries.
	2	Click + and add the JavaFX SDK's lib directory.
	3	Update the VM options in the run configuration as follows: --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml




For Eclipse:
	1	Go to Project -> Properties -> Java Build Path -> Libraries -> Add External JARs.
	2	Select all the .jar files in the lib folder of the JavaFX SDK.
	3	Under the Run Configurations, add the following arguments to the VM options:
--module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml


