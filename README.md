# Contact Management System
This is a simple and user-friendly contact management system that allows users to easily add, update, query, and delete contact information. Through an intuitive interface, users can enter a contact's name, added by, age, contact type, gender, image, contact details, address, and description, and view all contacts in a list format.

## Table of Contents
Features
Tech Stack
Installation
Usage
Code Structure
Contributing
License
Acknowledgements
## Features
Add new contact information
Update existing contact information
Query contacts
Delete contacts
View a list of all contacts
## Tech Stack
VUE: For building the page structure
CSS3, ElementUI: For styling and layout
axios, JavaScript: For implementing front-end interactions and logic
Spring Boot: As the back-end service providing the API
## Installation
Clone the Repository
bash
git clone https://github.com/yourusername/contact-manager.git 
cd contact-manager
## Start the Back-End Service
Make sure you have Java JDK 1.8 and Maven 3 installed. Then run the following command in the back-end project directory:

## bash
mvn spring-boot:run
## Usage
Open your browser and navigate to http://118.89.116.252:8080/login. After logging in, click the "Add" button in the contact management list to input the contact's name, added by, age, contact type, gender, image, contact details, address, and description. Then click the "Submit" button. The contact will be added to the list. You can click the "Edit" button to update information, enter a contact's name to query, or click the "Delete" button to remove a contact.

Code Structure
lianxirencunchu/
├── src
   ├── main
       ├── java
           ├── com.config   # Java configuration for cross-domain access, image upload, etc.
           ├── com.controller # Controller layer code
               ├── ContactsController # Contacts management
               ├── UsersController # User management
           ├── com.dto   # Data Transfer Objects
           ├── com.entity # Entity models
           ├── com.mapper # Mapper layer
           ├── com.service # Service interface layer
               ├── impl # Service implementation layer
           ├── com.util # Utility functions
           ├── Application # Main application entry point
       ├── resources
           ├── application.yml   # Configuration file 
com.controller: Contains all the APIs for CRUD operations provided to the Vue front end.
com.entity: Model entity layer.
com.mapper: Entity table mappings.
com.service: Service interfaces.
com.service.impl: Implementation layer for service interfaces.
application.yml: Configuration for the database, Tomcat, image uploads, etc.
## Contributing
Contributions to this project are welcome! Please follow these steps:

Fork the repository.
Create a new branch (git checkout -b feature-branch).
Commit your changes (git commit -m 'Add new feature').
Push to the branch (git push origin feature-branch).
Submit a pull request.
## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgements
Thanks to the following resources for their support in this project:

Spring Boot
MDN Web Docs
W3C
## Explanation
Project Title: Describes the name and a brief overview of the project.
Features: Lists the main functionalities of the application.
Tech Stack: Describes the technologies used in the project.
Installation: Provides instructions for setting up the project.
Usage: Explains how to use the application.
Code Structure: Shows the organization of files in the project.
Contributing: Encourages contributions and outlines how to do so.
License: States the licensing information for the project.
Acknowledgements: Thanks the resources that were helpful in the development of the project.
Feel free to modify or expand any sections to better fit your project’s specifics!
