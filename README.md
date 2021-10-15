# World_Info_API

<!-- ABOUT THE PROJECT -->
## About The Project

What contributes to happiness? With this API, draw correlations between societal and economic variables that impact happiness. This project has basic information of the 20 most happy countries. Find for yourself which variables correlate with happiness and which variables don't!

### Built With

This section should list any major frameworks/libraries used to bootstrap your project. Leave any add-ons/plugins for the acknowledgements section. Here are a few examples.

* [Java](https://www.java.com/en/)
* [Spring](https://spring.io/)
* [SQL](https://www.microsoft.com/en-us/sql-server/sql-server-downloads)

<p align="right">(<a href="#top">back to top</a>)</p>


<!-- GETTING STARTED -->
### Installation
1. Simply clone the repo
   ```sh
   git clone git@github.com:Osborne92/World_Info_API.git
   ```

<p align="right">(<a href="#top">back to top</a>)</p>



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

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- CONTACT -->
## Contact

Your Name - [@your_twitter](https://twitter.com/your_username) - email@example.com

Project Link: [https://github.com/your_username/repo_name](https://github.com/your_username/repo_name)

<p align="right">(<a href="#top">back to top</a>)</p>
