public class Player {
        private String playerName;
        private int playerNumber;

        public Player(String playerName) {
            this.playerName = playerName;
        }

        public String getPlayerName() {
            return playerName;
        }

        public void setPlayerNumber(int playerNumber) {
            this.playerNumber = playerNumber;
        }

        public int getPlayerNumber() {
            return playerNumber;
        }
}