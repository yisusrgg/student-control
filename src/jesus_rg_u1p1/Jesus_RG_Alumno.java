
package jesus_rg_u1p1;
import java.util.Random;
import java.util.Date;
public class Jesus_RG_Alumno 
{
    private String nombre; 
    private String paterno;
    private String materno;
    private String carrera;
    private Date fechaingreso;
    private int semestre;          //agregar metodos para semestre. 
    private String extracurricular;
    private String noControl;

    public Jesus_RG_Alumno(String nombre, String paterno, String materno, String carrera, int semestre, Date fechaingreso) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.carrera = carrera;
        this.semestre = semestre;
        this.fechaingreso = fechaingreso;
        this.extracurricular = asigExtracurricular();
        this.noControl = genNoControl();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public String getExtracurricular() {
        return extracurricular;
    }

    public void setExtracurricular(String extracurricular) {
        this.extracurricular = extracurricular;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
    public String genNoControl()
    {
        String res="";
        char c = carrera.charAt(0);
        res+=c;
        
        String date = "";
        date += fechaingreso.getYear();
        res+= date.substring(1,3);
        for(int i=0; i<5; i++)
        {
            res+=(int)(Math.random()*8);
        }
        return res;
    }
    
    public String asigExtracurricular()
    {
        String [] talleres = {"Futbol", "Banda de Guerra", "Volley", "Danza", "Karate"};
        Random r = new Random();
        int ramdom = r.nextInt(talleres.length);
        this.extracurricular = talleres[ramdom];
        return talleres[ramdom];
    }

    @Override
    public String toString() {
        return "JesusRG_Alumno{" + "nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", carrera=" + carrera + ", fechaingreso=" + fechaingreso + ", extracurricular=" + extracurricular + ", noControl=" + noControl + '}';
    }
    
    
    
}
