package ua.lviv.lgs.someClass;

public class Mood implements Comparable<Mood>{

	private String moodName;
	private int moodIntensity;// умовно від 1 до 10
	
	
	public Mood(String moodName, int moodIntensity) {
		super();
		this.moodName = moodName;
		this.moodIntensity = moodIntensity;
	}


	public String getMoodName() {
		return moodName;
	}


	public void setMoodName(String moodName) {
		this.moodName = moodName;
	}


	public int getMoodIntensity() {
		return moodIntensity;
	}


	public void setMoodIntensity(int moodIntensity) {
		this.moodIntensity = moodIntensity;
	}


	@Override
	public String toString() {
		return "Mood [moodName=" + moodName + ", moodIntensity= " + moodIntensity + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + moodIntensity;
		result = prime * result + ((moodName == null) ? 0 : moodName.hashCode());
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
		Mood other = (Mood) obj;
		if (moodIntensity != other.moodIntensity)
			return false;
		if (moodName == null) {
			if (other.moodName != null)
				return false;
		} else if (!moodName.equals(other.moodName))
			return false;
		return true;
	}


	@Override
	public int compareTo(Mood o) {
		return this.moodName.compareTo(o.getMoodName());
	}
	
	
}
