const getLibrary = function () {
    fetch("https://striveschool-api.herokuapp.com/books")
        .then((response) => {
            if (response.ok) {
                return response.json()
            } else {
                throw new Error;
            }
        })
        .then((bookList) => {
            generateCArd(bookList)
            console.log(bookList)
        })
        .catch((error) => {
            console.log("Errore", error)
        })
}


const generateCArd = function (arrayOfBook) {
    const pickrow = document.getElementById("row")
    arrayOfBook.forEach(book => {
        const newCol = document.createElement("div")
        newCol.classList.add("col-6", "col-mid-3", "col-lg-2",)
        const newDiv = document.createElement("div")
        newDiv.classList.add("card", "bg-dark", "text-light", "border", "border-light")
        const newImg = document.createElement("img")
        newImg.classList.add("card-img-top")
        newImg.src = book.img
        const newBodyDiv = document.createElement("div")
        newBodyDiv.classList.add("card-body")
        const newTitle = document.createElement("h5")
        newTitle.classList.add("card-title")
        newTitle.innerText = book.title
        const newP = document.createElement("p")
        newP.classList.add("card-text")
        newP.innerText = book.price
        const secondP = document.createElement("p")
        secondP.classList.add("card-text")
        secondP.innerText = book.category
        
        pickrow.appendChild(newCol)
        newCol.appendChild(newDiv)
        newDiv.appendChild(newImg)
        newDiv.appendChild(newBodyDiv)
        newBodyDiv.appendChild(newTitle)
        newBodyDiv.appendChild(newP)
        newBodyDiv.appendChild(secondP)

        const deleteButton = document.createElement("button")
        deleteButton.type = "button"
        deleteButton.classList.add("btn", "btn-sm", "btn-danger")
        deleteButton.innerText = "DELETE"
        deleteButton.addEventListener("click", function (e) {
            e.target.closest(".col").classList.add("d-none")
            newBodyDiv.appendChild(deleteButton)
        })
    });

}

getLibrary()