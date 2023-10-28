package jesus_rg_u1p1;
import java.util.Random;
public class Jesus_RG_Materias 
{
    private String nombre;
    private String clave;
    private String tipo;
    private int creditos;
    private int noUnidades;
    private int semestre;

    public Jesus_RG_Materias(String nombre, int creditos, String tipo, int noUnidades, int semestre) {
        this.nombre = nombre;
        this.clave = genClave();
        this.tipo = tipo;
        this.creditos = creditos;
        this.noUnidades = noUnidades;
        this.semestre = semestre;
    }
    
    public String genClave()
    {
        String clave = "";
        String abecedario = "ABCDEFGHIJKLMOPQRSTUVWXYZ";
        Random r = new Random();
        int rand; 
        rand= r.nextInt(0,25);
        clave += abecedario.charAt(rand);
        rand= r.nextInt(0,25);
        clave += abecedario.charAt(rand);
        rand= r.nextInt(0,9);
        clave+=rand;
        rand= r.nextInt(0,9);
        clave += rand;
        rand= r.nextInt(1,9);
        clave +="-";
        clave+=rand;
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getNoUnidades() {
        return noUnidades;
    }

    public void setNoUnidades(int noUnidades) {
        this.noUnidades = noUnidades;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

    @Override
    public String toString() {
        return "Jesus_RG_TDAMaterias{" + "clave=" + clave + ", creditos=" + creditos + ", noUnidades=" + noUnidades + ", semestre=" + semestre + '}';
    }
    
    
}
