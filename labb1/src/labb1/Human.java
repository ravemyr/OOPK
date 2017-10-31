package labb1;
public class Human {

	public static void main(String[] args) {
		Human person1 = new Human(25, "Lars");
		System.out.print( person1.getName());
		System.out.println(person1.getAge());
		System.out.println(person1.toString());
		System.out.println(person1);
	}
	int age;
	String name;
	public Human(int ageIn, String nameIn) {
		name = nameIn;
		age = ageIn;
	}
	public String toString() {
		return "name: " + name + "," + " age: " + age;	
		}
	int getAge() {
		return age;
	}
	String getName(){
		return name;
	}
	public static Human randomHuman(){
	String[] nameArray;
	nameArray = new String[5];
	nameArray[0] = "Jerry";
	nameArray[1] = "Beth";
	nameArray[2] = "Morty";
	nameArray[3] = "Rick";
	nameArray[4] = "Summer";
	int newAge = (int) Math.round(Math.random()*100);
	String newName = nameArray[(int)Math.round(Math.random()*4)];
	return new Human(newAge,newName);
	}
}
