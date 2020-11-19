# Hibernate Challenge
Within this repository there are two Hibernate applications.  Within a team, your goal is to migrate the application to a postgreSQL database hosted on Amazon RDS and establish persitence of the Java objects within the application to your assigned database.

### Steps:
* Clone the repository.
* Import the two projects into your IDE as `Existing Maven Projects`
* Refactor the code to achieve persistence to your assigned database hosted by Amazon RDS.
  * The username for all DB's are `postgres`
  * The password for all DB's are `postgres`
  * The ports for all DB's are `5432`
> You will need to update the Hibernate configuration files and POM.xml file in order to reconfigure dependencies and connect to your database. 

### Your breakout room number determines your team number.
 
The database endpoints you will use as your RDS are as follows:
* **Team-1**: team-1.c9chs4ontkbe.us-east-1.rds.amazonaws.com
* **Team-2**: team-2.c9chs4ontkbe.us-east-1.rds.amazonaws.com
* **Team-3**: team-3.c9chs4ontkbe.us-east-1.rds.amazonaws.com
* **Team-4**: team-4.c9chs4ontkbe.us-east-1.rds.amazonaws.com
* **Team-5**: team-5.c9chs4ontkbe.us-east-1.rds.amazonaws.com

## End Goal:
You are able to persist objects to the database and return the objects from your database & view them in the console.
