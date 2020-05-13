
//Kennya
package demo;

public class Kennya_Clarissa {

long carnet;
String nombre, apellido;

public void Registro_de_estudiante(){

System.out.println("Métodos para el registro de estudiante:");

}

public void Consulta_de_estudiante(){

System.out.println("Métodos para consulta del estudiante:");
}

public void eliminar_estudiante(){

System.out.println("Métodos para eliminar el estudiante:");
}

public static void main(String[] args) {
Kennya_Clarissa est = new Kennya_Clarissa ();


est.carnet= 45687;
est.nombre ="Amelia";
est.apellido ="Rosales";

est.Registro_de_estudiante();
est.Consulta_de_estudiante();
est.eliminar_estudiante();

System.out.println("Carnet: "+est.carnet);
System.out.println("Nombre: "+est.nombre);
System.out.println("Apellido: "+est.apellido);

}
}