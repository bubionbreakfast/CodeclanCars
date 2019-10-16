package racetrack.person;

public class Driver extends Person {

    int skill;

    public Driver(String name, int wallet, int skill){
        super(name, wallet);
        this.skill = skill;
    }

    public int getSkill() {
        return skill;
    }
}
