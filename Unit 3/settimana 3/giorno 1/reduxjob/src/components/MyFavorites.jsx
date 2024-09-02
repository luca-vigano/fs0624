import { Col, Row, Button, Container } from "react-bootstrap";
import { useSelector, useDispatch } from "react-redux";

const MyFavorites = () => {
  const ArrOfFavorites = useSelector((store) => {
    return store.favorite.companies;
  });

  const dispatch = useDispatch();

  console.log(" ciao", ArrOfFavorites);
  return (
    <Container>
      <Row>
        <Col sm={12} className="text-center mt-5 text-success">
          <h3>MY FAVORITE</h3>
        </Col>
        <Col sm={12}>
          <ul style={{ listStyle: "none" }}>
            {ArrOfFavorites.map((company, i) => (
              <li key={i} className="my-4">
                <Button
                  variant="danger"
                  onClick={() => {
                    dispatch({
                      type: "REMOVE_FROM_FAVORITES",
                      payload: i,
                    });
                  }}
                >
                  DELETE
                </Button>
                <h4>{company}</h4>
              </li>
            ))}
          </ul>
        </Col>
      </Row>
    </Container>
  );
};

export default MyFavorites;
