# World_Info_API

<!-- ABOUT THE PROJECT -->
## About The Project

What contributes to happiness? With this API, draw correlations between societal and economic variables that impact happiness. This project has basic information of the 20 most happy countries. Find for yourself which variables correlate with happiness and which variables don't!

### Built With
* [Java](https://www.java.com/en/)
* [Spring](https://spring.io/)
* [SQL](https://www.microsoft.com/en-us/sql-server/sql-server-downloads)

<!-- GETTING STARTED -->
### Installation
1. Simply clone the repo
   ```sh
   git clone git@github.com:Osborne92/World_Info_API.git
   ```

<!-- USAGE EXAMPLES -->
## Usage
1. In your terminal, type in ./mvnw spring-boot:run (for Windows, use mvnw spring-boot:run)
  ```sh
   ./mvnw spring-boot:run
   ```
2. In another terminal, enter any command seen in the controller file. Example: Retrieve all countries
  ```sh
   curl GET "localhost:3000/countries"
   ```
   
   Retrieve specific country
  ```sh
   curl GET "localhost:3000/countries/name/Finland"
   ```
   
   Retrieve country by happinessIndex
  ```sh
   curl GET "localhost:3000/countries/happiness"
   ```
   
   Retrieve country by gdp
  ```sh
   curl GET "localhost:3000/countries/gdp"
   ```

<!-- CONTACT -->
## Contact

Dane Christensen - danechristensen92@gmail.com

Project Link: [https://github.com/Osborne92/World_Info_API](https://github.com/Osborne92/World_Info_API)
