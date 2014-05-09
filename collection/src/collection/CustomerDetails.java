package collection;

public class CustomerDetails {

private int accountNo;
private String customerName;
private int mobileNo;
private String customerAdd;
private String customerBranch;

public CustomerDetails(int accountNo, String customerName, int mobileNo,
		String customerAdd, String customerBranch) {

	this.accountNo = accountNo;
	this.customerName = customerName;
	this.mobileNo = mobileNo;
	this.customerAdd = customerAdd;
	this.customerBranch = customerBranch;
}

public int getAccountNo() {
	return accountNo;
}


public String getCustomerName() {
	return customerName;
}


public int getMobileNo() {
	return mobileNo;
}

public String getCustomerAdd() {
	return customerAdd;
}

public String getCustomerBranch() {
	return customerBranch;
}


}
