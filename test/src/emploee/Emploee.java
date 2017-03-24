package emploee;

public class Emploee {

	 private String name;
	 private int money;
	 private String year;
	 
	 public Emploee(String name, int money, String year) {
		this.name = name;
		this.money = money;
		this.year = year;
	}

	public void salary(double percent){
		double raise = money * percent/100;
		money += raise;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	public static void main(String[] args){
		Emploee[] staff = new Emploee[2];
		staff[0] = new Emploee("songhe1", 5000, "3");
		staff[1] = new Emploee("songhe2", 8000, "4");
		
		for(Emploee e: staff){
			e.salary(10);
		}
		
		for(Emploee e: staff){
			System.out.println("name:" + e.getName() + "'s 工资为：" + e.getMoney() + ",他参加工作了：" + e.getYear());
		}
	}
}
