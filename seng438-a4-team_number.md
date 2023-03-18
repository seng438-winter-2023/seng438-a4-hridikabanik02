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

Equivalent mutants are mutations that result in code that is functionally equivalent to the original code, meaning that the behavior of the program remains the same before and after the mutation. Detecting equivalent mutants does not contribute to the effectiveness of a testing suite since these mutations do not introduce new faults or defects into the program.

The DataUtilities test file has a mutation accuracy of 87 percent. This file contains many equivalent mutants that cannot be killed. This prevents us from getting a mutation score of 100 percent because of the unkillable mutants. These scenarios mostly occur in decision and computational changes.

Similarly there are multiple equivalent mutants in the Range test file which affect the actual mutation coverage. We should consider the mutation coverage without the equivalent mutations to get the actual mutation coverage.

# A discussion of what could have been done to improve the mutation score of the test suites

Increasing the amount of test cases in the test suite is one of the best approaches to raise the mutation score. More test cases increase the possibility of finding defects brought on by mutations. This can be accomplished by gradually adding new test cases that simulate various inputs, program routes, and edge cases.

Another approach of increasing the mutation score is by not considering the equivalent test cases to get the actual strength of the code. Improving the quality of the test is also an effective way to make the mutation coverage better. 

# Why do we need mutation testing? Advantages and disadvantages of mutation testing

Mutation testing is a very important technique that helps in identifying vulnerabilities in a software testing approach. In doing so it improves the quality of the software testing strategy. By introducing small, intentional changes to the code, known as mutations, this testing technique evaluates how effectively a test suite can detect errors in the source code.

The main aim of mutation testing is to enhance the quality of the test suite and overall code. By testing the code against multiple mutations, we can find out all the weaknesses in the test cases that we wouldn’t have found otherwise. This results in a more robust and error-free code.

Some of the advantages of mutation testing include: 

1) Mutation testing enhances the quality of our test suite by identifying the weaknesses of our previous test suite that couldn’t catch unknown bugs. Moreover, it helps in improving the quality of our source code by creating more reliable and error-free code.

2) By testing the code against a large number of mutations, we can gain a higher degree of confidence in the quality of the code.

3) Using mutation testing to detect bugs early in the development cycle can result in more cost-effective bug fixing.

Some of the disadvantages of mutation testing include: 

1) Running a test suite against numerous mutations during mutation testing can be a time-consuming process, especially source codes that have many lines of code.

2) The cost of implementing mutation testing can be significant, as it requires additional resources and tools.

3) Some mutations may not always indicate a problem in the code and can result in false positives, which can be both time- and resource-consuming.

# Explain your SELENUIM test case design process
Initially, we started  by identifying the different use-case scenarios , for Amazon.ca, that needed to be tested. Then we proceeded to define the test case scenarios by defining the tests that needed to be executed and the steps that needed to be implemented. We formed a step-by-step routine of the tests so that it can be efficiently performed once we started recording them. We also created example test data such as the category of the product that needs to be selected or item that needs to be searched using the search bar. We then proceeded to set up the Selenium IDE and added it as an extension to our Chrome web browser. Using the test cases and example test data we performed our tests on the Amazon.ca website and recorded our scripts by using HTML tags, in order to write the steps that the user would require to fulfill the outcomes of the user-case scenario. While doing this , we closely looked at any unpredictable results and tried to manually fix them by adding our own test script. We also added several validation checkpoints in order to check that the tests are getting the required outcomes. After the test scripts were written, we executed each one of them in order to identify any discrepancies in the outcomes and how we can make the tests better. 


# Explain the use of assertions and checkpoints
At specified locations in the test script, assertions are used to verify certain circumstances. In Selenium testing, assertions are typically used to check if expected items are available on web pages, certain text or values are displayed, or specific behaviors have been successfully carried out. An example of using assertion is comparing the URL Link of a webpage to that of the expected URL in order to ensure that the test is being performed correctly. In case the expected URL does not match the current URL, the test script will be stopped and will be failed.
Checkpoints are used to verify the application's status at a specified time rather than a particular circumstance. Checkpoints are useful in checking that the application is in the correct state before proceeding with further steps in the test script. Checkpoints are more concerned with the application's present state than assertions, while being identical. For example, a checkpoint is used to check if a specific element of the webpage is being displayed when needed or required by a test script while running. This ensures a smooth execution of the test script while also verifying that the test script is being run correctly. 

# how did you test each functionaity with different test data
As part of our comprehensive testing of the Amazon website, we performed a thorough evaluation of its various functionalities. Our testing involved scrutinizing the search bar function, category selection, language and country changing, order tracking, filter function, account order status, and sign out features to ensure that they were all working correctly.
Specifically, for the search bar, we conducted tests using different types of input data to assess its functionality under various circumstances. We tested it with regular items like books and bookshelves to ensure that it performed as expected with standard products. Additionally, we also used invalid data such as non-existent words to examine how the page reacted and responded in such situations.
Similarly, we conducted checks on the order tracking function by testing it with both valid and invalid tracking numbers. This helped us to determine if the system was able to correctly track the status of orders and provide accurate information. Furthermore, we also evaluated the website's location changing functionality by inputting postal codes that were both valid and invalid. Our aim was to ensure that the system provided the correct response in all cases, regardless of the validity of the input data. Overall, our testing was thorough and meticulous, aimed at uncovering any issues or glitches that may have existed in the system.



# Discuss advantages and disadvantages of Selenium vs. Sikulix

Selenium is a web automation testing technology that has a number of benefits. Several browsers, including well-known ones like Google Chrome and Mozilla Firefox, are supported by it. Test case management and organisation are made simpler by the ease with which Selenium may be connected with testing frameworks like TestNG, JUnit, and NUnit etc. In addition, Selenium is open-source software that is cost-free to use and can be modified to meet the unique requirements of a project. 
Selenium has some restrictions that need to be considered, including the fact that it has limited support for automating desktop apps, as it is largely built for online automation testing. However, some programming skill is necessary to use Selenium properly, which can be a drawback for testers without that background. Selenium tests have the potential to be unreliable, which means that they could stop working for no apparent cause connected to the application under test.
The advantages of Sikulix is that it uses image recognition in order to recognise and interact with user interfaces without having access to the source code. It is a flexible solution for desktop automation testing because it is cross-platform and compatible with Windows, Mac, and Linux operating systems. It is perfect for testers who are not familiar with programming languages because it is simple to learn and requires little prior programming experience.
Sikulix, however, also has certain drawbacks. It has limited support for web browsers and is not intended for web automation testing. For big or sophisticated systems, image-based automation's tendency to be slower than other types of automation can be a drawback. It may not function properly if the interface dramatically changes because it depends on graphics to distinguish and interact with items. 
Finally, it is safe to conclude that both Silenium and Sikulix have their own advantages and disadvantages but Sikulix is more reasonable for desktop automation testing and can be learned easily, but it mainly relies on picture recognition, whereas Selenium is more suitable for web automation testing and requires programming experience.

# How the team work/effort was divided and managed


# Difficulties encountered, challenges overcome, and lessons learned

# Comments/feedback on the lab itself
