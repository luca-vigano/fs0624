import logo from './logo.svg';
import './App.css';
import ButtonComponent from './components/ButtonComponent';
import ImageComponent from './components/ImageComponent';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <ButtonComponent buttonText="sono un bottone!"/>
        <ImageComponent src="https://zampol.it/wp-content/uploads/2023/02/Caratteristiche_del_gatto-scaled.jpg" alt="immagine di un gatto" />
      </header>
    </div>
  );
}

export default App;
