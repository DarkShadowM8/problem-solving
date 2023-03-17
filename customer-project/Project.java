import java.util.*; 
public class Project{
	public static void main(String[] args){
		/**
		*	initializng 5 members
		*
		**/
		TeamMembers member1 = new TeamMembers("Ali");
		TeamMembers member2 = new TeamMembers("Umer");
		TeamMembers member3 = new TeamMembers("Asad");
		TeamMembers member4 = new TeamMembers("Hamid");
		TeamMembers member5 = new TeamMembers("Jay");
		/**
		*	initializng a manager
		*
		**/
		ProjectManager manager = new ProjectManager("Usman");
		
		/**
		*	initializng a project
		*
		**/
		ProjectClass project = new ProjectClass();
		
		project.setProjectName("Sprint");
		project.setMemberList(member1);
		project.setMemberList(member3);
		project.setMemberList(member5);
		project.setProjectManager(manager);
		/**
		*	initializng a customer
		*
		**/
		Customer customer = new Customer();
		
		customer.setCustomerName("Arshad");
		customer.setProjects(project);
	}
}

