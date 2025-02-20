public class NegativeSubtractException extends Exception {

    public NegativeSubtractException(int n1, int n2){
        super(String.format("NegativeSubstractException: ‘%d - %d’ result is negative", n1, n2));
    }



}
