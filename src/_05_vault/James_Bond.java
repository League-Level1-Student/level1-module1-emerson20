package _05_vault;

public class James_Bond {
public static void main(String[] args) {
	Vault fox = new Vault(999925);
	
	James_Bond bond = new James_Bond();
	bond.findCode(fox);
	
}

public void findCode(Vault fox) {
	for (int i = 0; i < 1000000; i++) {
		if (fox.tryCode(i)) {
			System.out.println("The code is "+i+".");
		}
	}
}
}
//3. Make a James Bond class that has a method findCode() that takes a Vault as a parameter.
//The codes are between 0 and 1 million. This method tries all the codes, and returns the first code that opens the vault, or -1 if no code opened the vault.
//
//4. Test your code by instantiating the JamesBond and Vault classes.
//
//5. Add a constructor for Vault so that you can easily set the secret code. 
//
