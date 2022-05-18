/*
 * B Cutten
 * May 16, 2022
 * Tutorial from https://zetcode.com/javagames/pacman/
 * The goal of the game is to collect all the points in the maze and avoid the ghosts. 
 * The Pacman is animated in two ways: his position in the maze and his body. We animate 
 * his body with four images, depending on the direction. The animation is used to create 
 * the illusion of Pacman opening and closing his mouth. The maze consists of 15x15 squares. 
 * The structure of the maze is based on a simple array of integers. Pacman has three lives. 
 * We also count the score.
 */
package pacperson;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class PacPerson extends JFrame {

    public PacPerson() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new ThreadedBoard());
        
        setTitle("PacPerson");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 420);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new PacPerson();
            ex.setVisible(true);
        });
    }
}
