const getAlbum = function(value){
    fetch("https://api.pexels.com/v1/search?query=" + value,{
        headers:{
            Authorization:"L7nqZoWF7OaBOV7VgbP9mgAKcFEDTsLgz976ri3cJpWNNmhaw2eafeDG"
        }
    })
    .then((Response) =>{
        console.log(Response)
        if(Response.ok){
            return Response.json()
        } else {
            throw new Error
        }
    })
    .then((data) => {
        console.log(data)
    })
    .catch((error) => {
        console.log("ERRORE", error)
    })
}

getAlbum("kittens")