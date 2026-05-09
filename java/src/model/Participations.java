package model;

public class Participations extends BaseEntity {
	private int projectId;
	private int personId;
	private int projectRoleId;

	public Participations() {
	}

	public Participations(int id, int projectId, int personId, int projectRoleId) {
		super(id);
		setProjectId(projectId);
		setPersonId(personId);
		setProjectRoleId(projectRoleId);
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		if (projectId <= 0) {
			throw new IllegalArgumentException("Id del proyecto inválido");
		}
		
		this.projectId = projectId;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		if (personId <= 0) {
			throw new IllegalArgumentException("Id de la persona inválido");
		}
		
		this.personId = personId;
	}

	public int getProjectRoleId() {
		return projectRoleId;
	}

	public void setProjectRoleId(int projectRoleId) {
		if (projectRoleId <= 0) {
			throw new IllegalArgumentException("Id del rol inválido");
		}
		
		this.projectRoleId = projectRoleId;
	}
}