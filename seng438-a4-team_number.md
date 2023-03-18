**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#4 – Mutation Testing and Web app testing**

| Group \#:      |   16  |
| -------------- | --- |
| Student Names: |     |
|           MD Shaherier Khan     |     |
|             Radia Jannat   |     |
|          Syed Mohammed Abbas Kazmi      |     |
|          Hridika Banik      |     |

# Introduction


# Analysis of 10 Mutants of the Range class 

# Report all the statistics and the mutation score for each test class



# Analysis drawn on the effectiveness of each of the test classes

# A discussion on the effect of equivalent mutants on mutation score accuracy

# A discussion of what could have been done to improve the mutation score of the test suites

# Why do we need mutation testing? Advantages and disadvantages of mutation testing

# Explain your SELENUIM test case design process
Initially, we started  by identifying the different use-case scenarios , for Amazon.ca, that needed to be tested. Then we proceeded to define the test case scenarios by defining the tests that needed to be executed and the steps that needed to be implemented. We formed a step-by-step routine of the tests so that it can be efficiently performed once we started recording them. We also created example test data such as the category of the product that needs to be selected or item that needs to be searched using the search bar. We then proceeded to set up the Selenium IDE and added it as an extension to our Chrome web browser. Using the test cases and example test data we performed our tests on the Amazon.ca website and recorded our scripts by using HTML tags, in order to write the steps that the user would require to fulfill the outcomes of the user-case scenario. While doing this , we closely looked at any unpredictable results and tried to manually fix them by adding our own test script. We also added several validation checkpoints in order to check that the tests are getting the required outcomes. After the test scripts were written, we executed each one of them in order to identify any discrepancies in the outcomes and how we can make the tests better. 


# Explain the use of assertions and checkpoints
At specified locations in the test script, assertions are used to verify certain circumstances. In Selenium testing, assertions are typically used to check if expected items are available on web pages, certain text or values are displayed, or specific behaviors have been successfully carried out. An example of using assertion is comparing the URL Link of a webpage to that of the expected URL in order to ensure that the test is being performed correctly. In case the expected URL does not match the current URL, the test script will be stopped and will be failed.
Checkpoints are used to verify the application's status at a specified time rather than a particular circumstance. Checkpoints are useful in checking that the application is in the correct state before proceeding with further steps in the test script. Checkpoints are more concerned with the application's present state than assertions, while being identical. For example, a checkpoint is used to check if a specific element of the webpage is being displayed when needed or required by a test script while running. This ensures a smooth execution of the test script while also verifying that the test script is being run correctly. 

# how did you test each functionaity with different test data

# Discuss advantages and disadvantages of Selenium vs. Sikulix

# How the team work/effort was divided and managed


# Difficulties encountered, challenges overcome, and lessons learned

# Comments/feedback on the lab itself
