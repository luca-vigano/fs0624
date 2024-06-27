// const createtabellone = (numb) => {
//     const divTabellone = document.getElementById("tabellone");
//     for (let i = 0; i < numb.length; i++) {
//         const numberCellDiv = document.createElement("div");
//         numberCellDiv.classList.add("number");
//         numberCellDiv.innerText = 
//         divTabellone.appendChild(numberCellDiv);

// }

// function generateArray() {
//     let array = [];
//     for (let i = 1; i <= 90; i++) {
//         array.push(i);
//     }
//     return array;
// }
// console.log(generateArray())

// window.addEventListener('load', init());

// function init() {
//     generateArray();
//     createtabellone(generateArray());
// }


const createtabellone = (array) => {
    const divTabellone = document.getElementById("Tabellone");
    for (let i = 0; i < array.length; i++) {
        const numberCellDiv = document.createElement("div");
        const numberCell = document.createElement("h3");
        numberCell.classList.add("numberCell");
        numberCell.innerText = array[i];
        numberCellDiv.appendChild(numberCell);
        divTabellone.appendChild(numberCellDiv);
    }
}

function generateArray() {
    let array = [];
    for (let i = 1; i <= 90; i++) {
        array.push(i);
    }
    return array;
}
console.log(generateArray());

window.addEventListener('load', init);

function init() {
    const array = generateArray();
    createtabellone(array);
}