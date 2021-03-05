package pacote;

public class meuPet { // atributos
	private int energyMax, hungryMax, cleanMax;
	private int diamonds;
	private int energy, hungry, clean;
	private int age;
	private boolean alive;

	public meuPet(int energyMax, int hungryMax, int cleanMax) { // constutor, o costrutos vai sem tem o mesmo nome
																// da clase pois se for diferende não vai roda
		this.energyMax = energyMax;
		this.hungryMax = hungryMax;
		this.cleanMax = cleanMax;

		this.energy = energyMax;
		this.clean = cleanMax;
		this.alive = true;
	}

//----------
	private int getEnergyMax() {
		return energyMax;
	}

	private int getHungryMax() {
		return hungryMax;
	}

	private int getCleanMax() {
		return cleanMax;
	}

	private int getDiamonds() {
		return diamonds;
	}

	private int getEnergy() {
		return energy;
	}

	private int getHungry() {
		return hungry;
	}

	private int getClean() {
		return clean;
	}

	private int getAge() {
		return age;
	}

	// ------------------------
	private boolean isAlive() {
		return alive;
	}

	private void setEnergyMax(int energyMax) {
		this.energyMax = energyMax;
	}

	private void setHungryMax(int hungryMax) {
		this.hungryMax = hungryMax;
	}

	private void setCleanMax(int cleanMax) {
		this.cleanMax = cleanMax;
	}

	private void setDiamonds(int diamonds) {
		this.diamonds = diamonds;
	}

	private void setEnergy(int valor) {
		if (valor > 0) {
			energy = 0;
		} else {
			energy = valor;
		}

	}

	private void setHungry(int valor) {
		if (valor >= hungryMax) {
			hungry = hungryMax;
		} else {
			hungry = valor;
		}

	}

	private void setClean(int valor) {

		if (valor <= 0) {
			clean = 0;
		} else {
			clean = valor;
		}

	}

	private void setAge(int age) {
		this.age = age;
	}

	private void setAlive(boolean alive) {
		this.alive = alive;
	}

	public void play() {
		// - ganha um diamante, aumenta a hungry e diminui a energy e o clean

		setDiamonds(1);
		this.hungry += 1;
		this.energy -= 1;
		this.clean -= 1;
		this.age +=1;
		System.out.println("Seu pet está bricando");
	}

	public void shower() {
		// - Aumenta o clean em uma unidade, aumenta a fome e diminui a energy
		this.clean +=1;
		this.hungry += 1;
		this.energy -= 1;
		this.age +=1;
		System.out.println("Seu pet está tomando banho");
		
	}

	public void eat() {
		// - Aumenta em uma unidade a energy e diminui a hungry e o clean
		energy += 1;
		hungry -=1;
		clean -= 1;
		age += 1;
		System.out.println("Seu pet está comendo!");
	}

	public void sleep() {
		// - Aumenta em uma unidade a energy
		this.age +=1;
		this.energy +=1;
       System.out.println("Seu pet está comendo!");
	}

	public void show() {
		// - Imprime no console todas as informações do Pet
		System.out.println("Diamonds = " + getDiamonds());
		System.out.println("Energy = " + getEnergy());
		System.out.println("Hungry = " + getHungry());
		System.out.println("Clean = " + getClean());
		System.out.println("Age = " + getAge());

	}
}
