public class Poem {
    public static void main(String[] args) {
        //create array of stanzas for the poem
        String[] stanzas = {"Roses are red", "Violets are blue", "Sugar is sweet", "And so are you"};
        
        //cycle through array to access
        for(int i = 0; i < stanzas.length; i++)
            //print to console on a new line each time
            System.out.println(stanzas[i]);
    }
}