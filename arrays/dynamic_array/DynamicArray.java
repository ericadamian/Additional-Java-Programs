 public class DynamicArray{

	public int size;
	public int[] A;
	public int count;

	// constructor
	public DynamicArray(int initial){
		// initialies our size, array, and count variable
		size = initial;
		A = new int[initial];
		count = 0;
	}

	//******************************************************************

	// intializing size/count/A to DynamicArray
	public DynamicArray(DynamicArray D) {
		size = D.size;
		count = D.count;
		A = new int[size];
 
		for(int i = 0;i < D.count;i++){
			A[i] = D.A[i];
		}
	}

	//******************************************************************

	// returns DynamicArray copy
	public DynamicArray copy(){
		return this;
	}

	//******************************************************************

	// number positive number negative
	public int[] NPNN(){

		// initializing positive/negative counter
		int positive = 0;
		int negative = 0;
		int NPNN[] = new int[2];

		// searches for positive and negative integers
		for(int i = 0; i < count; i++){
			if(A[i] > 0){
				positive++;
			}
			if(A[i] < 0){
				negative++;
			}
		}
		NPNN[0] = positive;
		NPNN[1] = negative;
		return NPNN;
	}

	//******************************************************************

	public String toString(){

		// declaring our string variable
		String str = "";

		// returns each element of size count (formatting included)
		if(count > 0){
			for(int i = 0; i < count; i++){
				str = str + A[i] + " ";
			}
		}

		// return null if count is 0
		if(count == 0){
			str = null;
		}

		return str;
	}

	//******************************************************************

	public void add(int n){

		// incrementing count variable dependent on current value (+,-,0)
		// array value stored inside parameter n
		if(count < size){
			if(count > 0){
				count++;
				A[count-1] = n;
			}

			if(count == 0){
				A[0] = n;
				count++;
			}
		}
	}

	//******************************************************************

	public int delete(){

		int delete = 0;

		// decrements count and array A (value returned)
		if(count>0){
			count--;
			delete = A[count-1];
		}
		
		// returning a negative int when array size is 0
		if(size == 0){
			delete = -1;
		}

		return delete;
	}

	//******************************************************************
	
	public boolean equals(DynamicArray D){

		// boolean variable initially set to false
		boolean correct = false;

		for(int i = 0; i < count; i++){
			// returns false if not equal
			if(count == 0){
				correct = false;
				continue;
			}
			// returns true if equal
			if(count == D.count && A[i] == D.A[i]){
				correct = true;
			}
		}
		return correct;
	}	
}