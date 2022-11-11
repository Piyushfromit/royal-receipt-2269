package student.registration.bean;

public class Course {
      
	private int cid;
	private String cname;
	private int fee;
	private int seats;
	
	
	public Course() {
		// TODO Auto-generated constructor stub
	}


	public Course(int cid, String cname, int fee, int seats) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.fee = fee;
		this.seats = seats;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public int getFee() {
		return fee;
	}


	public void setFee(int fee) {
		this.fee = fee;
	}


	public int getSeats() {
		return seats;
	}


	public void setSeats(int seats) {
		this.seats = seats;
	}


	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", fee=" + fee + ", seats=" + seats + "]";
	}
	
}
