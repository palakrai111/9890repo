package javaproject;

public class StudentArrayList 
{
    int id;
    String name;
    @Override
	public String toString() {
		return "StudentArrayList [id=" + id + ", name=" + name + "]";
	}
	public StudentArrayList(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}