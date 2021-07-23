public class Ciclo {

    public int n;


   public Ciclo(int n){
       this.n = n;
       long factorial = 1;
       for (int i = 1; i <= n; ++i) {
           factorial = factorial * i;

       }
       System.out.println(factorial);

}

    public static void main(String[] args) {
        Ciclo prueba = new Ciclo(20);
        Ciclo prueba1 = new Ciclo(10);


    }
}

