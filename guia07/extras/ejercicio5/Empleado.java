package guia07.extras.ejercicio5;

public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    Empleado() {
    }

    Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcular_aumento() {
        if (this.edad < 30) {
            this.salario *= 1.05;
        } else {
            this.salario *= 1.10;
        }
    }
}
