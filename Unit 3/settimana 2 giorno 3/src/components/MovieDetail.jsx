import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import { Col, Container, ListGroupItem, Row } from "react-bootstrap";
import Image from "react-bootstrap/Image";
import ListGroup from "react-bootstrap/ListGroup";

const MovieDetail = () => {
  const params = useParams();
  const [film, setFilm] = useState({});
  const [comments, setComments] = useState({});

  useEffect(() => {
    fetchMovies();
    fetchComments();
    // eslint-disable-next-line react-hooks/exhaustive-deps
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
      });
  };
  const fetchComments = () => {
    fetch("https://www.omdbapi.com/?apikey=5ace13d8&i=" + params.movieId)
      .then((response) => {
        if (response.ok) {
          return response.json();
        } else {
          throw new Error("La chiamata non è andata a buon fine");
        }
      })
      .then((movieComments) => {
        setComments(movieComments);
        console.log(movieComments);
      })
      .catch((err) => {
        console.log("ERRORE RECUPERO DATI", err);
      });
  };

  return (
    <Container fluid className="bg-dark m-0 d-flex justify-content-around">
      <Row>
        <Col xs={12} md={6} className="my-4 text-center">
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
        <Col xs={12}>
          <ListGroup>
            {comments.length > 0 ? (
              comments.map((c) => {
                return <ListGroup.Item key={c._id}>{c.comment}</ListGroup.Item>;
              })
            ) : (
              <ListGroup.Item>
                Non ci sono recensioni per questo film
              </ListGroup.Item>
            )}
          </ListGroup>
        </Col>
      </Row>
    </Container>
  );
};

export default MovieDetail;
