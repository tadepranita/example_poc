package exception_handling.Game;

public class Master {

    public void Move(){
        System.out.println("Moving ......");
    }

    public void Exit(int key){
        if(key==1){
            System.out.println("Exiting ......");
        }else{
            throw new ArithmeticException("Arithmatic exception occured while exiting game");
        }
    }
}
