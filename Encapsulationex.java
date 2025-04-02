package javaproject;

public class Encapsulationex {
	private int id;
	private String name;
 Encapsulationex(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
    public String nameId()
    {
    	return id+name;
    }
   
}
