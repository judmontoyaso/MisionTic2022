package co.com.reto3;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Estudiante juan = new Estudiante("Juan", "David", "J@com", "español");
        juan.dirigir();
        System.out.println(juan.getUrl());
    }
}
