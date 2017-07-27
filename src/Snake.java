
public class Snake extends Animal {

	public Snake (){
		
		System.out.println("A snake slithers around");
	}
	
		
		
		@Override
		public String tree() {
		return "A can be found in trees";
		}

		@Override
		public String size() {
		return "A snake can be different sizes";
		}


		public String fly()
		{
		//Birds can fly but other animals can't so this method
		//is unique to the Bird class
		return "A bird flies...";
		}
		
	}

