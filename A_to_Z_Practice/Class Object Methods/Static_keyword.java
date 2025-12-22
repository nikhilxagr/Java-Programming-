class College {
    static String collegeName = "ABC College";

    static void show() {
        System.out.println(collegeName);
    }
}

public class Static_keyword {
    public static void main(String[] args) {
        College.show(); // no object needed
    }
}
