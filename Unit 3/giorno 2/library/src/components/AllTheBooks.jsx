import { Container, Row, Col, Card } from "react-bootstrap"
import fantasybook from "../books/fantasy.json"

const AllTheBook = function () {
    return (
        <Container>
            <Row>
                {fantasybook.map((book) => {
                    return (
                        <Col sm={12} md={6} lg={4}>
                            <Card >
                                <Card.Img variant="top" src={book.img} />
                                <Card.Body>
                                    <Card.Title>{book.title}</Card.Title>
                                    <Card.Text>
                                        Price: { book.price} €
                                    </Card.Text>
                                </Card.Body>
                            </Card>
                        </Col>
                    )
                })}
            </Row>
        </Container>
    )
}

export default AllTheBook