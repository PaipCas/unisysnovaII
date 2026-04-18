package model;

public class Participations {
	private int participationId;
	private int projectId;
	private int personId;
	private int projectRoleId;

	public Participations() {
	}

	public Participations(int participationId, int projectId, int personId, int projectRoleId) {
		setParticipationId(participationId);
		setProjectId(projectId);
		setPersonId(personId);
		setProjectRoleId(projectRoleId);
	}

	public int getParticipationId() {
		return participationId;
	}

	public void setParticipationId(int participationId) {
		if (participationId <= 0) {
			System.out.println("Id de la participación inválido");
			return;
		} else {
			this.participationId = participationId;
		}
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		if (projectId <= 0) {
			System.out.println("Id del proyecto inválido");
			return;
		} else {
			this.projectId = projectId;
		}
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		if (personId <= 0) {
			System.out.println("Id de la persona inválido");
			return;
		} else {
			this.personId = personId;
		}
	}

	public int getProjectRoleId() {
		return projectRoleId;
	}

	public void setProjectRoleId(int projectRoleId) {
		if (projectRoleId <= 0) {
			System.out.println("Id del rol inválido");
			return;
		} else {
			this.projectRoleId = projectRoleId;
		}
	}
}