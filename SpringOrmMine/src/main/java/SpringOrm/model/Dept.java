package SpringOrm.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dept {

	@Id
	private Integer deptno;

	private String dname;
	private String location;

	public Dept() {
	}

	public Dept(Integer dno, String dnm, String lc) {
		this.deptno = dno;
		this.dname = dnm;
		this.location = lc;
	}

	public Integer getdeptno() {
		return deptno;
	}

	public void setdeptno(Integer dno) {
		this.deptno = dno;
	}

	public String getdname() {
		return dname;
	}

	public void setdname(String dnm) {
		this.dname = dnm;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String lc) {
		this.location = lc;
	}

	@Override
	public String toString() {
		return "Dept{" + "Dept No=" + deptno + ", Dept Name='" + dname + '\'' + ", Location='" + location + '\'' + '}';
	}
}
