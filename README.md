# penguin
Penguin test

To run this Spring Boot application do the following within the project root folder:

1) mvn clean install
2) java -jar target/webapp-technicaltest-1.0-SNAPSHOT.jar

You can then do two things:

1) View the exmaple static webpage by opening a browser and hitting:
http://localhost:8080/example.html

2) View the example json by hitting:
http://localhost:8080/data.json
** If you then check in the console window (System.out) you can see some messages with simple checks
performed on the json file (missing values, security, valid urls) **

*** ASSUMPTIONS ***
The test stated there was an example component file supplied but none was given. Therefore a
Spring component was created that takes a books json list as input.
Also the assumptions made were that the security aspect referred to the url containing "https",
and the url's only required validation checks, not checking for a valid 200 response.
