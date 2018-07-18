/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import sinpatron.Vehiculo;

/**
 *
 * @author Moises
 */
public class CamaraRetro extends AutoDecorator {
    
    public CamaraRetro(Vehiculo v) {
        super(v);
    }
    
    public String getPrestaciones(){
        return getVehiculo().getPrestaciones()+"Dispositivo: Camara para retro\n";
    }
}
