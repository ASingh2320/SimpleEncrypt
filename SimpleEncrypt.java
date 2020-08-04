/***
 * Author: Anmol Singh
 * Title: Simple Encrypter
 */
import java.util.Scanner;
public class SimpleEncrypt {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		while(true){
			System.out.print("A) Atbash\n" +
					"B) ROT13\n" +
					"C) Caesar\n" +
					"D) Rail-fence\n" +
					"E) Polybius Square\n" +
					"F) Simple Substitution\n" +
					"G) Columnar Transposition\n" +
					"H) Vigenere\n" +
					"Q) Quit\n"+
					"\nPlease select encryption technique: ");
			String in = input.next();
			if(in.compareToIgnoreCase("Q") == 0){
				System.out.println("Thank you for using this encryption program. Have a nice day!");
				break;
			}
			System.out.println( "E) encrypt\n"+
					"D) decrypt\n"+
					"Please select what you would like to do: ");
			String act = input.next();
			input.nextLine();
			if(in.compareToIgnoreCase("A") == 0){
				if(act.compareToIgnoreCase("e") == 0){
					System.out.println("Please enter text to be encrypted: ");
					String text = input.nextLine();
					System.out.println("Encrypted result: " + Atbash(text));
				}
				else{
					System.out.println("Please enter text to be decrypted: ");
					String text = input.nextLine();
					System.out.println("Decrypted result: " + Atbash(text));
				}
			}
			else if(in.compareToIgnoreCase("B") == 0){
				if(act.compareToIgnoreCase("e") == 0){
					System.out.println("Please enter text to be encrypted: ");
					String text = input.nextLine();
					System.out.println("Encrypted result: " + ROT13(text));
				}
				else{
					System.out.println("Please enter text to be decrypted: ");
					String text = input.nextLine();
					System.out.println("Decrypted result: " + ROT13(text));
				}
			}
			else if(in.compareToIgnoreCase("C") == 0){
				if(act.compareToIgnoreCase("e") == 0){
					System.out.println("Please enter text to be encrypted: ");
					String text = input.nextLine();
					System.out.println("Please enter shift: ");
					int key = input.nextInt();
					System.out.println("Encrypted result: " + Caesar(text, key));
				}
				else{
					System.out.println("Please enter text to be decrypted: ");
					String text = input.nextLine();
					System.out.println("Please enter shift: ");
					int key = input.nextInt();
					System.out.println("Decrypted result: " + deCaesar(text, key));
				}
			}
			else if(in.compareToIgnoreCase("D") == 0){
				if(act.compareToIgnoreCase("e") == 0){
					System.out.println("Please enter text to be encrypted: ");
					String text = input.nextLine();
					System.out.println("Please enter key: ");
					int key = input.nextInt();
					System.out.println("Encrypted result: " + Railfence(key, text));
				}
				else{
					System.out.println("Please enter text to be decrypted: ");
					String text = input.nextLine();
					System.out.println("Please enter key: ");
					int key = input.nextInt();
					System.out.println("Decrypted result: " + deRail(text, key));
				}
			}

			else if(in.compareToIgnoreCase("E") == 0){
				if(act.compareToIgnoreCase("e") == 0){
					System.out.println("Please enter text to be encrypted: ");
					String text = input.nextLine();
					System.out.println("Please enter the cipher key: ");
					String key = input.nextLine();
					System.out.println("Encrypted result: " + Poly(text, key));
				}
				else{
					System.out.println("Please enter text to be decrypted: ");
					String text = input.nextLine();
					System.out.println("Please enter the cipher key: ");
					String key = input.nextLine();
					System.out.println("Decrypted result: " + dePoly(text, key));
				}
			}
			else if(in.compareToIgnoreCase("F") == 0){
				if(act.compareToIgnoreCase("e") == 0){
					System.out.println("Please enter text to be encrypted: ");
					String text = input.nextLine();
					System.out.println("Please enter the cipher key: ");
					String key = input.nextLine();
					System.out.println("Encrypted result: " + Sub(text, key));
				}
				else{
					System.out.println("Please enter text to be decrypted: ");
					String text = input.nextLine();
					System.out.println("Please enter the cipher key: ");
					String key = input.nextLine();
					System.out.println("Decrypted result: " + deSub(text, key));
				}

			}
			else if(in.compareToIgnoreCase("G") == 0){
				if(act.compareToIgnoreCase("e") == 0){
					System.out.println("Please enter text to be encrypted: ");
					String text = input.nextLine();
					System.out.println("Please enter the cipher key: ");
					String key = input.nextLine();
					System.out.println("Encrypted result: " + Ctra(text, key));
				}
				else{
					System.out.println("Please enter text to be decrypted: ");
					String text = input.nextLine();
					System.out.println("Please enter the cipher key: ");
					String key = input.nextLine();
					System.out.println("Decrypted result: " + deTra(text, key));
				}
			}

