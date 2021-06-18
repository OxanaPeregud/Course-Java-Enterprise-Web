<!DOCTYPE html>
<html>

<head>
    <title>Add Student</title>
</head>

<body>
<div id="wrapper">
    <div id="header">
        <h2>Student Admin</h2>
    </div>
</div>

<div id="container">
    <h3>Add Student</h3>

    <form name="addStudent" action="${pageContext.request.contextPath}/student/add" method="post">

        <label>
            <input type="text" name="studentId" value="${student.id}" hidden>
        </label>

        <table>
            <tbody>

            <tr>
                <td><label>First name:</label></td>
                <td><label><input type="text" name="firstName" value="${student.firstName}" required/></label></td>
            </tr>

            <tr>
                <td><label>Last name:</label></td>
                <td><label><input type="text" name="lastName" value="${student.lastName}" required/></label></td>
            </tr>

            <tr>
                <td><label>Email:</label></td>
                <td><label><input type="email" name="email" value="${student.email}" required/></label></td>
            </tr>

            <tr>
                <td><label></label></td>
                <td><input type="submit" value="Save" class="save"/></td>
            </tr>


            </tbody>
        </table>

    </form>

    <div style="clear: both;"></div>

    <p>
        <a href="${pageContext.request.contextPath}/student/list">Back to List</a>
    </p>

</div>
</body>
</html>
