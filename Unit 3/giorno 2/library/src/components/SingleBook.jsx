import { useState } from "react";
import { Col, Card } from "react-bootstrap";
// import CommentArea from "./CommentArea"

const SingleBook = (props) => {
  const [selected, setSelected] = useState(false);

  // state = {
  //     selected: false
  // }

  return (
    <>
      <Col sm={12} md={6} lg={4} className="g-4" data-testid="singlebook">
        <Card
          className={`h-100 ${selected ? "border border-2 border-danger" : ""}`}
        >
          <Card.Img
            className="h-100"
            variant="top"
            src={props.book.img}
            onClick={(e) => {
              // this.setState({
              //     selected: !this.state.selected
              // })
              setSelected(!selected);
              props.onSelectedBook(props.book.asin);
            }}
            value={selected}
          />
          <Card.Body>
            <Card.Title>{props.book.title}</Card.Title>
            <Card.Text>Price: {props.book.price} €</Card.Text>
          </Card.Body>
        </Card>
      </Col>
      {/* <Col>
                {this.state.selected && (
                    <CommentArea bookID= {this.props.book.asin}/>
                )}
                </Col> */}
    </>
  );
};

export default SingleBook;
