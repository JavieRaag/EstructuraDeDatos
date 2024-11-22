package ColaADT;

public class Paciente {
    String nombre;
    int edad;
    String sexo;

    public Paciente(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
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
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "\nPaciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' ;
    }

    public static void main(String[] args) {
        ColaADT<Paciente> consultorioMedico = new ColaADT();
        System.out.println("Encolar 3 personas: \n.-.-.-.-.-.-.-.-.-.-.-");
        consultorioMedico.encolar(new Paciente("Michael", 54, "Masculino"));
        consultorioMedico.encolar(new Paciente("Paola", 21, "Femenino"));
        consultorioMedico.encolar(new Paciente("Jorge", 47, "Masculino"));
        System.out.println(consultorioMedico);
        System.out.println("\nMostrar paciente que sigue: "+consultorioMedico.frente());
        System.out.println("\nAtender paciente que sigue: "+consultorioMedico.desEncolar()+"\n\nCola actualizada: "+consultorioMedico);
        System.out.println("\nAgregar dos nuevos pacientes");
        consultorioMedico.encolar(new Paciente("Xana", 24, "Femenino"));
        consultorioMedico.encolar(new Paciente("Raul", 36, "Masculino"));
        System.out.println(consultorioMedico);
        System.out.println("\nAtender paciente que sigue: "+consultorioMedico.desEncolar()+"\n\nCola actualizada: "+consultorioMedico);


    }

}
