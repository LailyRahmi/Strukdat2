package latihan_strukturdata2;

/**
 *
 * @author GF63
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<String>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");

        ArrayList<String> DeleteHewan = new ArrayList<String>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        System.out.println("Hewan : ");
        System.out.println(Hewan);
        
        System.out.println("\nHewan yang dihapus : ");
        System.out.println(DeleteHewan);

        for (int i = 0; i < DeleteHewan.size(); i++) {
            String warna = DeleteHewan.get(i);
            if (Hewan.contains(warna)) {
                Hewan.remove(warna);
            }
        }

        System.out.println("\nOutput Hewan : ");
        System.out.println(Hewan);
    }
}

