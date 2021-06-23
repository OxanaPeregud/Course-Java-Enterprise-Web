<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Select</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/view/multiple-tables.css">
</head>

<body>

<div class="dropdown">
    <button class="dropdown-button">Tables Dropdown</button>
    <div class="dropdown-list">

        <label>
            <select onchange="location = this.value;">
                <option>Choose table</option>
                <option value="${pageContext.request.contextPath}/get-students-table">Students</option>
                <option value="${pageContext.request.contextPath}/get-teachers-table">Teachers</option>
                <option value="${pageContext.request.contextPath}/get-tasks-table">Tasks</option>
            </select>
        </label>

    </div>
</div>

</body>
</html>
