import java.util.Date;
import java.util.List;

public class Billete {
    private int idBillete;
    private Date fechaEmision;
    private double precioTotal;
    private Cliente cliente;
    private Ciudad origem;
    private Ciudad Destino;
    private Categoria categoria;
    private List<Vuelo> vuelos;

    public Billete(int idBillete, Date fechaEmision, double precioTotal, Cliente cliente, Ciudad origem, Ciudad destino, Categoria categoria, List<Vuelo> vuelos) {
        this.idBillete = idBillete;
        this.fechaEmision = fechaEmision;
        this.precioTotal = precioTotal;
        this.cliente = cliente;
        this.origem = origem;
        Destino = destino;
        this.categoria = categoria;
        this.vuelos = vuelos;
    }

    public int getIdBillete() {
        return idBillete;
    }

    public void setIdBillete(int idBillete) {
        this.idBillete = idBillete;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Ciudad getOrigem() {
        return origem;
    }

    public void setOrigem(Ciudad origem) {
        this.origem = origem;
    }

    public Ciudad getDestino() {
        return Destino;
    }

    public void setDestino(Ciudad destino) {
        Destino = destino;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
}

