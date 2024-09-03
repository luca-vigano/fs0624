import { Col, Row, Button, Container } from "react-bootstrap";
import { useSelector, useDispatch } from "react-redux";
import { removeFromFavorites } from "../redux/actions/index";
import { useNavigate } from "react-router-dom";

const MyFavorites = () => {
  const ArrOfFavorites = useSelector((store) => {
    return store.favorite.companies;
  });

  const dispatch = useDispatch();
  const navigate = useNavigate();

  console.log(" ciao", ArrOfFavorites);
  return (
    <Container>
      <Row>
        <Col sm={12} className="text-center mt-5 text-danger">
          <h3>MY FAVORITE</h3>
        </Col>
        <Col sm={12} className="text-center text-success">
          <Button
            onClick={() => {
              dispatch({
                type: "CLEAR_ARRAY",
              });
              navigate("/");
            }}
          >
            TORNA ALLA HOME
          </Button>
        </Col>
        <Col sm={12}>
          <ul style={{ listStyle: "none" }}>
            {ArrOfFavorites.map((company, i) => (
              <li key={i} className="my-4 d-flex border border-2">
                <Button
                  variant="danger"
                  onClick={() => {
                    dispatch(removeFromFavorites(i));
                  }}
                >
                  DELETE
                </Button>
                <p>{company}</p>
              </li>
            ))}
          </ul>
        </Col>
      </Row>
    </Container>
  );
};

export default MyFavorites;
