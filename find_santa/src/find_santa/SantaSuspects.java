package find_santa;

public class SantaSuspects {
	String [] suspects;
	
	int nextIndex = 0;		//number of suspects in array
	int arraySize = 0;		//size of the whole array
	
	public SantaSuspects(int size) {
		this.arraySize = size;						//initialize size to zero
		this.suspects = new String[size];			//create array with input size
		
	}
	
	public void addSuspect(String suspect) {
		this.suspects[this.nextIndex]= suspect;		//add suspect to array at index of nextIndex
		this.nextIndex++;							//increment nextIndex
		if(this.nextIndex >= this.arraySize) {		//if nextIndex reaches the end of array 
			this.nextIndex = 0;							//reset to zero and overwrite old names
		}
	}
	
	public void printSuspects() {					//print all suspects in array
		for(String name : suspects) {
			if(name == null)						//if name is empty then skip
				continue;
			System.out.println(name);
		}
			
	}
	
	public boolean foundMatch(String input) {
		for(String name : suspects){
			if(input.equals(name))
					return true;
		}
		return false;
	}
	
	
	
}
