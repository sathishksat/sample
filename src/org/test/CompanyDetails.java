package org.test;

public class CompanyDetails {

	public void companyName(String companyName) {
		System.out.print("Company name is:"+companyName);	
		

	}

	public static void main(String[] args) {
		
	CompanyDetails d = new CompanyDetails();
	d.companyName("Caterpillar");
	}

}
