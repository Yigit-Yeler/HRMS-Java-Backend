package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "educations")
public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "education_id")
	private int id;
	
	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "department_name")
	private String departmentName;
	
	@Column(name = "entry_date")
	private Date entryDate;
	
	@Column(name = "graduation_date")
	private Date graduationDate;
	
	@JoinColumn(name = "education_id", insertable = false, updatable = false)
    @ManyToOne
	private Portfolio portfolio;

	public Education() {
		
	}

	public Education(int id, String schoolName, String departmentName, Date entryDate, Date educationDate,
			Portfolio portfolio) {
		super();
		this.id = id;
		this.schoolName = schoolName;
		this.departmentName = departmentName;
		this.entryDate = entryDate;
		this.graduationDate = educationDate;
		this.portfolio = portfolio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getEducationDate() {
		return graduationDate;
	}

	public void setEducationDate(Date educationDate) {
		this.graduationDate = educationDate;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}
	
	
}
