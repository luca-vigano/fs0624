import { useEffect, useState } from "react";
import { Container, Row, Col, Button } from "react-bootstrap";
import Job from "./Job";
import { useParams } from "react-router-dom";
import { useDispatch } from "react-redux";

const CompanySearchResults = () => {
  const [jobs, setJobs] = useState([]);
  const params = useParams();
  const dispatch = useDispatch();

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
        <Col className="my-3">
          <h1 className="display-4">Job posting for: {params.company}</h1>
          {jobs.map((jobData) => (
            <Job key={jobData._id} data={jobData} />
          ))}
        </Col>
        <Button
          className="d-flex align-items-center"
          onClick={() => {
            dispatch({
              type: "ADD_TO_FAVORITES",
              payload: params.company,
            });
          }}
        >
          ADD {params.company.toUpperCase()} TO FAVORITES
        </Button>
      </Row>
    </Container>
  );
};

export default CompanySearchResults;
