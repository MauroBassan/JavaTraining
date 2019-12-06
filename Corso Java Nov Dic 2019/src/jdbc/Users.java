package jdbc;

public class Users {
	
		private int id;
		private String nome;
		private String address;
		private String email;
		private String phone;
		
		
		public Users(int id, String nome, String address, String email, String phone) {
			this.id = id;
			this.nome = nome;
			this.address = address;
			this.email = email;
			this.phone = phone;
		}

		public Users() {
			
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getAddress() {
			return address;
		}
		
		public void setAddress(String address) {
			this.address = address;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getPhone() {
			return phone;
		}
		
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		public void printusers() {
			System.out.println("id : " + this.getId());
			System.out.println("Nome : " + this.getNome());
			System.out.println("Address : " + this.getAddress());
			System.out.println("Email : " + this.getEmail());
			System.out.println("Telefono : " + this.getPhone());
		}
	}