<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Calculate Cube Area</title>
</head>
<body>

<form name="calculate" action="${pageContext.request.contextPath}/calculate-cube-area" method="POST">

    <div>
        <h3>Calculating Cube Area</h3>
    </div>

    <table>
        <tr>
            <td>Enter side:</td>
            <td><label>
                <input type="text" name="side"/>
            </label></td>
        </tr>
        <th><input type="submit" value="Submit" name="find"/></th>
        <th><input type="reset" value="Reset" name="reset"/></th>
    </table>
    <h2>${area}</h2>
</form>

<p>
    <a href="${pageContext.request.contextPath}/calculating-operations">Choose Another Operation</a>
</p>

</body>
</html>
