package bai1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CircleCollection {
	
	ArrayList<Circle> al = new ArrayList<>();
	//Thêm hình tròn vào danh sách
	public void addCircle(Circle c) {
		System.out.println("Hinh da duoc them vao danh sach"); 
		this.al.add(c);
	}
	//Getter Setter 
	public void getCircle(int pos) {
		System.out.println("Phan tu" + pos + "la :");
		System.out.print(this.al.get(pos)); 
	}
	
	public void setCircle(int pos , Circle c) {
		System.out.println("Da thay doi gia tri cua phan tu thu "+ pos); 
		this.al.set(pos, c) ;
	}

	// Tổng diện tích 
	public double caclSumArea() {
		double sum = 0;
		for(Circle a : this.al) {
			sum += a.getArea();
		}
		return sum ;
	}
	//Trả về diện tích hình tòn nhỏ nhất 
	public double findMinArea() {
		double min = this.al.get(0).getArea();
		for(Circle a : this.al) {
			if(a.getArea() < min)
				min = a.getArea();
		}
		return min;
		}
	
	//Trả về diện tích hình tròn lớn nhất 
	public double findMaxArea() {
		double max = this.al.get(0).getArea();
		for(Circle a : this.al) {
			if(a.getArea() > max)
				max = a.getArea();
		}
		return max;
		}
	
	
	//Nhập giá trị
	public void nhapGiaTri() {
		Random r = new Random();
		int n ;
		System.out.println("Nhập vao so phan tu ban muon :");
		Scanner sc = new Scanner(System.in);
		n = sc. nextInt();
		for(int i = 0 ; i< n ; i++) {
			Circle c = new Circle(r.nextDouble());
			this.al.add(c);
		}
	}
	
	//Hiển thị thông tin 
	public void hienThiThongTin() {
		System.out.println("Nhung gia tri da nhap");
		for(Circle s : this.al){
			System.out.println(s.toString());
		}
	}
	
	//Hiển thị thông tin của hình tròn có diện tích nhỏ nhất : 
	public void InfomationMinArea() {
		int m = 0;
		double min = this.al.get(0).getArea();
		for(int i = 0 ; i < this.al.size() ; i++) {
			if(this.al.get(i).getArea() < min)
				min = this.al.get(i).getArea();
			 	m = i;
		}
			System.out.println("Thông tin hình tròn :"); 
			System.out.println("Bán kinh :"+this.al.get(m).getRadius());  
			System.out.println("Vị trí : " + m); 
		}
	
}
	

