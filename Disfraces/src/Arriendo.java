
public class Arriendo {

    private int dias;
    private String talla, disfraz;
    private Cliente cliente;

    public Arriendo() {
        dias = 0;
        talla = "";
        disfraz = "";
        cliente = new Cliente();
    }

    public Arriendo(int dias, String talla, String disfraz, Cliente cliente) {
        setDias(dias);
        setTalla(talla);
        setDisfraz(disfraz);
        setCliente(cliente);
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getDisfraz() {
        return disfraz;
    }

    public void setDisfraz(String disfraz) {
        this.disfraz = disfraz.toUpperCase();
    }

    public double precioDisfraz() {
        double valor = 0;
        if (disfraz.equals("DRACULA")) {
            valor = 1990 * dias;
        } else if (disfraz.equals("CENICIENTA")) {
            valor = 2230 * dias;
        } else if (disfraz.equals("FRANKENSTEIN")) {
            valor = 2000 * dias;
        } else if (disfraz.equals("SHREK")) {
            valor = 990 * dias;
        } else if (disfraz.equals("PINOCHO")) {
            if (dias > 3) {
                valor = 1190 * 3 + (2000 * (dias - 3));
            } else {
                valor = 1190 * dias;
            }
        }
        return valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double precioDscto() {
        double valor = precioDisfraz();
        if (cliente.getTipoCliente().equals("FRECUENTE")) {
            valor = precioDisfraz() * 0.965;
        } else if (cliente.getTipoCliente().equals("VIP")) {
            valor = precioDisfraz() * 0.912;
        }
        return valor;
    }

    public double dsctoEdad() {
        double valor = precioDscto();
        if (cliente.getEdad() >= 65 && cliente.getEdad() <= 99) {
            valor = precioDscto() * 0.95;
        }
        return valor;
    }

    public double precioFinal() {
        double valor = dsctoEdad() * 1.19;
        return valor;
    }

    public void imprimir() {
        System.out.println("DATOS DE LA VENTA");
        System.out.println("RUT          :" + getCliente().getRut());
        System.out.println("NOMBRE       :" + getCliente().getNombre());
        System.out.println("CLIENTE      :" + getCliente().getTipoCliente());
        System.out.println("DIAS         :" + getDias());
        System.out.println("DISFRAZ      :" + getDisfraz());
        System.out.println("TOTAL A PAGAR:$" + precioFinal());
    }

}
