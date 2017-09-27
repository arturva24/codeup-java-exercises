import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {
        String serverName = String.format("%s-%s", randomWord(adjective), randomWord(noun));
        System.out.printf("Here is your server name:\n%s\n", serverName);
    }

    public static String[] adjective=
            {"Bitter", "Bland", "Delicious", "Fruity", "Minty", "Spicy", "Sweet", "Tangy", "Tasty", "Yummy"};


    public static String[] noun =
            {"Man","Woman","Cat","Dog","Bird", "Mountain","Ocean","Airplane","TV","House"};

//        System.out.println(adjective[3]);
//        System.out.println(noun[5]);


    public static String randomWord(String[] words) {
        Random palabra = new Random();
        return words[palabra.nextInt(words.length)];

//
//     // alternate version
//      public static String randomWord() {
//           int rnd =(int) (Math.random() * ((noun.length ) + 1));
//        int rnd2 =(int) (Math.random() * ((noun.length ) + 1));
//
//           return noun[rnd] + "-" + adjective[rnd2];
//       }
    }
}
