function print() {
  var json =
    '{"societe": [{"employe": {"nom": "Haddock","prenom": "Capitaine","age": 43,"majeur": true,"adresse": {"numero": 5,"rue": "rue des algues","cp": "36000"},"compte": {"banque": "ING","rib": "78945622548"},"affectation": null}},{"employe": {"nom": "Tournesol","prenom": "Professeur","age": 62,"majeur": true,"adresse": {"numero": 7,"rue": "rue des horloges","cp": "36000"},"compte": {"banque": "N26","rib": "78945992548"},"affectation": {"projet": "projet1"}}}]}';

  var parsed = JSON.parse(json);

  var result = "<h1>Société</h1>";
  for (var i = 0; i < parsed.societe.length; i++) {
    result += "<p>";
    result +=
      parsed.societe[i].employe.prenom +
      " " +
      parsed.societe[i].employe.nom +
      "<br>";
    result +=
      parsed.societe[i].employe.adresse.numero +
      " " +
      parsed.societe[i].employe.adresse.rue +
      " " +
      parsed.societe[i].employe.adresse.cp +
      "<br>";
    result += "</p>";
  }
  console.log(result);

  document.getElementById("result").innerHTML = result;
}
