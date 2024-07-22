class User {
    constructor(_firstName, _lastName, _age, _location){
        this.firstName = _firstName
        this.lastName = _lastName
        this.age = _age
        this.location= _location
    }

    confronto= function(user) {
        if (this.age > user.age)
            return user.firstName + " è minore di " + this.firstName;
        else if (this.age <user.age)
            return user.firstName + " è maggiore di " + this.firstName;
        else (this.age === user.age)
        return user.firstName + " è coetaneo di " + this.firstName;
    }
}

const user1 = new User("Mario", "Rossi", 30, "Milano");
const user2 = new User("Dario", "Bianchi", 20, "Milano");
const user3 = new User("Carlo", "Neri", 35, "Milano");
const user4 = new User("Maria", "Verdi", 28, "Milano");

console.log (user4.confronto(user2))



//esercizio 2

class Pet {
    constructor(petNameValue, ownerNameValue, speciesValue, breedValue) {
        this.petName = petNameValue
        this.ownerName = ownerNameValue
        this.species = speciesValue
        this.breed = breedValue
    }
} 


const button = document.querySelector("button")
button.addEventListener("click", function (e){
    e.preventDefault()
    
    const petNameValue = document.getElementById("petName").value
    const ownerNameValue = document.getElementById("ownerName").value
    const speciesValue = document.getElementById("species").value
    const breedValue = document.getElementById("breed").value
    const ul = document.querySelector("ul")
    
    const elment = new Pet (petNameValue, ownerNameValue, speciesValue, breedValue)

   const newListElement =  document.createElement("li")
    newListElement.innerText= "animale"

    ul.appendChild(newListElement)
})


