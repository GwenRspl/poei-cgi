function loadTab() {
  var tab = [
    "Capitaine Haddock",
    "Professeur Tournesol",
    "Tintin",
    "Milou",
    "La Castafiore",
    "Rastapopoulos"
  ];
  var result = "<table border><tr><th>Position</th><th>Nom</th></tr>";
  for (var i = 0; i < tab.length; i++) {
    result += "<tr><td>" + i + "</td><td>" + tab[i] + "</td></tr>";
  }
  result += "</table>";
  document.getElementById("tab").innerHTML = result;
}
