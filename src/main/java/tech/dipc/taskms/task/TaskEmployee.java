package tech.dipc.taskms.task;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import tech.dipc.taskms.user.UserEmployee;

@Entity
public class TaskEmployee {

	@Id

	int eid;

	String taskName;
	String creator;
	int assignedTo;
	int proposedStartTime;
	int actualStartTime;
	int estimatedTimeTaken;
	int actualTimeTaken;

	@ManyToOne(cascade = CascadeType.ALL)

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public int getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(int assignedTo) {
		this.assignedTo = assignedTo;
	}

	public int getProposedStartTime() {
		return proposedStartTime;
	}

	public void setProposedStartTime(int proposedStartTime) {
		this.proposedStartTime = proposedStartTime;
	}

	public int getActualStartTime() {
		return actualStartTime;
	}

	public void setActualStartTime(int actualStartTime) {
		this.actualStartTime = actualStartTime;
	}

	public int getEstimatedTimeTaken() {
		return estimatedTimeTaken;
	}

	public void setEstimatedTimeTaken(int estimatedTimeTaken) {
		this.estimatedTimeTaken = estimatedTimeTaken;
	}

	public int getActualTimeTaken() {
		return actualTimeTaken;
	}

	public void setActualTimeTaken(int actualTimeTaken) {
		this.actualTimeTaken = actualTimeTaken;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", taskName=" + taskName + ", creator=" + creator + ", assignedTo=" + assignedTo
				+ ", proposedStartTime=" + proposedStartTime + ", actualStartTime=" + actualStartTime
				+ ", estimatedTimeTaken=" + estimatedTimeTaken + ", actualTimeTaken=" + actualTimeTaken + "]";
	}

}
