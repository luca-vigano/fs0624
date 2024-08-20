import {Container, Row, Col} from "react-bootstrap"

const MyFooter = function () {
    return (
        <Container>
            <Row>
                <Col sm={6} md={4} lg={4}>sono il footer</Col>
                <Col sm={6} md={4} lg={4}>sono il footer</Col>
                <Col sm={6} md={4} lg={4}>sono il footer</Col>
            </Row>
        </Container>
    )
}

export default MyFooter