package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    private List<Dog> dogs = new ArrayList<>();


    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void feedAll() {
        for (Dog oi : dogs) {
            oi.feed();
        }
    }

    public Dog findByName(String name) {
        for (Dog oi : dogs) {
            if (oi.getName().equals(name)) {
                return oi;
            }
        }
        throw new IllegalArgumentException("Nincs ilyen nevű Kutya");
    }

    public void playWith(String name, int hours) {
        Dog dogByName = findByName(name);
        dogByName.play(hours);
    }

    public List<String> getHappyDogNames(int minHappiness) {
        List<String> dogNames = new ArrayList<>();
        for (Dog oi: dogs) {
            if ( oi.getHappiness() > minHappiness ) {
                dogNames.add(oi.getName());
            }
        }
        return dogNames;
    }

    public List<Dog> getDogs() {
        return dogs;
    }
}
