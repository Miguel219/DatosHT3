package application;

public class Index<T> implements Comparable<T> {

	private int num;
	
	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * @param num = Numero del index
	 */
	public Index(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.num, ((Index)o).getNum());
	}

}
