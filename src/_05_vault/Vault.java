package _05_vault;

public class Vault {
private int secretCode = 999923;

Vault(int secretCode){
	this.secretCode=secretCode;
}

public boolean tryCode(int code) {
	if (code == secretCode) {
		return true;
	}return false;
}
}
//James Bond is trying to crack a vault. Before we start to write code, we will draw a UML diagram on the whiteboard (teacher will help) and figure out what the method signatures will be.
//
//1. We need a Vault object that contains a secret code.
//It also contains a tryCode() method that takes a number as a parameter and returns true if that number opens the vault, false otherwise.
//
//2. Test the vault object using a main method.
//
//3. Make a James Bond class that has a method findCode() that takes a Vault as a parameter.
//The codes are between 0 and 1 million. This method tries all the codes, and returns the first code that opens the vault, or -1 if no code opened the vault.
//
//4. Test your code by instantiating the JamesBond and Vault classes.
//
//5. Add a constructor for Vault so that you can easily set the secret code. 
//
