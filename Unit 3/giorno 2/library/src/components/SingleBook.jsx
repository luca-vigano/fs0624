import { Component } from "react"
import { Col, Card } from "react-bootstrap"


class SingleBook extends Component {

state = {
    selected: false
}

    render(){
        return (
            <Col sm={12} md={6} lg={4} className="g-4" >
                <Card className={`h-100 ${this.state.selected ? "border border-danger" : ""}`}>
                    <Card.Img className="h-100" variant="top" src={this.props.book.img} 
                    onClick={(e) =>{
                        this.setState({
                            selected: !this.state.selected
                        })
                    }}
                    value={this.state.selected}
                    />
                    <Card.Body>
                        <Card.Title>{this.props.book.title}</Card.Title>
                        <Card.Text>
                            Price: {this.props.book.price} €
                        </Card.Text>
                    </Card.Body>
                </Card>
            </Col>
        )
    }
}

export default SingleBook