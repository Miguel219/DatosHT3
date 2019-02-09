/**
 * Silvio Orozco 18282
 * Jose Castaneda 18161
 * Roberto Castillo 185546
 */
public class Index implements Comparable<Index> {

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
	public int compareTo(Index o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.num, ((Index)o).getNum());
	}

}
