package strings;

/**
 *
 * @author ProLinki
 */
public class TrabalhandoStringBuffer {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Lucas Lima Araúgo Silva Pinto");
        buffer.insert(5, " de");
        buffer.replace(14, 20, "Araújo");
        buffer.delete(27, 32);
        System.out.println(buffer.toString());

    }
}
