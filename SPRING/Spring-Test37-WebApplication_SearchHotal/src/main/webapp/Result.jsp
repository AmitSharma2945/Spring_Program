<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:choose>
	<c:when test="${not empty result}">
		<table border="1">
			<tr>
				<th>RESTID</th>
				<th>RESTNAME</th>
				<th>RATING</th>
				<th>LOCATION</th>
			</tr>
			<c:forEach var="map" items="${result}">
				<tr>
					<td><c:out value="${map.RESTID}" /></td>
					<td><c:out value="${map.RESTNAME}" /></td>
					<td><c:out value="${map.RATING}" /></td>
					<td><c:out value="${map.LOCATION}" /></td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
      No ResturantBABA Found
 </c:otherwise>
</c:choose>







