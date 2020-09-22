import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Circle implements Movable {
    @Override
    public void moveMe() {
        stap = 20;
        System.out.println("Steps = "+stap);
    }
}
