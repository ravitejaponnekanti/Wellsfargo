package com.wellsfargo.counselor.entity;


import java.util.List;

import com.example.demo.Model.entity.Client;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Advisor {

	    @Id
	    @GeneratedValue()
	    private long advisorId;

	    @Column(nullable = false)
	    private String firstName;

	    @Column(nullable = false)
	    private String lastName;

	    @Column(nullable = false)
	    private String address;

	    @Column(nullable = false)
	    private String phone;

	    @Column(nullable = false)
	    private String email;
	    
	    @OneToMany(mappedBy = "Advisor")
	    private List<Client> clients;

	    protected Advisor() {

	    }

	    public Advisor(String firstName, String lastName, String address, String phone, String email,
				List<Client> clients) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.phone = phone;
			this.email = email;
			this.clients = clients;
		}



		public List<Client> getClients() {
			return clients;
		}



		public void setClients(List<Client> clients) {
			this.clients = clients;
		}



		public Long getAdvisorId() {
	        return advisorId;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

}
