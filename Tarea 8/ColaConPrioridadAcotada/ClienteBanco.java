package ColaConPrioridadAcotada;

public class ClienteBanco {
    String nombre;
    int edad;
    int saldo;

    public ClienteBanco(String nombre, int edad, int saldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public int RetirarDinero(int dineroRetirado) {
        if (saldo<= 0 )
        {
            System.out.println("No hay dinero disponible");

        }else{
            this.saldo -= dineroRetirado;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);

        }
        return saldo;
    }

    @Override
    public String toString() {return "\n"+
        "nombre: " +  nombre+ " " +
            ", edad: " + edad + " "+
                ", Saldo disponible: " + saldo;
    }

    public static void main(String[] args) {
        ColaConPrioridadAcotada<ClienteBanco> FilaBanco = new ColaConPrioridadAcotada(5);
        System.out.println("\n" +"Agregando 2 clientes nuevos, 3 que no son clientes y una celebridad " );
        FilaBanco.encolar(4,new ClienteBanco("Javier Arroyo",19,13200));
        FilaBanco.encolar(4,new ClienteBanco("Antonio Perez",21,4000));
        FilaBanco.encolar(5,new ClienteBanco("Lucero Sanchez",18,9000));
        FilaBanco.encolar(5,new ClienteBanco("Carlos Salcedo",26,3000));
        FilaBanco.encolar(5,new ClienteBanco("Roberto Martinez",25,12000));
        FilaBanco.encolar(1,new ClienteBanco("Natanael Cano",24,60000));
        System.out.println("\n" +"Estado de la cola  "+"\n" + FilaBanco+"\n");

        System.out.println("\n" +"desEncolando siguiente y dinero retirado 10,000  " );
        ClienteBanco clienteDesencolado = (ClienteBanco) FilaBanco.desEncolar();
        clienteDesencolado.RetirarDinero(10000);

        System.out.println("\n" +"Estado de la cola  "+"\n" + FilaBanco+"\n");

        System.out.println("\nLlegan dos clientes mas, frecuente y premium: ");
        FilaBanco.encolar(3,new ClienteBanco("Alma Rodriguez",55,11000));
        FilaBanco.encolar(2,new ClienteBanco("Moises Camilla",23,24000));
        System.out.println("\n" +"Estado de la cola  "+"\n" + FilaBanco);

        FilaBanco.desEncolar();
        System.out.println("\n" +"desEncolando siguiente, cola actualizada:  "+"\n" + FilaBanco);
        System.out.println("\n" +"desEncolando toda la lista "+"\n" );
        FilaBanco.desEncolar();
        FilaBanco.desEncolar();
        FilaBanco.desEncolar();
        FilaBanco.desEncolar();
        FilaBanco.desEncolar();
        FilaBanco.desEncolar();
        FilaBanco.desEncolar();









    }

}
