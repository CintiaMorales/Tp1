package remiseria;


import remiseria.FormaPago;
import remiseria.Direccion;
import remiseria.Cliente;
import remiseria.Chofer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tecnica7
 */
public class Viaje {
    private Direccion origen;
    private Direccion destino;
    private float costo;
    private Chofer chofer;
    private Cliente cliente;
    private FormaPago FormaPago;

    public Direccion getOrigen() {
        return origen;
    }

    public void setOrigen(Direccion origen) {
        this.origen = origen;
    }

    public Direccion getDestino() {
        return destino;
    }

    public void setDestino(Direccion destino) {
        this.destino = destino;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FormaPago getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(FormaPago FormaPago) {
        this.FormaPago = FormaPago;
    }
    
    
}
