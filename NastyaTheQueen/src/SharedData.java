import java.util.ArrayList;

public class SharedData

{
	//
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * @param array
	 * @param getting informatin
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * @return the wining array
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}


	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return the array list
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return the number 
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return the flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
