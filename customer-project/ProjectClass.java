import java.util.*; 
public class ProjectClass{
	private String projectName;
	private ProjectManager projectManager;
	private List<TeamMembers> membersList = new ArrayList();

	public void setProjectName(String name){
		this.projectName = name;
	}
	public String getProjectName(){
		return this.projectName;
	}
	public void setProjectManager(ProjectManager manager){
		this.projectManager = manager;
	}
	public ProjectManager getProjectManager(){
		return this.projectManager;
	}
	public void setMemberList(TeamMembers member){
		this.membersList.add(member);
	}
	public List<TeamMembers> getTeamMembers(){
		return this.membersList;
	}
}
