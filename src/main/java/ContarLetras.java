import java.util.HashMap;

public class ContarLetras {

    public static String contRep(String cadena) {

        if (cadena == null)
            return null;
        char [] letras = cadena.toLowerCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character i : letras) {
            if (map.containsKey(i)) {
                Integer value = map.get(i);
                value++;
                map.replace(i, value);
            } else {
                map.put(i, 1);
            }
        }
        return map.toString();

    }
}



