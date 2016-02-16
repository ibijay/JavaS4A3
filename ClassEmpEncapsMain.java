
public class ClassEmpEncapsMain 
{
	public static void main (String[] arg)
	{
		ClassEmplEncaps Objcemp = new ClassEmplEncaps();
		Objcemp.setename("Bijay");
		Objcemp.seteid("012");
		Objcemp.setesal(5000);
		Objcemp.setegrade("Class I");
		
		System.out.println("Employee Details - Name :"+ Objcemp.getename()+" ID :"+ Objcemp.geteid() +" Salary :"+ Objcemp.getesal()+" Grade :"+Objcemp.getegrade());
	}
}
