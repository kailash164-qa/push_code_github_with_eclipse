
public class EmployeeDTO {
	
	
	private int empID;
	private String empString;
	@Override
	public String toString() {
		return "EmployeeDTO [empID=" + empID + ", empString=" + empString + "]";
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpString() {
		return empString;
	}
	public void setEmpString(String empString) {
		this.empString = empString;
	}
	public EmployeeDTO(int empID, String empString) {
		super();
		this.empID = empID;
		this.empString = empString;
	}
	
	

}
