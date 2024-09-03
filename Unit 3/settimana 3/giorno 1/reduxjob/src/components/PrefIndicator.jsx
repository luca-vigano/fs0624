import { Button } from "react-bootstrap";
import { useNavigate } from "react-router-dom";

import { useSelector } from "react-redux";

const PrefIndicator = () => {
  const navigate = useNavigate();
  const arrayOfFAvorites = useSelector((store) => {
    // store è TUTTO lo stato di Redux
    return store.favorite.companies;
  });

  return (
    <div className="d-flex justify-content-end my-4">
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
