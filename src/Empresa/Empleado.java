package Empresa;

import java.util.List;

public class Empleado extends Persona {
    private int Sueldo_Bruto;
    public void mostrar(){
        System.out.println(Sueldo_Bruto);
    }

    public int calcular_salario(){
        return Sueldo_Bruto;
    }
}