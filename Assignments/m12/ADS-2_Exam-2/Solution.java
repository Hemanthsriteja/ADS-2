/**.
 * Import Scanner Class
 */
import java.util.Scanner;
/**.
 * Class Solution
 */
final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {
    }
    /**.
     * Main function
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int ver = Integer.parseInt(scan.nextLine());
        int ed = Integer.parseInt(scan.nextLine());
        Edge edge;
        EdgeWeightedGraph eg = new EdgeWeightedGraph(ver, ed);
        for(int i = 0; i < ed; i++) {
            String[] token = scan.nextLine().split(" ");
            edge = new Edge(Integer.parseInt(token[0]),
                               Integer.parseInt(token[1]),
                               Double.parseDouble(token[2]));
            eg.addEdge(edge);
        }
        String caseToGo = scan.nextLine();
        switch (caseToGo) {
        case "Graph":
        	//Print the Graph Object.
            System.out.println(eg);
            break;
        case "DirectedPaths":
        	// Handle the case of DirectedPaths, where two
            // integers are given.
			// First is the source and second is the destination.
			// If the path exists print the distance between them.
			// Other wise print "No Path Found."
            System.out.println("No Path Found.");
            break;
        case "ViaPaths":
        	// Handle the case of ViaPaths, where three integers
            //  are given.
			// First is the source and second is the via is
            // the one where
            //  path should pass throuh.
			// third is the destination.
			// If the path exists print the distance between them.
			// Other wise print "No Path Found."
            System.out.println("No Path Found.");
            break;
        default:
            break;
        }
    }
}
