# Sauce Demo Cucumber Java Assessment

This repository contains an automated testing framework for the Sauce Demo web application, built using Java, Cucumber, Selenium WebDriver, and Maven. The framework is structured for maintainability and scalability, following best practices for BDD (Behavior Driven Development).

## Project Structure

```
SauceDemoAssessment2ndGroup2025/
├── pom.xml                  # Maven project configuration and dependencies
├── README.md                # Project documentation
└── src/
    ├── main/
    │   ├── java/            # (Reserved for application code, if needed)
    │   └── resources/       # (Reserved for main resources)
    └── test/
        ├── java/
        │   ├── Pages/       # Page Object Model classes (e.g., LoginPage.java)
        │   ├── Runners/     # Test runner classes (e.g., runner.java)
        │   ├── Steps/       # Step definitions for Cucumber (e.g., StepsDefinition.java)
        │   └── Utils/       # Utility classes (e.g., BrowserFactory.java)
        └── resources/
            └── Features/    # Cucumber feature files (e.g., Login.feature)
```

## Getting Started

### Prerequisites
- Java 8 or higher
- Maven 3.x
- ChromeDriver or compatible WebDriver installed and available in PATH

### Setup
1. Clone the repository:
   ```sh
   git clone <repository-url>
   cd SauceDemoAssessment2ndGroup2025
   ```
2. Install dependencies:
   ```sh
   mvn clean install
   ```

## Running the Tests

You can run the Cucumber tests using Maven:

```sh
mvn test
```

Test results and reports will be generated in the `target/` directory.

## Key Components
- **Pages/**: Contains Page Object Model classes for web elements and actions.
- **Runners/**: Contains Cucumber runner classes to execute feature files.
- **Steps/**: Contains step definitions mapping Gherkin steps to Java code.
- **Utils/**: Contains utility classes (e.g., browser setup/teardown).
- **Features/**: Contains `.feature` files written in Gherkin syntax.

## Contributing
Feel free to fork this repository and submit pull requests. Please follow best practices and write clear commit messages.

## License
This project is for educational and assessment purposes.

