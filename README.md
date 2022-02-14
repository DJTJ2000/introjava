# labs
Java Exception Handling
Lab 3

This assignment supports competency development and mastery.  Upon completion of this assignment, students will:
Write Java code to generate a report based on a given file
Test the Java code

Directions:
1. Complete the steps in the assignment below
2. Save your code (.java file) and your results output into a .ZIP file with the following format: firstname-lastname-exception-date

EXAMPLE: mary-smith-exception-05012020

3. Then, upload (submit) the file to the corresponding assignment link.

Assignment: Java Exceptions
1. Write a Java program to generate a report based on this file. Be careful and test your code well. 

2. Download the starter file Lab3.zip from Blackboard. Use 7zip (or another zip utility) to unzip the file using “Extract Here.” Then open the unzipped Lab3 project with IntelliJ.  The project will contain FOUR files:
Surnames_2010Census.csv – the census data project
Main.java – the Main class containing a pre-written Main method
Census.java – a class that contains a partially-written loadCensusData() method that you will complete to read and process the census data file
Surname.java – a class that holds one surname and its related metadata
3. For the Surname class you will need to add the constructor, and accessors and mutators.

4. The Census class contains a loadCensusData() method you will complete that will read and process the census data file. The filename of the census data file is passed in as a parameter. Make sure that you skip the line of the file that only contains column headings.
You can open a file using java.io.File; simply pass the file name to the File constructor. See the documentation on File for more details: https://docs.oracle.com/javase/7/docs/api/java/io/File.html
You can then read from the file using java.util.Scanner by passing the File object to the Scanner’s constructor. 

5. Read the first one hundred surnames in the file. Read each line containing a surname as a single String. 


6. Use the String method split(“,”) to split each String into an array of Strings split at the comma delimiter. See the documentation on the Java String class for details of the split() method:
https://docs.oracle.com/javase/10/docs/api/java/lang/String.html#split(java.lang.String) 

Note: you can ignore the cumulative proportion field.

7.  Use the Integer.parseInt() and Double.parseDouble() methods to convert Strings to int and double respectively.

8.  Be sure and catch FileNotFoundException and NumberFormatException. Output an appropriate error message and have the method return a null.

9.  Once the method has processed the file, it will return an array of 100 Surname objects.

Example Output
Rank	Name
1		SMITH
2		JOHNSON
3		WILLIAMS
4		BROWN
5		JONES

. . . many more lines of the report . . .

95		PATEL
96		MYERS
97		LONG
98		ROSS
99		FOSTER
100		JIMENEZ

Testing
There are a number of tests which have already been written for this lab. These tests will act as a guide to help you to complete the lab. Your first task will be to implement enough of the project to get it to compile, including in the test code. Once you have the project compiling you should be able to run the tests, which will fail initially. When all of the tests are passing and the correct output is generated the lab should be complete.
