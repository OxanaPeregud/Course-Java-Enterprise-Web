<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Application Form</title>
    <link rel="stylesheet" href="style-application.css">
    <script src="application.js"></script>
</head>

<body>
<form name="contactForm" onsubmit="return validateForm()"
      action="${pageContext.request.contextPath}/save-applicant" method="post">
    <h2>Online Course Application Form</h2>

    <div class="row">
        <label>Full Name</label>
        <label>
            <input type="text" name="name">
        </label>
        <div class="error" id="nameErr"></div>
    </div>

    <div class="row">
        <label>Email Address</label>
        <label>
            <input type="text" name="email">
        </label>
        <div class="error" id="emailErr"></div>
    </div>

    <div class="row">
        <label>Mobile Number</label>
        <label>
            <input type="text" name="mobile" maxlength="12">
        </label>
        <div class="error" id="mobileErr"></div>
    </div>

    <div class="row">
        <label>Course</label>
        <label>
            <select name="course">
                <option>Select</option>
                <option>Java</option>
                <option>C++</option>
                <option>Python</option>
                <option>JavaScript</option>
            </select>
        </label>
        <div class="error" id="courseErr"></div>
    </div>

    <div class="row">
        <label>Gender</label>
        <div class="form-inline">
            <label><input type="radio" name="gender" value="male"> Male</label>
            <label><input type="radio" name="gender" value="female"> Female</label>
        </div>
        <div class="error" id="genderErr"></div>
    </div>

    <div class="row">
        <label>Languages <i>(Optional)</i></label>
        <div class="form-inline">
            <label><input type="checkbox" name="languages[]" value="english"> English</label>
            <label><input type="checkbox" name="languages[]" value="russian"> Russian</label>
            <label><input type="checkbox" name="languages[]" value="spanish"> Spanish</label>
        </div>
    </div>

    <div class="row">
        <input type="submit" value="Submit">
    </div>

</form>
</body>
</html>
