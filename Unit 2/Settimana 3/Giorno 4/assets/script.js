const getAlbum = function (value) {
    fetch("https://api.pexels.com/v1/search?query=" + value, {
        headers: {
            Authorization: "L7nqZoWF7OaBOV7VgbP9mgAKcFEDTsLgz976ri3cJpWNNmhaw2eafeDG"
        }
    })
        .then((Response) => {
            console.log(Response)
            if (Response.ok) {
                return Response.json()
            } else {
                throw new Error
            }
        })
        .then((albumFoto) => {
            console.log(albumFoto)

            albumFoto.forEach(foto => {
                const newFotoCol = `
            <div class="col-md-4">
                <div class="card mb-4 shadow-sm">
                    <img src="${foto.url}" class="bd-placeholder-img card-img-top" />
                    <div class="card-body">
                        <h5 class="card-title">Lorem Ipsum</h5>
                        <p class="card-text">
                            This is a wider card with supporting text below as a natural
                            lead-in to additional content. This content is a little bit
                            longer.
                        </p>
                        <div class="d-flex justify-content-between align-items-center">
                            <div class="btn-group">
                                <button type="button" class="btn btn-sm btn-outline-secondary">
                                    View
                                </button>
                                <button type="button" class="btn btn-sm btn-outline-secondary">
                                    Edit
                                </button>
                            </div>
                         <small class="text-muted">9 mins</small>
                        </div>
                    </div>
                </div>
            </div>
            `
                const fotoCard =document.getElementById("foto-card")
                fotoCard.innerHTML = newFotoCol
            });
        })
        .catch((error) => {
            console.log("ERRORE", error)
        })
}

getAlbum("kittens")