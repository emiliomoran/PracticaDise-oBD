/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import sinpatron.*;

/**
 *
 * @author Moises
 */
public abstract class AbstractBuilder {
    private Vehiculo v;
    
    public AbstractBuilder(){
        this.v = new Vehiculo();
    }
    
    public abstract void setColor();
    public abstract void setDireccionAsistida();
    public abstract void setMarca();
    public abstract void setModelo();
    public abstract void setMotor();
    public abstract void setCarroceria();
    
    public Vehiculo getVehiculo(){
        return v;
    }
    
    public void setVehiculo(Vehiculo v){
        this.v=v;
    }
}
