package exception_handling;

public class Exception_Executor {
    public static void main(String args[]) {
        try {
            Calculation calc = new Calculation();
            calc = null;
            calc.add(1, 2);


        } catch (Exception e) {
            System.out.println(" null exception occured"+ e.getMessage());
        }

        //Arithmatic exception example
        Calculation cal = new Calculation();
        try {
            cal.divide(1, 0);
        }
        catch (NullPointerException npe){
            System.out.println("null exception occured");
        }
        catch (ArrayIndexOutOfBoundsException aibe){
            System.out.println("index out of bound occured");
        }
        catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        catch (Exception e){
            System.out.println("finally catched ");
        }
    }

}






