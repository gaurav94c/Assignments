
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Athlete List</h1>
<table border="3" width="80%" cellpadding="3">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Gender</th>
		<th>Email</th>
		<th>Mobile</th>
	</tr>
	
	<c:forEach var="ath" items="${list}">
		<tr>
			<td>${ath.id}</td>
			<td>${ath.name}</td>
			<td>${ath.gender}</td>
			<td>${ath.email}</td>
			<td>${ath.mobile}</td>
		</tr>
	</c:forEach>
</table>
<br />
<a href="athleteform">Add New Athlete</a>


