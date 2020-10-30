package thread.tortoise;

import javax.swing.*;

public class Tortoise  implements Runnable{

    private static final int MILESTONES = 5;
    private final Thread tortoise;

    public Tortoise(){
        this.tortoise = new Thread(this , "Tortoise");

    }

    public Thread getTortoise() {
        return tortoise;
    }

    @Override
    public void run() {
        for (int index = 0; index <  MILESTONES;index++){
            switch (index){
                case 0:
                    System.out.println("The tortoise has started from The Start Line.");
                    break;
                case 1:
                    System.out.println("The tortoise has reached The Cool River");
                    break;
                case 2:
                    System.out.println("The tortoise has reached The Mountain Hill");
                    break;
                case 3:
                    System.out.println("The tortoise has reached The Big Oak Tree!");
                    break;
                case 4:
                    System.out.println("The tortoise has reached The Fininish Line");
                    break;
            }
            try {

                Thread.sleep(3000L);
            }
            catch (InterruptedException e){
                System.err.println("The tortoise has lost the path!");

            }
        }
        JOptionPane.showConfirmDialog(null,"The tortoise has completed the race!!","Tortoise",JOptionPane.OK_CANCEL_OPTION);
    }
}
