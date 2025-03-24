# ShoppingCart - An amazing website [![HitCount](https://img.shields.io/badge/Maintenance%20Level-Not%20Maintained-yellow.svg)]

### Project Overview:
This project is a **web-based E-Commerce platform** that allows users to browse products, add them to their cart, and complete purchases. The backend is developed using **Java Spring MVC**, and the deployment process is automated using **Jenkins**. The application is hosted on **Tomcat** and interacts with a **H2 database** for storing user and product data.


### Functionalities:

1. User Registeration Cell.

2. **CRUD Operations** like

* User can add product to their cart and purchase summary.
* Admin can add product to the product list.
* Admin can edit the product details.
* Admin can delete the product from the list.

3. **Spring Security**

* User can login into the site.
* User can logout after completing.

4. **Spring WebFlow**

* After adding products in cart the User can checkout.
* Confirming User Details.
* Confirming Shipping and Billing Address.
* Receipt.
* If the user cancels the webflow, it will go to cancel Page.
* If the user submits the checkout, it will go to thank you page with the timing of delivery Report.

### Tools and Technologies:

* **Version Control** : Git, GitHub
* **Technology** : Bootstrap, Java, Spring MVC, Hibernate, JSP, Maven.
* **Build & CI/CD** : Jenkins, Maven
* **Code Quality Analysis** : SonarQube
* **Application Servicer**: Apache Tomcat Server.
* **Database** : H2 Database (In memory database)
* **Monitoring & Logging** : Prometheus, Grafana

### Installation:

1. Development Platform - Eclipse / IntelliJ Idea
   * [Download Eclipse](https://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/mars2).
   * [Download IntelliJ Idea](https://www.jetbrains.com/idea/download/#section=windows).
2. Server - Apache Tomcat Server

   * [Download Apache Server](https://tomcat.apache.org/download-70.cgi).

3. Build Tool - Maven

   * [Download Maven](https://maven.apache.org/download.cgi).

4. Database - H2 Database

   * [Download H2 Database](http://www.h2database.com/html/download.html).
     
5. CI/CD Tool - Jenkins
   * [Install Jenkins](https://www.jenkins.io/doc/book/installing/linux/)

6. Deploy Tool - Tomcat
   * [Download Tomcat](https://tomcat.apache.org/download-90.cgi)

7. Monitoring Tool - Prometheus
   * [Install Prometheus](https://www.cherryservers.com/blog/install-prometheus-ubuntu)

8. Visualization Tool - Grafana
   * [Install Grafana](https://www.cherryservers.com/blog/install-grafana-ubuntu)
   
5. Installation of maven in eclipse - [Click Here](https://stackoverflow.com/questions/8620127/maven-in-eclipse-step-by-step-installation).

6. Clone the repository and import it to eclipse.

7. Run your H2 Database.

8. Configure your databse configuration in **application-context.xml**.

   * Database properties:


        <!-- database properties DataSource -->

            <bean id="dataSource"
              class="org.springframework.jdbc.datasource.DriverManagerDataSource">
              <property name="driverClassName" value=YOUR DB DRIVER CLASS NAME" />
              <property name="url" value="YOUR DB URL" />
              <property name="username" value="YOUR DB USERNAME" />
              <property name="password" value="YOUR DB PASSWORD" />
            </bean>

      * Database Dialect:

            <prop key="hibernate.dialect">YOUR DB DIALECT</prop>

9. Run the server.

#### Contribution

Contributors are most welcome.

### ScreenShots:

* Home Page:

![Alt text](https://github.com/ikismail/ShoppingCart/blob/master/src/main/webapp/WEB-INF/resource/images/screenshots/Home.jpg "Home Page")


