# JAVA + MONGODB DEMO

This project has the sole purpose of demonstrating Java technology and data storage in NoSQL format. 

Follow the instructions below:

## Local installation prerequisites

- Install the MongoDB application on your desktop.
- Start the Windows service.
- Download and import the project into the IDE (IntelliJ or Eclipse (newer versions).
- Import the pom.xml dependencies.
- Install the PostMan software to test the available GET,POST and PUT methods.

## How can this API be used?
You can use the methods below:

# GET
## List all users:

Example URL: http://localhost:8080/users 
Notice: Be careful with the quantity, paging needs to be implemented.
Use headers: If the headers are null, only the first 100 records will be returned.
Example Header: Quantity = 100

## Get a specific user by ID:

Example URL: http://localhost:8080/users/101

# POST
## Authenticate a specific user:

Example URL: http://localhost:8080/users/validate
Header: Authorization = user:pass

# PUT
## Record a new user in the collection.

Example URL: "Still needs to be implemented."

