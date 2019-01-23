package virtualPet;

public class Virtualpet {
	
	private String name = "Pauly";
	private String type = "Parrot";
	private int age = 1;
	private int thirst = 50;
	private int hunger = 50;
	private int happy = 50;
	private int clean = 50;
    private int bored = 50;
    private int tired = 50;

    public int getAge() {
    	return age;
    }
    public void setAge(int age) {
    	this.age = age;
    }
    public int getThirst() {
    	return thirst;
    }
    public void setThirst(int thirst) {
    	this.thirst = thirst;
    }
    public int getHunger() {
    	return hunger;
    }
    public void getHunger(int hunger) {
    	this.hunger = hunger;
    }
    public int getHappy() {
    	return happy;
    }
    public void getHappy (int happy) {
    	this.happy = happy;
    }
    public int getClean() {
    	return clean;
    }
    public void getClean(int clean) {
    	this.clean = clean;
}
public int getBored() {
	return bored;
}
public void setBored(int bored) {
	this.bored = bored;
}	
public int getTired() {
	return tired;
}
public void setTired(int tired) {
	this.tired = tired;
}

public Virtualpet() {
}

public Virtualpet(String name, String type, String color, int age, int thirst, int hunger, int happy, int clean, int bored, int tired) {
	this.name = name;
	this.type = type;
	this.age = age;
	this.hunger = hunger;
	this.happy = happy;
	this.clean = clean;
	this.bored = bored;
	this.tired = tired;		
}
public void poo () {
	this.clean = this.clean -15;
	this.hunger = this.hunger +20;
	this.thirst = this.thirst +5;
}
public void play() {
	this.clean = this.clean -5;
	this.hunger = this.hunger +25;
	this.thirst = this.thirst +30;
	this.happy = this.happy +50;
	this.bored = this.bored +50;
	this.tired = this.tired +50;
}	
public void feed() {	
	this.hunger = this.hunger +30;
	this.thirst	= this.thirst +10;
	this.happy = this.happy +50;
	this.clean = this.clean -3;		
}
public void water() {
	this.thirst =this.thirst  +30;
	this.happy = this.happy +30;
}
public void tired() {
	this.tired = this.tired +0;
	this.happy = this.happy +10;
}
public void bored( ) {
	this.bored = this.bored +10;
	this.happy = this.happy +10;
}
boolean isHungry() {
    return hunger >= 15;
}
boolean isSleepy() {
    return tired >= 15;
}
boolean isThirsty() {
    return thirst >= 15;
}
boolean isBored() {
    return bored >= 15;
}
boolean isHappy() {
	return happy >= 15;
}
public void Tick() {
	this.age = age +1;
	this.hunger = hunger +10;
    this.happy = happy -12;	
    this.thirst = thirst +15;
    this.clean = clean -15;	
    this.bored = bored +25;
    this.tired = tired +1;
}

}

























 

