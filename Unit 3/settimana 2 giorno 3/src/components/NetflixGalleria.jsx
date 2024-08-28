import { Component } from "react"
import { Col, Container, Row, Alert } from "react-bootstrap"
import FilmCard from "./FilmCard"



class NetflixGalleria extends Component {

    state = {
        film: [],
        isError: false
    }

    componentDidMount = () => {
        this.fetchBatman()
    }


    fetchBatman = () => {
        fetch("https://www.omdbapi.com/?apikey=5ace13d8&s=" + this.props.search)
            .then((response) => {
                if (response.ok) {
                    return response.json()
                } else {
                    throw new Error("La chiamata non è andata a buon fine")
                }
            })
            .then((filmsearch) => {
                this.setState({
                    film: filmsearch.Search,
                })
                console.log(filmsearch.Search)
            })
            .catch((err) => {
                console.log("ERRORE RECUPERO DATI", err)
                this.setState({
                    isError: true,
                })
            })
    }
    render() {
        return (
            <Container fluid className="bg-dark m-0">
                <Row>
                    <Col sm={12} className="text-light" >
                        <h4>{this.props.search}</h4>
                    </Col>
                    {this.state.film.length > 0 ? (
                        this.state.film.map((film) => (
                            <FilmCard film={film} key={film.imdbID} />
                        ))
                    ) : (
                        <p>No movies found.</p>
                    )}
                </Row>
                {this.state.isError && (
                <Alert variant="danger">Something going wrong!</Alert>
            )}

            </Container>

        )
    }
}

export default NetflixGalleria
