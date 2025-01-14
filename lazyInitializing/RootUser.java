package lazyInitializing;

public class RootUser {
    private static RootUser instance;
    private int UID = 0;
    private int GID = 0;
    private String userName = "root";
    private String name = "Super user";
    private String home = "/root";
    private String shell = "/bin/sh";

    public RootUser() {
    }

    public static RootUser getInstance() {
        if (instance == null) {
            instance = new RootUser();
        }
        return instance;
    }

    @Override
    public String toString() {
        return new StringBuilder(userName)
                .append("(").append(name).append(")")
                .append(" ").append(UID).append(":").append(GID)
                .append(" home: ").append(home).append(" ")
                .append("shell: ").append(shell)
                .toString();
    }
}

/*
 * lazy initialization,
 * public static final Instance field,
 * and enum.
 * 
 * Write a main class and test the above.
 */