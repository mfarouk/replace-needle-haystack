# Showtime Homework

**Project details:**

- Repo including the solution is located under https://github.com/mfarouk/cbs

- Java, maven, and IDE: I used java 1.8.0_121 and maven 3.3.9 and IntelliJ IDEA to develop this project. I saw that the question asked for Java 1.5 but I assumed that the assignment was written a while back. I am happy to rewrite it for java 1.5 if you would you like me to.

- Files submitted for consideration: ReplaceTalatiniFarouk.java, ReplaceTalatiniFaroukGroovy.groovy, Stack.java, ReplaceTalatiniFaroukTest.java, StackTest.java, and solution.txt

- Features: SLF4J Logging, JavaDoc style comments, and JUnit4 tests

- Compiling and running the project: 

     **CommandLine**

    ``mvn clean package`` will run the tests and log everything to the command line.

    ``mvn exec:java`` will run the groovy class since it's the only class that has a main method

    ``mvn assembly:assembly`` will produce a fully java compatible jar with all the dependencies

    ``java -jar target/cbs-homework-1.0-SNAPSHOT-jar-with-dependencies.jar`` will run the jar if you chose to do the step above

    **IDE**

    You can run the tests and ReplaceTalatiniFaroukGroovy.groovy individually from your IDE, I used IntelliJ IDEA  

## Question 1 - ReplaceTalatiniFarouk.java, ReplaceTalatiniFaroukGroovy.groovy, and ReplaceTalatiniFaroukTest.java

I provided a java and a groovy solution for this problem to demonstrate how much easier it could be done in groovy. I added JUnit tests as well. The tests don't extend TestCase since I am using JUnit4 and hence using the @Test annotation instead.

## Question 2 - solution.txt, Stack.java, and StackTest.java

I wrote notes on the issues I found in the file solution.txt which could be found at the root of this repo. Although not requested, I also wrote a new version of Stack.java and JUnit tests for the new changes I introduced to verify they are working as intended.

Thank you for your time to review my answer and looking forward to hearing your feedback.

-Farouk







 


