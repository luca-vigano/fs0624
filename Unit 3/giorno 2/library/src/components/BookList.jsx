import { Component } from "react"
import fantasybook from "../books/fantasy.json"
import SingleBook from "./SingleBook"
import { Container, Row, Col } from "react-bootstrap"
import CommentArea from "./CommentArea"




class BookList extends Component {

    state = {
        selectedBook: 0
    }

    setId= (bookId) => {
        this.setState({
            ...this.state,
            selectedBook:bookId
        })
    }
    render() {
        return (
            <Container>
                <Row>
                    <Col>
                        <Row>
                            {fantasybook.map((libro) => {
                                return (
                                    <SingleBook book={libro} onSelectedBook={(bookId)=>this.setId(bookId)} key={libro.asin} />
                                )
                            })
                            }
                        </Row>
                    </Col>
                    <Col>
                    <CommentArea selectetBook={this.state.selectedBook}/>
                    </Col>
                </Row>
            </Container>

        )
    }
}

export default BookList