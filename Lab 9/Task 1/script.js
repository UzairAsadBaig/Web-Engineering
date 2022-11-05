const button = document.querySelector(".buttonC");

button.addEventListener("click", (e) => {
  e.preventDefault();
  const num1 = Number(prompt("Enter first number"));
  const num2 = Number(prompt("Enter second  number"));
  let result;
  if (e.target.value == "Add") result = num1 + num2;
  if (e.target.value == "Subtract") result = num1 - num2;
  if (e.target.value == "Multiply") result = num1 * num2;
  if (e.target.value == "Divide") result = num1 / num2;

  alert(`Your result is ${result}`);
});
