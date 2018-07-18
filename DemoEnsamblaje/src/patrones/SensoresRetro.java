/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import sinpatron.Vehiculo;

/**
 *
 * @author CltControl
 */
public class SensoresRetro extends AutoDecorator{
    
    public SensoresRetro(Vehiculo v) {
        super(v);
    }
    
    public String getPrestaciones(){
        return getVehiculo().getPrestaciones()+"Dispositivo: Sistema de sensores para retro\n";
    }
}
