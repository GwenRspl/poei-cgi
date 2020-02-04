function Personne(nom, prenom, age) {
  this.nom = nom;
  this.prenom = prenom;
  this.age = age;
  this.status = this.age < 18 ? "mineur" : "majeur";
}

var list = [];

function add() {
  var p = new Personne(
    document.getElementById("nom").value,
    document.getElementById("prenom").value,
    document.getElementById("age").value
  );
  list.push(p);
  document.getElementById("success").innerHTML =
    p.prenom + " " + p.nom + " a bien été ajouté à la liste.";
}

function print() {
  var result =
    "<table class='table'><thead class='thead-dark'><tr><th>Nom</th><th>Prenom</th><th>Age</th><th>Status</th></thead></tr>";
  list.forEach(element => {
    result += "<tr><td>" + element.nom + "</td>";
    result += "<td>" + element.prenom + "</td>";
    result += "<td>" + element.age + "</td>";
    result += "<td>" + element.status + "</td></tr>";
  });
  result += "</table>";
  document.getElementById("result").innerHTML = result;
}
