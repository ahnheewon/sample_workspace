package Review1;

public class Product {
	// 필드 : price, amount
		private int price;  //private 이므로 getter setter 만들어주기.
		private int amount; 
		private String name; 
		
	// 생성자


	// 메소드
		
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
}
