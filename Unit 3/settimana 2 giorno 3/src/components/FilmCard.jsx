import { Component } from "react"
import { Col, Card } from "react-bootstrap"

class FilmCard extends Component {

        render(){
            return (
                <Col sm={12} md={6} lg={3} className="g-4" >
                    <Card className="h-100 border-0">
                        <Card.Img className="h-100" variant="top" src={this.props.film.Poster}/>
                        <Card.Body className="bg-dark text-light">
                            <Card.Title>{this.props.film.Title}</Card.Title>
                            <Card.Text>
                                Year: {this.props.film.Year}
                            </Card.Text>
                        </Card.Body>
                    </Card>
                </Col>
            )
        }
    }
    
    export default FilmCard