package bai1;

public class Test {
	public static void main(String[] args) {
		Person p = new Person("Nguyen Van A" ,"20-1-1999" , "Ha noi",'M',"abc@gmail.com" , "091234567");
		System.out.println(p.getName() + p.getPhone() + p.getPod() + p.getDod() + p.getEmail() + p.getGender());
		p.setName("Nguyen Thi B");
		p.setEmail("123@gmail.com");
		p.setDod("1-1-1999");
		p.setPod("Thai Binh");
		p.setPhone("123456789");
		p.setGender('F');
		System.out.println(p.toString()); 
	}
}
