package Empresa;

public class Empresa {
    private String Nombre;
    public Empleado Empleados;
    public Cliente Clientes;

    public Empresa(){
        Empleados = new Empleado();
        Clientes = new Cliente();
    }

}