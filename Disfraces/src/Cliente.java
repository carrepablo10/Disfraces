
public class Cliente {

    private String rut, nombre;
    private int edad;
    private char tipoCliente, sexo;

    public Cliente() {
        rut = "";
        nombre = "";
        edad = 0;
        tipoCliente = 'N';
        sexo = 'M';

    }

    public Cliente(String rut, String nombre, int edad, char tipoCliente, char sexo) {
        setRut(rut);
        setNombre(nombre);
        setEdad(edad);
        setTipoCliente(tipoCliente);
        setSexo(sexo);
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if (rut.length() >= 8 && rut.length() <= 9) {
            this.rut = rut;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() >= 3 && nombre.length() <= 25) {
            this.nombre = nombre.toUpperCase();
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 17) {
            this.edad = edad;
        }
    }

    public String getTipoCliente() {
        if (tipoCliente == 'F') {
            return "FRECUENTE";
        } else if (tipoCliente == 'V') {
            return "VIP";
        } else if (tipoCliente == 'N') {
            return "NORMAL";
        }
        return "";
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
