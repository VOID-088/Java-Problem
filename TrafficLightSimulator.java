

public class TrafficLightSimulator {
    public static void main(String[] args) {

        // Here's the color of the traffic light.
        // You can change this to "Red" or "Yellow" to see what happens!
        String lightColor = "Green";

        // Let's use a switch statement to figure out what to do based on the color.
        // It's like asking, "What's the lightColor?" and then checking our list of answers.
        switch (lightColor) {

            // Case 1: If the light is "Red"...
            case "Red":
                // ...it means we need to stop.
                System.out.println("Stop");
                break; // The 'break' tells the program we're done with this switch.

            // Case 2: If the light is "Yellow"...
            case "Yellow":
                // ...we should get ready to go.
                System.out.println("Ready");
                break; // And we're done here, too.

            // Case 3: If the light is "Green"...
            case "Green":
                // ...it's time to go!
                System.out.println("Go");
                break; // Don't forget to break!

            // Now, what if the color isn't one of the above?
            default:
                // The 'default' case catches any other input.
                // We'll let the user know their input wasn't valid.
                System.out.println("Invalid Input");
                break;
        }
    }
}
