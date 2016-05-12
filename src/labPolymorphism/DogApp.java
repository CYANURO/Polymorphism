package labPolymorphism;

import java.util.List;
import java.util.ArrayList;

public class DogApp
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Greyhound");
        System.out.println(myDog);
        actAsDog(myDog);

        SledDog mySledDog = new SledDog("Husky");
        System.out.println(mySledDog);
        actAsDog(mySledDog);

        CircusDog myCircusDog = new CircusDog("Terrier");
        System.out.println(myCircusDog);
        actAsDog(myCircusDog);
        
        System.out.println("Using an Array:" + "\n");
        
        List<Dog> newDogArray = new ArrayList<Dog>();
        
        newDogArray.add(myDog);
        newDogArray.add(mySledDog);
        newDogArray.add(myCircusDog);
        
        for(Dog iterationOverDogs: newDogArray) {
        	
        	System.out.println(iterationOverDogs);
        	if (iterationOverDogs instanceof SledDog) {
        		
        		((SledDog) iterationOverDogs).pullSled();
        		
        	}
        	
        	actAsDog(iterationOverDogs);
        }

    }

    private static void actAsDog(Dog d)
    {
        d.communicate();
        d.move();
        System.out.println();
    }
}
