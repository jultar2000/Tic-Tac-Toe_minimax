

public class TicTacToe {

    TicTacToe(String game_type)
    {
        switch(game_type)
        {
            case "PlayerVsPlayer":

                new PlayerVsPlayer(4);
                break;

            case "PlayerVsAi":
                System.out.println("Cos tam");
                break;
            case "AiVsAi":
                break;

        }

    }
}
