##SpringSecurityHelloWorldAnnotationExample

This is purely Spring annotation based project hence there's no web.xml and spring-config.xml 
nor dispatcher-servlet.xml

To deploy this project you need to maven clean install the project and
 then you can Run as -> Run on Server -> Apache Tomcat 9.
 
 <b>OR</b>
 
To deploy this project you need to maven clean install the project and
 then you can deploy the war through Glassfish Admin console.
 
 Also the tutorial for this project is available at:
 
[http://websystique.com/spring-security/spring-security-4-hello-world-annotation-xml-example/](http://websystique.com/spring-security/spring-security-4-hello-world-annotation-xml-example/)

Functionality provided in this project are as follows:


1. Run the application. Open browser and go to localhost:8080/SpringSecurityHelloWorldAnnotationExample/

2. Now try to access admin page on localhost:8080/SpringSecurityHelloWorldAnnotationExample/admin, you will be prompted for login.

3. Provide credentials of a ‘USER’ role i.e. check in SecurityConfiguration.java for the username and password.

4. Submit, you will see AccessDenied Page.

5. Now logout and try to access admin page again and Provide wrong password.

6. Provide proper admin role credentials and login.

7. Now try to access db page on localhost:8080/SpringSecurityHelloWorldAnnotationExample/db, you will get AccessDenied page.

8. Logout, you will be back at home page.

That’s it for the basic introduction.