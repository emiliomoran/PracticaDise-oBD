/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import sinpatron.*;

/**
 *
 * @author CltControl
 */
public abstract class AutoDecorator extends Vehiculo{
    private Vehiculo v = new Vehiculo();
    
    public AutoDecorator(Vehiculo v){
        setVehiculo(v);
    }
    
    public Vehiculo getVehiculo(){
        return v;
    }
    
    public void setVehiculo(Vehiculo v){
        this.v=v;
    }
}
