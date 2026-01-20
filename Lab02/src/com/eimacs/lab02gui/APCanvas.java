import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * A panel on which to draw
 *
 * @author |your name|
 * @version 1.0 |today's date|
 */
public class APCanvas extends JPanel
{
  /**
   * The class constructor
   */
  public APCanvas()
  {
  }

  /**
   * Draws on a Graphics object
   *
   * @param g  a Graphics object
   */
  private void paintMe( Graphics g )
  {
  }

  /**
   * Overrides JPanel's paintComponent method
   *
   * @param g  a Graphics object
   */
  public void paintComponent( Graphics g )
  {
    super.paintComponent( g );
    paintMe( g );
  }
}