# 🍏 Open Food Facts Wrapper with Spring Boot
Welcome to the Open Food Facts Wrapper! This repository contains a Spring Boot application designed to interact with the Open Food Facts API. The goal of this project is to provide Java developers with a simple and efficient way to access and use the vast database of food products provided by Open Food Facts.

## Features

- **Java and Spring Boot**: Built with Java 17 and Spring Boot 3.2.2 for modern and efficient back-end development.
- **Open Food Facts API Integration**: Seamlessly interacts with the Open Food Facts API to fetch and process food product data.
- **RESTful API Endpoints**: Exposes a set of RESTful endpoints to retrieve data from the Open Food Facts database.
- **Springdoc OpenAPI UI**: Incorporates Springdoc OpenAPI for API documentation and testing interface.
- **Project Lombok**: Uses Lombok for reducing boilerplate code in models and other classes.
- **Developer Tools**: Includes Spring Boot Devtools for rapid application development and testing.

## Getting Started

1. Clone the repository:
`git clone https://github.com/DeaLeSa/openfoodfacts-wrapper.git`

2. Create an application.properties file
To set up your Spring Boot application, create an `application.properties` file in the `src/main/resources` directory with the following content:
`server.port=8080`

3. Navigate to the project directory: `cd openfoodfacts-wrapper`

4. Build the project: `mvn clean install`

5. Run the application: `mvn spring-boot:run`

The application will start running on http://localhost:8080.

## Using the Wrapper

Once the application is running, you can access the following RESTful endpoints:

**/api/v1/products/7622210449283**: Retrieves detailed information about a product with the specified barcode.  
**/api/v1/products?nutriscore=b&brand=Innocent&category=Orange%20juice&page=1**: Searches for products based on queries.

## Contributing 🤝

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".

Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (git checkout -b feature/AmazingFeature)
3. Commit your Changes (git commit -m 'Add some AmazingFeature')
4. Push to the Branch (git push origin feature/AmazingFeature)
5. Open a Pull Request

### Getting Started

Not sure where to start? Look at our open issues for areas where you can contribute. Even updating documentation, fixing typos, or clarifying instructions are significant contributions that help make the project better.

### Questions?

Have any questions or need guidance? Feel free to reach out to the project maintainers or open an issue for discussion. We're here to help and make sure your contributing experience is smooth and enjoyable.

Thank you for being a part of this journey. Your contributions not only help improve the project but also make the tech community a better place. Let's build something amazing together!

