import { Col, Card } from "react-bootstrap";
import { useNavigate } from "react-router-dom";

const FilmCard = (props) => {
  const navigate = useNavigate();

  return (
    <Col sm={12} md={6} lg={3} className="g-4">
      <Card
        className="h-100 border-0"
        onClick={() => {
          navigate(/movie-detail/ + props.film.imdbID);
        }}
      >
        <Card.Img className="h-100" variant="top" src={props.film.Poster} />
        <Card.Body className="bg-dark text-light">
          <Card.Title>{props.film.Title}</Card.Title>
          <Card.Text>Year: {props.film.Year}</Card.Text>
        </Card.Body>
      </Card>
    </Col>
  );
};

export default FilmCard;
