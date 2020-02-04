var secretNumber = Math.floor(Math.random() * 11);
var count = 0;

function verify() {
  count++;
  var guess = document.getElementById("guess").value;
  var result;
  if (guess == secretNumber) {
    result = "Bravo vous avez trouvé le bon numéro en " + count + " coups!";
  } else {
    result = "Mauvais numéro, essayez encore! ";
  }

  document.getElementById("result").innerHTML = result;
}

function verify2() {
  count++;
  var guess = document.getElementById("guess2").value;
  var result;
  if (guess > secretNumber) {
    result = "Mauvais numéro, c'est moins !";
  } else if (guess < secretNumber) {
    result = "Mauvais numéro, c'est plus ! ";
  } else {
    result = "Bravo vous avez trouvé le bon numéro en " + count + " coups!";
  }

  document.getElementById("result2").innerHTML = result;
}

function verify3() {
  count++;
  var result;
  var guess = document.getElementById("guess3").value;
  if (count == 10 && guess != secretNumber) {
    result = "Raté! Vous avez dépassé le nomber maximal de coup";
  } else {
    if (guess > secretNumber) {
      result = "Mauvais numéro, c'est moins !";
    } else if (guess < secretNumber) {
      result = "Mauvais numéro, c'est plus ! ";
    } else {
      result = "Bravo vous avez trouvé le bon numéro en " + count + " coups!";
    }
  }

  document.getElementById("result3").innerHTML = result;
}

function reset() {
  secretNumber = Math.floor(Math.random() * 11);
  count = 0;
  document.getElementById("result").innerHTML = "";
  document.getElementById("result2").innerHTML = "";
  document.getElementById("result3").innerHTML = "";
  document.getElementById("guess").value = "";
  document.getElementById("guess2").value = "";
  document.getElementById("guess3").value = "";
}
