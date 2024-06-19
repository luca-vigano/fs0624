/* ESERCIZIO 1
 Scrivi un algoritmo per trovare il più grande tra due numeri interi.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("****** ESERCIZIO 1 ******")

let myNumb = 43;
let myNumb1 = 14;

if (myNumb > myNumb1) {
  console.log(myNumb);
} else {
  console.log(myNumb1);
}

/* ESERCIZIO 2
  Scrivi un algoritmo che mostri "not equal" in console se un numero intero fornito è diverso da 5.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("****** ESERCIZIO 2 ******")

myNumb2 = 6
if (myNumb2 != 5) {
  console.log("not equal");
} else {
  console.log("equal")
}

/* ESERCIZIO 3
  Scrivi un algoritmo che mostri "divisibile per 5" in console se un numero fornito è perfettamente divisibile per 5 (suggerimento: usa l'operatore modulo)
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("****** ESERCIZIO 3 ******")

let number4 = 16;

if (number4 % 5 === 0) {
  console.log("divisibile per 5")
} else {
  console.log("non divisibile per 5")
}

/* ESERCIZIO 4
  Scrivi un algoritmo per verificare che, dati due numeri interi, il valore di uno di essi sia 8 oppure se la loro addizione/sottrazione sia uguale a 8.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("****** ESERCIZIO 4 ******")

let number5 = 15
let number6 = 15

/* ESERCIZIO 5
  Stai lavorando su un sito di e-commerce. Stai salvando il saldo totale del carrello dell'utente in una variabile "totalShoppingCart".
  C'è una promozione in corso: se il totale del carrello supera 50, l'utente ha diritto alla spedizione gratuita (altrimenti la spedizione ha un costo fisso pari a 10).
  Crea un algoritmo che determini l'ammontare totale che deve essere addebitato all'utente per il checkout.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("****** ESERCIZIO 5 ******")

let totalshoppigcart = 55;
let delivery = 10;
let checkOut;

if (totalshoppigcart > 50) {
  checkOut = totalshoppigcart;
} else {
  checkOut = totalshoppigcart + delivery;
}
console.log(checkOut);

/* ESERCIZIO 6
  Stai lavorando su un sito di e-commerce. Oggi è il Black Friday e viene applicato il 20% su ogni prodotto.
  Modifica la risposta precedente includendo questa nuova promozione nell'algoritmo, determinando come prima se le spedizioni sono gratuite oppure no e e calcolando il totale.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("****** ESERCIZIO 6 ******")

let discount = 0.2;
totalshoppigcart = totalshoppigcart * (1- discount)

if (totalshoppigcart > 50) {
  checkOut = totalshoppigcart;
} else {
  checkOut = totalshoppigcart + delivery;
}

/* ESERCIZIO 7
  Crea tre variabili, e assegna un valore numerico a ciascuna di esse.
  Utilizzando un blocco condizionale, crea un algoritmo per ordinarle secondo il loro valore, dal più alto al più basso.
  Alla fine mostra il risultato in console.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("****** ESERCIZIO 7 ******")

let num1 = 15;
let num2 = 15;
let num3 = 15;

if(num1 > num2 && num1 > num3)


/* ESERCIZIO 8
  Crea un algoritmo per verificare che un valore fornito sia un numero oppure no (suggerimento: cerca su un motore di ricerca "typeof").
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("****** ESERCIZIO 8 ******")

let integer = 15

if(typeof(integer) === "number") {
  console.log("è un numero");
} else {
  console.log("non è un numero")
}
/* ESERCIZIO 9
  Crea un algoritmo per controllare se un numero fornito sia pari o dispari (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("****** ESERCIZIO 9 ******")

if (integer % 2 === 0) {
  console.log("pari")
} else {
  console.log("dispari")
}
/* ESERCIZIO 10
  Modifica la logica del seguente algoritmo in modo che mostri in console il messaggio corretto in ogni circostanza.
  
  console.log("****** ESERCIZIO 10 ******")
  
  let val = 7
  if (val < 5) {
      console.log("Meno di 5");
    } else if (val < 10) {
      console.log("Meno di 10");
    } else {
      console.log("Uguale a 10 o maggiore");
    }
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 11
  Fornito il seguente oggetto, scrivi del codice per aggiungere una proprietà "city", il cui valore sarà "Toronto".
*/

console.log("****** ESERCIZIO 11 ******")

const me = {
  name: 'John',
  lastName: 'Doe',
  skills: ['javascript', 'html', 'css'],
}
me.city: "Toronto";

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 12
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere la proprietà "lastName".
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("****** ESERCIZIO 12 ******")

delete me.lastName;
console.log(me);

/* ESERCIZIO 13
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere l'ultimo elemento della proprietà "skills".
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("****** ESERCIZIO 13 ******")

me.skills.length = me.skills.length - 1;
console.log(me);

/* ESERCIZIO 14
  Scrivi del codice per creare un array inizialmente vuoto. Riempilo successivamente con i numeri da 1 a 10.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("****** ESERCIZIO 14 ******")

const myArr = [];

arr[0] =1;
arr[1] =2;
arr[2] =3;
arr[3] =4;
arr[4] =5;
arr[5] =6;
arr[6] =7;
arr[7] =8;
arr[8] =9;
arr[9] =10;
// è preferibile usare il metodo Push()

/* ESERCIZIO 15
  Scrivi del codice per sostituire l'ultimo elemento dell'array, ovvero il valore 10, con il valore 100.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("****** ESERCIZIO 15 ******")

myArr[9] = 100;
console.log(myArr);