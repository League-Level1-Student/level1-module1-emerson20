package _03_harry_potter;

public class Harry_Potter_Runner {
public static void main(String[] args) {
	HarryPotter harry = new HarryPotter();
	harry.makeInvisible(true);
	harry.spyOnSnape();
	harry.makeInvisible(false);
	harry.castSpell("stupefy");
}
}
//* Create a HarryRunner class in the harry_potter package with a main method.
// * The main method should:
// * 
//* 1. create harry potter
//* 2. make him become invisible
//* 3. spy on Professor Snape
//* 4. make him become visible again
//* 5. cast a “stupefy” spell
