package bai2;

public class Test {
	public static void main(String[] args) {
		Diachi p = new Diachi("Thon 1" ,"Tich Giang" , "Phuc Tho" , "Ha Tay");
		System.out.println(p.getThon() + p.getXa() + p.getHuyen() + p.getTinh());
		p.setThon("Thon 2");
		p.setXa("Tho An");
		p.setHuyen("Dan Phuong");
		p.setTinh("Ha Tay");
		System.out.println(p.toString()); 
	}
}
