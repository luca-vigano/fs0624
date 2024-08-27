import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css'
import MyNav from './components/MyNav';
import MyFooter from './components/MyFooter';
import Welcome from './components/Welcome';
// import AllTheBook from './components/AllTheBooks';
import BookList from './components/BookList';



function App() {
  return (
    <>
      <header>
        <MyNav />
      </header>
      <main>
        <Welcome />
        <BookList />
        {/* <AllTheBook /> */}
      </main>
      <footer>
        <MyFooter />
      </footer>
    </>
  );
}

export default App;
