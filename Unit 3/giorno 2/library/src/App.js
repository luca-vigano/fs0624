import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css'
import MyNav from './components/MyNav';
import MyFooter from './components/MyFooter';
import Welcome from './components/Welcome';

function App() {
  return (
    <>
      <header>
        <MyNav />
      </header>
      <main>
        <Welcome />
      </main>
      <footer>
        <MyFooter />
      </footer>
    </>
  );
}

export default App;
