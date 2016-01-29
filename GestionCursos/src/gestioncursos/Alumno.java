package gestioncursos;

/**
 *
 * @author Victor
 */
public class Alumno {

    public Alumno(String materias[], String nombres, String apellidos, String DNI) {
        this.materias = materias;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.edad = edad;
        this.nacimiento = nacimiento;
        valores = new int[materias.length][5];
    }

    public String[] getMaterias() {
        return materias;
    }

    public int getMateria(String materia) {
        for (int i = 0; i < materias.length; i++) {
        if (materias[i].equals(materia)) {
        return i;
            }
        }

        return -1;
    }

    public String getNotas() {
        StringBuilder salida = new StringBuilder();
        salida.append(apellidos).append(",").append(nombres).append("");
        for (int i = 0; i < materias.length; i++) {
            salida.append(materias[i]).append(":");
            for (int j = 0; j < valores[i].length; j++) {
                salida.append(valores[i][j]).append(",");
            }

            salida.delete(salida.length() - 2, salida.length());
            salida.append("\n");
        }

        return salida.toString();
    }

    public String getNotas(String materia) {
        StringBuilder salida = new StringBuilder();
        salida.append(apellidos).append(",").append(nombres).append("\n");
        int position = getMateria(materia);
        salida.append(materias[position]).append(":");
        for (int j = 0; j < valores[position].length; j++) {
            salida.append(valores[position][j]).append(",");
        }

        return salida.substring(0, salida.length() - 3);
    }

    public int getNotas(String materia, int examen) {
        int position = getMateria(materia);
        return valores[position][examen - 1];
    }

    public double getNota(String materia) {
        int position = getMateria(materia);
        if (valores[position][0] != 0 && valores[position][1] != 0 && valores[position][2] != 0) {
            double nota = (double) (valores[position][0] + valores[position][1] + valores[position][2]) / 3D;
            if (nota >= 5D) {
                return nota;
            } else {
                return valores[position][3] <= valores[position][4] ? valores[position][4] : valores[position][3];
            }
        } else {
            return 0.0D;
        }
    }

    public void setValores(int[][] valores) {
        this.valores = valores;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public boolean estaBecado() {
        return estaBecado;
    }

    public void setBecado(boolean becado) {
        this.estaBecado = estaBecado;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public String toString() {
        return (new StringBuilder()).append(apellidos).append(", ").append(nombres).toString();
    }

    private String materias[];
    private int[][] valores;
    private String nombres;
    private String apellidos;
    private String DNI;
    private String edad;
    private String nacimiento;
    private boolean estaBecado;
    private boolean pagado;
}
