# Harbacore.comment

This project creates  completely **Dynamic and Responsive** pages to `dynamically` list the **latest comments** added under the particular page and also a functionality to **Add new comment**.

## Technical Features
- Backed by the latest **SQL Database** .
- All compiled within a decent **Spring MVC Gradle Java** Project Structure.
- I used **Java-8**. You can choose Java-11 or Java-14, either one would work just fine.
- The UI is completely **RESPONSIVE** with the help of **BOOTSTRAP-4 HTMLand CSS**
- The templates handled by **THYMELEAF** template Engine.
- I prefer **Intellij Idea** as the IDE.

## Setup
This was the most crucial and hectic part for me.

`Spring Dependencies`
<br>
<br>
**HEADS UP!! DO NOT MESS THIS** 
<br>
This is [my Gradle build-script](https://github.com/sameer-garg/harbacore.comment/blob/master/build.gradle) for reference.

`Sql Integration`
<br>
<br>
[This](https://https://spring.io/guides/gs/accessing-data-mysql/) is the documentation I followed.
- Also  do not forget to save the config of the project in your application.properties file.
[This](https://github.com/sameer-garg/harbacore.comment/blob/master/src/main/resources/application.properties) can be used for refernce.

`Thymeleaf` 
<br>
<br>
Just in case you aren't familiar with the syntax and all of Thymeleaf( i wasn't too) follow [this right here](https://www.thymeleaf.org/). 

`The Final Project Structure looks something like this`
<br>
<br>
![Image of Project Structure](https://github.com/sameer-garg/harbacore.comment/blob/master/src/main/resources/images/Screenshot%20(193).png)
<br>
<br>
## How to use?
`Running the project`
<br>
<br>
Just scroll into your project root directory and type- gradlew bootrun.
 
`Url's and ports`
<br>
<br>
- To view the commentsof any paricular page just direct to [localhost:8080/show-form](https://localhost:8080/show-form?pg-id=samplepageid) .
<br>
<br>
<br>
# **And There You Have It**
