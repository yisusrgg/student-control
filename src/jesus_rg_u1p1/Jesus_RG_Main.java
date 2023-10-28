
package jesus_rg_u1p1;
import java.util.Random;
import java.util.Date;

public class Jesus_RG_Main {

    public static void main(String[] args) 
    {
        
        Jesus_RG_TDAA estructura = new Jesus_RG_TDAA(11);
        Jesus_RG_Alumno obj = new Jesus_RG_Alumno("Jesus", "rosiles", "gonzalez", "Sistemas",1, new Date(2022-1900,5,5) );
        Jesus_RG_Alumno obj1 = new Jesus_RG_Alumno("Javier", "jacob", "Garcia", "Sistemas", 2,new Date(2020-1900,5,5) );
        Jesus_RG_Alumno obj2 = new Jesus_RG_Alumno("Juan", "Alvarez", "Ruiz", "Sistemas",3, new Date(2019-1900,5,5));
        Jesus_RG_Alumno obj3 = new Jesus_RG_Alumno("Eduardo", "Rodriguez", "Rodriguez", "Sistemas",4, new Date(2019-1900,5,5));
        Jesus_RG_Alumno obj4 = new Jesus_RG_Alumno("Rafael", "Rosiles", "Gonzalez", "Sistemas",5, new Date(2019-1900,5,5));
        
        
        System.out.println(obj.genNoControl());
        estructura.insertar(obj);
        estructura.insertar(obj1);
        estructura.insertar(obj2);
        estructura.insertar(obj3);
        
        System.out.println(estructura.maxDate());
        
        estructura.modificaTodas("Sistemas", "Volley");
        System.out.println(estructura.maxDate());
       
        System.out.println(estructura.buscar("Juan"));
        System.out.println(estructura.buscar("yisus"));
        System.out.println(estructura.buscar("Eduardo"));
        System.out.println(estructura.buscar("javier"));
        
        Jesus_RG_TDAM estructuraM = new Jesus_RG_TDAM(10);
        Jesus_RG_Materias obj10 = new Jesus_RG_Materias("Integral", 7, "repe",7,3);
        Jesus_RG_Materias obj14 = new Jesus_RG_Materias("Etica", 5, "ordinario",8,1);
        Jesus_RG_Materias obj15 = new Jesus_RG_Materias("Vectorial", 7, "ordinario",6,4);
        Jesus_RG_Materias obj11 = new Jesus_RG_Materias("CONTABILIDAD", 5,"ordinario",5,2);
        Jesus_RG_Materias obj12 = new Jesus_RG_Materias("LEOYE", 5,"ordinario",5,1);
        Jesus_RG_Materias obj13 = new Jesus_RG_Materias("MatesD", 6,"ordinario",5,2);
        Jesus_RG_Materias obj17 = new Jesus_RG_Materias("Algebra Lineal", 7,"especial",5,3);
        Jesus_RG_Materias obj18 = new Jesus_RG_Materias("Quimica", 6,"ordinario",5,2);
        Jesus_RG_Materias obj16 = new Jesus_RG_Materias("Redes", 7,"ordinario",5,4);
        Jesus_RG_Materias obj19 = new Jesus_RG_Materias("Programacion web", 7,"ordinario",5,8);
        
        
   
        estructuraM.insertar(obj10);
        estructuraM.insertar(obj11);
        estructuraM.insertar(obj12);
        estructuraM.insertar(obj13);
        estructuraM.insertar(obj14);
        estructuraM.insertar(obj15);
        estructuraM.insertar(obj16);
        estructuraM.insertar(obj17);
        estructuraM.insertar(obj18);
        estructuraM.insertar(obj19);
        
        
        estructuraM.buscar3("CALCULO");
        System.out.println(estructuraM.max());
        estructuraM.modifica1("ETICA", 2);
        System.out.println(estructuraM.max());
        estructuraM.modifica1("CALCULO", 15);
        estructuraM.eliminarTodos(10);
        System.out.println(estructuraM.getIndex());
        
        
        Jesus_RG_CargaAcademica cargaAcademica = new Jesus_RG_CargaAcademica(obj3, estructura, estructuraM);
        cargaAcademica.agregaMateria(obj10);
        cargaAcademica.agregaMateria(obj17);
        cargaAcademica.agregaMateria(obj12);
        cargaAcademica.agregaMateria(obj13);
        cargaAcademica.agregaMateria(obj15);
        cargaAcademica.agregaMateria(obj14);
        
        System.out.println(cargaAcademica.totalCreditos());
        System.out.println(cargaAcademica.totalMaterias());
         
        cargaAcademica.mostrarCargaAcademica();
    }
    
}
