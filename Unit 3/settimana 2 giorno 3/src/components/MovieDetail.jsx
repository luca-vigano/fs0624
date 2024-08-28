import { useEffect, useState } from "react";
import { useParams, useNavigate } from "react-router-dom";
import { Col, Container, Row } from "react-bootstrap";
import Image from "react-bootstrap/Image";
import ListGroup from "react-bootstrap/ListGroup";

const MovieDetail = () => {
  const params = useParams();
  const navigate = useNavigate();

  const [film, setFilm] = useState({});
  const [isError, setIsError] = useState(false);

  useEffect(() => {
    fetchMovies();
  }, []);

  const fetchMovies = () => {
    fetch("https://www.omdbapi.com/?apikey=5ace13d8&i=" + params.movieId)
      .then((response) => {
        if (response.ok) {
          return response.json();
        } else {
          throw new Error("La chiamata non è andata a buon fine");
        }
      })
      .then((filmsearch) => {
        setFilm(filmsearch);
        console.log(filmsearch);
      })
      .catch((err) => {
        console.log("ERRORE RECUPERO DATI", err);
        setIsError(true);
      });
  };
  return (
    <Container fluid className="bg-dark m-0 d-flex justify-content-around">
      <Row>
        <Col xs={12} md={6} className="my-2 text-center">
          <Image src={film.Poster} rounded />
        </Col>
        <Col xs={12} md={6} className="my-5">
          <ListGroup>
            <ListGroup.Item className="bg-dark text-light">
              {film.Title}
            </ListGroup.Item>
            <ListGroup.Item className="bg-dark text-light">
              {film.Year}
            </ListGroup.Item>
            <ListGroup.Item className="bg-dark text-light">
              {film.Runtime}
            </ListGroup.Item>
            <ListGroup.Item className="bg-dark text-light">
              {film.Genre}
            </ListGroup.Item>
            <ListGroup.Item className="bg-dark text-light">
              {film.Director}
            </ListGroup.Item>
            <ListGroup.Item className="bg-dark text-light">
              {film.Writer}
            </ListGroup.Item>
            <ListGroup.Item className="bg-dark text-light">
              {film.Actors}
            </ListGroup.Item>
            <ListGroup.Item className="bg-dark text-light">
              {film.Awards}
            </ListGroup.Item>
          </ListGroup>
        </Col>
      </Row>
    </Container>
  );
};

export default MovieDetail;
