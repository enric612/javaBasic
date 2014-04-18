package cat.enric612.javabasic.exemples.exemple1;

import java.math.BigDecimal;
import java.util.Locale;


public class Client {
	private String nom;
	private Integer id;
	private Locale localitzacio;
	private BigDecimal balans; // És recomanble no utilitzar el caracter ç
	
	/*
	 * Constructor
	 */
	
	public Client(){
		this.nom = "Nom de Client per defecte";
		this.id = 12345;
		this.localitzacio = new Locale("ca","ES");
		this.balans = new BigDecimal("0");
		
		
	}
	
	/*
	 * Getters/Setters
	 */
	
	public String getNom(){
		return this.nom;
	}
	
	public void setNom(String nom){
		if(nom == null){
			throw new IllegalArgumentException(
					"El nom no pot ser nul");
		} else {
			this.nom = nom;
		}
			
	}
	
	public Integer getId(){
		return this.id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public BigDecimal getBalans(){
		return this.balans;
	}
	
	public void setBalans(float balans){
		this.balans = new BigDecimal(balans);
	}
	
	
	/*
	 * SObrescritura de mètodes de la classe Object de java
	 */
	
	public String toString(){
		java.text.NumberFormat format = java.text.NumberFormat.getCurrencyInstance(localitzacio);
		
		StringBuilder valor = new StringBuilder();
		valor.append(String.format("Nom : %s%n", this.nom));
		valor.append(String.format("Nombre de Client : %d%n", this.id));
		valor.append(String.format("Balanç : %s%n", format.format(this.balans)));
		
		return valor.toString();
		
	
	}
	

	

}
