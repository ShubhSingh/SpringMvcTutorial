# SpringMvcHibernateIntegration

1. To run this project first of all import this maven project into your eclipse workspace.
2. Add derbyclient.jar to Java Build Path
3. Copy derbyclient.jar to src/main/webapp/WEB-INF/lib/
4. Open the project's properties (e.g., right-click on the project's name in the project explorer and select "Properties"). -> Select "Deployment Assembly". -> Click the "Add..." button on the right margin. -> Select "Java Build Path Entries" from the menu of Directive Type and click "Next". -> Select "Maven Dependencies" from the Java Build Path Entries menu and click "Finish".
5. mvn clean install
6. Deploy on Tomcat Server 9.0