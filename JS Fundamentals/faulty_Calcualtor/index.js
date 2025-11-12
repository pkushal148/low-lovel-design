let a = prompt("Enter a number");
let op = prompt("Enter the operation");
let b = prompt("Enter a second number");

let x = Math.random();
let map = {
  "+": "-",
  "-": "+",
  "*": "/",
  "/": "*",
};
if (x > 0.1) {
  alert("The result is: " + eval(a + op + b));
} else {
  op = map[op];
  alert("The result is: " + eval(a + op + b));
}
