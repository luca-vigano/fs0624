import { useEffect, useState } from "react";
import { Container, Row, Col, Button, Alert } from "react-bootstrap";
import Job from "./Job";
import { useParams } from "react-router-dom";
import { useDispatch, useSelector } from "react-redux";
import { useNavigate } from "react-router-dom";
import PrefIndicator from "./PrefIndicator";
import { addToFavoriteAction } from "../redux/actions/index";

const CompanySearchResults = () => {
  const [jobs, setJobs] = useState([]);
  const params = useParams();
  const dispatch = useDispatch();
  const navigate = useNavigate();
  const username = useSelector((store) => {
    return store.user.name;
  });

  const baseEndpoint =
    "https://strive-benchmark.herokuapp.com/api/jobs?company=";

  useEffect(() => {
    getJobs();
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, []);

  const getJobs = async () => {
    try {
      const response = await fetch(baseEndpoint + params.company);
      if (response.ok) {
        const { data } = await response.json();
        setJobs(data);
      } else {
        alert("Error fetching results");
      }
    } catch (error) {
      console.log(error);
    }
  };

  return (
    <Container>
      <Row>
        <Col xs={12} className="my-3">
          <h1 className="display-4">Job posting for: {params.company}</h1>
          {jobs.map((jobData) => (
            <Job key={jobData._id} data={jobData} />
          ))}
        </Col>
        <Col>
          <PrefIndicator />
        </Col>
        {username ? (
          <Button
            variant="success"
            className="mb-4"
            onClick={() => {
              dispatch(addToFavoriteAction(params.company));
            }}
          >
            ADD {params.company.toUpperCase()} TO FAVORITES
          </Button>
        ) : (
          <Alert className="text-center">
            FAI IL LOGIN PER AGGIUNGERE AI TUOI PREFERITI!
          </Alert>
        )}

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
      </Row>
    </Container>
  );
};

export default CompanySearchResults;
