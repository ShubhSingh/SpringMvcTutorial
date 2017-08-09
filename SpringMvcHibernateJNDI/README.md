## SpringMvcHibernateJNDI

This tutorial is for configuring the JNDI Datasource in Tomcat and then using it in your code.

1. To run this project first of all import this maven project into your eclipse workspace.
2. Add src/main/webapp/META-INF/context.xml with following content.

<Context>
    <Resource 
        name="jdbc/DsWebAppDB" 
        auth="Container" 
        type="javax.sql.DataSource" 
        username="user" 
        password="password" 
        driverClassName="org.apache.derby.jdbc.ClientDriver" 
        url="jdbc:derby://localhost:1527/HibernateDerbyDB;create=true" 
        maxActive="8" 
        maxIdle="4"/>
</Context>

2. Add derbyclient.jar to Java Build Path
3. Copy derbyclient.jar to src/main/webapp/WEB-INF/lib/
4. Open the project's properties (e.g., right-click on the project's name in the project explorer and select "Properties"). -> Select "Deployment Assembly". -> Click the "Add..." button on the right margin. -> Select "Java Build Path Entries" from the menu of Directive Type and click "Next". -> Select "Maven Dependencies" from the Java Build Path Entries menu and click "Finish".
5. mvn clean install
6. Deploy on Tomcat Server 9.0
