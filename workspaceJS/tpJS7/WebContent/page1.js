function testCalcul(op) {
  var a = Number(document.getElementById("nb1").value);
  var b = Number(document.getElementById("nb2").value);
  document.getElementById("result").innerHTML =
    a + " " + op + " " + b + " = " + calcul(a, b, op);
}

function calcul(a, b, op) {
  switch (op) {
    case "+":
      return add(a, b);
    case "-":
      return sub(a, b);
    case "*":
      return mult(a, b);
    case "/":
      return div(a, b);
  }
}

function add(a, b) {
  return a + b;
}

function sub(a, b) {
  return a - b;
}

function mult(a, b) {
  return a * b;
}

function div(a, b) {
  return a / b;
}
