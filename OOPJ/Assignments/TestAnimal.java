public class TestAnimal
{

	public static void main(String args[]){
		
			Animal an = new Cat("meow");
			an.makeSound("bark");
	
			Animal an1 = new Dog("bark");
			an1.makeSound("bark");

	}
}

class Animal
{
	String sound;
	Animal(String sound)
	{
		this.sound=sound;
	}
	public void makeSound(String sound) {
        System.out.println("Animal sound: " + sound);
    }
	
}

class Dog extends Animal
{
	
	Dog(String sound)
	{
		super(sound);
		
	}
	
	 @Override
	public void makeSound(String sound)
	{
		if(this.sound.equals(sound)){
			System.out.println("Dog -> "+sound);	
		}else {
            System.out.println("Dog doesn’t recognize this sound.");
        }
		
	}
	
}

class Cat extends Animal
{
	Cat(String sound)
	{
		super(sound);
	}
	@Override
	public void makeSound(String sound)
	{
		if(this.sound.equals(sound)){
			System.out.println("cat -> "+sound);	
		}else {
            System.out.println("Cat doesn’t recognize this sound.");
        }
		
	}
}