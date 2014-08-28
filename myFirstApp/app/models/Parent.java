package models;
 
import java.util.Date;
 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
 
import play.db.ebean.Model;
 
import com.avaje.ebean.annotation.CreatedTimestamp;
 
@Entity
public class Parent extends Model {
 
    @Id
	private Long id;
 
    private String name;
 
    @CreatedTimestamp
	private Date createDate;
 
    @Version
	private Date updateDate;
 
    public String toString() {
        return "Parent [id=" + getId() + ", name=" + getName() + ", createDate="
                + getCreateDate() + ", updateDate=" + getUpdateDate() + "]";
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}