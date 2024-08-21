import { Component } from "react"
import fantasybook from "../books/fantasy.json"
import SingleBook from "./SingleBook"
import { Container, Row } from "react-bootstrap"




class BookList extends Component {
    render() {
        return (
            <Container>
                <Row>
                    {fantasybook.map((libro) => {
                        return (
                            <SingleBook book={libro} key={libro.asin} />
                        )
                    })
                    }
                </Row>
            </Container>

        )
    }
}

export default BookList