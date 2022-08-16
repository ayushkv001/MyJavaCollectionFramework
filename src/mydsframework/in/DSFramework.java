package mydsframework.in;


interface DSFramework {
    default void base(){
        System.out.println("You are at the base of Data Structure Framework");
    }
    static void MyFramework(){
        System.out.println("You are using\n"+"\t\t<----    MyFramework ---->");
    }
}