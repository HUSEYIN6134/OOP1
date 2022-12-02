package oop1;

public class CorporateCustomer extends Customer {
	
	private String companyName;
	private String taxNmumber;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTaxNmumber() {
		return taxNmumber;
	}
	public void setTaxNmumber(String taxNmumber) {
		this.taxNmumber = taxNmumber;
	}
	

}
