function myFunction() {
  var nom = document.getElementById("nom").value;
  var prenom = document.getElementById("prenom").value;
  var age = document.getElementById("age").value;
  var status;

  if (age >= 0 && age < 18) {
    status = "mineur";
  } else if (age < 120) {
    status = "majeur";
  } else {
    status = "erreur";
  }

  var personne = { nom: nom, prenom: prenom, age: age, status: status };

  var str =
    "Nom: " +
    personne.nom +
    "<br>Prenom: " +
    personne.prenom +
    "<br>Age: " +
    personne.age +
    "<br>Status: " +
    personne.status;

  document.getElementById("result").innerHTML = str;
}

function formatNom() {
  var x = document.getElementById("nom");
  x.value = x.value.toUpperCase();
}

function formatPrenom() {
  var x = document.getElementById("prenom");
  x.value = x.value.toLowerCase();
}
