import { useState } from "react";
import fantasybook from "../books/fantasy.json";
import SingleBook from "./SingleBook";
import { Container, Row, Col } from "react-bootstrap";
import CommentArea from "./CommentArea";

const BookList = () => {
  // state = {
  //     selectedBook: 0
  // }
  const [selectedBook, setSelectedBook] = useState(0);

  const setId = (bookId) => {
    console.log(bookId);
    setSelectedBook(bookId);

    // this.setState({
    //     ...this.state,
    //     selectedBook: bookId
    // })
  };
  return (
    <Container>
      <Row>
        <Col>
          <Row>
            {fantasybook.map((libro) => {
              return (
                <SingleBook
                  book={libro}
                  onSelectedBook={(bookId) => setId(bookId)}
                  key={libro.asin}
                />
              );
            })}
          </Row>
        </Col>
        <Col>
          <CommentArea selectedBook={selectedBook} />
          {/* <CommentArea selectetBook={this.state.selectedBook} /> */}
        </Col>
      </Row>
    </Container>
  );
};

export default BookList;
