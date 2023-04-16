import java.util.*;

public class Main {
    public static void main(String[] args) {
        cosik();
    }

    public static void cosik(){
        Scanner scanner = new Scanner(System.in);
        String name;
        Set<String> names = new HashSet<>();

        while (true){
            System.out.print("imie: ");
            name = scanner.next();

            if(name.equals("-")){
                break;
            }
            names.add(name);
        }

        System.out.println("unikalne: " + names.size());
    }
}