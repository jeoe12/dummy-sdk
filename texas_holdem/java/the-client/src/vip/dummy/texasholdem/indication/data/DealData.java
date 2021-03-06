package vip.dummy.texasholdem.indication.data;

import vip.dummy.texasholdem.bean.Player;
import vip.dummy.texasholdem.bean.Table;

public class DealData {

    private Table table;
    private Player []players;

    public DealData(Table table, Player[] players) {
        this.table = table;
        this.players = players;
    }

    public DealData() {

    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
