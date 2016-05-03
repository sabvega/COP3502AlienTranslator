import java.util.Scanner;

/**

* This class translates messages from aliens on planets

* Beaumonde and Regina into Earth English.

* @author Kristy Boyer

*

*/

public class AlienTranslator {

/**

* This main method creates an AlienTranslator and then calls the

* translateInput method. Students should not modify this method.

* @param args

*/

public static void main(String[] args) {

AlienTranslator a = new AlienTranslator();

Scanner s = new Scanner(System.in);

a.translateInput(s);

}

/**

* This method gets the necessary input from the user regarding planet

* and the message to be translated.

* Students should fill in the missing code in this method.

* @param in A Scanner created on the appropriate stream of input.

*/

public String translateInput(Scanner in) {

//TODO: Get from user which planet the inter-galactic message is from.


//1=Beaumonde and 2=Regina

//Store value in an int variable named planet. If it is not valid, print

//an error to the user and exit the program. Otherwise (a valid planet)

//Get the inter-galactic message that needs to be translated.

//Store it in a String variable named message

//---- > Fill in Student Code Here < ------
	
	System.out.println("What planet?");
	int planet = in.nextInt();
	in.nextLine();
	String message="";
	if(planet!=1 && planet!=2){
		System.out.println("Not a valid planet.");
		System.exit(0);
	} else{
		System.out.println("What message?");	
		 message = in.nextLine();
	} 
		

//---- > End Student Code < -----

//Teaching staff code - STUDENTS DO NOT MODIFY - extracts characters

//one at a time from the String message and stores each character in

//the char variable named charToTranslate

//The result variable is used to build and store the translated message

// which will be sent back when this method is finished.

String result = "";

for (int i=0; i < message.length(); i++) {

char charToTranslate = message.charAt(i);

//End teaching staff code

//TODO: translate the character stored in variable charToTranslate

//and append the translated character to the result variable

//----- > Fill in Student Code Here < -----

//checks if planet is equal to 1 or 2
//if it is planet 1 it will decrease the char value by two
//if it is planet 2 it will increase the char value by two

if(planet==2){
	//integer version of the char
	int charVal = (int) charToTranslate;
	
	if(charVal>=97 && charVal<=122){ //lowercase letters
		if(charVal==122){
			int charValB =98;
			char newCharB = (char) charValB;
			String stringB = newCharB +"";
			result+=stringB;
		} 
		else if(charVal==121){
			int charValB = 97;
			char newCharB = (char) charValB;
			String stringB = newCharB +"";
			result+=stringB;
		} 
		else{
			int charValB = charVal+2;
			char newCharB = (char) charValB;
			String stringB = newCharB +"";
			result+=stringB;
		}
	}
	else if(charVal>=65 && charVal<=90){//uppercase
		if(charVal==90){
			int charValB =66;
			char newCharB = (char) charValB;
			String stringB = newCharB +"";
			result+=stringB;
		} 
		else if(charVal==89){
			int charValB = 65;
			char newCharB = (char) charValB;
			String stringB = newCharB +"";
			result+=stringB;
		} 
		else{
			int charValB = charVal+2;
			char newCharB = (char) charValB;
			String stringB = newCharB +"";
			result+=stringB;
		}
	}	
	else{// not letters
		char newCharB = (char) charVal;
		String stringB = newCharB +"";
		result+=stringB;
		} 
	}

if(planet==1){
	//integer version of the char
	int charVal = (int) charToTranslate;
	
	if(charVal>=97 && charVal<=122){ //lowercase letters
		if(charVal==98){
			int charValB =122;
			char newCharB = (char) charValB;
			String stringB = newCharB +"";
			result+=stringB;
		} 
		else if(charVal==97){
			int charValB = 121;
			char newCharB = (char) charValB;
			String stringB = newCharB +"";
			result+=stringB;
		} 
		else{
			int charValB = charVal-2;
			char newCharB = (char) charValB;
			String stringB = newCharB +"";
			result+=stringB;
		}
	}
	else if(charVal>=65 && charVal<=90){//uppercase
		if(charVal==66){
			int charValB =90;
			char newCharB = (char) charValB;
			String stringB = newCharB +"";
			result+=stringB;
		} 
		else if(charVal==65){
			int charValB = 89;
			char newCharB = (char) charValB;
			String stringB = newCharB +"";
			result+=stringB;
		} 
		else{
			int charValB = charVal-2;
			char newCharB = (char) charValB;
			String stringB = newCharB +"";
			result+=stringB;
		}
	}	
	else{ //not letters
		char newCharB = (char) charVal;
		String stringB = newCharB +"";
		result+=stringB;
		} 
	}
	
//----- > End Student Code < -----

} //ends the for loop

//TODO: perform the necessary output as specified in the requirements

// **** This TODO was added to this starter code on Mon 1/25 2:55pm ****

//------> Fill in Student Code < -------
	if(planet==1)System.out.println("Original message in Beaumondian: "+message);
	if(planet==2)System.out.println("Original message in Reginian: "+message);
	System.out.println("Translation in Earth English: "+result+".");

//------> End Student Code < -------

//Sends back the value of the result variable

return result;

} //ends the translateInput method

} //ends the AlienTranslator class