import Nav from "react-bootstrap/Nav";
import Logo from "../assets/logo.png";
import "bootstrap-icons/font/bootstrap-icons.css";
import { Link } from "react-router-dom";

const NetflixNavbar = function () {
  return (
    <Nav
      className="navbar navbar-expand-lg bg-dark"
      data-bs-theme="dark"
      style={{ backgroundColor: "#221f1f" }}
    >
      <div className="container-fluid">
        <Link to="/" className="navbar-brand" href="#">
          <img src={Logo} style={{ width: 100, height: 55 }} />
        </Link>
        <button
          className="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon"></span>
        </button>
        <div className="collapse navbar-collapse" id="navbarSupportedContent">
          <ul className="navbar-nav me-auto mb-2 mb-lg-0">
            <li className="nav-item">
              <Link to="/" className="nav-link fw-bold">
                Home
              </Link>
            </li>
            <li className="nav-item">
              <Link to="/tv-shows" className="nav-link fw-bold">
                TV Shows
              </Link>
            </li>
            <li className="nav-item">
              <a className="nav-link fw-bold" href="#">
                Movies
              </a>
            </li>
            <li className="nav-item">
              <a className="nav-link fw-bold" href="#">
                Recently Added
              </a>
            </li>
            <li className="nav-item">
              <a className="nav-link fw-bold" href="#">
                My List
              </a>
            </li>
          </ul>
          <div
            className="d-flex align-items-center;"
            style={{ width: 150, justifyContent: "space-evenly" }}
          >
            <i className="bi bi-search icons text-light"></i>
            <div id="kids" className="fw-bold text-light">
              KIDS
            </div>
            <i className="bi bi-bell icons text-light"></i>
            <i className="bi bi-person-circle icons text-light"></i>
          </div>
        </div>
      </div>
    </Nav>
  );
};
export default NetflixNavbar;
