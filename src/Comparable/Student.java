package Comparable;

public class Student implements Comparable<Student >
{
	int id;
	long phn, accountno;
	int bal;
	String name, bank, Branch, date;
	public Student(int id, long phn, long accountno, int bal, String name, String bank, String branch, String date) {
		super();
		this.id = id;
		this.phn = phn;
		this.accountno = accountno;
		this.bal = bal;
		this.name = name;
		this.bank = bank;
		Branch = branch;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", phn=" + phn + ", accountno=" + accountno + ", bal=" + bal + ", name=" + name
				+ ", bank=" + bank + ", Branch=" + Branch + ", date=" + date + "]";
				
	}
	public int compareTo(Student s3)
	{
		if(this.id>s3.id)
		{
			return 1;
		}else if(this.id<s3.id)
			return -1;
		else return 0;
	}
	

	
	
	
}