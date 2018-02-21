package me.kbrewster.hypixelapi.player.stats;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import me.kbrewster.hypixelapi.player.stats.arena.Arena;
import me.kbrewster.hypixelapi.player.stats.battlegrounds.BattleGrounds;
import me.kbrewster.hypixelapi.player.stats.megawalls.Walls3;
import me.kbrewster.hypixelapi.player.stats.mm.MurderMystery;
import me.kbrewster.hypixelapi.player.stats.skyclash.SkyClash;
import me.kbrewster.hypixelapi.player.stats.skywars.Skywars;
import me.kbrewster.hypixelapi.player.stats.speeduhc.SpeedUHC;
import me.kbrewster.hypixelapi.player.stats.tnt.TNTGames;
import me.kbrewster.hypixelapi.player.stats.uhc.UHC;
import me.kbrewster.hypixelapi.player.stats.vampz.VampireZ;
import me.kbrewster.hypixelapi.player.stats.walls.Walls;

@Getter
public class Stats {

    @Expose
    private me.kbrewster.hypixelapi.player.stats.arcade.Arcade Arcade;
    @Expose
    private Arena Arena;
    @Expose
    private BattleGrounds Battleground;
    @Expose
    private me.kbrewster.hypixelapi.player.stats.hg.HungerGames HungerGames;
    @Expose
    private me.kbrewster.hypixelapi.player.stats.mcgo.MCGO MCGO;
    @Expose
    private me.kbrewster.hypixelapi.player.stats.quake.Quake Quake;
    @Expose
    private TNTGames TNTGames;
    @Expose
    private UHC UHC;
    @Expose
    private Skywars SkyWars;
    @Expose
    private me.kbrewster.hypixelapi.player.stats.gingerbread.GingerBread GingerBread;
    @Expose
    private me.kbrewster.hypixelapi.player.stats.smash.SuperSmash SuperSmash;
    @Expose
    private Walls Walls;
    @Expose
    private Walls3 Walls3;
    @Expose
    private MurderMystery MurderMystery;
    @Expose
    private me.kbrewster.hypixelapi.player.stats.bedwars.Bedwars Bedwars;
    @Expose
    private me.kbrewster.hypixelapi.player.stats.paintball.Paintball Paintball;
    @Expose
    private VampireZ VampireZ;
    @Expose
    private SpeedUHC SpeedUHC;
    @Expose
    private SkyClash SkyClash;


}
