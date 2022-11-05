const notifyBtn = document.querySelector("#notifyBtn");
const check1 = document.querySelector("#check1");
const check2 = document.querySelector("#check2");
const check3 = document.querySelector("#check3");

notifyBtn.addEventListener("click", function (e) {
  e.preventDefault();
  if (check1.checked == true) console.log(" Daily E-mail");
  if (check2.checked == true) console.log(" Weekly E-mail ");
  if (check3.checked == true) console.log(" Monthly E-mail ");
});
