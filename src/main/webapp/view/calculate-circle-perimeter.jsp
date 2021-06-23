<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Calculate Circle Perimeter</title>
</head>
<body>

<form name="calculate" action="${pageContext.request.contextPath}/calculate-circle-perimeter" method="POST">

    <div>
        <h3>Calculating Circle Perimeter</h3>
    </div>

    <table>
        <tr>
            <td>Enter radius:</td>
            <td><label>
                <input type="text" name="radius"/>
            </label></td>
        </tr>
        <th><input type="submit" value="Submit" name="find"/></th>
        <th><input type="reset" value="Reset" name="reset"/></th>
    </table>
    <h2>${perimeter}</h2>
</form>

<p>
    <a href="${pageContext.request.contextPath}/calculating-operations">Choose Another Operation</a>
</p>

</body>
</html>
