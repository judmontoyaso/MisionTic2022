import CardRazaPerros from "components/CardRazaPerros";
import borderCollie from "Media/borderCollie.jpg";
import rodesian from "Media/rodesian.jpg";


function Index() {
  return (
    <div>
        <section>
          <h1 className="tituloPrincipal">RAZAS DE PERROS</h1>
          <ul className="breedCardContainer">
            <CardRazaPerros nombreRaza="Border Collie" imagen={borderCollie} />
            <CardRazaPerros nombreRaza="Rodesian" imagen={rodesian} />
          </ul>
        </section>
        <section></section>
      <footer></footer>
    </div>
  );
}

export default Index;
