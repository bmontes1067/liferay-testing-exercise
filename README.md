# Automated test for Liferay test challenge

## What are we going to use for doing these automated validations?
- **Gradle**: Less complex syntax than Maven for configuring third-party sdk(s), cleaner for builds and executions,
  and better performance -> https://gradle.org/maven-vs-gradle/
- **Selenium + Selenide**: Selenium upper-layer for having many web-drivers ("chrome", "firefox", "iexplorer", "safari"
  and phantom ones) and syntax web elements higher-definition in a more transparent way -> https://selenide.org/
- **TestNG**: An evolved framework from JUnit -> https://testng.org/doc/
- **Allure**: For representing the tests results, their performance, and having some graphical evidences of the failed
  ones -> https://docs.qameta.io/allure/

## How this project is structured?

Easy. We will follow the Page Object Model pattern to structure our tests project:
- *src/main/java/liferay.form/** contains the relevant web elements needed for the tests.
- *src/test/java/liferay.form/** contains the own automated tests.

## Set-up & Go
Easy too. Just follow the next steps:
- Be sure that you have installed Chrome. Otherwise: https://www.google.com/intl/es/chrome/
- Install the most recent Java Oracle JDK: https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
- Install gradle: https://gradle.org/install/
- Run:
  ```
  gradle test
  ```
  From the second time onwards use the --rerun-tasks parameter. We are telling gradle to build again this step, cause
  if we do not do it, there were no changes in code, and last tests run succeeded, it will think that no tests'
  execution is needed to make a build again.

**Extra**:

- **Allure:** If you want to give some sugar to the tests result, just launch the next build after executing the tests:
  ```
  $ gradle allureReport
  $ gradle allureServe
  ```
  Make a test fail! Then check the reports. You will be able even to see a snapshot of the browser and the code!
  Execution tests timings, some graphs, more detailed and concise explanations about the fails... Awesome!