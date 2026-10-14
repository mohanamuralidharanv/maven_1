# Number Reverser

A Java 17-compatible Maven project that reverses a signed 32-bit integer.
Reversals outside the `int` range are reported as an error.

## Run locally

```text
mvn clean verify
java -cp target/classes com.example.NumberReverser 12345
```

The program prints `54321`. Provide the integer as the single command-line
argument.

## Build with Jenkins

1. Install the Jenkins **Pipeline** and **JUnit** plugins.
2. In **Manage Jenkins → Tools**, add a JDK installation named `JDK 17` and a
   Maven installation named `Maven 3`. Configure their homes or automatic
   installers so they are available to the Jenkins agent.
3. Put this project in a Git repository accessible to Jenkins.
4. In Jenkins, choose **New Item → Pipeline**, then configure **Pipeline
   script from SCM** with the repository URL and the `Jenkinsfile` script path.
5. Save and choose **Build Now**. The pipeline runs `mvn -B clean verify` and
   publishes the JUnit test report.
