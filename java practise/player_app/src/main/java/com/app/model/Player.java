package com.app.model;

public class Player {
	private int id; 
	private String name;
	private int age;
	private String gender;
	private String city;
	private String sportsName;
	private long contact;
	private Team teamName;
	

	

		public Player() {
			// TODO Auto-generated constructor stub
		}
		

		public Team getTeamName() {
			return teamName;
		}


		public void setTeamName(Team teamName) {
			this.teamName = teamName;
		}


		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getSportsName() {
			return sportsName;
		}

		public void setSportsName(String sportsName) {
			this.sportsName = sportsName;
		}

		public long getContact() {
			return contact;
		}

		public void setContact(long contact) {
			this.contact = contact;
		}
		

		@Override
		public String toString() {
			return "Player [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", city=" + city
					+ ", sportsName=" + sportsName + ", contact=" + contact + ", teamName=" + teamName + "]";
		}


}
