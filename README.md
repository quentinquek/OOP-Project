# OOP-Project
Muse Vue Ant Design Dashboard - Free and OpenSource Ant Design Vue Dashboard

# Spring Boot (Guide)
pom.xml - Add dependencies that you want to use (e.g., like Java Mail Sender)
RestApiApplication.java - Run spring application
main/resource/static - Web Resource live for web application
main/resource/templates - All the templates for your web application (e.g., ejs)
main/resource/application.properties - Properties for your application to live; Define properties for different environment (e.g., production, development environment)

main/java/com/app/rest/controller - RestController which has request mapping methods for RESTful requests (e.g., getAllEmployee(), createEmploee())
main/java/com/app/rest/model - Data model class coresponds to entity and table (e.g., for Employee.java)
main/java/com/app/rest/Repository - An interface that extends JpaRepository for CRUD methods and custom finder methods. It will be autowired in the corresponding controller. TLDR: Data Access Layer

# Spring Boot (Start up)
1. Click on RestApiApplication.java -> Run Java (Top right execute button drop down)
2. localhost:8080
3. username: user
4. password: It will be generated in the terminal (copy and paste that)