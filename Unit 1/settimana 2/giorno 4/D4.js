/* ESERCIZIO 1
 Scrivi una funzione di nome "area", che riceve due parametri (l1, l2) e calcola l'area del rettangolo associato.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("***** ESERCIZIO 1 *****");

let x1 = 100;
let x2 = 5;


function area(l1, l2) {
    return l1 * l2;
}
console.log(area(x1, x2));

/* ESERCIZIO 2
 Scrivi una funzione di nome "crazySum", che riceve due numeri interi come parametri.
 La funzione deve ritornare la somma dei due parametri, ma se il valore dei due parametri è il medesimo deve invece tornare
 la loro somma moltiplicata per tre.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("***** ESERCIZIO 2 *****");

function crazySum(n1, n2) {
    if (n1 !== n2) {
        return n1 + n2;
    } else {
        return (n1 + n2) * 3;
    }
}

crazySum(x1, x2);

console.log(crazySum(x1, x2));


/* ESERCIZIO 3
 Scrivi una funzione di nome "crazyDiff" che calcola la differenza assoluta tra un numero fornito come parametro e 19.
 Deve inoltre tornare la differenza assoluta moltiplicata per tre qualora il numero fornito sia maggiore di 19.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("***** ESERCIZIO 3 *****");

function crazyDiff(n1, n2 = 19) {
    if (n1 > n2) {
        return (n1 - n2) * 3;
    } else {
        return (n1 - n2) * (-1);
    }
}

crazyDiff(x1);

console.log(crazyDiff(x1));


/* ESERCIZIO 4
 Scrivi una funzione di nome "boundary" che accetta un numero intero n come parametro, e ritorna true se n è compreso tra 20 e 100 (incluso) oppure
 se n è uguale a 400.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("***** ESERCIZIO 4 *****");

function boundary(n) {
    return (n > 20 && n <= 100) || n == 400 ? true : false;
}
boundary(x1);

console.log(boundary(x1));

/* ESERCIZIO 5
 Scrivi una funzione di nome "epify" che accetta una stringa come parametro.
 La funzione deve aggiungere la parola "EPICODE" all'inizio della stringa fornita, ma se la stringa fornita comincia già con "EPICODE" allora deve
 ritornare la stringa originale senza alterarla.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("***** ESERCIZIO 5 *****");

const s = "ciao a tutti"
const position = s.search("EPICODE");

function epify(stringa) {
    if (position === 0) {
        return s;
    } else {
        return "EPICODE " + s;
    }
}
epify(s);

console.log(epify(s))

/* ESERCIZIO 6
 Scrivi una funzione di nome "check3and7" che accetta un numero positivo come parametro. La funzione deve controllare che il parametro sia un multiplo
 di 3 o di 7. (Suggerimento: usa l'operatore modulo)
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("***** ESERCIZIO 6 *****");

function check3and7(n) {
    return (n % 3) === 0 || (n % 7) === 0 ? true : false;
}

console.log(check3and7(4));

/* ESERCIZIO 7
 Scrivi una funzione di nome "reverseString", il cui scopo è invertire una stringa fornita come parametro (es. "EPICODE" --> "EDOCIPE")
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log("***** ESERCIZIO 7 *****");

// function reverseString(stringa) {
//         let split= stringa.split;
//         let reverse= split.reverse;
//         let join= reverse.join;
//         return join;
// }

// console.log(reverseString("hello"))

/* ESERCIZIO 8
 Scrivi una funzione di nome "upperFirst", che riceve come parametro una stringa formata da diverse parole.
 La funzione deve rendere maiuscola la prima lettera di ogni parola contenuta nella stringa.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 9
 Scrivi una funzione di nome "cutString", che riceve come parametro una stringa. La funzione deve creare una nuova stringa senza il primo e l'ultimo carattere
 della stringa originale.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 10
 Scrivi una funzione di nome "giveMeRandom", che accetta come parametro un numero n e ritorna un'array contenente n numeri casuali inclusi tra 0 e 10.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
