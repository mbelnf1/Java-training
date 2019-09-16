package com.yourname.model;

public class Airplane extends FlyingVehicle{
    private short wheels;
    private short propellers;

  public Airplane(short wheels, short propellers) {
	  super((short)4, new Engine());

	  this.wheels = wheels;
	  this.propellers = propellers;

  //getters and setters
  public short getWheels(){ return this.wheels; }
  public void setWheels(short wheels){ this.wheels = wheels; }

  public short propellors() { return this.propellers; }
  public void setPropellers(short propellers) {this.propellers = propellers; }
 
  public void turn(){
    System.out.println("Turning...");
    

    
      }
    
  }
}