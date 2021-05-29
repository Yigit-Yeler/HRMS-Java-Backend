package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "job_ads")
public class JobAd {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_ad_id")
	private int id;
	
	@Column(name = "job_ad_company_name")
	private String companyName;
	
	@Column(name = "job_ad_desc")
	private String description;
	
	@Column(name = "job_ad_city")
	private String city;
	
	@Column(name = "job_ad_count")
	private int count;
	
	@Column(name = "job_ad_min_salary")
	private int minSalary;
	
	@Column(name = "job_ad_max_salary")
	private int maxSalary;
	
	@Column(name = "job_ad_last_date")
	private Date lastDate;
	
	@Column(name = "job_ad_active")
	private boolean isActive;
	
	@ManyToOne()
	@JoinColumn(name = "job_pos_id")
	private Position position;
	
	public JobAd() {
		
	}
	
	public JobAd(int id, String companyName, String description, String city, int count, int minSalary,
			int maxSalary, Date lastDate,boolean isActive,Position position) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.description = description;
		this.city = city;
		this.count = count;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.lastDate = lastDate;
		this.isActive = isActive;
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}

	public Date getLastDate() {
		return lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
}
