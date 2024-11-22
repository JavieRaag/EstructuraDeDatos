public class SumaDeNumeros {
    public int sumaNumeros(int numeros) {
        if (numeros == 0) {
            return 0;
        }
        return (numeros % 10) + sumaNumeros(numeros / 10);
    }
    public static void main(String[] args) {

        System.out.println(new SumaDeNumeros().sumaNumeros(10232) + " Es es la suma de: 10232");

    }

}
