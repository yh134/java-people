class People1
{
	private String name;
	private int age;
	private char sex;
	private int weight;
	public People1()
	{
	}
	public People1(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public People1(String name,int age,char sex,int weight)
	{
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.weight=weight;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setSex(char sex)
	{
		this.sex=sex;
	}
	public void setWeight(int weight)
	{
		this.weight=weight;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public char getSex()
	{
		return this.sex;
	}
	public int getWeight()
	{
		return this.weight;
	}
	public String getInfo()
	{
		return "������"+this.name+" ���䣺"+this.age+" �Ա�"+
				this.sex+" ���أ�"+this.weight;		
	}
}

public class People {

	public static void main(String[] args) {
	People1 man=new People1("С��",18,'��',60);
	System.out.println(man.getInfo());
	

	}

}
