function submitForm() {
    const firstName = document.getElementById("firstName").value;
    const lastName = document.getElementById("lastName").value;
    const dob = document.getElementById("dob").value;
    const country = document.getElementById("country").value;
    const gender = document.querySelectorAll('input[name="gender"]:checked');
    const profession = document.getElementById("profession").value;
    const email = document.getElementById("email").value;
    const mobile = document.getElementById("mobile").value;

    if (
        !firstName ||
        !lastName ||
        !dob ||
        !country ||
        gender.length === 0 ||
        !profession ||
        !email ||
        !mobile
    ) {
        alert("Please fill in all the fields.");
        return;
    }

    const genderValues = Array.from(gender).map(item => item.value).join(", ");

    document.getElementById("popupFirstName").textContent = firstName;
    document.getElementById("popupLastName").textContent = lastName;
    document.getElementById("popupDob").textContent = dob;
    document.getElementById("popupCountry").textContent = country;
    document.getElementById("popupGender").textContent = genderValues;
    document.getElementById("popupProfession").textContent = profession;
    document.getElementById("popupEmail").textContent = email;
    document.getElementById("popupMobile").textContent = mobile;

    document.getElementById("resultPopup").style.display = "block";


    document.getElementById("surveyForm").reset();
}

function closePopup() {

    document.getElementById("resultPopup").style.display = "none";
}
