package MVCSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
      private Model model;
      private View view;
      private ActionListener actionListener;
      public Controller(Model model, View view) {
            this.model = model;
            this.view = view;
      }
      
      public void control() {
            actionListener = new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        linkBtnAndLabel();
                  }
            };
              view.getButton().addActionListener(actionListener);
      }
      
      private void linkBtnAndLabel() {
            model.incX();
            view.setText(Integer.toString(model.getX()));
      }
      
      
      // TESTE MVC
      public static void main(String[] args) {
            Model model = new Model(0);
            View view = new View("-");
            Controller controller = new Controller(model,view);
            controller.control();
      }
}
