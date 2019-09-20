<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>
<html>
<body>
	<h3>Student-Entry-Form</h3>
	
		<fr:form action="savestudent" modelAttribute="student">
			<pre>
			RollNo	<fr:input path="rno"/>
			SName	<fr:input path="name"/>
			Branch	<fr:radiobuttons path="branch" items="${branches}" />
			Semestr	<fr:select path="sem" items="${semesters}"/>
				<input type="submit" value="SaveRecord"/>
		</pre>				
		</fr:form>
</body>
</html>