const uname = document.querySelector("#name");
const email = document.querySelector("#email");
const password = document.querySelector("#password");
const cpassword = document.querySelector("#cpassword");
const uForm = document.querySelector("#uForm");

const checkEmail = function (email) {
  if (!email.includes("@") || !email.includes(".")) return false;

  if (!email.split("@")[1].includes(".")) return false;

  if (email.split("@")[1].split(".")[1] == "") return false;

  return true;
};

uForm.addEventListener("submit", function (e) {
  e.preventDefault();

  if (
    uname.value == "" ||
    email.value == "" ||
    password.value == "" ||
    cpassword.value == ""
  ) {
    alert("Fill all the fields");
    return;
  }

  if (cpassword.value != password.value) {
    alert("Password doesn't matches with the confirm password");
    return;
  }

  if (!checkEmail(email.value)) {
    alert("Email is invalid");
    return;
  }

  alert("Submitetd succesfully");
});
