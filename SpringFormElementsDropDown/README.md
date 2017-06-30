This is tutorial 9 for Spring MVC which uses Spring form elements for drop down in a webpage.

The only change from tutorial 8 is in index.jsp, hello.jsp, Information.java and HelloController.java

1. In index.jsp the drop down is defined to select Country by using Spring form elements.
2. In Information.java a String country is defined.
3. In HelloController.java to store the drop down value selected we are using model.addObject("country", userInfo.getCountry()).
4. In hello.jsp the value of Country is shown using ${country}.

If you are writing the code from scratch then make sure to verify the steps given in tutorial 1 SpringMvcTemplate project.

Just remember to update Context root and package name to tutorial9.springmvc after copying tutorial 8 SpringFormElementsRadioButtonPart2 project.
