import { useEffect, useState } from "react";
import { Form, Button } from "react-bootstrap";

const AddComment = (props) => {
    // state = {
    //     commento:{
    //         comment: "",
    //         elementId: this.props.bookID,
    //         rate: 5,
    //     }
    // }

    const [commento, setCommento] = useState({
        comment: "",
        elementId: props.bookID,
        rate: 5,
    })
     useEffect(()=>{
        setCommento({...commento, elementId:props.bookID})
     // eslint-disable-next-line react-hooks/exhaustive-deps
     }, [props.bookID])
    return (
        <>
            <Form>
                <Form.Group className="mb-3" controlId="exampleForm.ControlTextarea1">
                    <Form.Label>Example textarea</Form.Label>
                    <Form.Control as="textarea" rows={3}
                        onChange={(e) => {
                            // this.setState({
                            //     commento: {
                            //         ...this.state.commento,
                            //         comment: e.target.value

                            //     }
                            // })
                            setCommento({ 
                                ...commento,
                                comment: e.target.value })
                        }}
                        value={commento.comment}
                    />
                </Form.Group>
                <Button variant="primary"
                    onClick={(e) => {
                        NewComment()
                    }}
                >INVIO</Button>{' '}
            </Form>
        </>
    )

    function NewComment () {

        console.log(commento)
        fetch("https://striveschool-api.herokuapp.com/api/comments/", {
            headers: {
                "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NmNjN2E0M2ZkZWUzZDAwMTU5YmRlZjYiLCJpYXQiOjE3MjQ2NzY2NzUsImV4cCI6MTcyNTg4NjI3NX0.thO-bjFuB4ASlBFLjZi-vUJzgkYsWgVfli-_PUQNli0",
                "content-type": "application/json"
            },
            method: "POST",
            body: JSON.stringify(commento)
        })
            .then((response) => {
                // finale buono :)
                if (response.ok) {
                    // la chiamata ha tornato 200
                    console.log("post mandata")
                } else {
                    // la chiamata ha tornato 400, 401, 403, 404, 500
                    throw new Error('La chiamata non è andata a buon fine')
                }
            })
            .catch((err) => {
                // finale cattivo :( problema di rete?
                console.log('ERRORE NEL RECUPERO DATI (internet)?', err)
            })
    }

}

export default AddComment