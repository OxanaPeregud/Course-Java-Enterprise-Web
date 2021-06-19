<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Tasks</title>
    <link type="text/css" rel="stylesheet" href="multiple-tables.css">
</head>

<body>
<div id="wrapper">
    <div id="header">
        <h2>Tasks Table</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <input type="button" value="Add Tasks"
               onclick="window.location.href='add-tasks'; return false;"
               class="add-button"
        />

        <table>
            <tr>
                <th>Task ID</th>
                <th>Task</th>
            </tr>

            <%--@elvariable id="tasks" type="java.util.List"--%>
            <c:forEach var="tempTask" items="${tasks}">

                <tr>
                    <td> ${tempTask.taskId} </td>
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
