function add(a, b) {
  return a + b;
}

function displayResult() {
  var nb1 = Number(document.getElementById("nb1").value);
  var nb2 = Number(document.getElementById("nb2").value);
  document.getElementById("result").innerHTML = add(nb1, nb2);
}
