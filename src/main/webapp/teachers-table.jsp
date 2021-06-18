<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Teachers</title>
</head>

<body>
<div id="wrapper">
    <div id="header">
        <h2>Teachers Table</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
            </tr>

            <%--@elvariable id="teachers" type="java.util.List"--%>
            <c:forEach var="tempTeacher" items="${teachers}">

                <tr>
                    <td> ${tempTeacher.firstName} </td>
                    <td> ${tempTeacher.lastName} </td>
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
