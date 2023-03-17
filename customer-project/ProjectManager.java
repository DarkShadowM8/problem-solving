public class ProjectManager{
	private String managerName;
	
	public ProjectManager(String name){
		this.managerName = name;
	}
	
	public void setName(String name){
		this.managerName = name;
	}
	public String getManagerName(){
		return this.managerName;
	}
}
