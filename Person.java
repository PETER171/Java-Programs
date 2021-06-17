public class Person
{
	String name="n/a";
	String surname="n/a";
	String cellNumber="n/a";
	String occupation="n/a";
	int age=0;
	
	public Person()
	{
		/*this.name;
		this.surname;
		this.cellNumber;
		this.occupation;
		this.age;*/
	}
	public Person(String naam,String surnaam,String cellNr,String work,int dijara)
	{
		name = naam;
		surname = surnaam;
		cellNumber = cellNr;
		occupation = work;
		age = dijara;
	}
	
	public void setName(String naam)
	{
		name = naam;
	}
	public String getName()
	{
		return name;
	}
	
	public void setSurname(String surnaam)
	{
		surname = surnaam;
	}
	public String getSurname()
	{
		return surname;
	}
	
	public void setCellphone(String cellNr)
	{
		cellNumber = cellNr;
	}
	public String getCellphone()
	{
		return cellNumber;
	}
	
	public void setOccupation(String work)
	{
		occupation = work;
	}
	public String getOccupation()
	{
		return occupation;
	}
	
	public void setAge(int dijara)
	{
		age = dijara;
	}
	public int getAge()
	{
		return age;
	}
	
	public String toString()
	{
		return "Name: "+this.name+"\r\nSurname: "+this.surname+"\r\nCellphone: "+this.cellNumber+"\r\nOccupation: "+this.occupation+"\r\nAge: "+this.age;
	}
}