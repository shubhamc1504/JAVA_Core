@FunctionalInterface
interface A{ //Functional interface only has 1 method
    void show();
}

public class LambdaExpressions {
    public static void main(String[] args) {
        A obj = () -> System.out.println("in A show");//Lambda Expression: Syntactical  
        obj.show();  
    }
}
