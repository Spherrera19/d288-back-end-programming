<strong> **DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>
# WESTERN GOVERNORS UNIVERSITY 
## D288 – BACK-END PROGRAMMING
Welcome to Back-End Programming! This is an opportunity for students to develop object-oriented applications that can be integrated with relational databases, write code for object-oriented applications using Spring framework, and implements design patterns for object-oriented applications. 
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will be building your project using IntelliJ IDEA (Ultimate Edition) in a WGU-provided lab environment. You will be working with an existing MySQL database and Angular front-end, which are supplied for you in the lab environment. You will share this project to a private external GitLab repository and backup regularly. If you wish to work on it on your local machine, you will also need to download the Angular front-end application and create your own MySQL database. Use the links on your course page to install the integrated development environments (IDE), MySQL WorkBench, and IntelliJ IDEA, and pull the project from the lab environment.  


## SUPPLEMENTAL RESOURCES  
1.	How to clone a project to IntelliJ using Git?

> Ensure that you have Git installed on your system and that IntelliJ is installed using [Toolbox](https://www.jetbrains.com/toolbox-app/). Make sure that you are using version 2022.3.2. Once this has been confirmed, click the clone button and use the 'IntelliJ IDEA (HTTPS)' button. This will open IntelliJ with a prompt to clone the proejct. Save it in a safe location for the directory and press clone. IntelliJ will prompt you for your credentials. Enter in your WGU Credentials and the project will be cloned onto your local machine.  

2. How to create a branch and start Development?

- GitLab method
> Press the '+' button located near your branch name. In the dropdown list, press the 'New branch' button. This will allow you to create a name for your branch. Once the branch has been named, you can select 'Create Branch' to push the branch to your repository.

- IntelliJ method
> In IntelliJ, Go to the 'Git' button on the top toolbar. Select the new branch option and create a name for the branch. Make sure checkout branch is selected and press create. You can now add a commit message and push the new branch to the local repo.

## SUPPORT
If you need additional support, please navigate to the course page and reach out to your course instructor.
## FUTURE USE
Take this opportunity to create or add to a simple resume portfolio to highlight and showcase your work for future use in career search, experience, and education!

# D288 Back-End Programming: Task tracking
>Created for project tracking
>This repository contains the minimally viable product (MVP) for migrating a legacy travel agency back-end to a modern Java Spring Boot framework. This RESTful API is designed to interface with an existing Angular front-end application to manage vacation packages, excursions, and customer cart checkouts.

## Step A: Project Initialization

>The foundational architecture of this project was generated using Spring Initializr with a Maven build automation tool and Java. The following dependencies were integrated to support the application's required functionality:

**Spring Data JPA:** Used for Object-Relational Mapping (ORM) to map Java objects/entities directly to the database tables, eliminating the need for manual SQL queries.
**Rest Repositories (Spring Data REST):** Utilized to quickly expose the JPA repositories as RESTful web endpoints, allowing the Angular front-end to seamlessly fetch and post data over HTTP.
**MySQL Driver:** The essential database connector allowing the Spring Boot application to communicate with the provided MySQL database.
**Lombok:** A Java library used to reduce boilerplate code by automatically generating getters, setters, constructors, and other essential methods via annotations.

## Step B: Version Control
>This project is tracked using Git and hosted on GitLab. The repository was cloned locally, populated with the Spring Boot skeleton, and successfully pushed to the remote server to establish the working_branch and track step completion.

## Step C: Application Architecture and Configuration
Created the requisite files and copied the Database config files from the lab environment 

* **Created Package Hierarchy:** Generated the `controllers`, `entities`, `dao`, `services`, and `config` packages.
* **Configured REST Data:** Imported the provided `RestDataConfig.java` file into the `config` package and updated its paths.
* **Configured Database Connection:** Populated the `application.properties` file in the resources folder with the lab's MySQL credentials to successfully connect the Java backend to the database.