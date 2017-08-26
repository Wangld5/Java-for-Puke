package project3;

public class Courses {
	public String id;
	public String name;
	public String grade;
	public Courses(){
		
	}
	public Courses(String id, String name){
		this.id = id;
		this.name = name;
	}
	@Override
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 * 通过使用HashCode重载判断Set中是否包含元素
	 * Set的contains的判断机制
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Courses other = (Courses) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
