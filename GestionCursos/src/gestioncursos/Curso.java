package gestioncursos;

/**
 *
 * @author Victor
 */
public class Curso
{

    public Curso()
    {}

    public Curso(String materias[],int numPlazas,int importe,String nombre,String codigo)
    {
        this.materias = materias;
        this.numPlazas = numPlazas;
        this.importe = importe;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int numPlazas()
    {
        if(alumnosConMatricula == null)
            return numPlazas;
        int contador = 0;
        Alumno alumn[] = alumnosConMatricula;
        int i = alumn.length;
        for(int j=0; j<i; j++)
        {
            Alumno alumnosMatric1=alumn[j];
            if(alumnosMatric1==null)
            contador++;
        }

        return contador;
    }

    public String[] getMaterias()
    {
        return materias;
    }

    public String setMaterias(String materias)
    {
        if(numPlazas==numPlazas())
        {
        String materiasIndividuales[] = materias.split(",");
        setMaterias(materiasIndividuales);
        return (new StringBuilder()).append("Se registraron: ").append(materiasIndividuales.length).append(" materias.").toString();
        } else
        {
            return "Hay alumnos matriculados y por tanto no se pueden registrar mas materias";
        }
    }

    public void setMaterias(String materias[])
    {
        this.materias = materias;
    }

    public int getNumPlazas()
    {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas)
    {
        if(numPlazas>0)
        {
            this.numPlazas = numPlazas;
            if(alumnosConMatricula == null)
                alumnosConMatricula = new Alumno[numPlazas];
        }
    }

    public String getAlumnosConMatricula()
    {
        if(alumnosConMatricula != null)
        {
            String salida = "\n";
            Alumno alumn[] = alumnosConMatricula;
            int i = alumn.length;
            for(int j = 0; j < i; j++)
            {
            Alumno alumnWithMatricula = alumn[j];
            if(alumnWithMatricula != null)
            salida = (new StringBuilder()).append(salida).append(alumnWithMatricula).append("||").toString();
            }

            return salida;
        } else
        {
            return "No hay alumnos matriculados";
        }
    }

    public Alumno getAlumno(int numero)
    {
        if(alumnosConMatricula[numero - 1] == null)
            return null;
        else
            return alumnosConMatricula[numero - 1];
    }

    public String CuentaPlaza()
    {
        int ultimo = numPlazas - numPlazas();
        StringBuilder serie = new StringBuilder();
        for(int i = 0; i < ultimo; i++)
        {
        if(serie.length() != 0)
        serie.append("\n");
        serie.append(getAlumno(i + 1).getNotas());
        }
        return serie.toString();
    }

    public void ordenarAlumnos()
    {
        int ultimoAlumn = numPlazas - numPlazas();
        for(int i = 0; i < ultimoAlumn - 1; i++)
        {
        for(int j = i + 1; j < ultimoAlumn; j++)
        if(alumnosConMatricula[j].toString().compareTo(alumnosConMatricula[i].toString()) < 0)
        {
        Alumno aux=alumnosConMatricula[j];
        alumnosConMatricula[j]=alumnosConMatricula[i];
        alumnosConMatricula[i]=aux;
                }

        }

    }

    public boolean matricularAlumno(Alumno nuevoAlumno)
    {
        if(alumnosConMatricula == null)
        {
            alumnosConMatricula = new Alumno[numPlazas];
            alumnosConMatricula[0] = nuevoAlumno;
            return true;
        }
        for(int i = 0; i < alumnosConMatricula.length; i++)
            if(alumnosConMatricula[i] == null)
            {
                alumnosConMatricula[i] = nuevoAlumno;
                return true;
            }

        return false;
    }

    public int getImporte()
    {
        return importe;
    }

    public void setImporte(int importe)
    {
        if(importe > 0)
            this.importe = importe;
    }

    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
    if(nombre.length() > 0)
    this.nombre = nombre;
    }

    private String materias[];
    private int numPlazas;
    private Alumno alumnosConMatricula[];
    private int importe;
    private String codigo;
    private String nombre;
}