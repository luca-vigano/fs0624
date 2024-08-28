import Card from "react-bootstrap/Card";
import Button from "react-bootstrap/Button";
import { useEffect, useState } from "react";

const MovieDetail = () => {
  const [film, setFilm] = useState([]);
  const [isError, setIsError] = useState(false);

  useEffect(() => {
    fetchMovies();
  }, []);

  const fetchMovies = () => {
    fetch("https://www.omdbapi.com/?apikey=5ace13d8&s=")
      .then((response) => {
        if (response.ok) {
          return response.json();
        } else {
          throw new Error("La chiamata non è andata a buon fine");
        }
      })
      .then((filmsearch) => {
        setFilm(filmsearch.Search);
        console.log(filmsearch.Search);
      })
      .catch((err) => {
        console.log("ERRORE RECUPERO DATI", err);
        setIsError(true);
      });
  };
  return (
    <Card>
      <Card.Img variant="top" src="holder.js/100px180" />
      <Card.Body>
        <Card.Title>Card Title</Card.Title>
        <Card.Text>
          Some quick example text to build on the card title and make up the
          bulk of the card's content.
        </Card.Text>
        <Button variant="primary">Go somewhere</Button>
      </Card.Body>
    </Card>
  );
};

export default MovieDetail;
