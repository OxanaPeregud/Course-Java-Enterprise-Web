<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Students</title>
</head>

<body>
<div id="wrapper">
    <div id="header">
        <h2>Students Table</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
            </tr>

            <%--@elvariable id="students" type="java.util.List"--%>
            <c:forEach var="tempStudent" items="${students}">

                <tr>
                    <td> ${tempStudent.firstName} </td>
                    <td> ${tempStudent.lastName} </td>
                </tr>

            </c:forEach>
        </table>
    </div>

    <p>
        <a href="${pageContext.request.contextPath}/choose-table">Choose Another Table</a>
    </p>

</div>
</body>
</html>
