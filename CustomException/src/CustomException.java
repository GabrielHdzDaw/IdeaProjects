public class CustomException {
    static int positiveSubtract(int n1, int n2) throws NegativeSubtractException {
        if (n1 - n2 < 0){
            throw new NegativeSubtractException(n1, n2);
        } else{
            return n1 - n2;
        }
    }
    public static void main(String[] args) {
        try{
            int res = positiveSubtract(2,3);
        } catch (NegativeSubtractException e) {
            throw new RuntimeException(e);
        }
    }
}
