"use strict";
let numberArray = [2, 5, 4, 8];
let stringArray = ["un", "deux", "trois"];
let stringArray2 = ["un", "deux", "trois"];
let firstName = "Gwen";
let familyName = "Rspl";
let fullName = `${firstName} ${familyName}`;
// console.log(fullName);
// console.log(numberArray, stringArray);
// console.log(firstName, familyName);
function subtract(a, ...otherNumber) {
    for (let nb of otherNumber) {
        a -= nb;
    }
    return a;
}
console.log(subtract(1000, 2000, 1000, 3000, 5000, 10));
console.log(subtract(5, 10, 20));
console.log(subtract(25, 5, 5));
