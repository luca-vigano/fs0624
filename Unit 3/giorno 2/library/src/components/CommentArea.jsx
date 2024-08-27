import { useEffect, useState } from "react";
import ListGroup from 'react-bootstrap/ListGroup';
import AddComment from "./AddComment";


const CommentArea = (props) => {

    const[recensioni, setRecensioni]= useState([])

    // state = {
    //     recensioni: []
    // }
     const commentFetch = () => {
        fetch("https://striveschool-api.herokuapp.com/api/comments/"+ props.bookID, {
            headers: {
                "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NmNjN2E0M2ZkZWUzZDAwMTU5YmRlZjYiLCJpYXQiOjE3MjQ2NzY2NzUsImV4cCI6MTcyNTg4NjI3NX0.thO-bjFuB4ASlBFLjZi-vUJzgkYsWgVfli-_PUQNli0"
            }
        })
        .then((response) => {
            // finale buono :)
            if (response.ok) {
              // la chiamata ha tornato 200
              return response.json()
            } else {
              // la chiamata ha tornato 400, 401, 403, 404, 500
              throw new Error('La chiamata non è andata a buon fine')
            }
          })
          .then((arrayOfRecensioni) => {
            console.log('RECENSIONI RECUPERATE DAL SERVER', arrayOfRecensioni)
                // this.setState ({
                //     recensioni:arrayOfRecensioni
                // })
                setRecensioni(arrayOfRecensioni)
          })
          .catch((err) => {
            // finale cattivo :( problema di rete?
            console.log('ERRORE NEL RECUPERO DATI (internet)?', err)
          })
    }


useEffect(() => {
    commentFetch()
},[props.selectedBook])


// componentDidMount = () => {
//     this.commentFetch()
// }

// componentDidUpdate = (prevProps) => {
//     if (prevProps.selectedBook !== props.selectedBook){
//         this.commentFetch()
//     }

// }

        return (
            <>
            <ListGroup>
                {recensioni.map((rec) =>{
                    return(
                        <ListGroup.Item>{rec.comment}</ListGroup.Item>
                    )
                })}
          </ListGroup>
          <AddComment bookID={props.bookID} />
            </>
        )
}

export default CommentArea