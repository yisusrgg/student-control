
package jesus_rg_u1p1;

import java.util.ArrayList;

public class Jesus_RG_CargaAcademica 
{
    private Jesus_RG_Alumno alumno;
    private Jesus_RG_TDAM TDAMaterias;
    private Jesus_RG_TDAM materiasReticula;
    private ArrayList <Jesus_RG_Materias> materias = new ArrayList<>();
    

    public Jesus_RG_CargaAcademica(Jesus_RG_Alumno alumno, Jesus_RG_TDAA TDAA, Jesus_RG_TDAM materiasReticula) {
        
        this.alumno = TDAA.buscar(alumno.getNombre());
        if (this.alumno == null) 
        {
            System.out.println("EL ALUMNO NO EXISTE");
        } 
        else 
        {
            this.TDAMaterias = new Jesus_RG_TDAM(8);
            this.materiasReticula = materiasReticula;
        }
        
    }
    
    public boolean buscaAlumno(String nombre, Jesus_RG_TDAA tda) {
        Jesus_RG_Alumno alumno = tda.buscar(nombre);
        if (alumno != null) 
        {
            this.alumno = alumno;
            return true;
        } 
        else 
        {
            System.out.println("El alumno no existe");
            return false;
        }
    }
    
 public boolean agregaMateria(Jesus_RG_Materias materia) {
    int totalCreditosCarga = totalCreditos();
    int totalMateriasCarga = totalMaterias();
    String tipoMateria = materia.getTipo();
    int repe=0;
    int espe = 0;
    for (Jesus_RG_Materias recorre : materias) {
        if(recorre.getTipo()=="especial")
        {
            espe++;
            break;
        }
    }
    for (Jesus_RG_Materias recorre : materias) {
        if(recorre.getTipo()=="repe")
        {
            repe++;
            break;
        }
    }
    
    if (materias.contains(materia))
    {
        System.out.println("La materia ya esta en la carga academica");
        return false;
    } 
    else if (repe==1 && espe==1) 
    {
        if (totalMateriasCarga >= 4 || totalCreditosCarga + materia.getCreditos() > 20) {
            System.out.println("Restriccion para materia en repe y en especial: Maximo 4 materias o 20 creditos");
            return false;
        }
    }
    else if (repe==1) 
    {
        
        if (totalMateriasCarga >= 7 || totalCreditosCarga + materia.getCreditos() > 30) {
            System.out.println("Restriccion para materia en repe: Maximo 7 materias o 30 creditos");
            return false;
        }
    }
    else if (espe==1) 
    {
        
        if (totalMateriasCarga >= 6 || totalCreditosCarga + materia.getCreditos() > 25) {
            System.out.println("Restriccion para materia en especial: Maximo 6 materias o 25 creditos");
            return false;
        }
    }
    else if (totalMateriasCarga >= 8 || totalCreditosCarga + materia.getCreditos() > 35) 
    {
        System.out.println("Capacidad maxima de carga alcanzada (8 materias o 35 creditos)");
        return false;
    } 
    
    materias.add(materia);
    System.out.println("Materia agregada: " + materia.getNombre());
    return true;
}

    public int totalMaterias() 
    {
        return materias.size();
    }
   
    public int totalCreditos() 
    {
        int totalCreditos = 0;
        for (Jesus_RG_Materias materia : materias) 
        {
            totalCreditos += materia.getCreditos();
        }
        return totalCreditos;
    }
    
    public Jesus_RG_Alumno getAlumno() 
    {
        return alumno;
    }
    
    public Jesus_RG_Alumno setAlumno(Jesus_RG_Alumno alumno) 
    {
        return alumno = alumno;
    }
    
    public Jesus_RG_TDAM getTDAMaterias() 
    {
        return TDAMaterias;
    }

    public Jesus_RG_TDAM getMateriasReticula() 
    {
        return materiasReticula;
    }
   
    public void mostrarCargaAcademica() {
        System.out.println("\u001B[31m" + "ALUMNO:\t" + "\u001B[30m" + alumno.getNombre() + " " + alumno.getPaterno() + " "+ alumno.getMaterno() + "\t" + "\u001B[31m"
        + "NUMCONTROL:\t" + "\u001B[30m" + alumno.getNoControl());

        System.out.println("\u001B[31m" + "CARRERA: " + "\u001B[30m"+ alumno.getCarrera() + "\t\t" + "\u001B[31m" + "SEMESTRE:\t"
         + "\u001B[30m" + alumno.getSemestre()); 
        System.out.println("\u001B[31m" + "CLAVE\t\t" + "NOMBRE\t\t"
                + "CREDITOS\t" + "SEMESTRE");
        
        for (Jesus_RG_Materias materia : materias) {
            System.out.printf("%-15s%-18s%-15d%-10d%n", materia.getClave(), materia.getNombre(),
        materia.getCreditos(), materia.getSemestre());
        }
    }
    
}
