This is tutorial3 for Spring MVC which add complex data to model and then reads this complex data using JSTL.

Just remember to update Context root after copying SpringMvcTemplate by going into 

Project Properties --> Web Project Settings --> Context root: (New value to be updated)

Also update package name.

Be very careful with this in Dispatcher servlet xml:

<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans 
	http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
	http://www.springframework.org/schema/context 
	http://www.springframework.org/schema/context/spring-context-3.0.xsd">
	
Also check Project Facets java version in Properties and also Targeted runtimes.