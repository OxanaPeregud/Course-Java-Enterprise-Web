<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Calculate Rectangle Area</title>
</head>
<body>

<form name="calculate" action="${pageContext.request.contextPath}/calculate-rectangle-area" method="POST">

    <div>
        <h3>Calculating Rectangle Area</h3>
    </div>

    <table>
        <tr>
            <td>Enter first side:</td>
            <td><label>
                <input type="text" name="firstSide"/>
            </label></td>
        </tr>
        <tr>
            <td>Enter second side:</td>
            <td><label>
                <input type="text" name="secondSide"/>
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
