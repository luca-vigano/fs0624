import "./App.css";
import React from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import NetflixNavbar from "./components/NetflixNavbar";
import NetflixFooter from "./components/NetflixFooter";
import "bootstrap-icons/font/bootstrap-icons.css";
import NetflixGalleria from "./components/NetflixGalleria";
import "../node_modules/bootstrap/dist/js/bootstrap.js";
import Genres from "./components/Genres.jsx";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import TvShows from "./components/TvShows.jsx";
import MovieDetail from "./components/MovieDetail.jsx";

function App() {
  return (
    <BrowserRouter>
      <header>
        <NetflixNavbar />
      </header>
      <main>
        <Genres />
        <Routes>
          <Route path="/tv-shows" element={<TvShows />} />
          <Route
            path="/"
            element={
              <>
                <NetflixGalleria search={"Thor"} />
                <NetflixGalleria search={"Batman"} />
                <NetflixGalleria search={"Deadpool"} />
              </>
            }
          />
          <Route path="/movie-detail/:movieId" element={<MovieDetail />} />
        </Routes>
      </main>
      <footer>
        <NetflixFooter />
      </footer>
    </BrowserRouter>
  );
}

export default App;
