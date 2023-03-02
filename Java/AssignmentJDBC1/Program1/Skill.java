package Program1;

public class Skill {
	private long skillId;
	private String skillName;
	public long getSkillId() {
		return skillId;
	}
	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public Skill(long skillId, String skillName) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
	}
	public Skill() {
		super();
	}
	@Override
	public String toString() {
		return skillName;
	}
	
}
