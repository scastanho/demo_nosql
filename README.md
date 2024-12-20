#How can this API be used?

You can use the methods below:

#GET
##List all users:

Example url: http://localhost:8080/users

(be careful with the quantity).

Use headers: If header is null, only the first 100 records will be returned.

##Get a specific user by ID:

Example url: http://localhost:8080/users/101

#POST
##Authenticate a specific user:

Example url: http://localhost:8080/users/validate
Header: Authorization = user:pass

#PUT
##Record a new user in the collection.

Example url: "Still needs to be implemented."
# demo_nosql
