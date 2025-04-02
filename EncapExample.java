package javaproject;

public class EncapExample {

	private int id ;
	private  String name;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapExample ob = new EncapExample();
		ob.setId(1);
		ob.setName("nnn");
		System.out.println(ob.getId());
		System.out.println(ob.getName());
		
		
	}

}
