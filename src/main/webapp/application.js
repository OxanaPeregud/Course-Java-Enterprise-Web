function printError(elemId, hintMsg) {
    document.getElementById(elemId).innerHTML = hintMsg;
}

function validateForm() {
    var name = document.contactForm.name.value;
    var email = document.contactForm.email.value;
    var mobile = document.contactForm.mobile.value;
    var course = document.contactForm.course.value;
    var gender = document.contactForm.gender.value;
    var languages = [];
    var checkboxes = document.getElementsByName("languages[]");
    for (var i = 0; i < checkboxes.length; i++) {
        if (checkboxes[i].checked) {
            languages.push(checkboxes[i].value);
        }
    }

    var nameErr = emailErr = mobileErr = courseErr = genderErr = true;
    if (name === "") {
        printError("nameErr", "Please enter your name");
    } else {
        var regex1 = /^[a-zA-Z\s]+$/;
        if (regex1.test(name) === false) {
            printError("nameErr", "Please enter a valid name");
        } else {
            printError("nameErr", "");
            nameErr = false;
        }
    }

    if (email === "") {
        printError("emailErr", "Please enter your email address");
    } else {
        var regex2 = /^\S+@\S+\.\S+$/;
        if (regex2.test(email) === false) {
            printError("emailErr", "Please enter a valid email address");
        } else {
            printError("emailErr", "");
            emailErr = false;
        }
    }

    if (mobile === "") {
        printError("mobileErr", "Please enter your mobile number");
    } else {
        var regex3 = /^[1-9]\d{11}$/;
        if (regex3.test(mobile) === false) {
            printError("mobileErr", "Please enter a valid 12 digit mobile number");
        } else {
            printError("mobileErr", "");
            mobileErr = false;
        }
    }

    if (course === "Select") {
        printError("courseErr", "Please select course you would like to attend");
    } else {
        printError("courseErr", "");
        courseErr = false;
    }

    if (gender === "") {
        printError("genderErr", "Please select your gender");
    } else {
        printError("genderErr", "");
        genderErr = false;
    }

    if ((nameErr || emailErr || mobileErr || courseErr || genderErr) === true) {
        return false;
    } else {
        var dataPreview = "You've entered the following details: \n" +
            "Full Name: " + name + "\n" +
            "Email Address: " + email + "\n" +
            "Mobile Number: " + mobile + "\n" +
            "Course: " + course + "\n" +
            "Gender: " + gender + "\n";
        if (languages.length) {
            dataPreview += "Languages: " + languages.join(", ");
        }
        alert(dataPreview);
    }
}
