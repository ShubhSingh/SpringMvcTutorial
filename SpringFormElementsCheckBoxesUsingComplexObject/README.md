This is tutorial 13 for Spring MVC which uses Spring form elements for checkboxes in a webpage.

The only change from tutorial 12 is in index.jsp and HelloController.java

1. In index.jsp the checkboxes are defined to select Visited Countries by using Spring form elements. But this time it is able to store Visited Countries info in complex object i.e. LinkedHashMap.
2. In Information.java an array of visitedCountries[] is defined.
3. In HelloController.java a LinkedhashMap<String, String> visitedCountries is defined to store the checkbox values selected.
4. In hello.jsp the list of Visited Countries is shown using JSTL tag.

If you are writing the code from scratch then make sure to verify the steps given in tutorial 1 SpringMvcTemplate project.

Just remember to update Context root and package name to tutorial13.springmvc after copying tutorial 12 SpringFormElementsCheckBoxes project.
