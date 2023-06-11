
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <body bgcolor="aqua">
        <h1>Person List</h1>
        <div>
            <table>
                <tr>
                    <th>First Name </th>
                    <th>Last Name</th>
                    <th>Email </th>
                </tr>
                <c:forEach items="${persons}" var="person">
                    <tr>
                        <td>${person.fName}</td>
                        <td>${person.lName}</td>
                        <td>${person.email}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>