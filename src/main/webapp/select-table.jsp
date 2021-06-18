<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Select</title>
</head>

<body>

<label>
    <select name="tables" onchange="location = this.value;">
        <option>Choose table</option>
        <option value="${pageContext.request.contextPath}/get-students-table">Students</option>
        <option value="${pageContext.request.contextPath}/get-teachers-table">Teachers</option>
        <option value="${pageContext.request.contextPath}/get-tasks-table">Tasks</option>
    </select>
</label>

</body>
</html>
