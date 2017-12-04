package Animals;

public class Puppy {
	  String name ;
	  public Puppy(String t) {
	    name = t;
	  }
	 
	  public static void main(String[] args) {
	    
	    Puppy Hoopah = new Puppy("Hoopah");
	 
	    Hoopah.getName();
	   
	  }
	 
	  public void getName() {
	    System.out.println(name);
	  }
}