import java.util.*; 
public class Customer{
	private String customerName;
	private List<Project> projects = new ArrayList();
	
	public List<Project> getProjects(){
		return this.projects;
	}
	public String getCustomerName(){
		return this.customerName;
	}
	public void setProjects(Project project){
		this.projects.add(project);
	}
	public void setCustomerName(String name){
		this.customerName = name;
	}
}