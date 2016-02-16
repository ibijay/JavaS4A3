
public class ClassEmplEncaps 
{
private String empName;
private String empID;
private int empSal;
private String empGrade; 

	public void setename(String feName)
	{
		this.empName= new String(feName);
		
	}
	public void seteid(String feID)
	{
		this.empID=new String(feID);
	}
	
	public void setesal(int feSal)
	{
		this.empSal=feSal;
	}
	
	public void setegrade(String feGrade)
	{
		this.empGrade=new String(feGrade);
	}

	public String getename()
	{
		return this.empName;
	}
	
	public String geteid()
	{
		return this.empID;
	}
	public int getesal()
	{
		return this.empSal;
	}
	public String getegrade()
	{
		return this.empGrade;
	}
	
}
