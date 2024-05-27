package domain;
import IF.CompensationList;
import IF.ContractList;
import IF.CounselList;
import IF.InsuranceList;
import IF.PaymentList;
public class Employee {
	private String email;
	private int employeeID;
	private String employeePW;
	private String gender;
	private String name;
	private String phone;
	private String type;
	//
	public InsuranceList insuranceListImpl;
	public Rule m_Rule;
	public ContractList contractListImpl;
	public CounselList counselListImpl;
	public PaymentList paymentListImpl;
	public CompensationList compensationListImpl;
	//
	public Employee(){

	}

	public void finalize() throws Throwable {

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeePW() {
		return employeePW;
	}

	public void setEmployeePW(String employeePW) {
		this.employeePW = employeePW;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public InsuranceList getInsuranceList() {
		return insuranceListImpl;
	}

	public void setInsuranceList(InsuranceList insuranceListImpl) {
		this.insuranceListImpl = insuranceListImpl;
	}

	public Rule getM_Rule() {
		return m_Rule;
	}

	public void setM_Rule(Rule m_Rule) {
		this.m_Rule = m_Rule;
	}
	public CounselList getCounselList() {
		return counselListImpl;
	}

	public void setCounselList(CounselList counselListImpl) {
		this.counselListImpl = counselListImpl;
	}
	
	public ContractList getContractList() {
		return contractListImpl;
	}

	public void setContractList(ContractList contractListImpl) {
		this.contractListImpl = contractListImpl;
	}

	public boolean createContract(Contract contract) {
		return contractListImpl.add(contract);
	}

	public boolean deleteContract(int contractID) {
		return contractListImpl.deleteById(contractID);
	}

	public boolean createInsurance(Insurance insurance) {
		return this.insuranceListImpl.add(insurance);
	}

	public boolean deleteInsurance(int insuranceID) {
		return this.insuranceListImpl.delete(insuranceID);
	}

	public boolean createPayment(Payment payment) {
		return this.paymentListImpl.add(payment);
	}

	public boolean deletePayment(int paymentID) {
		return this.paymentListImpl.delete(paymentID);
	}

	public void setPaymentList(PaymentList paymentListImpl) {
		this.paymentListImpl = paymentListImpl;
	}
	public CompensationList getCompensationList() {
		return compensationListImpl;
	}
	public void setCompensationList(CompensationList compensationListImpl) {
		this.compensationListImpl = compensationListImpl;
	}
	public boolean createCompensation(Compensation compensation) {
		return this.compensationListImpl.add(compensation);
	}
	public boolean deleteCompensation(int compensationID) {
		return this.compensationListImpl.deleteById(compensationID);
	}
}