package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {


    public List<Spice> getAllSpices() {

        List<Spice> myList = new ArrayList<>();


        Ginger ginger = new Ginger();
        myList.add((Spice) ginger);

        Pepper pepper = new Pepper();
        myList.add((Spice) pepper);

        Curry curry = new Curry();
        myList.add((Spice) curry);


        return myList;
    }



    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {




        return null;
    }




    public void applySpice(Spice spice) {









    }
}
