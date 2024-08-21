
# SecurityLab Project

## Project Overview

The securityLab project is designed to enhance the security and integrity of request data by implementing robust validation mechanisms. The project focuses on validating request data and performing static code analysis to identify potential errors and vulnerabilities.

## Project Objectives

Validate Request Data: Ensure that incoming request data meets specific criteria, such as valid email formats and required fields.
Static Code Analysis with Semgrep: Analyze the codebase for potential errors and vulnerabilities using Semgrep. This includes custom rules to detect specific code patterns like System.out.println statements.
Implemented Features

1. **Request Data Validation**
Email Validation: Verifies that the email address contains an @ symbol.
Name Validation: Ensures that both first name and last name are provided and not empty.
2. **Static Code Analysis**
Tool/Framework: Semgrep
Description: Utilizes Semgrep to analyze the codebase for potential errors and vulnerabilities. Includes custom rules to:
Detect System.out.println Statements: Identifies and addresses potentially insecure or debug-related code.
## Repository Links
- **GitHub Repository**: [SecurityLab](https://github.com/Elvis-mugisha/SecurityLab)
- **Video Recording**: [Loom Video Link](https://www.loom.com/share/077d91e44ad34d54985aedcd6923661a?sid=5f2dc487-afaa-4914-a246-26fa950c98df)
## Getting Started

1. **Clone the Repository**
   ```bash
   git clone https://github.com/Elvis-mugisha/SecurityLab

## Install Dependencies

2. **Intsall Dependencies**
   ```bash
   mvn clean install
   
Follow the instructions in the build.gradle or pom.xml file to install the required dependencies.
Configure Semgrep
Create a configuration file for Semgrep with your custom rules.
Example configuration can be found in semgrep-config.yml.
Run Validation Tests
To validate request data, use the provided validation functions or API endpoints in the project.
Run Semgrep Analysis
Execute Semgrep with your custom rules to analyze the codebase.

**Check Results**
Review the output from Semgrep for any violations or issues detected by your custom rules.

**1.** Here is a picture showing an issue with System.out.println identified by Semgrep:
<img width="1440" alt="Screenshot 2024-08-21 at 18 41 55" src="https://github.com/user-attachments/assets/3c4e6a92-fcf7-4407-b992-c5c302b43691">

**2.** And here is a picture showing the corrected error:
<img width="1440" alt="Screenshot 2024-08-21 at 19 13 55" src="https://github.com/user-attachments/assets/4ede130c-2450-4746-acc3-759b71c9311f">

**Contributing**

Contributions are welcome! Please fork the repository, make your changes, and submit a pull request. Ensure that your code adheres to the validation rules and passes all Semgrep checks before submitting.

License

This project is licensed under the MIT License. See the LICENSE file for more details.










