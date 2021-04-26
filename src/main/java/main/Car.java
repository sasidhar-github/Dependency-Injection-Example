package main;

public class Car {
    private Engine engine;
    
    //Without DI
   /* public Car() {
    	engine = new Engine();
    }*/
    
    //With DI
    public Car(Engine engine) {
    	this.engine = engine;
    }

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
    
	public String showEngineHp() {
		return "Car "+engine.getHp();
	}
    
}
