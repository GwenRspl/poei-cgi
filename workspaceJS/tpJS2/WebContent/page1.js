function myFunction() {
  var nom = document.getElementById("nom").value;
  var prenom = document.getElementById("prenom").value;
  var age = document.getElementById("age").value;
  var status;

  if (age >= 0 && age < 18) {
    status = "mineur";
  } else if (age < 50) {
    status = "majeur";
  } else if (age < 120) {
    status = "senior";
  } else {
    status = "erreur";
  }

  var str =
    "Nom: " +
    nom +
    "<br>Prenom: " +
    prenom +
    "<br>Age: " +
    age +
    "<br>Status: " +
    status;

  document.getElementById("result").innerHTML = str;
}

function f() {
  console.log("done");
}
