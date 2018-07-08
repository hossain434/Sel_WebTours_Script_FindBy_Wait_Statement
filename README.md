# Sel_WebTours_Script_FindBy_Wait_Statement

Page Object Pattern using PageFactory

Creating Selenium test cases can result in an un-maintainable project. One of the reasons is that too many duplicated code is used. Duplicated code could be caused by duplicated functionality and this will result in duplicated usage of locators. The disadvantage of duplicated code is that the project is less maintainable. If some locator will change, you have to walk through the whole test code to adjust locators where necessary. By using the Page Object Pattern using PageFactory we can make non-brittle test code and reduce or eliminate duplicate test code. Beside of that it improves the readability and allows us to create interactive documentation. Last but not least, we can create tests with less keystroke. An implementation of the page object model can be achieved by separating the abstraction of the test object and the test scripts.

Selenium PageFactory

The PageFactory Class in Selenium is an extension to the Page Object design pattern. It is used to initialize the elements of the Page Object or instantiate the Page Objects itself. Annotations for elements can also be created (and recommended) as the describing properties may not always be descriptive enough to tell one object from the other.

It is used to initialize elements of a Page class without having to use ‘FindElement’ or ‘FindElements’. Annotations can be used to supply descriptive names of target objects to improve code readability. There is however a few differences between C# and Java implementation – Java provide greater flexibility with PageFactory

Find more here: 

http://toolsqa.com/selenium-webdriver/page-object-pattern-model-page-factory/
