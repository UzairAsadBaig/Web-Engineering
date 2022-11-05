const loginID = document.querySelector("#loginID");
const password = document.querySelector("#password");
const idErr = document.querySelector("#idErr");
const passErr = document.querySelector("#passErr");

const checkEmpty = function (text) {
  if (text === "") return true;
  else false;
};

const checkNumber = function (text) {
  const numbers = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "0"];
  let bool = false;
  numbers.forEach((element) => {
    if (text.indexOf(element) != -1) bool = true;
  });

  return bool;
};

loginID.addEventListener("blur", function () {
  if (checkEmpty(loginID.value)) idErr.textContent = "ID cannot be empty";
  // if(checkNumber(loginID.value))
  // idErr.textContent="ID cannot contain number";
});
password.addEventListener("blur", function () {
  if (checkEmpty(loginID.value))
    passErr.textContent = "password cannot be empty";
  // if(checkNumber(loginID.value))
  // idErr.textContent="ID cannot contain number";
});
