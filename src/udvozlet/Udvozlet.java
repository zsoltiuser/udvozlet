
package udvozlet;

/**
 *
 * @author Eszényi Zsolt
 */
public class Udvozlet {

    public static void main(String[] args) {
        Ember no = new Ember("Kati");
        Ember ferfi = new Ember("Zoltán");
        
        System.out.println(no.koszont());
        System.out.println(ferfi.koszont());
    }
    
}
