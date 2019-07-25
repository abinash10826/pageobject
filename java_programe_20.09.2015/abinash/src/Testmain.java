
 class Animal
{
	void eat()
	{
	System.out.println("eating bread");

}}
 class Dog extends Animal
 {
	 void eat()
	 {
	 System.out.println("vhbjbjjv");
	 }
	 void bark()
	 {
	 System.out.println("barking");
	 }
	 void work()
	 {
	 super.eat();
	 bark();
	 eat();
 }
	 }
	 class Testmain
	 {
		 public static void main(String[]args)
		 {
		 Dog ref=new Dog();
		 ref.work();
	 }}
	 
