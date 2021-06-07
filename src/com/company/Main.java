package com.company;

class Dog {
   private String name;

    /**
     * Show message
     */
    public void castAVoice (){
        System.out.println("Гав");
    }

    /**
     * Displays a message which command the dog executed
     */
    public void giveAPaw (){
        System.out.printf("A dog named %s gave its paw",name);
    }

    /**
     * Name of a dog
     * @param name name of dog
     */
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


public class Main {

    public static void main(String[] args) {
	 Dog dog = new Dog();
	 dog.castAVoice();
	 dog.setName("Чуча");
	 dog.giveAPaw();

    }
}
