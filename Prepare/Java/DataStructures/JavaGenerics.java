class Printer{
    <T> void printArray(T[] arr){
        for(T item:arr){
            System.out.println(item);
        }
    }
}

public class JavaGenerics {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        Printer p = new Printer();
        p.printArray(intArray);
        p.printArray(stringArray);
    }
}
