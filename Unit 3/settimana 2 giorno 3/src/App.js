import './App.css';
import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css'
import NetflixNavbar from './components/NetflixNavbar';
import NetflixFooter from "./components/NetflixFooter";
import "bootstrap-icons/font/bootstrap-icons.css";
import NetflixGalleria from "./components/NetflixGalleria";
import '../node_modules/bootstrap/dist/js/bootstrap.js'
import TvShows from './components/TvShows.jsx';

function App() {
  return (
    <>
      <header>
      <NetflixNavbar />
      </header>
      <main>
        <TvShows />
        <NetflixGalleria search={"Thor"} />
        <NetflixGalleria search={"Batman"} />
        <NetflixGalleria search={"Deadpool"} />
      </main>
      <footer>
        <NetflixFooter />
      </footer>
    </>
  );
}

export default App;
