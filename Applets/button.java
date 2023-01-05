import java.awt.*;
import java.applet.*;
public class button {
    public class ButtonTest extends Applet{
        public void init(){
            Label l1;
            Button btnRewind,btnPlay,btnForward,btnStop;
            l1 = new Label("Creating Buttons");
            btnRewind = new Button("Rewind");
            btnPlay = new Button("Play");
            btnForward = new Button("Fast Forward");
            btnStop = new Button("Stop");
            add(l1);
            add(btnRewind);
            add(btnPlay);
            add(btnForward);
            add(btnStop);
        }
        
    }
   
}
