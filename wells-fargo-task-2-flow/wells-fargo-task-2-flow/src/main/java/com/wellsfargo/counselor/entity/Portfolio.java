package com.wellsfargo.counselor.entity;

import javax.persistence.*;

import com.example.demo.entity.Client;
import com.example.demo.entity.Security;

import java.util.List;

@Entity
@Table(name = "portfolios")
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;

    @OneToOne
    @JoinColumn(name = "clientId")
    private Client client;

    @ManyToMany
    @JoinTable(
        name = "portfolio_securities",
        joinColumns = @JoinColumn(name = "portfolio_id"),
        inverseJoinColumns = @JoinColumn(name = "security_id")
    )
    private List<Security> securities;

    public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Security> getSecurities() {
		return securities;
	}

	public void setSecurities(List<Security> securities) {
		this.securities = securities;
	}

	public Portfolio(String name, String description, Client client, List<Security> securities) {
		this.name = name;
		this.description = description;
		this.client = client;
		this.securities = securities;
	}
	public Portfolio() {}
}
