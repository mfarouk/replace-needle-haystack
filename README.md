
**Project details:**

- Java, maven, and IDE: I used java 1.8.0_121 and maven 3.3.9 and IntelliJ IDEA to develop this project.

- Files: ReplaceNeedleHayStack.java, ReplaceNeedleHayStackGroovy.groovy, Stack.java, ReplaceNeedleHayStackTest.java, StackTest.java, and solution.txt

- Features: SLF4J Logging, JavaDoc style comments, and JUnit4 tests

- Compiling and running the project: 

     **CommandLine**

    ``mvn clean package`` will run the tests and log everything to the command line.

    ``mvn exec:java`` will run the groovy class since it's the only class that has a main method

    ``mvn assembly:assembly`` will produce a fully java compatible jar with all the dependencies

    ``java -jar target/cbs-homework-1.0-SNAPSHOT-jar-with-dependencies.jar`` will run the jar if you chose to do the step above

    **IDE**

    You can run the tests and ReplaceNeedleHayStackGroovy.groovy individually from your IDE, I used IntelliJ IDEA  







 


