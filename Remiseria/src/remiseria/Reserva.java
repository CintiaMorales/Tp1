package remiseria;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tecnica7
 */
public class Reserva 
extends Viaje //hereda atributos de Viaje.
{
  Date fecha;
  
  public Reserva (Viaje v, Date f) {
      super.setChofer(v.getChofer());
      super.setCliente(v.getCliente());
      super.setCosto(v.getCosto());
      super.setDestino(v.getDestino());
      super.setFormaPago(v.getFormaPago());
      super.setOrigen(v.getOrigen());
      
  }
}
