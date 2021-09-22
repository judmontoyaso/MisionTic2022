import logo from "./logo.svg";
import "./styles/estilos.css";

function App() {
  return (
    <div className="App">
      <header>
        <ul className="navbar">
          <li>
            <img src="./media/logo.png" alt="imagen" className="logo" />
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
            <li className="breedCard">
              <div className="contenedorImagen">
                <img src="./Media/borderCollie.jpg" alt="Border Collie" />
              </div>
              <span className="breedTittle"> Border colli </span>
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
            <li className="breedCard">
              <div className="contenedorImagen">
                <img src="./Media/rodesian.jpg" alt="Rodesian" />
              </div>
              <span className="breedTittle"> Rodesian </span>
              <div>
                <ul className="barraReacciones">
                  <li>
                    <div>
                      <i className="fas fa-heart buttonReaccion iconoLike"></i>
                      <span className="number">450</span>
                    </div>
                  </li>
                  <li>
                    <div>
                      <i className="fas fa-comment buttonReaccion"></i>
                      <span className="number">1.1k</span>
                    </div>
                  </li>
                  <li>
                    <div>
                      <i className="fas fa-eye buttonReaccion"></i>
                      <span className="number">850</span>
                    </div>
                  </li>
                </ul>
              </div>
            </li>
          </ul>
        </section>
        <section></section>
      </main>
      <footer></footer>
    </div>
  );
}

export default App;
