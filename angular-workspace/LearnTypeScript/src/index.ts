let numberArray: number[] = [2, 5, 4, 8];
let stringArray: string[] = ["un", "deux", "trois"];
let stringArray2: Array<string> = ["un", "deux", "trois"];

let firstName: string = "Gwen";
let familyName: string = "Rspl";
let fullName: string = `${firstName} ${familyName}`;

// console.log(fullName);
// console.log(numberArray, stringArray);
// console.log(firstName, familyName);

function subtract(a: number, ...otherNumber: number[]): number {
  for (let nb of otherNumber) {
    a -= nb;
  }
  return a;
}

console.log(subtract(1000, 2000, 1000, 3000, 5000, 10));
console.log(subtract(5, 10, 20));
console.log(subtract(25, 5, 5));
