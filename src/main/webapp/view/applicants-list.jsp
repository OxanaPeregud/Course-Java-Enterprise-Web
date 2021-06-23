<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Applicants</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/view/style-application.css">
</head>

<body>
<div id="wrapper">
    <div id="header">
        <h2>Applicants Table</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <table>
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Mobile</th>
                <th>Course</th>
                <th>Gender</th>
            </tr>

            <%--@elvariable id="applicants" type="java.util.List"--%>
            <c:forEach var="tempApplicant" items="${applicants}">

                <tr>
                    <td> ${tempApplicant.name} </td>
                    <td> ${tempApplicant.email} </td>
                    <td> ${tempApplicant.mobile} </td>
                    <td> ${tempApplicant.course} </td>
                    <td> ${tempApplicant.gender} </td>
                </tr>

            </c:forEach>
        </table>

    </div>

    <p>
        <a href="${pageContext.request.contextPath}/application-form">Back to Application Form</a>
    </p>

</div>
</body>
</html>
