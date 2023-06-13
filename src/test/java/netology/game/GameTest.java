package netology.game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void shouldFindStrongPlayer() {

        Player playerName1 = new Player( 11, "Иван", 10);
        Player playerName2 = new Player(22, "Денис", 20);

        Game game = new Game();
            game.register(playerName1);
            game.register(playerName2);

            int expected = 1;
            int actual = game.round(playerName2, playerName1);

            Assertions.assertEquals(expected, actual);

        }

    }

