# MONGODB DEMO
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

