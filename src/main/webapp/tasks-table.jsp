<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Tasks</title>
</head>

<body>
<div id="wrapper">
    <div id="header">
        <h2>Tasks Table</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <table>
            <tr>
                <th>Task</th>
            </tr>

            <%--@elvariable id="tasks" type="java.util.List"--%>
            <c:forEach var="tempTask" items="${tasks}">

                <tr>
                    <td> ${tempTask.taskName} </td>
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
