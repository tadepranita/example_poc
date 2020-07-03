package exception_handling.Game;

public class Player {

    public static void main(String[] args) {
        Master master = new Master();

        master.Move();

        //normally end the end game
        master.Exit(1);


        try {
            //abnormally end the game
            master.Exit(0);
        }catch (Exception e){
            System.out.println("Exception is handled :: "+e.getMessage());
        }
    }

}
