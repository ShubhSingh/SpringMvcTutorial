All the Examples are built using jdk1.8.

This is a template for Spring MVC tutorials and can be copied to build different examples.

Just remember to update Context root after copying by going into 

Project Properties --> Web Project Settings --> Context root: (New value to be updated)


Be very careful with this in Dispatcher servlet xml:

<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans 
	http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
	http://www.springframework.org/schema/context 
	http://www.springframework.org/schema/context/spring-context-3.0.xsd">
	
Also check Project Facets java version in Properties and also Targeted runtimes.

Following are the jars in WEB-INF/lib directory
![lib directory](https://github.com/ShubhSingh/SpringMvcTutorial/SpringMvcTemplate/lib.JPG)
