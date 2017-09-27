import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {
        String serverName = String.format("%s-%s", randomWord(adjective), randomWord(noun));
        System.out.printf("Here is your server name:\n%s\n", serverName);
    }

    public static final String[] adjective=
            {"bitter", "bland", "delicious", "fruity", "minty", "spicy", "sweet", "tangy", "tasty", "yummy"};


    public static final String[] noun =
            {"man","woman","cat","dog","bird", "mountain","ocean","airplane","tv","house"};

//        System.out.println(adjective[3]);
//        System.out.println(noun[5]);


    public static String randomWord(String[] words) {
        Random palabra = new Random();
        return words[palabra.nextInt(words.length)];
    }
}
