import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

class MonopolyTest {
    Monopoly player = new Monopoly(0);

    @Test
    public void when_dice_rolls_are_1_and_2_current_position_should_advance_to_3(){
        Monopoly spiedPlayer = Mockito.spy(player);
        Mockito.when(spiedPlayer.throwDice()).thenReturn(1,2);
        assertEquals(3,spiedPlayer.advance());
    }
    @Test
    public void when_dice_rolls_are_same_then_advance_should_be_called_again_current_position_should_advance_to_3(){
        Monopoly spiedPlayer = Mockito.spy(player);
        Mockito.when(spiedPlayer.throwDice()).thenReturn(3,3,5,1);
        assertEquals(12,spiedPlayer.advance());
    }

}