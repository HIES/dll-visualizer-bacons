import bridges.base.ElementVisualizer;
import bridges.base.LinkVisualizer;
import bridges.connect.Bridges;
import bridges.connect.Bridges;

import bridges.base.DLelement;
/**
 * A class that utilizes the BRIDGES library to visualize a doubly-linked list.
 *
 * @author Jonathon Davis
 */
public class DLLVisualizer
{
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{

        // TO DO: Define credentials
        final String API_KEY = "1302836539611";
        final String USER_ID = "bacons";
        
        // No need to modify Bridges constructor
        Bridges bridge = new Bridges(1, API_KEY, USER_ID);

        // TO DO: Build the objects to be added to your DLL
        Track jon = new Track("Purple Haze","Jimi Hendrix");
        Track bob = new Track("hi", "frame");
        Track im = new Track("Rainbow", "Ruby");
        Track tim = new Track("Why am I", "doing this");

        // TO DO: Build the head 
        DLelement head = new DLelement("Track",jon);

        
        // TO DO: Create the rest of the Nodes/DLelements and link them to form a DLL
        DLelement jake = new DLelement("test", bob);
        DLelement tom = new DLelement("tube", im);
        DLelement billy = new DLelement("three", tim);

        head.setNext(jake);
        jake.setNext(tom);
        tom.setPrev(jake);
        jake.setPrev(head);
        tom.setNext(billy);
        billy.setPrev(tom);

        // HEAD TO JAKE TO TOM

        LinkVisualizer t = jake.getLinkVisualizer(jake);
        t.setColor(255,0,0, (float) 0);

        tom.getVisualizer().setColor("green");

        jake.getVisualizer().setColor("blue");
        jake.getVisualizer().setOpacity(.5f);

        jake.getLinkVisualizer(tom).setColor(255,0,0,1f);

        //Prepare for visualization
        bridge.setDataStructure(head);
        bridge.setTitle("A Doubly-Linked List");
        bridge.visualize();

    }
}
