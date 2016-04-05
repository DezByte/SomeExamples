
public class Test1 {

    public static void main(String[] args)
    {

        args = new String[] {"Java", "PHP", "Ruby"};

        System.out.println("Print all args...");

        for (String argument : args) {
            System.out.println("----");

            char[] chars = argument.toUpperCase().toCharArray();

            for (Character charItem : chars) {
                System.out.println(charItem);
            }
        }

        System.out.println("Finish!");

    }

}
