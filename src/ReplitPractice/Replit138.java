package ReplitPractice;

class Replit138 {
    private static String privateMethod() {
        return "private";
    }

    static String defaultMethod() {
        return "default";
    }

    protected static String protectedMethod() {
        return "protected";
    }

    public static String publicMethod() {
        return "public";
    }


    public static void main(String[] args) {
        // System.out.println(AnotherClass.privateMethod()); // This line will cause a compile-time error because privateMethod() is private and not accessible outside AnotherClass
        System.out.println(Replit138.defaultMethod());
        System.out.println(Replit138.protectedMethod());
        System.out.println(Replit138.publicMethod());
    }
}
