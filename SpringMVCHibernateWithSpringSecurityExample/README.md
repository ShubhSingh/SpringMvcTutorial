##SpringMVCHibernateWithSpringSecurityExample

This is purely Spring annotation based project hence there's no web.xml and spring-config.xml 
nor dispatcher-servlet.xml

To deploy this project you need to maven clean install the project and
 then you can Run as -> Run on Server -> Apache Tomcat 9.
 
 <b>OR</b>
 
To deploy this project you need to maven clean install the project and
 then you can deploy the war through Glassfish Admin console.
 
 Also the tutorial for this project is available at:
 
[http://websystique.com/springmvc/spring-mvc-4-and-spring-security-4-integration-example/](http://websystique.com/springmvc/spring-mvc-4-and-spring-security-4-integration-example/)

Functionality provided in this project are as follows:


1. Run the application. Open browser and go to localhost:8080/SpringMVCHibernateWithSpringSecurityExample/

2. Login with User sam & password abc125, check RememberMe as well.

3. Check database now. An entry should be made in persistent_logins table.

4. Nothing changes for APP_USER table though.

5. Now click on ‘Add new user’ link. Add a user with ‘USER’ role.

6. Click on Register, user should be added.

7. Click on ‘Users List’ link. You should see the newly added user.

8. Add another user with DBA & USER role.

9. Register. Now check the list again. Verify APP_USER table.

10. Now logout. Check persistent_logins table, entry should be removed.

11. Login with user ‘will’ which has ‘User’ role. No Add/Edit/Delete links are available to this user.

12. Now logout and login with ‘bob’. No Add/Delete links are available to this user.

13. Now try to manually type the delete URL in browser-bar and enter.You should see AccessDenied page.

That’s it.