# Calculator
This is a Web-based Calculator using Java and Spring MVC framework.

Process to make Calculator:

1. Create GitHub account and repo
2. Download Eclipse Mars and install Tomcat 8.0.36 and JDK 7.79
3. Create a new Dynamic Web Project and link the targeted runtime (tomcat) and version of Java
4. Download and copy all the libs from "spring-framework-4.3.2.RELEASE-dist" and "commons-logging-1.2-bin" to project
5. In web.xml, I defined the front controller (dispatcher-servlet) of the MVC framework
6. In spring-dispatcher-servlet, I defined everything that it would need to carry out the MVC process (ex. viewResolver, where to scan for controllers, etc)
7. I made a HomeController class and a HomePage page to see how the two interacted
8. After it was up and running I added another servlet page and seen how the controller could interact between the two.
9. I then used bare HTML on the servlet pages to ensure that I had functionality down pat
10. After it was working how I wanted, I linked BootStrap and made it look nice

To be able to run the application download and import the project, start a server and run the project on the server or you can build the project and deploy the .war file to the server.

Once started use the URL: http://localhost:8080/Calculator/home then type in the given input. After that hit calculate. It will bring you to the http://localhost:8080/Calculator/result page with the result. Hit the back button to navigate back. 

(Tested on Google Chrome)
