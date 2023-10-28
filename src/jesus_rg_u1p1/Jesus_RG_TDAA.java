
package jesus_rg_u1p1;

import java.util.Date;

public class Jesus_RG_TDAA {
    private Jesus_RG_Alumno[] tda;
    private int index;
    private int contador;

    public Jesus_RG_TDAA(int a) { //tamaño variable
        this.tda = new Jesus_RG_Alumno[a];
        this.index = 0;
        this.contador = 0;
    }

    public Jesus_RG_Alumno[] getTda() {
        return tda;
    }

    public void setTda(Jesus_RG_Alumno[] tda) {
        this.tda = tda;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public boolean vacia()
    {
        return index ==0;
    }
    
    public boolean llena()
    {
        return index == contador && index==tda.length;
    }
    
    public void insertar (Jesus_RG_Alumno obj)
    {
        if(!llena())
        {
            tda[index++] = obj;
            contador++;
        }
        else if(contador<index)
        {
            reInsertar(obj); // busca los espacios "vacios" intermedios 
            extender();
            tda[index++] = obj;
            contador++;
           
        } 
    }
    
   public void reInsertar(Jesus_RG_Alumno obj)
    {
        for(int i=0; i<index; i++)
        {
            if(tda[i]==null)
            {
                tda[i] = obj;
                contador++;
                break;
            }
        }
    }
    
    public void extender()
    {
        //agregar los espacios al tda
        Jesus_RG_Alumno [] alumno = new Jesus_RG_Alumno[tda.length+2];
        for(int i =0; i<tda.length; i++)
        {
            alumno[i] = tda[i];
        }
        tda = alumno;
    }
   
    
    public Jesus_RG_Alumno buscar(String nombre){
        int cont=0;
        for(int i=0; i<index; i++)
        {
            if(tda[i]!= null && nombre.equals(tda[i].getNombre()))
            {
                cont++;
            }
        }
        for(int i=0; i<index; i++)
        {
            if(tda[i]!= null && nombre.equals(tda[i].getNombre()))
            {
                return tda[i];
            }
        }
        return null;
    }
    
    public Jesus_RG_Alumno maxDate(){
        
        Date max = null;
        int posicion = -1;
        for(int i=0; i<index; i++)
        {
            if (max == null || tda[i].getFechaingreso().before(max)) {
                max = tda[i].getFechaingreso();
                posicion = i;
            }
        }
        if (posicion != -1) {
            return tda[posicion];
         } 
        else 
        {
        return null; 
        }
    }
    
    public int modificaTodas(String carrera, String extracurriculares)
    {
        int cont=0;
        for(int i=0;i <index; i++)
        {
            if(tda[i]!= null && tda[i].getCarrera().equals(carrera)){
                tda[i].setExtracurricular(extracurriculares);
            }
        }
        return cont;
    }
    
    public boolean eliminaUno(int posicion)
    {
        //NO reacomoda, deja el espacio "vacio"
        if(posicion<index && posicion>-1)
        {
            tda[posicion] = null;
            contador--;
            return true;
        }
        return false;
    }

    public int disponibles()
    { 
        return this.tda.length-this.contador;
    }
    
    @Override
    public String toString() {
        return "Jesus_RG_TDA2{" + "tda=" + tda + ", index=" + index + ", contador=" + contador + '}';
    }
    
    
}
