import org.junit.jupiter.api.Test;

public class ExampleTest {
    @Test
    public void input1() {
        String output = PorkerHands.exec("Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH");
        assert(output.equals("White wins - high card: Ace"));
    }

    @Test
    public void input2() {
        String output = PorkerHands.exec("Black: 2H 4S 4C 2D 4H White: 2S 8S AS QS 3S");
        assert(output.equals("Black wins - full house"));
    }

    @Test
    public void input3() {
        String output = PorkerHands.exec("Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C KH");
        assert(output.equals("Black wins - high card: 9"));
    }

    @Test
    public void input4() {
        String output = PorkerHands.exec("Black: 2H 3D 5S 9C KD White: 2D 3H 5C 9S KH");
        assert(output.equals("Tie"));
    }
}
