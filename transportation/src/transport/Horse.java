package transport;

public class Horse implements Vehicle, Animal {
	// fields

	private int fuel = 0;
	private String name;


	// in spring, you have to include the default constructor
	// default constructor
	public Horse() {

	}



	// constructor
	public Horse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//implement the interfaces
	// You only need to implement move once. Same name. You only can implement once.
	@Override
	public void move() {
		fuel = fuel - 1;
	}

	// by default, fuel is the only fuel in context
	@Override
	public void eat(int i) {
		fuel = fuel + 1;
	}
	
	@Override
	public String speak() {
		return "Neigh";
	}


	@Override
	public String getPath() {
		return "Grass";
	}

	
	@Override
	public int getFuelLevel() {
		return fuel;
	}
	
	@Override
	public void addFuel(int i) {
		eat(i);
	}

	
    @Override
    public String toString()
    {
        return "HorseFromVehicle{" +
                "name='" + name + '\'' +
                ", fuel=" + fuel +
                '}';
    }
}