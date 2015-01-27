
package ejercicioasignatura;

public class Asignatura {
    String nombre;
    int codigo;
    int curso;
    
    Asignatura(String nom,int cod,int cur){
        this.nombre = nom;
        this.codigo = cod;
        this.curso = cur;
    }
    
    void mostrarNombre(){
        System.out.println("Asignatura "+ nombre);
    }
    void mostrarCodigo(){
        System.out.println("Codigo: "+codigo);
    }

    void mostrarCurso(){
        System.out.println("Curso "+curso);
    }
    
    void mostrarValores(){
        System.out.println("Alumno Matriculado en: "+nombre+" curso"+curso+" codigo"+codigo);
    }
}
