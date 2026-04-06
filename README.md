# Selenium Java Hybrid Framework - POM

This project is a robust Selenium automation framework built using **Java**, **TestNG**, and **Maven**. It follows the **Page Object Model (POM)** design pattern for better maintainability and scalability.

### 🚀 Key Features:
* **Hybrid Framework:** Combination of Data-Driven and Modular approaches.
* **Page Object Model:** Separated page actions from test scripts.
* **Property Files:** Managed locators and configurations via `.properties` files.
* **WebDriverManager:** Automated management of ChromeDriver (No manual .exe needed).
* **TestNG:** Used for annotations, assertions, and test execution.

### 🛠️ Tech Stack:
* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Build Tool:** Maven
* **Testing Framework:** TestNG
* **IDE:** Eclipse

### 📂 Folder Structure:
* `src/main/java`: Contains Page Objects and Base Classes (MasterPage).
* `src/test/java`: Contains Test Scripts (LoginTest).
* `locators.properties`: Stores all XPaths.
* `testng.xml`: Configuration for running the test suite.
