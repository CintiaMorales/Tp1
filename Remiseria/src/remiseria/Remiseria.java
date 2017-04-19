/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remiseria;

/**
 *
 * @author Tecnica7
 */
public class Remiseria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Direccion casa = new Direccion();
            casa.setCalle("Frione");
            casa.setLocalidad("Ciudadela");
            casa.setDpto(2);
            casa.setNumero(4472);
            casa.setPartido("Tres de Febrero");
            casa.setPiso(0);
        Direccion trabajo = new Direccion();
            trabajo.setCalle("Payador Castro");
            trabajo.setDpto(1);
            trabajo.setLocalidad("ciudadela");
            trabajo.setNumero(9);
            trabajo.setPartido(" Tres de Febrero");
            trabajo.setPiso(0);
        Patente p= new Patente ("ABC123", 0);
        Vehiculo auto= new Vehiculo ();
            auto.setColor(Color.Rojo);
            auto.setEstado("bueno");
            auto.setMarca("Ford");
            auto.setModelo("ka");
            auto.setPatente(p);
        Chofer pedro= new Chofer();
            pedro.setLicencia("B");
            pedro.setNombre("pedro");
            pedro.setNumeroChofer(3);
            pedro.setPuntaje(8);
            pedro.setTelefono(15688333);
            pedro.setVehiculo(auto);
        Cliente juan= new Cliente();
            juan.setDireccion(casa);
            juan.setNombre("juan");
            juan.setNumeroCliente(2);
            juan.setPuntaje(9);
            juan.setTelefono(44881324);
        Viaje nuevo= new Viaje();
            nuevo.setChofer(pedro);
            nuevo.setCliente(juan);
            nuevo.setCosto(60);
            nuevo.setDestino(trabajo);
            nuevo.setFormaPago(FormaPago.Efectivo);
            nuevo.setOrigen(casa);
        Reserva r= new Reserva();
            r.setChofer(pedro);
            r.setCliente(juan);
            r.setCosto(60);
            r.setDestino(trabajo);
            r.setFormaPago(FormaPago.Efectivo);
            r.setOrigen(casa);
        
        
    }
    
}
