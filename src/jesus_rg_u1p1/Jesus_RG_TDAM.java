
package jesus_rg_u1p1;
public class Jesus_RG_TDAM 
{
    private Jesus_RG_Materias[] tda;
    private int index;
    private int contador;

    public Jesus_RG_TDAM(int a) { //tamaño variable
        this.tda = new Jesus_RG_Materias[a];
        this.index = 0;
        this.contador = 0;
    }
       
    public int getIndex()
    {
        return index;
    }
    public void insertar (Jesus_RG_Materias obj)
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
    
    public int disponible()
    { 
        return this.tda.length-this.contador;
    }
    
    public boolean vacia()
    {
        return index ==0;
    }
    
    public boolean llena()
    {
        return index == contador && index==tda.length;
    }
    
    public void extender()
    {
        //agregar los espacios al tda
       
        Jesus_RG_Materias [] compu = new Jesus_RG_Materias[tda.length+2];
        for(int i =0; i<tda.length; i++)
        {
            compu[i] = tda[i];
        }
        tda = compu;
    }
    
    
    
    public void reInsertar(Jesus_RG_Materias obj)
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
    
    public int disponibles()
    { 
        return this.tda.length-this.contador;
    }
    
    public boolean insertarNoRepetido(Jesus_RG_Materias obj)
    {
        for(int i=0; i<index; i++)
        {
            if(tda[i]!= null && tda[i]!= obj)
            {
                return false;
            }
        }
        if(!llena())
        {
            tda[index++] = obj;
            contador++;
            return true;
        }
        else if(contador<index)
        {
            reInsertar(obj);
            extender();
            tda[index++] = obj;
            contador++;
            return true;
        }
        return false;
    }
    
    public int buscar3(String nombre)
    {
        int cont = 0;
        for(int i=0; i<index; i++ )
        {
            if(tda[i]!= null && nombre.equals(tda[i].getNombre()))
            {
                cont++;
            }
        }
        return cont;
    }
    
    public Jesus_RG_Materias max(){
        
        double max = -1;
        int posicion = -1;
        for(int i=0; i<index; i++)
        {
            if(tda[i].getCreditos()>max)
            {
                max = tda[i].getCreditos();
                posicion = i;
            }
        }
        return tda[posicion];
    }
    
    public boolean modifica1(String nombre, int uni) {
        for (int i = 0; i < index; i++) {
            if ( tda[i].getNombre().equalsIgnoreCase(nombre)) {
                tda[i].setNoUnidades(uni);
                return true;
            }
        }
        return false;
    }
    
    public  void eliminarTodos(int creditos)
    {
        for(int i=0; i<index; i++)
        {
            if(tda[i]!=null && tda[i].getCreditos()==creditos)
            {
                tda[i]=null;
            }
        }
    }
    
    public int totalCreditos()
    {
        int cont=0; 
        for(int i=0; i<index; i++)
        {
            cont+=tda[i].getCreditos();
        }
        return cont;
    }

    public Jesus_RG_Materias[] getTda() {
        return tda;
    }

    public void setTda(Jesus_RG_Materias[] tda) {
        this.tda = tda;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    
}
