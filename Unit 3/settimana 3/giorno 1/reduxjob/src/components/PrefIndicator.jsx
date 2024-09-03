import { Button, Form } from "react-bootstrap";
import { useState } from "react-router-dom";
import { useNavigate } from "react-router-dom";
import { useSelector } from "react-redux";
import { useDispatch } from "react-redux";
import { setUserNameAction } from "../redux/actions";

const PrefIndicator = () => {
  const navigate = useNavigate();
  const dispatch = useDispatch();
  const [name, setName] = useState();
  const arrayOfFAvorites = useSelector((store) => {
    // store è TUTTO lo stato di Redux
    return store.favorite.companies;
  });

  return (
    <div className="d-flex justify-content-end my-4">
      <Form
        onSubmit={(e) => {
          e.preventDefault();
          dispatch(setUserNameAction(name));
        }}
      >
        <Form.Control
          type="text"
          placeholder="fai il login"
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
      </Form>
      <Button
        onClick={() => navigate("/favorites")}
        className="d-flex align-items-center"
      >
        <span className="ms-2">My Favorites</span>
        <span className="ms-2">{arrayOfFAvorites.length}</span>
      </Button>
    </div>
  );
};
export default PrefIndicator;
