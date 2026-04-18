package model;

public class Participations {
	private int participationId;
	private int projectId;
	private int personId;
	private int projectRoleId;
	
	public Participations() {}
	
	public Participations(int participationId, int projectId, int personId, int projectRoleId) {
		this.participationId = participationId;
		this.projectId = projectId;
		this.personId = personId;
		this.projectRoleId = projectRoleId;
	}
	
	public int getParticipationId() {
		return participationId;
	}
	
	public void setParticipationId(int participationId) {
		this.participationId = participationId;
	}
	
	public int getProjectId() {
		return projectId;
	}
	
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	
	public int getPersonId() {
		return personId;
	}
	
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	
	public int getProjectRoleId() {
		return projectRoleId;
	}
	
	public void setProjectRoleId(int projectRoleId) {
		this.projectRoleId = projectRoleId;
	}
}