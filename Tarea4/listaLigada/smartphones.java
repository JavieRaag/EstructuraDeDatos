package listaLigada;

public class smartphones {
    private int modelo;
    private String marca;
    private String color;

    public smartphones(int modelo, String marca, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "[ " +
                "modelo=" + modelo +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ']';
    }

    public static void main(String[] args) {
        listaLigada<smartphones> listaS = new listaLigada<smartphones>();


        listaS.agregarAlFinal(new smartphones(2019, "Samsung", "green"));
        listaS.agregarAlFinal(new smartphones(2024, "Apple", "red"));
        listaS.agregarAlFinal(new smartphones(2022, "Huawei", "green"));
        listaS.agregarAlFinal(new smartphones(2024, "Xiaomi", "green"));
        listaS.agregarAlFinal(new smartphones(2023, "Motorola", "green"));


        System.out.println("\nLista de Smartphones:");
        listaS.transversal(0);

        listaS.eliminarPosicion(2);
        System.out.println("\nEliminando posicion 2: ");
        listaS.transversal(0);

        listaS.actualizarValor(2,new smartphones(2022,"pixel","blanco"));
        System.out.println("\nActualizando elemento 2: ");
        listaS.transversal(0);

        listaS.agregarAlInicio(new smartphones(2023,"ZTE","plateado"));
        System.out.println("\nAgregando al inicio: ");
        listaS.transversal(0);

        listaS.agregarAlFinal(new smartphones(2024,"OnePlus","Negro mate"));
        System.out.println("\nAgregando al fnal: ");
        listaS.transversal(0);

        listaS.eliminarPrimero();
        System.out.println("\nEliminando primero: ");
        listaS.transversal(0);

    }
}

