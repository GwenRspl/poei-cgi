function Article(id, name, price) {
  this.id = id;
  this.name = name;
  this.price = price;
}

function FactureLine(article, quantite, totalLinePrice) {
  this.article = article;
  this.quantite = quantite;
  this.totalLinePrice = totalLinePrice;
}

var foret = new Article(1, "Forêt Noire", 15);
var pb = new Article(2, "Paris Brest", 4);
var opera = new Article(3, "Opéra", 5);
var trianon = new Article(4, "Trianon", 3);
var articleList = [foret, pb, opera, trianon];
var panier = [];

function initSelect() {
  var str;
  articleList.forEach(article => {
    str += "<option value='" + article.id + "'>" + article.name + "</option>";
  });
  document.getElementById("select").innerHTML = str;
}

function add() {
  var quantite = Number(document.getElementById("quantite").value);
  var select = document.getElementById("select").value;
  var selectedArticle;
  articleList.forEach(article => {
    if (select == article.id) {
      selectedArticle = article;
    }
  });
  var found = false;
  for (let i = 0; i < panier.length; i++) {
    if (panier[i].article.id == selectedArticle.id) {
      panier[i].quantite = panier[i].quantite + quantite;
      panier[i].totalLinePrice = panier[i].quantite * panier[i].article.price;
      found = true;
    }
  }
  if (found == false) {
    var line = new FactureLine(
      selectedArticle,
      quantite,
      quantite * selectedArticle.price
    );
    panier.push(line);
  }
}

function displayCart() {
  document.getElementById("client").disabled = true;
  document.getElementById("maleGender").disabled = true;
  document.getElementById("femaleGender").disabled = true;

  var gender;
  if (document.getElementById("maleGender").checked) {
    gender = "Mr";
  } else {
    gender = "Mme";
  }
  var clientName = document.getElementById("client").value;

  var str = "<h2>Facture de " + gender + " " + clientName + "</h2>";
  if (document.getElementById("detail").checked) {
    str += detail();
  }
  if (document.getElementById("total").checked) {
    str += total();
  }
  document.getElementById("result").innerHTML = str;
}

function detail() {
  var str =
    "<table class='table table-striped'><thead class='thead-dark'><tr><th>Quantité</th><th>Article</th><th>Prix</th></thead></tr>";

  panier.forEach(line => {
    str += "<tr>";
    str += "<td>" + line.quantite + "</td>";
    str +=
      "<td>" + line.article.name + " - " + line.article.price + "\u20AC </td>";
    str += "<td>" + line.totalLinePrice + "\u20AC </td>";
    str += "</tr>";
  });
  str += "</table>";
  return str;
}

function total() {
  var str = "<h3>Total: ";
  var count = 0;
  panier.forEach(line => {
    count += line.totalLinePrice;
  });
  str += count + "\u20AC</h3>";
  return str;
}
