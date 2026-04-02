import java.util.ArrayList;
import java.util.List;

// Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Display bogies
        System.out.println("\nGoods Bogies:");
        goodsBogies.forEach(System.out::println);

        // Safety check using allMatch
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Display result
        System.out.println("\nSafety Compliance Status:");
        if (isSafe) {
            System.out.println("Train is SAFE for operation");
        } else {
            System.out.println("Train is NOT SAFE");
        }
    }
}