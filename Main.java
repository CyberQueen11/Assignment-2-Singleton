import lazyInitializing.RootUser;
import noFactoryMethod.RootUser2;
import withEnum.RootUser3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lazy initialization: ");
        System.out.println(RootUser.getInstance());
        System.out.println();
        System.out.println("Singleton pattern with no factory method:");
        System.out.println(RootUser2.INSTANCE);
        System.out.println();
        System.out.println("With enum:");
        System.out.println(RootUser3.INSTANCE);
    }
}
