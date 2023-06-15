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
            int actual = game.round("Денис", "Иван");

            Assertions.assertEquals(expected, actual);

        }

    @Test
    public void shouldFindWeakPlayer() {

        Player playerName1 = new Player( 11, "Иван", 10);
        Player playerName2 = new Player(22, "Денис", 20);

        Game game = new Game();
        game.register(playerName1);
        game.register(playerName2);

        int expected = 2;
        int actual = game.round("Иван", "Денис");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindEqualsPlayer() {

        Player playerName1 = new Player( 11, "Иван", 10);
        Player playerName2 = new Player(22, "Денис", 10);

        Game game = new Game();
        game.register(playerName1);
        game.register(playerName2);

        int expected = 0;
        int actual = game.round("Иван", "Денис");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindNotOnePlayer() {

        Player playerName1 = new Player( 11, "Иван", 10);
        Player playerName2 = new Player(22, "Денис", 10);

        Game game = new Game();
        game.register(playerName1);
        game.register(playerName2);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Сергей", "Денис");

        });

    }


}

