import { Link } from "react-router-dom";

function CardRazaPerros({ nombreRaza, imagen }) {
  return (
    <li className="breedCard">
      <Link to="/rhodesian">
        <div className="contenedorImagen">
          <img src={imagen} alt={nombreRaza} />
        </div>
      </Link>
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
  );
}

export default CardRazaPerros;
