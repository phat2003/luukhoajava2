package com.java.chuong5;

/*public class SinhVien {
	
	private int id;//biến instance(ghi lại để dòng giải thích dưới sẽ dễ hiểu vs nhận biết hơn)
	private String name;
	private String email;
	
	public SinhVien(int id,String name) {//biến truyền vào trong ngoặc là parameter
		this.id = id;//ở đây phải có this do nếu không có thì cái biến parameter truyền vào contructor SinhVien sẽ trùng tên với cái biến instance của class đó.
		this.name = name;//do vậy ở chỗ này để truyền chính xác mà không bị trùng tên thì phải dùng biến tham chiếu this ở đây.
		//có thể nhận biết sự khác biệt ở chỗ màu code, this.id là chỉ cái biến instance(private int id; ở trên) còn sau dấu bằng là màu đỏ là của cái parameter
	}
	
	public SinhVien(int id, String name, String email) {
		this(id,name);//chỗ này nếu dùng this.id = id; this.email = email thì nó sẽ chỉ truyền parameter của contructor ở chỗ này vào biến instance ở trên mà thôi
		              //còn cách ghi this(id,name) là nó sẽ gọi id và name ở contructor SinhVien ở trên xuống đây. và cách này thường được dùng để gọi 1 contructor khác khi đang ở contructor này.
		this.email = email;
	}
	
	public void display() {
		System.out.println(name);
		
		this.showEmail();
	}
	
	public void showEmail() {
		System.out.println(email);
	}
	
	public static void main(String[] args) {
		
		SinhVien sv1 = new SinhVien(1,"Sinh Vien 1");
		sv1.display();
		
		SinhVien sv2 = new SinhVien(1,"Sinh Vien 2","sv2@gmail.com");
		sv2.display();
	}

}
*/