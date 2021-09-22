import "./styles/estilos.css";
import borderCollie from './Media/borderCollie.jpg';
import rodesian from './Media/rodesian.jpg'
import logo from './Media/logo.png'

function App() {
  return (
    <div className="App">
      <header>
        <ul className="navbar">
          <li>
            <img src={logo} alt="imagen" className="logo" />
          </li>
          <li>
            <button className="button mainButton">
              <i className="fas fa-plus buttonAdd"></i>Nuevo post
            </button>
          </li>
          <li>
            <div className="buscar">
              <input placeholder="Buscar una raza" />
              <i className="fas fa-search button iconoBusqueda"></i>
            </div>
          </li>
          <li>
            <button className="button secundaryButton">Iniciar sesion</button>
          </li>
          <li>
            <button className="button mainButton">Registro</button>
          </li>
        </ul>
      </header>
      <main>
        <section>
          <h1 className="tituloPrincipal">RAZAS DE PERROS</h1>
          <ul className="breedCardContainer">
            <CardRazaPerros nombreRaza = 'Border Collie' imagen={borderCollie}/>
            <CardRazaPerros nombreRaza = 'Rodesian' imagen = {rodesian}/>
          </ul>
        </section>
        <section></section>
      </main>
      <footer></footer>
    </div>
  );
}

function CardRazaPerros({nombreRaza, imagen}) {
  return  <li className="breedCard">
  <div className="contenedorImagen">
    <img src={imagen} alt={nombreRaza}/>
  </div>
  <span className="breedTittle">{nombreRaza}</span>
  <div>
    <ul className="barraReacciones">
      <li>
        <div>
          <i className="fas fa-heart buttonReaccion iconoLike"></i>
          <span className="number">150</span>
        </div>
      </li>
      <li>
        <div>
          <i className="fas fa-comment buttonReaccion"></i>
          <span className="number">1.5k</span>
        </div>
      </li>
      <li>
        <div>
          <i className="fas fa-eye buttonReaccion"></i>
          <span className="number">120</span>
        </div>
      </li>
    </ul>
  </div>
</li>
}

export default App;