			else if(in.compareToIgnoreCase("H") == 0){
				if(act.compareToIgnoreCase("e") == 0){
					System.out.println("Please enter text to be encrypted: ");
					String text = input.nextLine();
					System.out.println("Please enter the cipher key: ");
					String key = input.nextLine();
					System.out.println("Encrypted result: " + Vir(text, key));
				}
				else{
					System.out.println("Please enter text to be decrypted: ");
					String text = input.nextLine();
					System.out.println("Please enter the cipher key: ");
					String key = input.nextLine();
					System.out.println("Decrypted result: " + deVir(text, key));
				}
			}
			else{
				System.out.println("Please select an option from the menu.");
			}
		}
		input.close();

	}

	public static String Atbash(String text){
		String result = "";
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) >= 'A' && text.charAt(i) <= 'M'){
				result = result + (char)('N' + 'M' - text.charAt(i));
			}
			if(text.charAt(i) >= 'N' && text.charAt(i) <= 'Z'){
				result = result + (char)('M' - (text.charAt(i) - 'N'));
			}
			if(text.charAt(i) >= 'a' && text.charAt(i) <= 'm'){
				result = result + (char)('n' + 'm' - text.charAt(i));
			}
			if(text.charAt(i) >= 'n' && text.charAt(i) <= 'z'){
				result = result + (char)('m' - text.charAt(i) - 'n');
			}
			if(text.charAt(i) == ' '){
				result = result + ' ';
			}
		}
		return result;
	}
	public static String ROT13(String text){
		String result = "";
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) >= 'A' && text.charAt(i) <= 'M'){
				result = result + (char)(text.charAt(i) + 13);
			}
			if(text.charAt(i) >= 'N' && text.charAt(i) <= 'Z'){
				result = result + (char)(text.charAt(i) - 13);
			}
			if(text.charAt(i) >= 'a' && text.charAt(i) <= 'm'){
				result = result + (char)(text.charAt(i) + 13);
			}
			if(text.charAt(i) >= 'n' && text.charAt(i) <= 'z'){
				result = result + (char)(text.charAt(i) - 13);
			}
			if(text.charAt(i) == ' '){
				result = result + ' ';
			}
		}
		return result;
	}
	public static String Caesar(String text, int key){
		String result = "";
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) >= 'A' && text.charAt(i) <= (char)('Z' - key)){
				result = result + (char)(text.charAt(i) + key);
			}
			if(text.charAt(i) >= (char)('Z' - key) && text.charAt(i) <= 'Z'){
				result = result + (char)(text.charAt(i) + key - 26);
			}
			if(text.charAt(i) >= 'a' && text.charAt(i) <= (char)('z' - key)){
				result = result + (char)(text.charAt(i) + key);
			}
			if(text.charAt(i) >= (char)('z' - key) && text.charAt(i) <= 'z'){
				result = result + (char)(text.charAt(i) + key - 26);
			}
			if(text.charAt(i) == ' '){
				result = result + ' ';
			}
		}
		return result;
	}

	public static String deCaesar(String text, int key){
		String result = "";
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) >= 'A' && text.charAt(i) <= (char)('A' + key)){
				result = result + (char)((text.charAt(i) - key) + 26);
			}
			if(text.charAt(i) >= (char)('A' + key) && text.charAt(i) <= 'Z'){
				result = result + (char)(text.charAt(i) - key);
			}
			if(text.charAt(i) >= 'a' && text.charAt(i) <= (char)('a' + key)){
				result = result + (char)((text.charAt(i) - key) + 26);
			}
			if(text.charAt(i) >= (char)('a' + key) && text.charAt(i) <= 'z'){
				result = result + (char)(text.charAt(i) - key);
			}
			if(text.charAt(i) == ' '){
				result = result + ' ';
			}
		}
		result = result.replace("{", "");
		return result;
	}

	public static String Railfence(int key, String text){
		text = text.replaceAll(" ", "");
		String result = "";
		char[][] fence = new char[key][text.length()];
		int lev = 0;
		boolean flag = true;
		for(int i = 0; i < text.length(); i++){
			char rail = text.charAt(i);
			if(flag){
				fence[lev][i] = rail;
				lev++;
			}
			else {
				fence[lev][i] = rail;
				lev--;
			}
			if(lev == 0 || lev == key - 1){
				flag = !flag;
			}
		}
		for(int j = 0; j < fence.length; j++){
			if(fence[j] == null){
				continue;
			}
			for(int k = 0; k < fence[j].length; k++){
				if(fence[j][k] == 0){
					continue;
				}
				result = result + fence[j][k];
			}
		}

		return result;
	}
	public static String deRail(String text, int key){
		int spacer1 = 2 * key - 3;
		int spacer2 = 0;

		char[][] fence = new char[key][text.length()];
		int count = 0;

		for(int i = 0; i < key; i++){
			if(count >= text.length())
				break;
			fence[i][i] = text.charAt(count);

			count++;
			int placer = 0;
			placer = i;

			while(placer < text.length()){

				if(spacer1 != 0){
					placer = placer + spacer1 + 1;
					if(placer >= text.length())
						break;
					fence[i][placer] = text.charAt(count);
					count++;
				}

				if(spacer2 != 0){
					placer = placer + spacer2 + 1;
					if(placer >= text.length())
						break;
					fence[i][placer] = text.charAt(count);
					count++;
				}
			}
			if(spacer1 == 1){
				spacer1--;
			}
			else{
				spacer1 = spacer1 - 2;
			}
			if(spacer2 == 0){
				spacer2++;
			}
			else{
				spacer2 = spacer2 + 2;
			}

		}


		String result = "";
		int lev = 0;
		boolean flag2 = true;
		for(int k = 0; k < text.length(); k++){
			if(flag2){
				result = result + "" + fence[lev][k];
				lev++;
			}
			else {
				result = result + "" + fence[lev][k];
				lev--;
			}
			if(lev == 0 || lev == key - 1){
				flag2 = !flag2;
			}
		}
		return result;
	}

	public static String Poly(String text, String cipher){
		text = text.toLowerCase();
		cipher = cipher.toLowerCase();
		String result = "";
		char[][] alpha = new char[5][5];
		int count = 0;
		for (int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				alpha[i][j] = cipher.charAt(count);
				count++;
			}
		}
		boolean flag = false;
		for(int k = 0; k < text.length(); k++){
			if(text.charAt(k) == ' '){
				result = result + "";
			}
			for (int i = 0; i < 5; i++){
				for(int j = 0; j < 5; j++){
					if(alpha[i][j] == text.charAt(k)){
						result = result + "" + (char)(i + 65) + "" + (char)(j + 65);
						flag = true;
					}
				}
				if(flag){
					flag = !flag;
					break;
				}
			}
		}

		return result;
	}
	public static String dePoly(String text, String cipher){
		cipher = cipher.toLowerCase();
		String result = "";
		char[][] alpha = new char[5][5];

		int count = 0;
		for (int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				alpha[i][j] = cipher.charAt(count);
				count++;
			}
		}

		for(int k = 0; k < text.length(); k = k + 2){
			char row = text.charAt(k);
			char col = text.charAt(k + 1);
			System.out.println(row + "" + col);
			result = result + "" + alpha[row - 65][col - 65];
		}
		return result;
	}
	public static String Sub(String text, String cipher){
		text = text.toLowerCase();
		String result = "";
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == ' '){
				result = result + ' ';
			}
			else{
				int key = text.charAt(i) - 97;
				result = result + cipher.charAt(key);
			}
		}
		return result;
	}
	public static String deSub(String text, String cipher){
		text = text.toLowerCase();
		String result = "";
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == ' '){
				result = result + " ";
			}
			else{
				int index = 0;
				for(int j = 0; j < cipher.length(); j++){
					if(cipher.charAt(j) == text.charAt(i)){
						index = j;
						break;
					}
				}
				result = result + (char)(index + 97);
			}
		}
		return result;
	}
	public static String Ctra(String text, String key){
		int col = text.length() / key.length();
		if(text.length() % key.length() != 0)
			col++;
		col++;
		char[][] arr = new char[key.length()][col];
		for(int i = 0; i < key.length(); i++){
			arr[i][0] = key.charAt(i);
		}

		int index = 1;
		int lev = 0;
		int count = 0;
		for(int j = 0; j < key.length() * col; j++){
			if(lev < key.length()){
				if(count == text.length()){
					arr[lev][index] = 'x';
				}
				else{
					arr[lev][index] = text.charAt(count);
					count++;
					lev++;
				}
			}
			if(lev == key.length()){
				lev = 0;
				index++;
				if(count == text.length()){
					arr[lev][index] = 'x';
				}
				else{
					arr[lev][index] = text.charAt(count);
					count++;
					lev++;
				}
			}
		}

		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length - i - 1; j++){
				System.out.println("/n" + j);
				if(arr[j][0] > arr[j+1][0]){
					char[] temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}


		String result = "";
		for(int m = 0; m < arr.length; m++){
			for(int n = 1; n < arr[m].length; n++){
				result = result + arr[m][n];
			}
		}
		return result;
	}
	public static String deTra(String text, String key){
		char[] akey = key.toCharArray();
		for(int k = 0; k < akey.length - 1; k++){
			for(int l = 0; l < akey.length - k - 1; l++){
				if(akey[l] > akey[l + 1]){
					char temp = akey[l];
					akey[l] = akey[l + 1];
					akey[l + 1] = temp;
				}
			}
		}

		int col = text.length() / key.length();
		if(text.length() % key.length() != 0)
			col++;
		col++;
		char[][] arr = new char[key.length()][col];
		for(int i = 0; i < key.length(); i++){
			arr[i][0] = akey[i];
		}
		int count = 0;
		for(int m = 0; m < arr.length; m++){
			for(int n = 1; n < arr[m].length; n++){
				arr[m][n] = text.charAt(count);
				count++;
			}
		}
		char[][] order =  new char[key.length()][col - 1];
		for(int i = 0; i < key.length(); i++){
			boolean found = false;
			int placer = 0;
			while(!found){
				if(key.charAt(i) == arr[placer][0]){
					order[i] = arr[placer];
					arr[placer][0] = '@';
					found = true;
				}
				placer++;
			}
		}


		String result = "";
		for(int m = 1; m < order[0].length; m++){
			for(int n = 0; n < key.length(); n++){
				result = result + order[n][m];
			}
		}
		return result;
	}
	public static String Vir(String text, String key){
		text = text.replaceAll(" ", "");
		char[][] tab = new char[26][26];
		char start = 'a';
		for(int i = 0; i < tab.length; i++){
			char let = start;
			for(int j = 0; j < tab[i].length; j++){
				if(let > 'z')
					let = 'a';
				tab[i][j] = let;
				let++;
			}
			start++;
		}

		char[] arr = new char[text.length()];
		int index = 0;
		for(int j = 0; j < text.length(); j++){
			if(index == key.length())
				index = 0;
			arr[j] = key.charAt(index);
			index++;
		}
		String result = "";
		for(int k = 0; k < text.length(); k++){
			result = result + "" + tab[text.charAt(k)-97][arr[k]-97];
		}
		return result;
	}

	public static String deVir(String text, String key){
		char[][] tab = new char[26][26];
		char start = 'a';
		for(int i = 0; i < tab.length; i++){
			char let = start;
			for(int j = 0; j < tab[i].length; j++){
				if(let > 'z')
					let = 'a';
				tab[i][j] = let;
				let++;
			}
			start++;
		}
		String result = "";

		char[] arr = new char[text.length()];
		int index = 0;
		for(int j = 0; j < text.length(); j++){
			if(index == key.length())
				index = 0;
			arr[j] = key.charAt(index);
			index++;
		}

		for(int i = 0; i < text.length(); i++){
			int row = arr[i] - 97;
			int col = 0;
			while(tab[row][col] != text.charAt(i)){
				col++;
			}
			result = result + (char)(col + 97);
		}
		return result;
	}
}
