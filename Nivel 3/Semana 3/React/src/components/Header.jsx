import logo from "Media/logo.png";


const Header = () => {
    return (<header>
        <ul className="navbar">
          <li>
            <img src={logo} alt="imagen" className="logo" />
          </li>
          <li>
            <button className="button mainButton">
              <i className="fas fa-plus buttonAdd"></i>
              Nuevo post
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
      </header>)
}
export default Header;

