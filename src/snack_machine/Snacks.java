package snack_machine;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks;

    static{
        snacks = new ArrayList<>();
        snacks.add(new Snack("Lays", 1.5, 10));
        snacks.add(new Snack("Cheetos", 1.25, 10));
        snacks.add(new Snack("Doritos", 1.75, 10));
    }

    public static void addSnack(Snack snack){
        snacks.add(snack);
    }

    public static void getSnacks(){
        var inventory = "";
        for (var snack : snacks){
            inventory += snack.toString() + "\n";
        }
        System.out.println(inventory);
        System.out.println(inventory);
    }

    public static List<Snack> getSnackList(){
        return snacks;
    }
}
