package me.kbrewster.hypixelapi.player.stats.skywars;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class Skywars {

    @SerializedName("coins")
    @Expose
    private long coins;
    @SerializedName("win_streak")
    @Expose
    private long winStreak;
    @SerializedName("survived_players")
    @Expose
    private long survivedPlayers;
    @SerializedName("losses")
    @Expose
    private long losses;
    @SerializedName("deaths_team_insane")
    @Expose
    private long deathsTeamInsane;
    @SerializedName("survived_players_kit_mining_team_default")
    @Expose
    private long survivedPlayersKitMiningTeamDefault;
    @SerializedName("games")
    @Expose
    private long games;
    @SerializedName("survived_players_team")
    @Expose
    private long survivedPlayersTeam;
    @SerializedName("losses_team_insane")
    @Expose
    private long lossesTeamInsane;
    @SerializedName("losses_kit_mining_team_default")
    @Expose
    private long lossesKitMiningTeamDefault;
    @SerializedName("games_kit_mining_team_default")
    @Expose
    private long gamesKitMiningTeamDefault;
    @SerializedName("deaths")
    @Expose
    private long deaths;
    @SerializedName("deaths_kit_mining_team_default")
    @Expose
    private long deathsKitMiningTeamDefault;
    @SerializedName("games_team")
    @Expose
    private long gamesTeam;
    @SerializedName("losses_team")
    @Expose
    private long lossesTeam;
    @SerializedName("deaths_team")
    @Expose
    private long deathsTeam;
    @SerializedName("deaths_team_normal")
    @Expose
    private long deathsTeamNormal;
    @SerializedName("losses_team_normal")
    @Expose
    private long lossesTeamNormal;
    @SerializedName("blocks_placed")
    @Expose
    private long blocksPlaced;
    @SerializedName("quits")
    @Expose
    private long quits;
    @SerializedName("soul_well")
    @Expose
    private long soulWell;
    @SerializedName("usedSoulWell")
    @Expose
    private boolean usedSoulWell;
    @SerializedName("solo_instant_smelting")
    @Expose
    private long soloInstantSmelting;
    @SerializedName("kills_kit_mining_team_default")
    @Expose
    private long killsKitMiningTeamDefault;
    @SerializedName("arrows_hit")
    @Expose
    private long arrowsHit;
    @SerializedName("blocks_broken")
    @Expose
    private long blocksBroken;
    @SerializedName("kills_team_normal")
    @Expose
    private long killsTeamNormal;
    @SerializedName("kills")
    @Expose
    private long kills;
    @SerializedName("arrows_shot")
    @Expose
    private long arrowsShot;
    @SerializedName("kills_team")
    @Expose
    private long killsTeam;
    @SerializedName("souls_gathered")
    @Expose
    private long soulsGathered;
    @SerializedName("souls")
    @Expose
    private long souls;
    @SerializedName("egg_thrown")
    @Expose
    private long eggThrown;
    @SerializedName("games_solo")
    @Expose
    private long gamesSolo;
    @SerializedName("wins_solo")
    @Expose
    private long winsSolo;
    @SerializedName("wins")
    @Expose
    private long wins;
    @SerializedName("wins_kit_basic_solo_default")
    @Expose
    private long winsKitBasicSoloDefault;
    @SerializedName("survived_players_kit_basic_solo_default")
    @Expose
    private long survivedPlayersKitBasicSoloDefault;
    @SerializedName("kills_kit_basic_solo_default")
    @Expose
    private long killsKitBasicSoloDefault;
    @SerializedName("wins_solo_normal")
    @Expose
    private long winsSoloNormal;
    @SerializedName("kills_solo")
    @Expose
    private long killsSolo;
    @SerializedName("survived_players_solo")
    @Expose
    private long survivedPlayersSolo;
    @SerializedName("kills_solo_normal")
    @Expose
    private long killsSoloNormal;
    @SerializedName("games_kit_basic_solo_default")
    @Expose
    private long gamesKitBasicSoloDefault;
    @SerializedName("paid_souls")
    @Expose
    private long paidSouls;
    @SerializedName("packages")
    @Expose
    private List<String> packages = null;
    @SerializedName("activeKit_SOLO")
    @Expose
    private String activeKitSOLO;
    @SerializedName("kills_kit_basic_solo_ecologist")
    @Expose
    private long killsKitBasicSoloEcologist;
    @SerializedName("survived_players_kit_basic_solo_ecologist")
    @Expose
    private long survivedPlayersKitBasicSoloEcologist;
    @SerializedName("losses_solo")
    @Expose
    private long lossesSolo;
    @SerializedName("losses_solo_normal")
    @Expose
    private long lossesSoloNormal;
    @SerializedName("deaths_kit_basic_solo_ecologist")
    @Expose
    private long deathsKitBasicSoloEcologist;
    @SerializedName("deaths_solo")
    @Expose
    private long deathsSolo;
    @SerializedName("losses_kit_basic_solo_ecologist")
    @Expose
    private long lossesKitBasicSoloEcologist;
    @SerializedName("deaths_solo_normal")
    @Expose
    private long deathsSoloNormal;
    @SerializedName("currentCage")
    @Expose
    private String currentCage;
    @SerializedName("kills_solo_insane")
    @Expose
    private long killsSoloInsane;
    @SerializedName("deaths_solo_insane")
    @Expose
    private long deathsSoloInsane;
    @SerializedName("losses_solo_insane")
    @Expose
    private long lossesSoloInsane;
    @SerializedName("games_kit_basic_solo_ecologist")
    @Expose
    private long gamesKitBasicSoloEcologist;
    @SerializedName("wins_kit_basic_solo_ecologist")
    @Expose
    private long winsKitBasicSoloEcologist;
    @SerializedName("soul_well_legendaries")
    @Expose
    private long soulWellLegendaries;
    @SerializedName("losses_kit_advanced_solo_pyro")
    @Expose
    private long lossesKitAdvancedSoloPyro;
    @SerializedName("survived_players_kit_advanced_solo_pyro")
    @Expose
    private long survivedPlayersKitAdvancedSoloPyro;
    @SerializedName("kills_kit_advanced_solo_pyro")
    @Expose
    private long killsKitAdvancedSoloPyro;
    @SerializedName("deaths_kit_advanced_solo_pyro")
    @Expose
    private long deathsKitAdvancedSoloPyro;
    @SerializedName("games_kit_advanced_solo_pyro")
    @Expose
    private long gamesKitAdvancedSoloPyro;
    @SerializedName("enderpearls_thrown")
    @Expose
    private long enderpearlsThrown;
    @SerializedName("wins_kit_advanced_solo_pyro")
    @Expose
    private long winsKitAdvancedSoloPyro;
    @SerializedName("team_mining_expertise")
    @Expose
    private long teamMiningExpertise;
    @SerializedName("team_ender_mastery")
    @Expose
    private long teamEnderMastery;
    @SerializedName("activeKit_TEAM")
    @Expose
    private String activeKitTEAM;
    @SerializedName("survived_players_kit_attacking_team_scout")
    @Expose
    private long survivedPlayersKitAttackingTeamScout;
    @SerializedName("losses_kit_attacking_team_scout")
    @Expose
    private long lossesKitAttackingTeamScout;
    @SerializedName("kills_kit_attacking_team_scout")
    @Expose
    private long killsKitAttackingTeamScout;
    @SerializedName("deaths_kit_attacking_team_scout")
    @Expose
    private long deathsKitAttackingTeamScout;
    @SerializedName("deaths_kit_mining_team_cannoneer")
    @Expose
    private long deathsKitMiningTeamCannoneer;
    @SerializedName("survived_players_kit_mining_team_cannoneer")
    @Expose
    private long survivedPlayersKitMiningTeamCannoneer;
    @SerializedName("losses_kit_mining_team_cannoneer")
    @Expose
    private long lossesKitMiningTeamCannoneer;
    @SerializedName("team_resistance_boost")
    @Expose
    private long teamResistanceBoost;
    @SerializedName("kills_kit_mining_team_cannoneer")
    @Expose
    private long killsKitMiningTeamCannoneer;
    @SerializedName("assists_team")
    @Expose
    private long assistsTeam;
    @SerializedName("kills_team_insane")
    @Expose
    private long killsTeamInsane;
    @SerializedName("assists")
    @Expose
    private long assists;
    @SerializedName("assists_kit_attacking_team_scout")
    @Expose
    private long assistsKitAttackingTeamScout;
    @SerializedName("soul_well_rares")
    @Expose
    private long soulWellRares;
    @SerializedName("kills_kit_supporting_team_healer")
    @Expose
    private long killsKitSupportingTeamHealer;
    @SerializedName("losses_kit_supporting_team_healer")
    @Expose
    private long lossesKitSupportingTeamHealer;
    @SerializedName("assists_kit_supporting_team_healer")
    @Expose
    private long assistsKitSupportingTeamHealer;
    @SerializedName("survived_players_kit_supporting_team_healer")
    @Expose
    private long survivedPlayersKitSupportingTeamHealer;
    @SerializedName("deaths_kit_supporting_team_healer")
    @Expose
    private long deathsKitSupportingTeamHealer;
    @SerializedName("items_enchanted")
    @Expose
    private long itemsEnchanted;
    @SerializedName("solo_blazing_arrows")
    @Expose
    private long soloBlazingArrows;
    @SerializedName("solo_speed_boost")
    @Expose
    private long soloSpeedBoost;
    @SerializedName("assists_solo")
    @Expose
    private long assistsSolo;
    @SerializedName("assists_kit_advanced_solo_pyro")
    @Expose
    private long assistsKitAdvancedSoloPyro;
    @SerializedName("wins_team_insane")
    @Expose
    private long winsTeamInsane;
    @SerializedName("wins_kit_attacking_team_scout")
    @Expose
    private long winsKitAttackingTeamScout;
    @SerializedName("wins_team")
    @Expose
    private long winsTeam;
    @SerializedName("games_kit_attacking_team_scout")
    @Expose
    private long gamesKitAttackingTeamScout;
    @SerializedName("wins_solo_insane")
    @Expose
    private long winsSoloInsane;
    @SerializedName("solo_resistance_boost")
    @Expose
    private long soloResistanceBoost;
    @SerializedName("solo_ender_mastery")
    @Expose
    private long soloEnderMastery;
    @SerializedName("votes_Congo")
    @Expose
    private long votesCongo;
    @SerializedName("wins_team_normal")
    @Expose
    private long winsTeamNormal;
    @SerializedName("votes_Elven")
    @Expose
    private long votesElven;
    @SerializedName("deaths_kit_supporting_team_armorsmith")
    @Expose
    private long deathsKitSupportingTeamArmorsmith;
    @SerializedName("survived_players_kit_supporting_team_armorsmith")
    @Expose
    private long survivedPlayersKitSupportingTeamArmorsmith;
    @SerializedName("losses_kit_supporting_team_armorsmith")
    @Expose
    private long lossesKitSupportingTeamArmorsmith;
    @SerializedName("kills_kit_supporting_team_armorsmith")
    @Expose
    private long killsKitSupportingTeamArmorsmith;
    @SerializedName("votes_Steampunk")
    @Expose
    private long votesSteampunk;
    @SerializedName("votes_Overfall")
    @Expose
    private long votesOverfall;
    @SerializedName("assists_kit_attacking_team_snowman")
    @Expose
    private long assistsKitAttackingTeamSnowman;
    @SerializedName("deaths_kit_attacking_team_snowman")
    @Expose
    private long deathsKitAttackingTeamSnowman;
    @SerializedName("survived_players_kit_attacking_team_snowman")
    @Expose
    private long survivedPlayersKitAttackingTeamSnowman;
    @SerializedName("losses_kit_attacking_team_snowman")
    @Expose
    private long lossesKitAttackingTeamSnowman;
    @SerializedName("kills_kit_attacking_team_snowman")
    @Expose
    private long killsKitAttackingTeamSnowman;
    @SerializedName("wins_kit_mining_team_cannoneer")
    @Expose
    private long winsKitMiningTeamCannoneer;
    @SerializedName("games_kit_mining_team_cannoneer")
    @Expose
    private long gamesKitMiningTeamCannoneer;
    @SerializedName("assists_kit_mining_team_cannoneer")
    @Expose
    private long assistsKitMiningTeamCannoneer;
    @SerializedName("votes_Dwarven")
    @Expose
    private long votesDwarven;
    @SerializedName("team_instant_smelting")
    @Expose
    private long teamInstantSmelting;
    @SerializedName("votes_Temple")
    @Expose
    private long votesTemple;
    @SerializedName("games_kit_supporting_team_healer")
    @Expose
    private long gamesKitSupportingTeamHealer;
    @SerializedName("wins_kit_supporting_team_healer")
    @Expose
    private long winsKitSupportingTeamHealer;
    @SerializedName("votes_Dragonice")
    @Expose
    private long votesDragonice;
    @SerializedName("votes_Shattered")
    @Expose
    private long votesShattered;
    @SerializedName("votes_Atuin")
    @Expose
    private long votesAtuin;
    @SerializedName("votes_Toadstool")
    @Expose
    private long votesToadstool;
    @SerializedName("votes_Siege")
    @Expose
    private long votesSiege;
    @SerializedName("solo_bulldozer")
    @Expose
    private long soloBulldozer;
    @SerializedName("votes_LongIsland")
    @Expose
    private long votesLongIsland;
    @SerializedName("votes_Shire")
    @Expose
    private long votesShire;
    @SerializedName("games_kit_attacking_team_snowman")
    @Expose
    private long gamesKitAttackingTeamSnowman;
    @SerializedName("refill_chest_destroy")
    @Expose
    private long refillChestDestroy;
    @SerializedName("assists_kit_basic_solo_ecologist")
    @Expose
    private long assistsKitBasicSoloEcologist;
    @SerializedName("votes_Onionring")
    @Expose
    private long votesOnionring;
    @SerializedName("votes_Frostbite")
    @Expose
    private long votesFrostbite;
    @SerializedName("solo_marksmanship")
    @Expose
    private long soloMarksmanship;
    @SerializedName("losses_kit_defending_team_armorer")
    @Expose
    private long lossesKitDefendingTeamArmorer;
    @SerializedName("survived_players_kit_defending_team_armorer")
    @Expose
    private long survivedPlayersKitDefendingTeamArmorer;
    @SerializedName("deaths_kit_defending_team_armorer")
    @Expose
    private long deathsKitDefendingTeamArmorer;
    @SerializedName("kills_kit_defending_team_armorer")
    @Expose
    private long killsKitDefendingTeamArmorer;
    @SerializedName("games_kit_defending_team_armorer")
    @Expose
    private long gamesKitDefendingTeamArmorer;
    @SerializedName("wins_kit_defending_team_armorer")
    @Expose
    private long winsKitDefendingTeamArmorer;
    @SerializedName("assists_kit_defending_team_armorer")
    @Expose
    private long assistsKitDefendingTeamArmorer;
    @SerializedName("solo_mining_expertise")
    @Expose
    private long soloMiningExpertise;
    @SerializedName("harvesting_season")
    @Expose
    private long harvestingSeason;
    @SerializedName("survived_players_kit_attacking_team_knight")
    @Expose
    private long survivedPlayersKitAttackingTeamKnight;
    @SerializedName("losses_kit_attacking_team_knight")
    @Expose
    private long lossesKitAttackingTeamKnight;
    @SerializedName("kills_kit_attacking_team_knight")
    @Expose
    private long killsKitAttackingTeamKnight;
    @SerializedName("deaths_kit_attacking_team_knight")
    @Expose
    private long deathsKitAttackingTeamKnight;
    @SerializedName("assists_kit_attacking_team_knight")
    @Expose
    private long assistsKitAttackingTeamKnight;
    @SerializedName("deaths_kit_advanced_solo_cannoneer")
    @Expose
    private long deathsKitAdvancedSoloCannoneer;
    @SerializedName("kills_kit_advanced_solo_cannoneer")
    @Expose
    private long killsKitAdvancedSoloCannoneer;
    @SerializedName("losses_kit_advanced_solo_cannoneer")
    @Expose
    private long lossesKitAdvancedSoloCannoneer;
    @SerializedName("survived_players_kit_advanced_solo_cannoneer")
    @Expose
    private long survivedPlayersKitAdvancedSoloCannoneer;
    @SerializedName("wins_kit_advanced_solo_cannoneer")
    @Expose
    private long winsKitAdvancedSoloCannoneer;
    @SerializedName("games_kit_advanced_solo_cannoneer")
    @Expose
    private long gamesKitAdvancedSoloCannoneer;
    @SerializedName("assists_kit_advanced_solo_cannoneer")
    @Expose
    private long assistsKitAdvancedSoloCannoneer;
    @SerializedName("kills_kit_attacking_team_hunter")
    @Expose
    private long killsKitAttackingTeamHunter;
    @SerializedName("losses_kit_attacking_team_hunter")
    @Expose
    private long lossesKitAttackingTeamHunter;
    @SerializedName("survived_players_kit_attacking_team_hunter")
    @Expose
    private long survivedPlayersKitAttackingTeamHunter;
    @SerializedName("deaths_kit_attacking_team_hunter")
    @Expose
    private long deathsKitAttackingTeamHunter;
    @SerializedName("losses_kit_basic_solo_armorsmith")
    @Expose
    private long lossesKitBasicSoloArmorsmith;
    @SerializedName("survived_players_kit_basic_solo_armorsmith")
    @Expose
    private long survivedPlayersKitBasicSoloArmorsmith;
    @SerializedName("kills_kit_basic_solo_armorsmith")
    @Expose
    private long killsKitBasicSoloArmorsmith;
    @SerializedName("deaths_kit_basic_solo_armorsmith")
    @Expose
    private long deathsKitBasicSoloArmorsmith;
    @SerializedName("wins_kit_basic_solo_armorsmith")
    @Expose
    private long winsKitBasicSoloArmorsmith;
    @SerializedName("assists_kit_basic_solo_armorsmith")
    @Expose
    private long assistsKitBasicSoloArmorsmith;
    @SerializedName("games_kit_basic_solo_armorsmith")
    @Expose
    private long gamesKitBasicSoloArmorsmith;
    @SerializedName("games_kit_attacking_team_hunter")
    @Expose
    private long gamesKitAttackingTeamHunter;
    @SerializedName("wins_kit_attacking_team_hunter")
    @Expose
    private long winsKitAttackingTeamHunter;
    @SerializedName("games_kit_supporting_team_armorsmith")
    @Expose
    private long gamesKitSupportingTeamArmorsmith;
    @SerializedName("games_kit_attacking_team_knight")
    @Expose
    private long gamesKitAttackingTeamKnight;
    @SerializedName("wins_kit_attacking_team_knight")
    @Expose
    private long winsKitAttackingTeamKnight;
    @SerializedName("wins_kit_supporting_team_armorsmith")
    @Expose
    private long winsKitSupportingTeamArmorsmith;
    @SerializedName("assists_kit_supporting_team_armorsmith")
    @Expose
    private long assistsKitSupportingTeamArmorsmith;
    @SerializedName("deaths_kit_mega_mega_default")
    @Expose
    private long deathsKitMegaMegaDefault;
    @SerializedName("losses_mega_normal")
    @Expose
    private long lossesMegaNormal;
    @SerializedName("deaths_mega")
    @Expose
    private long deathsMega;
    @SerializedName("losses_mega")
    @Expose
    private long lossesMega;
    @SerializedName("losses_kit_mega_mega_default")
    @Expose
    private long lossesKitMegaMegaDefault;
    @SerializedName("survived_players_mega")
    @Expose
    private long survivedPlayersMega;
    @SerializedName("deaths_mega_normal")
    @Expose
    private long deathsMegaNormal;
    @SerializedName("survived_players_kit_mega_mega_default")
    @Expose
    private long survivedPlayersKitMegaMegaDefault;
    @SerializedName("assists_kit_mega_mega_default")
    @Expose
    private long assistsKitMegaMegaDefault;
    @SerializedName("kills_mega")
    @Expose
    private long killsMega;
    @SerializedName("kills_kit_mega_mega_default")
    @Expose
    private long killsKitMegaMegaDefault;
    @SerializedName("assists_mega")
    @Expose
    private long assistsMega;
    @SerializedName("kills_mega_normal")
    @Expose
    private long killsMegaNormal;
    @SerializedName("kit_mega_mega_armorer")
    @Expose
    private long kitMegaMegaArmorer;
    @SerializedName("activeKit_MEGA")
    @Expose
    private String activeKitMEGA;
    @SerializedName("losses_kit_mega_mega_armorer")
    @Expose
    private long lossesKitMegaMegaArmorer;
    @SerializedName("assists_kit_mega_mega_armorer")
    @Expose
    private long assistsKitMegaMegaArmorer;
    @SerializedName("survived_players_kit_mega_mega_armorer")
    @Expose
    private long survivedPlayersKitMegaMegaArmorer;
    @SerializedName("deaths_kit_mega_mega_armorer")
    @Expose
    private long deathsKitMegaMegaArmorer;
    @SerializedName("kills_kit_mega_mega_armorer")
    @Expose
    private long killsKitMegaMegaArmorer;
    @SerializedName("games_kit_mega_mega_armorer")
    @Expose
    private long gamesKitMegaMegaArmorer;
    @SerializedName("games_mega")
    @Expose
    private long gamesMega;
    @SerializedName("wins_kit_mega_mega_armorer")
    @Expose
    private long winsKitMegaMegaArmorer;
    @SerializedName("wins_mega")
    @Expose
    private long winsMega;
    @SerializedName("wins_mega_normal")
    @Expose
    private long winsMegaNormal;
    @SerializedName("votes_MegaShire")
    @Expose
    private long votesMegaShire;
    @SerializedName("mega_ender_mastery")
    @Expose
    private long megaEnderMastery;
    @SerializedName("deaths_kit_supporting_team_ecologist")
    @Expose
    private long deathsKitSupportingTeamEcologist;
    @SerializedName("kills_kit_supporting_team_ecologist")
    @Expose
    private long killsKitSupportingTeamEcologist;
    @SerializedName("survived_players_kit_supporting_team_ecologist")
    @Expose
    private long survivedPlayersKitSupportingTeamEcologist;
    @SerializedName("losses_kit_supporting_team_ecologist")
    @Expose
    private long lossesKitSupportingTeamEcologist;
    @SerializedName("mega_rusher")
    @Expose
    private long megaRusher;
    @SerializedName("mega_mining_expertise")
    @Expose
    private long megaMiningExpertise;
    @SerializedName("games_kit_supporting_team_ecologist")
    @Expose
    private long gamesKitSupportingTeamEcologist;
    @SerializedName("wins_kit_supporting_team_ecologist")
    @Expose
    private long winsKitSupportingTeamEcologist;
    @SerializedName("assists_kit_supporting_team_ecologist")
    @Expose
    private long assistsKitSupportingTeamEcologist;
    @SerializedName("survived_players_kit_advanced_solo_farmer")
    @Expose
    private long survivedPlayersKitAdvancedSoloFarmer;
    @SerializedName("games_kit_advanced_solo_farmer")
    @Expose
    private long gamesKitAdvancedSoloFarmer;
    @SerializedName("wins_kit_advanced_solo_farmer")
    @Expose
    private long winsKitAdvancedSoloFarmer;
    @SerializedName("kills_kit_advanced_solo_farmer")
    @Expose
    private long killsKitAdvancedSoloFarmer;
    @SerializedName("deaths_kit_advanced_solo_farmer")
    @Expose
    private long deathsKitAdvancedSoloFarmer;
    @SerializedName("losses_kit_advanced_solo_farmer")
    @Expose
    private long lossesKitAdvancedSoloFarmer;
    @SerializedName("mega_tank")
    @Expose
    private long megaTank;
    @SerializedName("mega_juggernaut")
    @Expose
    private long megaJuggernaut;
    @SerializedName("team_arrow_recovery")
    @Expose
    private long teamArrowRecovery;
    @SerializedName("wins_kit_basic_solo_speleologist")
    @Expose
    private long winsKitBasicSoloSpeleologist;
    @SerializedName("kills_kit_basic_solo_speleologist")
    @Expose
    private long killsKitBasicSoloSpeleologist;
    @SerializedName("games_kit_basic_solo_speleologist")
    @Expose
    private long gamesKitBasicSoloSpeleologist;
    @SerializedName("survived_players_kit_basic_solo_speleologist")
    @Expose
    private long survivedPlayersKitBasicSoloSpeleologist;
    @SerializedName("losses_kit_basic_solo_speleologist")
    @Expose
    private long lossesKitBasicSoloSpeleologist;
    @SerializedName("deaths_kit_basic_solo_speleologist")
    @Expose
    private long deathsKitBasicSoloSpeleologist;
    @SerializedName("assists_kit_basic_solo_speleologist")
    @Expose
    private long assistsKitBasicSoloSpeleologist;
    @SerializedName("kit_mega_mega_baseball-player")
    @Expose
    private long kitMegaMegaBaseballPlayer;
    @SerializedName("survived_players_kit_mega_mega_baseball-player")
    @Expose
    private long survivedPlayersKitMegaMegaBaseballPlayer;
    @SerializedName("deaths_kit_mega_mega_baseball-player")
    @Expose
    private long deathsKitMegaMegaBaseballPlayer;
    @SerializedName("assists_kit_mega_mega_baseball-player")
    @Expose
    private long assistsKitMegaMegaBaseballPlayer;
    @SerializedName("losses_kit_mega_mega_baseball-player")
    @Expose
    private long lossesKitMegaMegaBaseballPlayer;
    @SerializedName("kills_kit_mega_mega_baseball-player")
    @Expose
    private long killsKitMegaMegaBaseballPlayer;
    @SerializedName("games_kit_mega_mega_baseball-player")
    @Expose
    private long gamesKitMegaMegaBaseballPlayer;
    @SerializedName("wins_kit_mega_mega_baseball-player")
    @Expose
    private long winsKitMegaMegaBaseballPlayer;
    @SerializedName("votes_Entangled")
    @Expose
    private long votesEntangled;
    @SerializedName("xezbeth_luck")
    @Expose
    private long xezbethLuck;
    @SerializedName("extra_wheels")
    @Expose
    private long extraWheels;
    @SerializedName("team_juggernaut")
    @Expose
    private long teamJuggernaut;
    @SerializedName("kills_weekly_b")
    @Expose
    private long killsWeeklyB;
    @SerializedName("kills_monthly_b")
    @Expose
    private long killsMonthlyB;
    @SerializedName("solo_arrow_recovery")
    @Expose
    private long soloArrowRecovery;
    @SerializedName("kills_weekly_a")
    @Expose
    private long killsWeeklyA;
    @SerializedName("kills_monthly_a")
    @Expose
    private long killsMonthlyA;
    @SerializedName("solo_juggernaut")
    @Expose
    private long soloJuggernaut;
    @SerializedName("survived_players_kit_defending_team_guardian")
    @Expose
    private long survivedPlayersKitDefendingTeamGuardian;
    @SerializedName("wins_kit_defending_team_guardian")
    @Expose
    private long winsKitDefendingTeamGuardian;
    @SerializedName("kills_kit_defending_team_guardian")
    @Expose
    private long killsKitDefendingTeamGuardian;
    @SerializedName("games_kit_defending_team_guardian")
    @Expose
    private long gamesKitDefendingTeamGuardian;
    @SerializedName("losses_kit_defending_team_guardian")
    @Expose
    private long lossesKitDefendingTeamGuardian;
    @SerializedName("assists_kit_defending_team_guardian")
    @Expose
    private long assistsKitDefendingTeamGuardian;
    @SerializedName("deaths_kit_defending_team_guardian")
    @Expose
    private long deathsKitDefendingTeamGuardian;
    @SerializedName("wins_kit_attacking_team_snowman")
    @Expose
    private long winsKitAttackingTeamSnowman;
    @SerializedName("activeKit_RANKED")
    @Expose
    private String activeKitRANKED;
    @SerializedName("winstreak_ranked")
    @Expose
    private long winstreakRanked;
    @SerializedName("killstreak")
    @Expose
    private long killstreak;
    @SerializedName("survived_players_kit_ranked_ranked_champion")
    @Expose
    private long survivedPlayersKitRankedRankedChampion;
    @SerializedName("games_ranked")
    @Expose
    private long gamesRanked;
    @SerializedName("wins_ranked_normal")
    @Expose
    private long winsRankedNormal;
    @SerializedName("kills_ranked_normal")
    @Expose
    private long killsRankedNormal;
    @SerializedName("killstreak_ranked")
    @Expose
    private long killstreakRanked;
    @SerializedName("killstreak_kit_ranked_ranked_champion")
    @Expose
    private long killstreakKitRankedRankedChampion;
    @SerializedName("survived_players_ranked")
    @Expose
    private long survivedPlayersRanked;
    @SerializedName("kills_ranked")
    @Expose
    private long killsRanked;
    @SerializedName("winstreak")
    @Expose
    private long winstreak;
    @SerializedName("wins_kit_ranked_ranked_champion")
    @Expose
    private long winsKitRankedRankedChampion;
    @SerializedName("kills_kit_ranked_ranked_champion")
    @Expose
    private long killsKitRankedRankedChampion;
    @SerializedName("winstreak_kit_ranked_ranked_champion")
    @Expose
    private long winstreakKitRankedRankedChampion;
    @SerializedName("wins_ranked")
    @Expose
    private long winsRanked;
    @SerializedName("games_kit_ranked_ranked_champion")
    @Expose
    private long gamesKitRankedRankedChampion;
    @SerializedName("highestKillstreak")
    @Expose
    private long highestKillstreak;
    @SerializedName("highestWinstreak")
    @Expose
    private long highestWinstreak;
    @SerializedName("losses_kit_ranked_ranked_champion")
    @Expose
    private long lossesKitRankedRankedChampion;
    @SerializedName("deaths_kit_ranked_ranked_champion")
    @Expose
    private long deathsKitRankedRankedChampion;
    @SerializedName("deaths_ranked")
    @Expose
    private long deathsRanked;
    @SerializedName("losses_ranked")
    @Expose
    private long lossesRanked;
    @SerializedName("deaths_ranked_normal")
    @Expose
    private long deathsRankedNormal;
    @SerializedName("losses_ranked_normal")
    @Expose
    private long lossesRankedNormal;
    @SerializedName("assists_ranked")
    @Expose
    private long assistsRanked;
    @SerializedName("assists_kit_ranked_ranked_champion")
    @Expose
    private long assistsKitRankedRankedChampion;
    @SerializedName("mega_instant_smelting")
    @Expose
    private long megaInstantSmelting;
    @SerializedName("votes_Twisted Grove")
    @Expose
    private long votesTwistedGrove;
    @SerializedName("killstreak_kit_basic_solo_armorsmith")
    @Expose
    private long killstreakKitBasicSoloArmorsmith;
    @SerializedName("winstreak_kit_basic_solo_armorsmith")
    @Expose
    private long winstreakKitBasicSoloArmorsmith;
    @SerializedName("killstreak_solo")
    @Expose
    private long killstreakSolo;
    @SerializedName("winstreak_solo")
    @Expose
    private long winstreakSolo;
    @SerializedName("team_blazing_arrows")
    @Expose
    private long teamBlazingArrows;
    @SerializedName("team_savior")
    @Expose
    private long teamSavior;
    @SerializedName("solo_knowledge")
    @Expose
    private long soloKnowledge;
    @SerializedName("ranked_instant_smelting")
    @Expose
    private long rankedInstantSmelting;
    @SerializedName("votes_Eirene")
    @Expose
    private long votesEirene;
    @SerializedName("killstreak_kit_mega_mega_armorer")
    @Expose
    private long killstreakKitMegaMegaArmorer;
    @SerializedName("winstreak_kit_mega_mega_armorer")
    @Expose
    private long winstreakKitMegaMegaArmorer;
    @SerializedName("winstreak_mega")
    @Expose
    private long winstreakMega;
    @SerializedName("killstreak_mega")
    @Expose
    private long killstreakMega;
    @SerializedName("killstreak_kit_defending_team_armorer")
    @Expose
    private long killstreakKitDefendingTeamArmorer;
    @SerializedName("killstreak_team")
    @Expose
    private long killstreakTeam;
    @SerializedName("winstreak_team")
    @Expose
    private long winstreakTeam;
    @SerializedName("winstreak_kit_defending_team_armorer")
    @Expose
    private long winstreakKitDefendingTeamArmorer;
    @SerializedName("mega_nourishment")
    @Expose
    private long megaNourishment;
    @SerializedName("team_nourishment")
    @Expose
    private long teamNourishment;
    @SerializedName("killstreak_kit_mega_mega_baseball-player")
    @Expose
    private long killstreakKitMegaMegaBaseballPlayer;
    @SerializedName("winstreak_kit_mega_mega_baseball-player")
    @Expose
    private long winstreakKitMegaMegaBaseballPlayer;
    @SerializedName("kills_kit_advanced_solo_enderman")
    @Expose
    private long killsKitAdvancedSoloEnderman;
    @SerializedName("survived_players_kit_advanced_solo_enderman")
    @Expose
    private long survivedPlayersKitAdvancedSoloEnderman;
    @SerializedName("losses_kit_advanced_solo_enderman")
    @Expose
    private long lossesKitAdvancedSoloEnderman;
    @SerializedName("deaths_kit_advanced_solo_enderman")
    @Expose
    private long deathsKitAdvancedSoloEnderman;
    @SerializedName("solo_nourishment")
    @Expose
    private long soloNourishment;
    @SerializedName("winstreak_kit_advanced_solo_pyro")
    @Expose
    private long winstreakKitAdvancedSoloPyro;
    @SerializedName("killstreak_kit_advanced_solo_pyro")
    @Expose
    private long killstreakKitAdvancedSoloPyro;
    @SerializedName("winstreak_kit_supporting_team_ecologist")
    @Expose
    private long winstreakKitSupportingTeamEcologist;
    @SerializedName("killstreak_kit_supporting_team_ecologist")
    @Expose
    private long killstreakKitSupportingTeamEcologist;
    @SerializedName("team_fat")
    @Expose
    private long teamFat;
    @SerializedName("assists_kit_basic_solo_troll")
    @Expose
    private long assistsKitBasicSoloTroll;
    @SerializedName("deaths_kit_basic_solo_troll")
    @Expose
    private long deathsKitBasicSoloTroll;
    @SerializedName("losses_kit_basic_solo_troll")
    @Expose
    private long lossesKitBasicSoloTroll;
    @SerializedName("kills_kit_basic_solo_troll")
    @Expose
    private long killsKitBasicSoloTroll;
    @SerializedName("survived_players_kit_basic_solo_troll")
    @Expose
    private long survivedPlayersKitBasicSoloTroll;
    @SerializedName("games_kit_basic_solo_troll")
    @Expose
    private long gamesKitBasicSoloTroll;
    @SerializedName("winstreak_kit_basic_solo_troll")
    @Expose
    private long winstreakKitBasicSoloTroll;
    @SerializedName("killstreak_kit_basic_solo_troll")
    @Expose
    private long killstreakKitBasicSoloTroll;
    @SerializedName("wins_kit_basic_solo_troll")
    @Expose
    private long winsKitBasicSoloTroll;
    @SerializedName("kit_mega_mega_knight")
    @Expose
    private long kitMegaMegaKnight;
    @SerializedName("killstreak_kit_mega_mega_knight")
    @Expose
    private long killstreakKitMegaMegaKnight;
    @SerializedName("winstreak_kit_mega_mega_knight")
    @Expose
    private long winstreakKitMegaMegaKnight;
    @SerializedName("assists_kit_mega_mega_knight")
    @Expose
    private long assistsKitMegaMegaKnight;
    @SerializedName("kills_kit_mega_mega_knight")
    @Expose
    private long killsKitMegaMegaKnight;
    @SerializedName("wins_kit_mega_mega_knight")
    @Expose
    private long winsKitMegaMegaKnight;
    @SerializedName("survived_players_kit_mega_mega_knight")
    @Expose
    private long survivedPlayersKitMegaMegaKnight;
    @SerializedName("games_kit_mega_mega_knight")
    @Expose
    private long gamesKitMegaMegaKnight;
    @SerializedName("deaths_kit_mega_mega_knight")
    @Expose
    private long deathsKitMegaMegaKnight;
    @SerializedName("losses_kit_mega_mega_knight")
    @Expose
    private long lossesKitMegaMegaKnight;
    @SerializedName("winstreak_kit_mining_team_cannoneer")
    @Expose
    private long winstreakKitMiningTeamCannoneer;
    @SerializedName("killstreak_kit_mining_team_cannoneer")
    @Expose
    private long killstreakKitMiningTeamCannoneer;
    @SerializedName("killstreak_kit_attacking_team_knight")
    @Expose
    private long killstreakKitAttackingTeamKnight;
    @SerializedName("winstreak_kit_attacking_team_knight")
    @Expose
    private long winstreakKitAttackingTeamKnight;
    @SerializedName("activeKillEffect")
    @Expose
    private String activeKillEffect;
    @SerializedName("team_annoy-o-mite")
    @Expose
    private long teamAnnoyOMite;
    @SerializedName("mega_blazing_arrows")
    @Expose
    private long megaBlazingArrows;
    @SerializedName("activeProjectileTrail")
    @Expose
    private String activeProjectileTrail;
    @SerializedName("team_speed_boost")
    @Expose
    private long teamSpeedBoost;
    @SerializedName("wins_kit_ranked_ranked_armorer")
    @Expose
    private long winsKitRankedRankedArmorer;
    @SerializedName("winstreak_kit_ranked_ranked_armorer")
    @Expose
    private long winstreakKitRankedRankedArmorer;
    @SerializedName("games_kit_ranked_ranked_armorer")
    @Expose
    private long gamesKitRankedRankedArmorer;
    @SerializedName("survived_players_kit_ranked_ranked_armorer")
    @Expose
    private long survivedPlayersKitRankedRankedArmorer;
    @SerializedName("kills_kit_ranked_ranked_armorer")
    @Expose
    private long killsKitRankedRankedArmorer;
    @SerializedName("killstreak_kit_ranked_ranked_armorer")
    @Expose
    private long killstreakKitRankedRankedArmorer;
    @SerializedName("deaths_kit_ranked_ranked_armorer")
    @Expose
    private long deathsKitRankedRankedArmorer;
    @SerializedName("assists_kit_ranked_ranked_armorer")
    @Expose
    private long assistsKitRankedRankedArmorer;
    @SerializedName("losses_kit_ranked_ranked_armorer")
    @Expose
    private long lossesKitRankedRankedArmorer;
    @SerializedName("team_marksmanship")
    @Expose
    private long teamMarksmanship;
    @SerializedName("games_kit_ranked_ranked_pyromancer")
    @Expose
    private long gamesKitRankedRankedPyromancer;
    @SerializedName("deaths_kit_ranked_ranked_pyromancer")
    @Expose
    private long deathsKitRankedRankedPyromancer;
    @SerializedName("kills_kit_ranked_ranked_pyromancer")
    @Expose
    private long killsKitRankedRankedPyromancer;
    @SerializedName("survived_players_kit_ranked_ranked_pyromancer")
    @Expose
    private long survivedPlayersKitRankedRankedPyromancer;
    @SerializedName("losses_kit_ranked_ranked_pyromancer")
    @Expose
    private long lossesKitRankedRankedPyromancer;
    @SerializedName("killstreak_kit_ranked_ranked_pyromancer")
    @Expose
    private long killstreakKitRankedRankedPyromancer;
    @SerializedName("winstreak_kit_ranked_ranked_pyromancer")
    @Expose
    private long winstreakKitRankedRankedPyromancer;
    @SerializedName("wins_kit_ranked_ranked_pyromancer")
    @Expose
    private long winsKitRankedRankedPyromancer;
    @SerializedName("assists_kit_ranked_ranked_pyromancer")
    @Expose
    private long assistsKitRankedRankedPyromancer;
    @SerializedName("solo_revenge")
    @Expose
    private long soloRevenge;
    @SerializedName("losses_kit_enderchest_solo_enderchest")
    @Expose
    private long lossesKitEnderchestSoloEnderchest;
    @SerializedName("games_kit_enderchest_solo_enderchest")
    @Expose
    private long gamesKitEnderchestSoloEnderchest;
    @SerializedName("deaths_kit_enderchest_solo_enderchest")
    @Expose
    private long deathsKitEnderchestSoloEnderchest;
    @SerializedName("kills_kit_enderchest_solo_enderchest")
    @Expose
    private long killsKitEnderchestSoloEnderchest;
    @SerializedName("survived_players_kit_enderchest_solo_enderchest")
    @Expose
    private long survivedPlayersKitEnderchestSoloEnderchest;
    @SerializedName("winstreak_kit_enderchest_solo_enderchest")
    @Expose
    private long winstreakKitEnderchestSoloEnderchest;
    @SerializedName("wins_kit_enderchest_solo_enderchest")
    @Expose
    private long winsKitEnderchestSoloEnderchest;
    @SerializedName("killstreak_kit_enderchest_solo_enderchest")
    @Expose
    private long killstreakKitEnderchestSoloEnderchest;
    @SerializedName("assists_kit_enderchest_solo_enderchest")
    @Expose
    private long assistsKitEnderchestSoloEnderchest;
    @SerializedName("team_knowledge")
    @Expose
    private long teamKnowledge;
    @SerializedName("losses_kit_supporting_team_rookie")
    @Expose
    private long lossesKitSupportingTeamRookie;
    @SerializedName("survived_players_kit_supporting_team_rookie")
    @Expose
    private long survivedPlayersKitSupportingTeamRookie;
    @SerializedName("deaths_kit_supporting_team_rookie")
    @Expose
    private long deathsKitSupportingTeamRookie;
    @SerializedName("assists_kit_supporting_team_rookie")
    @Expose
    private long assistsKitSupportingTeamRookie;
    @SerializedName("winstreak_kit_supporting_team_rookie")
    @Expose
    private long winstreakKitSupportingTeamRookie;
    @SerializedName("wins_kit_supporting_team_rookie")
    @Expose
    private long winsKitSupportingTeamRookie;
    @SerializedName("games_kit_supporting_team_rookie")
    @Expose
    private long gamesKitSupportingTeamRookie;
    @SerializedName("killstreak_kit_supporting_team_rookie")
    @Expose
    private long killstreakKitSupportingTeamRookie;
    @SerializedName("kills_kit_supporting_team_rookie")
    @Expose
    private long killsKitSupportingTeamRookie;
    @SerializedName("killstreak_kit_defending_team_guardian")
    @Expose
    private long killstreakKitDefendingTeamGuardian;
    @SerializedName("winstreak_kit_defending_team_guardian")
    @Expose
    private long winstreakKitDefendingTeamGuardian;
    @SerializedName("winstreak_kit_attacking_team_scout")
    @Expose
    private long winstreakKitAttackingTeamScout;
    @SerializedName("killstreak_kit_attacking_team_scout")
    @Expose
    private long killstreakKitAttackingTeamScout;
    @SerializedName("mega_notoriety")
    @Expose
    private long megaNotoriety;
    @SerializedName("quickjoin_uses_Aquarius")
    @Expose
    private long quickjoinUsesAquarius;
    @SerializedName("quickjoin_uses_total")
    @Expose
    private long quickjoinUsesTotal;
    @SerializedName("quickjoin_uses_Haunted")
    @Expose
    private long quickjoinUsesHaunted;
    @SerializedName("quickjoin_uses_Martian")
    @Expose
    private long quickjoinUsesMartian;
    @SerializedName("quickjoin_uses_Aegis")
    @Expose
    private long quickjoinUsesAegis;
    @SerializedName("quickjoin_uses_Skychurch")
    @Expose
    private long quickjoinUsesSkychurch;
    @SerializedName("quickjoin_uses_Elven")
    @Expose
    private long quickjoinUsesElven;
    @SerializedName("quickjoin_uses_Plateau")
    @Expose
    private long quickjoinUsesPlateau;
    @SerializedName("quickjoin_uses_random")
    @Expose
    private long quickjoinUsesRandom;
    @SerializedName("mega_marksmanship")
    @Expose
    private long megaMarksmanship;
    @SerializedName("quickjoin_uses_Toadstool")
    @Expose
    private long quickjoinUsesToadstool;
    @SerializedName("quickjoin_uses_Tribal")
    @Expose
    private long quickjoinUsesTribal;
    @SerializedName("quickjoin_uses_Steampunk")
    @Expose
    private long quickjoinUsesSteampunk;
    @SerializedName("quickjoin_uses_Entangled")
    @Expose
    private long quickjoinUsesEntangled;
    @SerializedName("quickjoin_uses_Onionring 2")
    @Expose
    private long quickjoinUsesOnionring2;
    @SerializedName("quickjoin_uses_Overfall")
    @Expose
    private long quickjoinUsesOverfall;
    @SerializedName("quickjoin_uses_Tribute")
    @Expose
    private long quickjoinUsesTribute;
    @SerializedName("quickjoin_uses_Tundra")
    @Expose
    private long quickjoinUsesTundra;
    @SerializedName("quickjoin_uses_Dwarven")
    @Expose
    private long quickjoinUsesDwarven;
    @SerializedName("quickjoin_uses_Sentinel")
    @Expose
    private long quickjoinUsesSentinel;
    @SerializedName("quickjoin_uses_Frostbite")
    @Expose
    private long quickjoinUsesFrostbite;
    @SerializedName("quickjoin_uses_Siege")
    @Expose
    private long quickjoinUsesSiege;
    @SerializedName("quickjoin_uses_Crumble")
    @Expose
    private long quickjoinUsesCrumble;
    @SerializedName("quickjoin_uses_Shattered")
    @Expose
    private long quickjoinUsesShattered;
    @SerializedName("quickjoin_uses_Congo")
    @Expose
    private long quickjoinUsesCongo;
    @SerializedName("quickjoin_uses_Fossil")
    @Expose
    private long quickjoinUsesFossil;
    @SerializedName("quickjoin_uses_Frozen Throne")
    @Expose
    private long quickjoinUsesFrozenThrone;
    @SerializedName("quickjoin_uses_Tiki")
    @Expose
    private long quickjoinUsesTiki;
    @SerializedName("quickjoin_uses_Towers")
    @Expose
    private long quickjoinUsesTowers;
    @SerializedName("games_kit_basic_solo_snowman")
    @Expose
    private long gamesKitBasicSoloSnowman;
    @SerializedName("losses_kit_basic_solo_snowman")
    @Expose
    private long lossesKitBasicSoloSnowman;
    @SerializedName("survived_players_kit_basic_solo_snowman")
    @Expose
    private long survivedPlayersKitBasicSoloSnowman;
    @SerializedName("kills_kit_basic_solo_snowman")
    @Expose
    private long killsKitBasicSoloSnowman;
    @SerializedName("deaths_kit_basic_solo_snowman")
    @Expose
    private long deathsKitBasicSoloSnowman;
    @SerializedName("quickjoin_uses_Jinzhou")
    @Expose
    private long quickjoinUsesJinzhou;
    @SerializedName("quickjoin_uses_Railroad")
    @Expose
    private long quickjoinUsesRailroad;
    @SerializedName("melee_kills_solo")
    @Expose
    private long meleeKillsSolo;
    @SerializedName("chests_opened_kit_basic_solo_armorsmith")
    @Expose
    private long chestsOpenedKitBasicSoloArmorsmith;
    @SerializedName("most_kills_game_kit_basic_solo_armorsmith")
    @Expose
    private long mostKillsGameKitBasicSoloArmorsmith;
    @SerializedName("chests_opened")
    @Expose
    private long chestsOpened;
    @SerializedName("melee_kills")
    @Expose
    private long meleeKills;
    @SerializedName("most_kills_game_solo")
    @Expose
    private long mostKillsGameSolo;
    @SerializedName("chests_opened_solo")
    @Expose
    private long chestsOpenedSolo;
    @SerializedName("time_played_kit_basic_solo_armorsmith")
    @Expose
    private long timePlayedKitBasicSoloArmorsmith;
    @SerializedName("melee_kills_kit_basic_solo_armorsmith")
    @Expose
    private long meleeKillsKitBasicSoloArmorsmith;
    @SerializedName("time_played_solo")
    @Expose
    private long timePlayedSolo;
    @SerializedName("time_played")
    @Expose
    private long timePlayed;
    @SerializedName("most_kills_game")
    @Expose
    private long mostKillsGame;
    @SerializedName("arrows_shot_kit_basic_solo_armorsmith")
    @Expose
    private long arrowsShotKitBasicSoloArmorsmith;
    @SerializedName("arrows_shot_solo")
    @Expose
    private long arrowsShotSolo;
    @SerializedName("void_kills")
    @Expose
    private long voidKills;
    @SerializedName("void_kills_kit_basic_solo_armorsmith")
    @Expose
    private long voidKillsKitBasicSoloArmorsmith;
    @SerializedName("void_kills_solo")
    @Expose
    private long voidKillsSolo;
    @SerializedName("longest_bow_shot")
    @Expose
    private long longestBowShot;
    @SerializedName("fastest_win")
    @Expose
    private long fastestWin;
    @SerializedName("fastest_win_solo")
    @Expose
    private long fastestWinSolo;
    @SerializedName("fastest_win_kit_basic_solo_armorsmith")
    @Expose
    private long fastestWinKitBasicSoloArmorsmith;
    @SerializedName("longest_bow_shot_solo")
    @Expose
    private long longestBowShotSolo;
    @SerializedName("longest_bow_shot_kit_basic_solo_armorsmith")
    @Expose
    private long longestBowShotKitBasicSoloArmorsmith;
    @SerializedName("arrows_hit_kit_basic_solo_armorsmith")
    @Expose
    private long arrowsHitKitBasicSoloArmorsmith;
    @SerializedName("arrows_hit_solo")
    @Expose
    private long arrowsHitSolo;
    @SerializedName("solo_lucky_charm")
    @Expose
    private long soloLuckyCharm;
    @SerializedName("longest_bow_shot_kit_mega_mega_knight")
    @Expose
    private long longestBowShotKitMegaMegaKnight;
    @SerializedName("fastest_win_kit_mega_mega_knight")
    @Expose
    private long fastestWinKitMegaMegaKnight;
    @SerializedName("fastest_win_mega")
    @Expose
    private long fastestWinMega;
    @SerializedName("longest_bow_shot_mega")
    @Expose
    private long longestBowShotMega;
    @SerializedName("melee_kills_kit_mega_mega_knight")
    @Expose
    private long meleeKillsKitMegaMegaKnight;
    @SerializedName("melee_kills_mega")
    @Expose
    private long meleeKillsMega;
    @SerializedName("mob_kills_kit_mega_mega_knight")
    @Expose
    private long mobKillsKitMegaMegaKnight;
    @SerializedName("arrows_shot_kit_mega_mega_knight")
    @Expose
    private long arrowsShotKitMegaMegaKnight;
    @SerializedName("arrows_shot_mega")
    @Expose
    private long arrowsShotMega;
    @SerializedName("most_kills_game_kit_mega_mega_knight")
    @Expose
    private long mostKillsGameKitMegaMegaKnight;
    @SerializedName("mob_kills")
    @Expose
    private long mobKills;
    @SerializedName("most_kills_game_mega")
    @Expose
    private long mostKillsGameMega;
    @SerializedName("mob_kills_mega")
    @Expose
    private long mobKillsMega;
    @SerializedName("time_played_kit_mega_mega_knight")
    @Expose
    private long timePlayedKitMegaMegaKnight;
    @SerializedName("arrows_hit_mega")
    @Expose
    private long arrowsHitMega;
    @SerializedName("arrows_hit_kit_mega_mega_knight")
    @Expose
    private long arrowsHitKitMegaMegaKnight;
    @SerializedName("time_played_mega")
    @Expose
    private long timePlayedMega;
    @SerializedName("solo_bridger")
    @Expose
    private long soloBridger;
    @SerializedName("team_lucky_charm")
    @Expose
    private long teamLuckyCharm;
    @SerializedName("mega_lucky_charm")
    @Expose
    private long megaLuckyCharm;
    @SerializedName("chests_opened_mega")
    @Expose
    private long chestsOpenedMega;
    @SerializedName("chests_opened_kit_mega_mega_knight")
    @Expose
    private long chestsOpenedKitMegaMegaKnight;
    @SerializedName("void_kills_kit_mega_mega_knight")
    @Expose
    private long voidKillsKitMegaMegaKnight;
    @SerializedName("void_kills_mega")
    @Expose
    private long voidKillsMega;
    @SerializedName("mega_bridger")
    @Expose
    private long megaBridger;
    @SerializedName("mob_kills_solo")
    @Expose
    private long mobKillsSolo;
    @SerializedName("mob_kills_kit_basic_solo_armorsmith")
    @Expose
    private long mobKillsKitBasicSoloArmorsmith;
    @SerializedName("team_bridger")
    @Expose
    private long teamBridger;
    @SerializedName("longest_bow_shot_team")
    @Expose
    private long longestBowShotTeam;
    @SerializedName("fastest_win_team")
    @Expose
    private long fastestWinTeam;
    @SerializedName("longest_bow_shot_kit_defending_team_armorer")
    @Expose
    private long longestBowShotKitDefendingTeamArmorer;
    @SerializedName("fastest_win_kit_defending_team_armorer")
    @Expose
    private long fastestWinKitDefendingTeamArmorer;
    @SerializedName("melee_kills_team")
    @Expose
    private long meleeKillsTeam;
    @SerializedName("chests_opened_team")
    @Expose
    private long chestsOpenedTeam;
    @SerializedName("chests_opened_kit_defending_team_armorer")
    @Expose
    private long chestsOpenedKitDefendingTeamArmorer;
    @SerializedName("void_kills_kit_defending_team_armorer")
    @Expose
    private long voidKillsKitDefendingTeamArmorer;
    @SerializedName("arrows_shot_team")
    @Expose
    private long arrowsShotTeam;
    @SerializedName("melee_kills_kit_defending_team_armorer")
    @Expose
    private long meleeKillsKitDefendingTeamArmorer;
    @SerializedName("time_played_kit_defending_team_armorer")
    @Expose
    private long timePlayedKitDefendingTeamArmorer;
    @SerializedName("arrows_hit_team")
    @Expose
    private long arrowsHitTeam;
    @SerializedName("most_kills_game_team")
    @Expose
    private long mostKillsGameTeam;
    @SerializedName("time_played_team")
    @Expose
    private long timePlayedTeam;
    @SerializedName("most_kills_game_kit_defending_team_armorer")
    @Expose
    private long mostKillsGameKitDefendingTeamArmorer;
    @SerializedName("arrows_hit_kit_defending_team_armorer")
    @Expose
    private long arrowsHitKitDefendingTeamArmorer;
    @SerializedName("void_kills_team")
    @Expose
    private long voidKillsTeam;
    @SerializedName("arrows_shot_kit_defending_team_armorer")
    @Expose
    private long arrowsShotKitDefendingTeamArmorer;
    @SerializedName("quickjoin_uses_Festive Tribute")
    @Expose
    private long quickjoinUsesFestiveTribute;
    @SerializedName("quickjoin_uses_Festive Shire")
    @Expose
    private long quickjoinUsesFestiveShire;
    @SerializedName("solo_fat")
    @Expose
    private long soloFat;
    @SerializedName("solo_environmental_expert")
    @Expose
    private long soloEnvironmentalExpert;
    @SerializedName("survived_players_kit_defending_team_frog")
    @Expose
    private long survivedPlayersKitDefendingTeamFrog;
    @SerializedName("time_played_kit_defending_team_frog")
    @Expose
    private long timePlayedKitDefendingTeamFrog;
    @SerializedName("deaths_kit_defending_team_frog")
    @Expose
    private long deathsKitDefendingTeamFrog;
    @SerializedName("losses_kit_defending_team_frog")
    @Expose
    private long lossesKitDefendingTeamFrog;
    @SerializedName("chests_opened_kit_defending_team_frog")
    @Expose
    private long chestsOpenedKitDefendingTeamFrog;
    @SerializedName("longest_bow_shot_kit_defending_team_frog")
    @Expose
    private long longestBowShotKitDefendingTeamFrog;
    @SerializedName("kills_kit_defending_team_frog")
    @Expose
    private long killsKitDefendingTeamFrog;
    @SerializedName("arrows_shot_kit_defending_team_frog")
    @Expose
    private long arrowsShotKitDefendingTeamFrog;
    @SerializedName("assists_kit_defending_team_frog")
    @Expose
    private long assistsKitDefendingTeamFrog;
    @SerializedName("melee_kills_kit_defending_team_frog")
    @Expose
    private long meleeKillsKitDefendingTeamFrog;
    @SerializedName("arrows_hit_kit_defending_team_frog")
    @Expose
    private long arrowsHitKitDefendingTeamFrog;
    @SerializedName("most_kills_game_kit_defending_team_frog")
    @Expose
    private long mostKillsGameKitDefendingTeamFrog;
    @SerializedName("fastest_win_kit_mining_team_cannoneer")
    @Expose
    private long fastestWinKitMiningTeamCannoneer;
    @SerializedName("time_played_kit_mining_team_cannoneer")
    @Expose
    private long timePlayedKitMiningTeamCannoneer;
    @SerializedName("longest_bow_shot_kit_mining_team_cannoneer")
    @Expose
    private long longestBowShotKitMiningTeamCannoneer;
    @SerializedName("most_kills_game_kit_mining_team_cannoneer")
    @Expose
    private long mostKillsGameKitMiningTeamCannoneer;
    @SerializedName("arrows_hit_kit_mining_team_cannoneer")
    @Expose
    private long arrowsHitKitMiningTeamCannoneer;
    @SerializedName("chests_opened_kit_mining_team_cannoneer")
    @Expose
    private long chestsOpenedKitMiningTeamCannoneer;
    @SerializedName("arrows_shot_kit_mining_team_cannoneer")
    @Expose
    private long arrowsShotKitMiningTeamCannoneer;
    @SerializedName("void_kills_kit_mining_team_cannoneer")
    @Expose
    private long voidKillsKitMiningTeamCannoneer;
    @SerializedName("melee_kills_kit_mining_team_cannoneer")
    @Expose
    private long meleeKillsKitMiningTeamCannoneer;
    @SerializedName("longest_bow_shot_kit_basic_solo_scout")
    @Expose
    private long longestBowShotKitBasicSoloScout;
    @SerializedName("kills_kit_basic_solo_scout")
    @Expose
    private long killsKitBasicSoloScout;
    @SerializedName("survived_players_kit_basic_solo_scout")
    @Expose
    private long survivedPlayersKitBasicSoloScout;
    @SerializedName("losses_kit_basic_solo_scout")
    @Expose
    private long lossesKitBasicSoloScout;
    @SerializedName("most_kills_game_kit_basic_solo_scout")
    @Expose
    private long mostKillsGameKitBasicSoloScout;
    @SerializedName("deaths_kit_basic_solo_scout")
    @Expose
    private long deathsKitBasicSoloScout;
    @SerializedName("melee_kills_kit_basic_solo_scout")
    @Expose
    private long meleeKillsKitBasicSoloScout;
    @SerializedName("time_played_kit_basic_solo_scout")
    @Expose
    private long timePlayedKitBasicSoloScout;
    @SerializedName("arrows_shot_kit_basic_solo_scout")
    @Expose
    private long arrowsShotKitBasicSoloScout;
    @SerializedName("arrows_hit_kit_basic_solo_scout")
    @Expose
    private long arrowsHitKitBasicSoloScout;
    @SerializedName("void_kills_kit_basic_solo_scout")
    @Expose
    private long voidKillsKitBasicSoloScout;
    @SerializedName("chests_opened_kit_basic_solo_scout")
    @Expose
    private long chestsOpenedKitBasicSoloScout;
    @SerializedName("fastest_win_kit_basic_solo_scout")
    @Expose
    private long fastestWinKitBasicSoloScout;
    @SerializedName("wins_kit_basic_solo_scout")
    @Expose
    private long winsKitBasicSoloScout;
    @SerializedName("winstreak_kit_basic_solo_scout")
    @Expose
    private long winstreakKitBasicSoloScout;
    @SerializedName("killstreak_kit_basic_solo_scout")
    @Expose
    private long killstreakKitBasicSoloScout;
    @SerializedName("games_kit_basic_solo_scout")
    @Expose
    private long gamesKitBasicSoloScout;
    @SerializedName("fastest_win_kit_defending_team_disco")
    @Expose
    private long fastestWinKitDefendingTeamDisco;
    @SerializedName("killstreak_kit_defending_team_disco")
    @Expose
    private long killstreakKitDefendingTeamDisco;
    @SerializedName("void_kills_kit_defending_team_disco")
    @Expose
    private long voidKillsKitDefendingTeamDisco;
    @SerializedName("winstreak_kit_defending_team_disco")
    @Expose
    private long winstreakKitDefendingTeamDisco;
    @SerializedName("assists_kit_defending_team_disco")
    @Expose
    private long assistsKitDefendingTeamDisco;
    @SerializedName("kills_kit_defending_team_disco")
    @Expose
    private long killsKitDefendingTeamDisco;
    @SerializedName("games_kit_defending_team_disco")
    @Expose
    private long gamesKitDefendingTeamDisco;
    @SerializedName("chests_opened_kit_defending_team_disco")
    @Expose
    private long chestsOpenedKitDefendingTeamDisco;
    @SerializedName("time_played_kit_defending_team_disco")
    @Expose
    private long timePlayedKitDefendingTeamDisco;
    @SerializedName("most_kills_game_kit_defending_team_disco")
    @Expose
    private long mostKillsGameKitDefendingTeamDisco;
    @SerializedName("survived_players_kit_defending_team_disco")
    @Expose
    private long survivedPlayersKitDefendingTeamDisco;
    @SerializedName("wins_kit_defending_team_disco")
    @Expose
    private long winsKitDefendingTeamDisco;
    @SerializedName("losses_kit_defending_team_disco")
    @Expose
    private long lossesKitDefendingTeamDisco;
    @SerializedName("deaths_kit_defending_team_disco")
    @Expose
    private long deathsKitDefendingTeamDisco;
    @SerializedName("longest_bow_shot_kit_defending_team_disco")
    @Expose
    private long longestBowShotKitDefendingTeamDisco;
    @SerializedName("arrows_shot_kit_defending_team_disco")
    @Expose
    private long arrowsShotKitDefendingTeamDisco;
    @SerializedName("melee_kills_kit_defending_team_disco")
    @Expose
    private long meleeKillsKitDefendingTeamDisco;
    @SerializedName("arrows_hit_kit_defending_team_disco")
    @Expose
    private long arrowsHitKitDefendingTeamDisco;
    @SerializedName("team_environmental_expert")
    @Expose
    private long teamEnvironmentalExpert;
    @SerializedName("deaths_kit_basic_solo_frog")
    @Expose
    private long deathsKitBasicSoloFrog;
    @SerializedName("survived_players_kit_basic_solo_frog")
    @Expose
    private long survivedPlayersKitBasicSoloFrog;
    @SerializedName("chests_opened_kit_basic_solo_frog")
    @Expose
    private long chestsOpenedKitBasicSoloFrog;
    @SerializedName("time_played_kit_basic_solo_frog")
    @Expose
    private long timePlayedKitBasicSoloFrog;
    @SerializedName("losses_kit_basic_solo_frog")
    @Expose
    private long lossesKitBasicSoloFrog;
    @SerializedName("fastest_win_kit_basic_solo_frog")
    @Expose
    private long fastestWinKitBasicSoloFrog;
    @SerializedName("winstreak_kit_basic_solo_frog")
    @Expose
    private long winstreakKitBasicSoloFrog;
    @SerializedName("games_kit_basic_solo_frog")
    @Expose
    private long gamesKitBasicSoloFrog;
    @SerializedName("most_kills_game_kit_basic_solo_frog")
    @Expose
    private long mostKillsGameKitBasicSoloFrog;
    @SerializedName("killstreak_kit_basic_solo_frog")
    @Expose
    private long killstreakKitBasicSoloFrog;
    @SerializedName("wins_kit_basic_solo_frog")
    @Expose
    private long winsKitBasicSoloFrog;
    @SerializedName("melee_kills_kit_basic_solo_frog")
    @Expose
    private long meleeKillsKitBasicSoloFrog;
    @SerializedName("kills_kit_basic_solo_frog")
    @Expose
    private long killsKitBasicSoloFrog;
    @SerializedName("void_kills_kit_basic_solo_frog")
    @Expose
    private long voidKillsKitBasicSoloFrog;
    @SerializedName("mega_environmental_expert")
    @Expose
    private long megaEnvironmentalExpert;
    @SerializedName("chests_opened_kit_supporting_team_enchanter")
    @Expose
    private long chestsOpenedKitSupportingTeamEnchanter;
    @SerializedName("survived_players_kit_supporting_team_enchanter")
    @Expose
    private long survivedPlayersKitSupportingTeamEnchanter;
    @SerializedName("deaths_kit_supporting_team_enchanter")
    @Expose
    private long deathsKitSupportingTeamEnchanter;
    @SerializedName("time_played_kit_supporting_team_enchanter")
    @Expose
    private long timePlayedKitSupportingTeamEnchanter;
    @SerializedName("losses_kit_supporting_team_enchanter")
    @Expose
    private long lossesKitSupportingTeamEnchanter;
    @SerializedName("fastest_win_kit_supporting_team_enchanter")
    @Expose
    private long fastestWinKitSupportingTeamEnchanter;
    @SerializedName("wins_kit_supporting_team_enchanter")
    @Expose
    private long winsKitSupportingTeamEnchanter;
    @SerializedName("assists_kit_supporting_team_enchanter")
    @Expose
    private long assistsKitSupportingTeamEnchanter;
    @SerializedName("kills_kit_supporting_team_enchanter")
    @Expose
    private long killsKitSupportingTeamEnchanter;
    @SerializedName("games_kit_supporting_team_enchanter")
    @Expose
    private long gamesKitSupportingTeamEnchanter;
    @SerializedName("melee_kills_kit_supporting_team_enchanter")
    @Expose
    private long meleeKillsKitSupportingTeamEnchanter;
    @SerializedName("killstreak_kit_supporting_team_enchanter")
    @Expose
    private long killstreakKitSupportingTeamEnchanter;
    @SerializedName("winstreak_kit_supporting_team_enchanter")
    @Expose
    private long winstreakKitSupportingTeamEnchanter;
    @SerializedName("most_kills_game_kit_supporting_team_enchanter")
    @Expose
    private long mostKillsGameKitSupportingTeamEnchanter;
    @SerializedName("void_kills_kit_supporting_team_enchanter")
    @Expose
    private long voidKillsKitSupportingTeamEnchanter;
    @SerializedName("mob_kills_kit_defending_team_armorer")
    @Expose
    private long mobKillsKitDefendingTeamArmorer;
    @SerializedName("mob_kills_team")
    @Expose
    private long mobKillsTeam;
    @SerializedName("melee_kills_kit_ranked_ranked_armorer")
    @Expose
    private long meleeKillsKitRankedRankedArmorer;
    @SerializedName("chests_opened_ranked")
    @Expose
    private long chestsOpenedRanked;
    @SerializedName("time_played_ranked")
    @Expose
    private long timePlayedRanked;
    @SerializedName("time_played_kit_ranked_ranked_armorer")
    @Expose
    private long timePlayedKitRankedRankedArmorer;
    @SerializedName("melee_kills_ranked")
    @Expose
    private long meleeKillsRanked;
    @SerializedName("chests_opened_kit_ranked_ranked_armorer")
    @Expose
    private long chestsOpenedKitRankedRankedArmorer;
    @SerializedName("most_kills_game_ranked")
    @Expose
    private long mostKillsGameRanked;
    @SerializedName("most_kills_game_kit_ranked_ranked_armorer")
    @Expose
    private long mostKillsGameKitRankedRankedArmorer;
    @SerializedName("fastest_win_kit_ranked_ranked_armorer")
    @Expose
    private long fastestWinKitRankedRankedArmorer;
    @SerializedName("fastest_win_ranked")
    @Expose
    private long fastestWinRanked;
    @SerializedName("void_kills_kit_ranked_ranked_armorer")
    @Expose
    private long voidKillsKitRankedRankedArmorer;
    @SerializedName("void_kills_ranked")
    @Expose
    private long voidKillsRanked;
    @SerializedName("longest_bow_shot_ranked")
    @Expose
    private long longestBowShotRanked;
    @SerializedName("longest_bow_shot_kit_ranked_ranked_armorer")
    @Expose
    private long longestBowShotKitRankedRankedArmorer;
    @SerializedName("arrows_hit_ranked")
    @Expose
    private long arrowsHitRanked;
    @SerializedName("arrows_hit_kit_ranked_ranked_armorer")
    @Expose
    private long arrowsHitKitRankedRankedArmorer;
    @SerializedName("arrows_shot_ranked")
    @Expose
    private long arrowsShotRanked;
    @SerializedName("arrows_shot_kit_ranked_ranked_armorer")
    @Expose
    private long arrowsShotKitRankedRankedArmorer;
    @SerializedName("chests_opened_kit_mega_mega_armorer")
    @Expose
    private long chestsOpenedKitMegaMegaArmorer;
    @SerializedName("time_played_kit_mega_mega_armorer")
    @Expose
    private long timePlayedKitMegaMegaArmorer;
    @SerializedName("fastest_win_kit_mega_mega_armorer")
    @Expose
    private long fastestWinKitMegaMegaArmorer;
    @SerializedName("melee_kills_kit_mega_mega_armorer")
    @Expose
    private long meleeKillsKitMegaMegaArmorer;
    @SerializedName("most_kills_game_kit_mega_mega_armorer")
    @Expose
    private long mostKillsGameKitMegaMegaArmorer;
    @SerializedName("kit_mega_mega_healer")
    @Expose
    private long kitMegaMegaHealer;
    @SerializedName("chests_opened_kit_mega_mega_healer")
    @Expose
    private long chestsOpenedKitMegaMegaHealer;
    @SerializedName("time_played_kit_mega_mega_healer")
    @Expose
    private long timePlayedKitMegaMegaHealer;
    @SerializedName("deaths_kit_mega_mega_healer")
    @Expose
    private long deathsKitMegaMegaHealer;
    @SerializedName("melee_kills_kit_mega_mega_healer")
    @Expose
    private long meleeKillsKitMegaMegaHealer;
    @SerializedName("most_kills_game_kit_mega_mega_healer")
    @Expose
    private long mostKillsGameKitMegaMegaHealer;
    @SerializedName("losses_kit_mega_mega_healer")
    @Expose
    private long lossesKitMegaMegaHealer;
    @SerializedName("kills_kit_mega_mega_healer")
    @Expose
    private long killsKitMegaMegaHealer;
    @SerializedName("void_kills_kit_mega_mega_healer")
    @Expose
    private long voidKillsKitMegaMegaHealer;
    @SerializedName("survived_players_kit_mega_mega_healer")
    @Expose
    private long survivedPlayersKitMegaMegaHealer;
    @SerializedName("longest_bow_shot_kit_mega_mega_healer")
    @Expose
    private long longestBowShotKitMegaMegaHealer;
    @SerializedName("arrows_shot_kit_mega_mega_healer")
    @Expose
    private long arrowsShotKitMegaMegaHealer;
    @SerializedName("arrows_hit_kit_mega_mega_healer")
    @Expose
    private long arrowsHitKitMegaMegaHealer;
    @SerializedName("fastest_win_kit_mega_mega_healer")
    @Expose
    private long fastestWinKitMegaMegaHealer;
    @SerializedName("assists_kit_mega_mega_healer")
    @Expose
    private long assistsKitMegaMegaHealer;
    @SerializedName("games_kit_mega_mega_healer")
    @Expose
    private long gamesKitMegaMegaHealer;
    @SerializedName("wins_kit_mega_mega_healer")
    @Expose
    private long winsKitMegaMegaHealer;
    @SerializedName("killstreak_kit_mega_mega_healer")
    @Expose
    private long killstreakKitMegaMegaHealer;
    @SerializedName("winstreak_kit_mega_mega_healer")
    @Expose
    private long winstreakKitMegaMegaHealer;
    @SerializedName("mob_kills_kit_mega_mega_healer")
    @Expose
    private long mobKillsKitMegaMegaHealer;
    @SerializedName("quickjoin_uses_Shire")
    @Expose
    private long quickjoinUsesShire;
    @SerializedName("assists_kit_basic_solo_scout")
    @Expose
    private long assistsKitBasicSoloScout;
    @SerializedName("time_played_kit_advanced_solo_cannoneer")
    @Expose
    private long timePlayedKitAdvancedSoloCannoneer;
    @SerializedName("chests_opened_kit_advanced_solo_cannoneer")
    @Expose
    private long chestsOpenedKitAdvancedSoloCannoneer;
    @SerializedName("most_kills_game_kit_advanced_solo_cannoneer")
    @Expose
    private long mostKillsGameKitAdvancedSoloCannoneer;
    @SerializedName("melee_kills_kit_advanced_solo_cannoneer")
    @Expose
    private long meleeKillsKitAdvancedSoloCannoneer;
    @SerializedName("fastest_win_kit_ranked_ranked_champion")
    @Expose
    private long fastestWinKitRankedRankedChampion;
    @SerializedName("chests_opened_kit_ranked_ranked_champion")
    @Expose
    private long chestsOpenedKitRankedRankedChampion;
    @SerializedName("most_kills_game_kit_ranked_ranked_champion")
    @Expose
    private long mostKillsGameKitRankedRankedChampion;
    @SerializedName("time_played_kit_ranked_ranked_champion")
    @Expose
    private long timePlayedKitRankedRankedChampion;
    @SerializedName("melee_kills_kit_ranked_ranked_champion")
    @Expose
    private long meleeKillsKitRankedRankedChampion;
    @SerializedName("mob_kills_kit_basic_solo_scout")
    @Expose
    private long mobKillsKitBasicSoloScout;
    @SerializedName("arrows_shot_kit_ranked_ranked_champion")
    @Expose
    private long arrowsShotKitRankedRankedChampion;
    @SerializedName("deaths_kit_ranked_ranked_scout")
    @Expose
    private long deathsKitRankedRankedScout;
    @SerializedName("games_kit_ranked_ranked_scout")
    @Expose
    private long gamesKitRankedRankedScout;
    @SerializedName("losses_kit_ranked_ranked_scout")
    @Expose
    private long lossesKitRankedRankedScout;
    @SerializedName("survived_players_kit_ranked_ranked_scout")
    @Expose
    private long survivedPlayersKitRankedRankedScout;
    @SerializedName("time_played_kit_ranked_ranked_scout")
    @Expose
    private long timePlayedKitRankedRankedScout;
    @SerializedName("chests_opened_kit_ranked_ranked_scout")
    @Expose
    private long chestsOpenedKitRankedRankedScout;
    @SerializedName("fastest_win_kit_ranked_ranked_scout")
    @Expose
    private long fastestWinKitRankedRankedScout;
    @SerializedName("most_kills_game_kit_ranked_ranked_scout")
    @Expose
    private long mostKillsGameKitRankedRankedScout;
    @SerializedName("void_kills_kit_ranked_ranked_scout")
    @Expose
    private long voidKillsKitRankedRankedScout;
    @SerializedName("winstreak_kit_ranked_ranked_scout")
    @Expose
    private long winstreakKitRankedRankedScout;
    @SerializedName("killstreak_kit_ranked_ranked_scout")
    @Expose
    private long killstreakKitRankedRankedScout;
    @SerializedName("kills_kit_ranked_ranked_scout")
    @Expose
    private long killsKitRankedRankedScout;
    @SerializedName("wins_kit_ranked_ranked_scout")
    @Expose
    private long winsKitRankedRankedScout;
    @SerializedName("melee_kills_kit_ranked_ranked_scout")
    @Expose
    private long meleeKillsKitRankedRankedScout;
    @SerializedName("longest_bow_shot_kit_ranked_ranked_scout")
    @Expose
    private long longestBowShotKitRankedRankedScout;
    @SerializedName("arrows_shot_kit_ranked_ranked_scout")
    @Expose
    private long arrowsShotKitRankedRankedScout;
    @SerializedName("arrows_hit_kit_ranked_ranked_scout")
    @Expose
    private long arrowsHitKitRankedRankedScout;
    @SerializedName("assists_kit_ranked_ranked_scout")
    @Expose
    private long assistsKitRankedRankedScout;
    @SerializedName("solo_annoy-o-mite")
    @Expose
    private long soloAnnoyOMite;
    @SerializedName("longest_bow_shot_kit_basic_solo_princess")
    @Expose
    private long longestBowShotKitBasicSoloPrincess;
    @SerializedName("losses_kit_basic_solo_princess")
    @Expose
    private long lossesKitBasicSoloPrincess;
    @SerializedName("arrows_shot_kit_basic_solo_princess")
    @Expose
    private long arrowsShotKitBasicSoloPrincess;
    @SerializedName("time_played_kit_basic_solo_princess")
    @Expose
    private long timePlayedKitBasicSoloPrincess;
    @SerializedName("survived_players_kit_basic_solo_princess")
    @Expose
    private long survivedPlayersKitBasicSoloPrincess;
    @SerializedName("chests_opened_kit_basic_solo_princess")
    @Expose
    private long chestsOpenedKitBasicSoloPrincess;
    @SerializedName("arrows_hit_kit_basic_solo_princess")
    @Expose
    private long arrowsHitKitBasicSoloPrincess;
    @SerializedName("deaths_kit_basic_solo_princess")
    @Expose
    private long deathsKitBasicSoloPrincess;
    @SerializedName("lastMode")
    @Expose
    private String lastMode;
    @SerializedName("fastest_win_kit_basic_solo_energix")
    @Expose
    private long fastestWinKitBasicSoloEnergix;
    @SerializedName("kills_kit_basic_solo_energix")
    @Expose
    private long killsKitBasicSoloEnergix;
    @SerializedName("most_kills_game_kit_basic_solo_energix")
    @Expose
    private long mostKillsGameKitBasicSoloEnergix;
    @SerializedName("chests_opened_kit_basic_solo_energix")
    @Expose
    private long chestsOpenedKitBasicSoloEnergix;
    @SerializedName("killstreak_kit_basic_solo_energix")
    @Expose
    private long killstreakKitBasicSoloEnergix;
    @SerializedName("time_played_kit_basic_solo_energix")
    @Expose
    private long timePlayedKitBasicSoloEnergix;
    @SerializedName("survived_players_kit_basic_solo_energix")
    @Expose
    private long survivedPlayersKitBasicSoloEnergix;
    @SerializedName("melee_kills_kit_basic_solo_energix")
    @Expose
    private long meleeKillsKitBasicSoloEnergix;
    @SerializedName("wins_kit_basic_solo_energix")
    @Expose
    private long winsKitBasicSoloEnergix;
    @SerializedName("games_kit_basic_solo_energix")
    @Expose
    private long gamesKitBasicSoloEnergix;
    @SerializedName("winstreak_kit_basic_solo_energix")
    @Expose
    private long winstreakKitBasicSoloEnergix;
    @SerializedName("games_played_skywars")
    @Expose
    private long gamesPlayedSkywars;
    @SerializedName("void_kills_kit_basic_solo_energix")
    @Expose
    private long voidKillsKitBasicSoloEnergix;
    @SerializedName("longest_bow_shot_kit_basic_solo_energix")
    @Expose
    private long longestBowShotKitBasicSoloEnergix;
    @SerializedName("arrows_shot_kit_basic_solo_energix")
    @Expose
    private long arrowsShotKitBasicSoloEnergix;
    @SerializedName("arrows_hit_kit_basic_solo_energix")
    @Expose
    private long arrowsHitKitBasicSoloEnergix;
    @SerializedName("deaths_kit_basic_solo_energix")
    @Expose
    private long deathsKitBasicSoloEnergix;
    @SerializedName("losses_kit_basic_solo_energix")
    @Expose
    private long lossesKitBasicSoloEnergix;
    @SerializedName("assists_kit_basic_solo_energix")
    @Expose
    private long assistsKitBasicSoloEnergix;
    @SerializedName("mob_kills_kit_basic_solo_energix")
    @Expose
    private long mobKillsKitBasicSoloEnergix;
    @SerializedName("longest_bow_shot_kit_basic_solo_default")
    @Expose
    private long longestBowShotKitBasicSoloDefault;
    @SerializedName("void_kills_kit_basic_solo_default")
    @Expose
    private long voidKillsKitBasicSoloDefault;
    @SerializedName("most_kills_game_kit_basic_solo_default")
    @Expose
    private long mostKillsGameKitBasicSoloDefault;
    @SerializedName("chests_opened_kit_basic_solo_default")
    @Expose
    private long chestsOpenedKitBasicSoloDefault;
    @SerializedName("arrows_shot_kit_basic_solo_default")
    @Expose
    private long arrowsShotKitBasicSoloDefault;
    @SerializedName("arrows_hit_kit_basic_solo_default")
    @Expose
    private long arrowsHitKitBasicSoloDefault;
    @SerializedName("deaths_kit_basic_solo_default")
    @Expose
    private long deathsKitBasicSoloDefault;
    @SerializedName("time_played_kit_basic_solo_default")
    @Expose
    private long timePlayedKitBasicSoloDefault;
    @SerializedName("melee_kills_kit_basic_solo_default")
    @Expose
    private long meleeKillsKitBasicSoloDefault;
    @SerializedName("losses_kit_basic_solo_default")
    @Expose
    private long lossesKitBasicSoloDefault;
    @SerializedName("assists_kit_basic_solo_default")
    @Expose
    private long assistsKitBasicSoloDefault;
    @SerializedName("votes_Aegis")
    @Expose
    private long votesAegis;
    @SerializedName("activeVictoryDance")
    @Expose
    private String activeVictoryDance;
    @SerializedName("mega_arrow_recovery")
    @Expose
    private long megaArrowRecovery;
    @SerializedName("fastest_win_kit_attacking_team_grenade")
    @Expose
    private long fastestWinKitAttackingTeamGrenade;
    @SerializedName("assists_kit_attacking_team_grenade")
    @Expose
    private long assistsKitAttackingTeamGrenade;
    @SerializedName("kills_kit_attacking_team_grenade")
    @Expose
    private long killsKitAttackingTeamGrenade;
    @SerializedName("wins_kit_attacking_team_grenade")
    @Expose
    private long winsKitAttackingTeamGrenade;
    @SerializedName("time_played_kit_attacking_team_grenade")
    @Expose
    private long timePlayedKitAttackingTeamGrenade;
    @SerializedName("most_kills_game_kit_attacking_team_grenade")
    @Expose
    private long mostKillsGameKitAttackingTeamGrenade;
    @SerializedName("winstreak_kit_attacking_team_grenade")
    @Expose
    private long winstreakKitAttackingTeamGrenade;
    @SerializedName("survived_players_kit_attacking_team_grenade")
    @Expose
    private long survivedPlayersKitAttackingTeamGrenade;
    @SerializedName("void_kills_kit_attacking_team_grenade")
    @Expose
    private long voidKillsKitAttackingTeamGrenade;
    @SerializedName("chests_opened_kit_attacking_team_grenade")
    @Expose
    private long chestsOpenedKitAttackingTeamGrenade;
    @SerializedName("killstreak_kit_attacking_team_grenade")
    @Expose
    private long killstreakKitAttackingTeamGrenade;
    @SerializedName("melee_kills_kit_attacking_team_grenade")
    @Expose
    private long meleeKillsKitAttackingTeamGrenade;
    @SerializedName("deaths_kit_attacking_team_grenade")
    @Expose
    private long deathsKitAttackingTeamGrenade;
    @SerializedName("void_kills_kit_defending_team_frog")
    @Expose
    private long voidKillsKitDefendingTeamFrog;
    @SerializedName("time_played_kit_attacking_team_snowman")
    @Expose
    private long timePlayedKitAttackingTeamSnowman;
    @SerializedName("chests_opened_kit_attacking_team_snowman")
    @Expose
    private long chestsOpenedKitAttackingTeamSnowman;
    @SerializedName("time_played_kit_basic_solo_fisherman")
    @Expose
    private long timePlayedKitBasicSoloFisherman;
    @SerializedName("survived_players_kit_basic_solo_fisherman")
    @Expose
    private long survivedPlayersKitBasicSoloFisherman;
    @SerializedName("chests_opened_kit_basic_solo_fisherman")
    @Expose
    private long chestsOpenedKitBasicSoloFisherman;
    @SerializedName("melee_kills_kit_basic_solo_fisherman")
    @Expose
    private long meleeKillsKitBasicSoloFisherman;
    @SerializedName("most_kills_game_kit_basic_solo_fisherman")
    @Expose
    private long mostKillsGameKitBasicSoloFisherman;
    @SerializedName("losses_kit_basic_solo_fisherman")
    @Expose
    private long lossesKitBasicSoloFisherman;
    @SerializedName("deaths_kit_basic_solo_fisherman")
    @Expose
    private long deathsKitBasicSoloFisherman;
    @SerializedName("void_kills_kit_basic_solo_fisherman")
    @Expose
    private long voidKillsKitBasicSoloFisherman;
    @SerializedName("kills_kit_basic_solo_fisherman")
    @Expose
    private long killsKitBasicSoloFisherman;
    @SerializedName("games_kit_basic_solo_fisherman")
    @Expose
    private long gamesKitBasicSoloFisherman;
    @SerializedName("longest_bow_shot_kit_basic_solo_fisherman")
    @Expose
    private long longestBowShotKitBasicSoloFisherman;
    @SerializedName("arrows_shot_kit_basic_solo_fisherman")
    @Expose
    private long arrowsShotKitBasicSoloFisherman;
    @SerializedName("arrows_hit_kit_basic_solo_fisherman")
    @Expose
    private long arrowsHitKitBasicSoloFisherman;
    @SerializedName("fastest_win_kit_basic_solo_fisherman")
    @Expose
    private long fastestWinKitBasicSoloFisherman;
    @SerializedName("wins_kit_basic_solo_fisherman")
    @Expose
    private long winsKitBasicSoloFisherman;
    @SerializedName("killstreak_kit_basic_solo_fisherman")
    @Expose
    private long killstreakKitBasicSoloFisherman;
    @SerializedName("winstreak_kit_basic_solo_fisherman")
    @Expose
    private long winstreakKitBasicSoloFisherman;
    @SerializedName("fastest_win_kit_defending_team_frog")
    @Expose
    private long fastestWinKitDefendingTeamFrog;
    @SerializedName("winstreak_kit_defending_team_frog")
    @Expose
    private long winstreakKitDefendingTeamFrog;
    @SerializedName("games_kit_defending_team_frog")
    @Expose
    private long gamesKitDefendingTeamFrog;
    @SerializedName("wins_kit_defending_team_frog")
    @Expose
    private long winsKitDefendingTeamFrog;
    @SerializedName("killstreak_kit_defending_team_frog")
    @Expose
    private long killstreakKitDefendingTeamFrog;
    @SerializedName("chests_opened_kit_advanced_solo_farmer")
    @Expose
    private long chestsOpenedKitAdvancedSoloFarmer;
    @SerializedName("most_kills_game_kit_advanced_solo_farmer")
    @Expose
    private long mostKillsGameKitAdvancedSoloFarmer;
    @SerializedName("time_played_kit_advanced_solo_farmer")
    @Expose
    private long timePlayedKitAdvancedSoloFarmer;
    @SerializedName("void_kills_kit_advanced_solo_farmer")
    @Expose
    private long voidKillsKitAdvancedSoloFarmer;
    @SerializedName("fastest_win_kit_advanced_solo_farmer")
    @Expose
    private long fastestWinKitAdvancedSoloFarmer;
    @SerializedName("longest_bow_shot_kit_advanced_solo_farmer")
    @Expose
    private long longestBowShotKitAdvancedSoloFarmer;
    @SerializedName("arrows_shot_kit_advanced_solo_farmer")
    @Expose
    private long arrowsShotKitAdvancedSoloFarmer;
    @SerializedName("melee_kills_kit_advanced_solo_farmer")
    @Expose
    private long meleeKillsKitAdvancedSoloFarmer;
    @SerializedName("killstreak_kit_advanced_solo_farmer")
    @Expose
    private long killstreakKitAdvancedSoloFarmer;
    @SerializedName("assists_kit_advanced_solo_farmer")
    @Expose
    private long assistsKitAdvancedSoloFarmer;
    @SerializedName("winstreak_kit_advanced_solo_farmer")
    @Expose
    private long winstreakKitAdvancedSoloFarmer;
    @SerializedName("arrows_hit_kit_advanced_solo_farmer")
    @Expose
    private long arrowsHitKitAdvancedSoloFarmer;
    @SerializedName("mob_kills_kit_defending_team_frog")
    @Expose
    private long mobKillsKitDefendingTeamFrog;
    @SerializedName("assists_kit_basic_solo_fisherman")
    @Expose
    private long assistsKitBasicSoloFisherman;
    @SerializedName("most_kills_game_kit_advanced_solo_knight")
    @Expose
    private long mostKillsGameKitAdvancedSoloKnight;
    @SerializedName("survived_players_kit_advanced_solo_knight")
    @Expose
    private long survivedPlayersKitAdvancedSoloKnight;
    @SerializedName("time_played_kit_advanced_solo_knight")
    @Expose
    private long timePlayedKitAdvancedSoloKnight;
    @SerializedName("kills_kit_advanced_solo_knight")
    @Expose
    private long killsKitAdvancedSoloKnight;
    @SerializedName("deaths_kit_advanced_solo_knight")
    @Expose
    private long deathsKitAdvancedSoloKnight;
    @SerializedName("melee_kills_kit_advanced_solo_knight")
    @Expose
    private long meleeKillsKitAdvancedSoloKnight;
    @SerializedName("losses_kit_advanced_solo_knight")
    @Expose
    private long lossesKitAdvancedSoloKnight;
    @SerializedName("void_kills_kit_advanced_solo_knight")
    @Expose
    private long voidKillsKitAdvancedSoloKnight;
    @SerializedName("time_played_kit_basic_solo_ecologist")
    @Expose
    private long timePlayedKitBasicSoloEcologist;
    @SerializedName("chests_opened_kit_basic_solo_ecologist")
    @Expose
    private long chestsOpenedKitBasicSoloEcologist;
    @SerializedName("void_kills_kit_basic_solo_ecologist")
    @Expose
    private long voidKillsKitBasicSoloEcologist;
    @SerializedName("most_kills_game_kit_basic_solo_ecologist")
    @Expose
    private long mostKillsGameKitBasicSoloEcologist;
    @SerializedName("melee_kills_kit_basic_solo_ecologist")
    @Expose
    private long meleeKillsKitBasicSoloEcologist;
    @SerializedName("fastest_win_kit_basic_solo_ecologist")
    @Expose
    private long fastestWinKitBasicSoloEcologist;
    @SerializedName("longest_bow_shot_kit_basic_solo_ecologist")
    @Expose
    private long longestBowShotKitBasicSoloEcologist;
    @SerializedName("arrows_shot_kit_basic_solo_ecologist")
    @Expose
    private long arrowsShotKitBasicSoloEcologist;
    @SerializedName("winstreak_kit_basic_solo_ecologist")
    @Expose
    private long winstreakKitBasicSoloEcologist;
    @SerializedName("killstreak_kit_basic_solo_ecologist")
    @Expose
    private long killstreakKitBasicSoloEcologist;
    @SerializedName("arrows_hit_kit_basic_solo_ecologist")
    @Expose
    private long arrowsHitKitBasicSoloEcologist;
    @SerializedName("time_played_kit_supporting_team_ecologist")
    @Expose
    private long timePlayedKitSupportingTeamEcologist;
    @SerializedName("blizzard_explained_last")
    @Expose
    private long blizzardExplainedLast;
    @SerializedName("blizzard_explained")
    @Expose
    private long blizzardExplained;
    @SerializedName("floor_is_lava_explained")
    @Expose
    private long floorIsLavaExplained;
    @SerializedName("floor_is_lava_explained_last")
    @Expose
    private long floorIsLavaExplainedLast;
    @SerializedName("kill_by_color_explained")
    @Expose
    private long killByColorExplained;
    @SerializedName("kill_by_color_explained_last")
    @Expose
    private long killByColorExplainedLast;
    @SerializedName("rush_explained")
    @Expose
    private long rushExplained;
    @SerializedName("rush_explained_last")
    @Expose
    private long rushExplainedLast;
    @SerializedName("tnt_madness_explained_last")
    @Expose
    private long tntMadnessExplainedLast;
    @SerializedName("tnt_madness_explained")
    @Expose
    private long tntMadnessExplained;

    @SerializedName("void_kills_kit_advanced_solo_pig-rider")
    @Expose
    private long voidKillsKitAdvancedSoloPigRider;
    @SerializedName("survived_players_kit_advanced_solo_pig-rider")
    @Expose
    private long survivedPlayersKitAdvancedSoloPigRider;
    @SerializedName("chests_opened_kit_advanced_solo_pig-rider")
    @Expose
    private long chestsOpenedKitAdvancedSoloPigRider;
    @SerializedName("losses_kit_advanced_solo_pig-rider")
    @Expose
    private long lossesKitAdvancedSoloPigRider;
    @SerializedName("most_kills_game_kit_advanced_solo_pig-rider")
    @Expose
    private long mostKillsGameKitAdvancedSoloPigRider;
    @SerializedName("melee_kills_kit_advanced_solo_pig-rider")
    @Expose
    private long meleeKillsKitAdvancedSoloPigRider;
    @SerializedName("time_played_kit_advanced_solo_pig-rider")
    @Expose
    private long timePlayedKitAdvancedSoloPigRider;
    @SerializedName("kills_kit_advanced_solo_pig-rider")
    @Expose
    private long killsKitAdvancedSoloPigRider;
    @SerializedName("deaths_kit_advanced_solo_pig-rider")
    @Expose
    private long deathsKitAdvancedSoloPigRider;
    @SerializedName("win_streak_lab")
    @Expose
    private long winStreakLab;
    @SerializedName("survived_players_lab_solo")
    @Expose
    private long survivedPlayersLabSolo;
    @SerializedName("chests_opened_lab_kit_advanced_solo_salmon")
    @Expose
    private long chestsOpenedLabKitAdvancedSoloSalmon;
    @SerializedName("void_kills_lab")
    @Expose
    private long voidKillsLab;
    @SerializedName("souls_gathered_lab")
    @Expose
    private long soulsGatheredLab;
    @SerializedName("blocks_broken_lab")
    @Expose
    private long blocksBrokenLab;
    @SerializedName("survived_players_lab")
    @Expose
    private long survivedPlayersLab;
    @SerializedName("coins_gained_lab")
    @Expose
    private long coinsGainedLab;
    @SerializedName("kills_lab")
    @Expose
    private long killsLab;
    @SerializedName("losses_lab_solo")
    @Expose
    private long lossesLabSolo;
    @SerializedName("blocks_placed_lab")
    @Expose
    private long blocksPlacedLab;
    @SerializedName("kills_lab_solo")
    @Expose
    private long killsLabSolo;
    @SerializedName("chests_opened_lab_solo")
    @Expose
    private long chestsOpenedLabSolo;
    @SerializedName("deaths_lab")
    @Expose
    private long deathsLab;
    @SerializedName("deaths_lab_solo")
    @Expose
    private long deathsLabSolo;
    @SerializedName("time_played_lab_solo")
    @Expose
    private long timePlayedLabSolo;
    @SerializedName("time_played_lab")
    @Expose
    private long timePlayedLab;
    @SerializedName("void_kills_lab_kit_advanced_solo_salmon")
    @Expose
    private long voidKillsLabKitAdvancedSoloSalmon;
    @SerializedName("survived_players_lab_kit_advanced_solo_salmon")
    @Expose
    private long survivedPlayersLabKitAdvancedSoloSalmon;
    @SerializedName("kills_lab_kit_advanced_solo_salmon")
    @Expose
    private long killsLabKitAdvancedSoloSalmon;
    @SerializedName("deaths_lab_kit_advanced_solo_salmon")
    @Expose
    private long deathsLabKitAdvancedSoloSalmon;
    @SerializedName("chests_opened_lab")
    @Expose
    private long chestsOpenedLab;
    @SerializedName("losses_lab_kit_advanced_solo_salmon")
    @Expose
    private long lossesLabKitAdvancedSoloSalmon;
    @SerializedName("losses_lab")
    @Expose
    private long lossesLab;
    @SerializedName("void_kills_lab_solo")
    @Expose
    private long voidKillsLabSolo;
    @SerializedName("quits_lab")
    @Expose
    private long quitsLab;
    @SerializedName("souls_lab")
    @Expose
    private long soulsLab;
    @SerializedName("time_played_lab_kit_advanced_solo_salmon")
    @Expose
    private long timePlayedLabKitAdvancedSoloSalmon;
    @SerializedName("killstreak_lab")
    @Expose
    private long killstreakLab;
    @SerializedName("wins_lab")
    @Expose
    private long winsLab;
    @SerializedName("killstreak_lab_kit_advanced_solo_salmon")
    @Expose
    private long killstreakLabKitAdvancedSoloSalmon;
    @SerializedName("games_lab")
    @Expose
    private long gamesLab;
    @SerializedName("wins_lab_kit_advanced_solo_salmon")
    @Expose
    private long winsLabKitAdvancedSoloSalmon;
    @SerializedName("melee_kills_lab_kit_advanced_solo_salmon")
    @Expose
    private long meleeKillsLabKitAdvancedSoloSalmon;
    @SerializedName("winstreak_lab")
    @Expose
    private long winstreakLab;
    @SerializedName("games_lab_solo")
    @Expose
    private long gamesLabSolo;
    @SerializedName("games_lab_kit_advanced_solo_salmon")
    @Expose
    private long gamesLabKitAdvancedSoloSalmon;
    @SerializedName("melee_kills_lab_solo")
    @Expose
    private long meleeKillsLabSolo;
    @SerializedName("winstreak_lab_solo")
    @Expose
    private long winstreakLabSolo;
    @SerializedName("winstreak_lab_kit_advanced_solo_salmon")
    @Expose
    private long winstreakLabKitAdvancedSoloSalmon;
    @SerializedName("killstreak_lab_solo")
    @Expose
    private long killstreakLabSolo;
    @SerializedName("wins_lab_solo")
    @Expose
    private long winsLabSolo;
    @SerializedName("melee_kills_lab")
    @Expose
    private long meleeKillsLab;
    @SerializedName("assists_lab_kit_advanced_solo_salmon")
    @Expose
    private long assistsLabKitAdvancedSoloSalmon;
    @SerializedName("arrows_shot_lab_solo")
    @Expose
    private long arrowsShotLabSolo;
    @SerializedName("assists_lab")
    @Expose
    private long assistsLab;
    @SerializedName("arrows_shot_lab_kit_advanced_solo_salmon")
    @Expose
    private long arrowsShotLabKitAdvancedSoloSalmon;
    @SerializedName("assists_lab_solo")
    @Expose
    private long assistsLabSolo;
    @SerializedName("arrows_shot_lab")
    @Expose
    private long arrowsShotLab;
    @SerializedName("enderpearls_thrown_lab")
    @Expose
    private long enderpearlsThrownLab;
    @SerializedName("egg_thrown_lab")
    @Expose
    private long eggThrownLab;
    @SerializedName("void_kills_kit_mega_mega_armorer")
    @Expose
    private long voidKillsKitMegaMegaArmorer;
    @SerializedName("longest_bow_shot_kit_mega_mega_armorer")
    @Expose
    private long longestBowShotKitMegaMegaArmorer;
    @SerializedName("arrows_hit_kit_mega_mega_armorer")
    @Expose
    private long arrowsHitKitMegaMegaArmorer;
    @SerializedName("arrows_shot_kit_mega_mega_armorer")
    @Expose
    private long arrowsShotKitMegaMegaArmorer;
    @SerializedName("mob_kills_kit_mega_mega_armorer")
    @Expose
    private long mobKillsKitMegaMegaArmorer;
    @SerializedName("fastest_win_lab_solo")
    @Expose
    private long fastestWinLabSolo;
    @SerializedName("fastest_win_lab")
    @Expose
    private long fastestWinLab;
    @SerializedName("fastest_win_lab_kit_advanced_solo_salmon")
    @Expose
    private long fastestWinLabKitAdvancedSoloSalmon;
    @SerializedName("arrows_hit_lab")
    @Expose
    private long arrowsHitLab;
    @SerializedName("arrows_hit_lab_solo")
    @Expose
    private long arrowsHitLabSolo;
    @SerializedName("solo_black_magic")
    @Expose
    private long soloBlackMagic;
    @SerializedName("mega_black_magic")
    @Expose
    private long megaBlackMagic;
    @SerializedName("chests_opened_kit_attacking_team_scout")
    @Expose
    private long chestsOpenedKitAttackingTeamScout;
    @SerializedName("melee_kills_kit_attacking_team_scout")
    @Expose
    private long meleeKillsKitAttackingTeamScout;
    @SerializedName("time_played_kit_attacking_team_scout")
    @Expose
    private long timePlayedKitAttackingTeamScout;
    @SerializedName("most_kills_game_kit_attacking_team_scout")
    @Expose
    private long mostKillsGameKitAttackingTeamScout;
    @SerializedName("void_kills_kit_attacking_team_scout")
    @Expose
    private long voidKillsKitAttackingTeamScout;
    @SerializedName("fastest_win_kit_attacking_team_scout")
    @Expose
    private long fastestWinKitAttackingTeamScout;
    @SerializedName("winstreak_lab_kit_basic_solo_scout")
    @Expose
    private long winstreakLabKitBasicSoloScout;
    @SerializedName("kills_lab_kit_basic_solo_scout")
    @Expose
    private long killsLabKitBasicSoloScout;
    @SerializedName("void_kills_lab_kit_basic_solo_scout")
    @Expose
    private long voidKillsLabKitBasicSoloScout;
    @SerializedName("games_lab_kit_basic_solo_scout")
    @Expose
    private long gamesLabKitBasicSoloScout;
    @SerializedName("time_played_lab_kit_basic_solo_scout")
    @Expose
    private long timePlayedLabKitBasicSoloScout;
    @SerializedName("survived_players_lab_kit_basic_solo_scout")
    @Expose
    private long survivedPlayersLabKitBasicSoloScout;
    @SerializedName("chests_opened_lab_kit_basic_solo_scout")
    @Expose
    private long chestsOpenedLabKitBasicSoloScout;
    @SerializedName("wins_lab_kit_basic_solo_scout")
    @Expose
    private long winsLabKitBasicSoloScout;
    @SerializedName("melee_kills_lab_kit_basic_solo_scout")
    @Expose
    private long meleeKillsLabKitBasicSoloScout;
    @SerializedName("killstreak_lab_kit_basic_solo_scout")
    @Expose
    private long killstreakLabKitBasicSoloScout;
    @SerializedName("deaths_lab_kit_basic_solo_scout")
    @Expose
    private long deathsLabKitBasicSoloScout;
    @SerializedName("losses_lab_kit_basic_solo_scout")
    @Expose
    private long lossesLabKitBasicSoloScout;
    @SerializedName("arrows_shot_lab_kit_basic_solo_scout")
    @Expose
    private long arrowsShotLabKitBasicSoloScout;
    @SerializedName("arrows_hit_lab_kit_basic_solo_scout")
    @Expose
    private long arrowsHitLabKitBasicSoloScout;
    @SerializedName("kit_mega_mega_scout")
    @Expose
    private long kitMegaMegaScout;
    @SerializedName("kills_kit_mega_mega_scout")
    @Expose
    private long killsKitMegaMegaScout;
    @SerializedName("deaths_kit_mega_mega_scout")
    @Expose
    private long deathsKitMegaMegaScout;
    @SerializedName("time_played_kit_mega_mega_scout")
    @Expose
    private long timePlayedKitMegaMegaScout;
    @SerializedName("most_kills_game_kit_mega_mega_scout")
    @Expose
    private long mostKillsGameKitMegaMegaScout;
    @SerializedName("survived_players_kit_mega_mega_scout")
    @Expose
    private long survivedPlayersKitMegaMegaScout;
    @SerializedName("melee_kills_kit_mega_mega_scout")
    @Expose
    private long meleeKillsKitMegaMegaScout;
    @SerializedName("void_kills_kit_mega_mega_scout")
    @Expose
    private long voidKillsKitMegaMegaScout;
    @SerializedName("chests_opened_kit_mega_mega_scout")
    @Expose
    private long chestsOpenedKitMegaMegaScout;
    @SerializedName("losses_kit_mega_mega_scout")
    @Expose
    private long lossesKitMegaMegaScout;
    @SerializedName("longest_bow_shot_kit_mega_mega_scout")
    @Expose
    private long longestBowShotKitMegaMegaScout;
    @SerializedName("assists_kit_mega_mega_scout")
    @Expose
    private long assistsKitMegaMegaScout;
    @SerializedName("arrows_hit_kit_mega_mega_scout")
    @Expose
    private long arrowsHitKitMegaMegaScout;
    @SerializedName("arrows_shot_kit_mega_mega_scout")
    @Expose
    private long arrowsShotKitMegaMegaScout;
    @SerializedName("fastest_win_kit_mega_mega_scout")
    @Expose
    private long fastestWinKitMegaMegaScout;
    @SerializedName("wins_kit_mega_mega_scout")
    @Expose
    private long winsKitMegaMegaScout;
    @SerializedName("killstreak_kit_mega_mega_scout")
    @Expose
    private long killstreakKitMegaMegaScout;
    @SerializedName("winstreak_kit_mega_mega_scout")
    @Expose
    private long winstreakKitMegaMegaScout;
    @SerializedName("void_kills_kit_ranked_ranked_champion")
    @Expose
    private long voidKillsKitRankedRankedChampion;
    @SerializedName("longest_bow_shot_kit_ranked_ranked_champion")
    @Expose
    private long longestBowShotKitRankedRankedChampion;
    @SerializedName("arrows_hit_kit_ranked_ranked_champion")
    @Expose
    private long arrowsHitKitRankedRankedChampion;
    @SerializedName("losses_kit_ranked_ranked_paladin")
    @Expose
    private long lossesKitRankedRankedPaladin;
    @SerializedName("chests_opened_kit_ranked_ranked_paladin")
    @Expose
    private long chestsOpenedKitRankedRankedPaladin;
    @SerializedName("deaths_kit_ranked_ranked_paladin")
    @Expose
    private long deathsKitRankedRankedPaladin;
    @SerializedName("time_played_kit_ranked_ranked_paladin")
    @Expose
    private long timePlayedKitRankedRankedPaladin;
    @SerializedName("survived_players_kit_ranked_ranked_paladin")
    @Expose
    private long survivedPlayersKitRankedRankedPaladin;
    @SerializedName("most_kills_game_kit_ranked_ranked_paladin")
    @Expose
    private long mostKillsGameKitRankedRankedPaladin;
    @SerializedName("kills_kit_ranked_ranked_paladin")
    @Expose
    private long killsKitRankedRankedPaladin;
    @SerializedName("void_kills_kit_ranked_ranked_paladin")
    @Expose
    private long voidKillsKitRankedRankedPaladin;
    @SerializedName("games_kit_ranked_ranked_paladin")
    @Expose
    private long gamesKitRankedRankedPaladin;
    @SerializedName("melee_kills_kit_ranked_ranked_paladin")
    @Expose
    private long meleeKillsKitRankedRankedPaladin;
    @SerializedName("fastest_win_kit_ranked_ranked_paladin")
    @Expose
    private long fastestWinKitRankedRankedPaladin;
    @SerializedName("winstreak_kit_ranked_ranked_paladin")
    @Expose
    private long winstreakKitRankedRankedPaladin;
    @SerializedName("wins_kit_ranked_ranked_paladin")
    @Expose
    private long winsKitRankedRankedPaladin;
    @SerializedName("killstreak_kit_ranked_ranked_paladin")
    @Expose
    private long killstreakKitRankedRankedPaladin;
    @SerializedName("slime_explained_last")
    @Expose
    private long slimeExplainedLast;
    @SerializedName("slime_explained")
    @Expose
    private long slimeExplained;
    @SerializedName("quickjoin_uses_Clearing")
    @Expose
    private long quickjoinUsesClearing;
    @SerializedName("longest_bow_shot_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long longestBowShotKitBlacksmithRankedBlacksmith;
    @SerializedName("fastest_win_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long fastestWinKitBlacksmithRankedBlacksmith;
    @SerializedName("games_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long gamesKitBlacksmithRankedBlacksmith;
    @SerializedName("most_kills_game_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long mostKillsGameKitBlacksmithRankedBlacksmith;
    @SerializedName("melee_kills_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long meleeKillsKitBlacksmithRankedBlacksmith;
    @SerializedName("arrows_shot_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long arrowsShotKitBlacksmithRankedBlacksmith;
    @SerializedName("killstreak_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long killstreakKitBlacksmithRankedBlacksmith;
    @SerializedName("survived_players_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long survivedPlayersKitBlacksmithRankedBlacksmith;
    @SerializedName("wins_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long winsKitBlacksmithRankedBlacksmith;
    @SerializedName("time_played_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long timePlayedKitBlacksmithRankedBlacksmith;
    @SerializedName("arrows_hit_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long arrowsHitKitBlacksmithRankedBlacksmith;
    @SerializedName("winstreak_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long winstreakKitBlacksmithRankedBlacksmith;
    @SerializedName("kills_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long killsKitBlacksmithRankedBlacksmith;
    @SerializedName("chests_opened_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long chestsOpenedKitBlacksmithRankedBlacksmith;
    @SerializedName("losses_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long lossesKitBlacksmithRankedBlacksmith;
    @SerializedName("deaths_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long deathsKitBlacksmithRankedBlacksmith;
    @SerializedName("assists_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long assistsKitBlacksmithRankedBlacksmith;
    @SerializedName("void_kills_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long voidKillsKitBlacksmithRankedBlacksmith;
    @SerializedName("activeDeathCry")
    @Expose
    private String activeDeathCry;
    @SerializedName("team_black_magic")
    @Expose
    private long teamBlackMagic;
    @SerializedName("chests_opened_lab_team")
    @Expose
    private long chestsOpenedLabTeam;
    @SerializedName("survived_players_lab_team")
    @Expose
    private long survivedPlayersLabTeam;
    @SerializedName("time_played_lab_team")
    @Expose
    private long timePlayedLabTeam;
    @SerializedName("chests_opened_lab_kit_defending_team_armorer")
    @Expose
    private long chestsOpenedLabKitDefendingTeamArmorer;
    @SerializedName("losses_lab_kit_defending_team_armorer")
    @Expose
    private long lossesLabKitDefendingTeamArmorer;
    @SerializedName("losses_lab_team")
    @Expose
    private long lossesLabTeam;
    @SerializedName("deaths_lab_kit_defending_team_armorer")
    @Expose
    private long deathsLabKitDefendingTeamArmorer;
    @SerializedName("survived_players_lab_kit_defending_team_armorer")
    @Expose
    private long survivedPlayersLabKitDefendingTeamArmorer;
    @SerializedName("deaths_lab_team")
    @Expose
    private long deathsLabTeam;
    @SerializedName("time_played_lab_kit_defending_team_armorer")
    @Expose
    private long timePlayedLabKitDefendingTeamArmorer;
    @SerializedName("arrows_hit_lab_team")
    @Expose
    private long arrowsHitLabTeam;
    @SerializedName("arrows_shot_lab_team")
    @Expose
    private long arrowsShotLabTeam;
    @SerializedName("arrows_hit_lab_kit_defending_team_armorer")
    @Expose
    private long arrowsHitLabKitDefendingTeamArmorer;
    @SerializedName("arrows_shot_lab_kit_defending_team_armorer")
    @Expose
    private long arrowsShotLabKitDefendingTeamArmorer;
    @SerializedName("melee_kills_lab_team")
    @Expose
    private long meleeKillsLabTeam;
    @SerializedName("kills_lab_team")
    @Expose
    private long killsLabTeam;
    @SerializedName("void_kills_lab_kit_defending_team_armorer")
    @Expose
    private long voidKillsLabKitDefendingTeamArmorer;
    @SerializedName("kills_lab_kit_defending_team_armorer")
    @Expose
    private long killsLabKitDefendingTeamArmorer;
    @SerializedName("melee_kills_lab_kit_defending_team_armorer")
    @Expose
    private long meleeKillsLabKitDefendingTeamArmorer;
    @SerializedName("void_kills_lab_team")
    @Expose
    private long voidKillsLabTeam;
    @SerializedName("games_kit_mega_mega_scout")
    @Expose
    private long gamesKitMegaMegaScout;
    @SerializedName("lab_win_rush_lab_solo")
    @Expose
    private long labWinRushLabSolo;
    @SerializedName("lab_win_rush_lab")
    @Expose
    private long labWinRushLab;
    @SerializedName("lab_win_rush_lab_kit_basic_solo_scout")
    @Expose
    private long labWinRushLabKitBasicSoloScout;
    @SerializedName("deaths_kit_ranked_ranked_healer")
    @Expose
    private long deathsKitRankedRankedHealer;
    @SerializedName("survived_players_kit_ranked_ranked_healer")
    @Expose
    private long survivedPlayersKitRankedRankedHealer;
    @SerializedName("losses_kit_ranked_ranked_healer")
    @Expose
    private long lossesKitRankedRankedHealer;
    @SerializedName("time_played_kit_ranked_ranked_healer")
    @Expose
    private long timePlayedKitRankedRankedHealer;
    @SerializedName("chests_opened_kit_ranked_ranked_healer")
    @Expose
    private long chestsOpenedKitRankedRankedHealer;
    @SerializedName("kit_advanced_solo_armorer_inventory_auto_equip_armor")
    @Expose
    private boolean kitAdvancedSoloArmorerInventoryAutoEquipArmor;

    @SerializedName("losses_kit_advanced_solo_armorer")
    @Expose
    private long lossesKitAdvancedSoloArmorer;
    @SerializedName("chests_opened_kit_advanced_solo_armorer")
    @Expose
    private long chestsOpenedKitAdvancedSoloArmorer;
    @SerializedName("survived_players_kit_advanced_solo_armorer")
    @Expose
    private long survivedPlayersKitAdvancedSoloArmorer;
    @SerializedName("time_played_kit_advanced_solo_armorer")
    @Expose
    private long timePlayedKitAdvancedSoloArmorer;
    @SerializedName("deaths_kit_advanced_solo_armorer")
    @Expose
    private long deathsKitAdvancedSoloArmorer;
    @SerializedName("longest_bow_shot_kit_advanced_solo_armorer")
    @Expose
    private long longestBowShotKitAdvancedSoloArmorer;
    @SerializedName("arrows_hit_kit_advanced_solo_armorer")
    @Expose
    private long arrowsHitKitAdvancedSoloArmorer;
    @SerializedName("kills_kit_advanced_solo_armorer")
    @Expose
    private long killsKitAdvancedSoloArmorer;
    @SerializedName("most_kills_game_kit_advanced_solo_armorer")
    @Expose
    private long mostKillsGameKitAdvancedSoloArmorer;
    @SerializedName("melee_kills_kit_advanced_solo_armorer")
    @Expose
    private long meleeKillsKitAdvancedSoloArmorer;
    @SerializedName("arrows_shot_kit_advanced_solo_armorer")
    @Expose
    private long arrowsShotKitAdvancedSoloArmorer;
    @SerializedName("void_kills_kit_advanced_solo_armorer")
    @Expose
    private long voidKillsKitAdvancedSoloArmorer;
    @SerializedName("fastest_win_kit_advanced_solo_armorer")
    @Expose
    private long fastestWinKitAdvancedSoloArmorer;
    @SerializedName("winstreak_kit_advanced_solo_armorer")
    @Expose
    private long winstreakKitAdvancedSoloArmorer;
    @SerializedName("killstreak_kit_advanced_solo_armorer")
    @Expose
    private long killstreakKitAdvancedSoloArmorer;
    @SerializedName("wins_kit_advanced_solo_armorer")
    @Expose
    private long winsKitAdvancedSoloArmorer;
    @SerializedName("games_kit_advanced_solo_armorer")
    @Expose
    private long gamesKitAdvancedSoloArmorer;
    @SerializedName("assists_kit_advanced_solo_armorer")
    @Expose
    private long assistsKitAdvancedSoloArmorer;
    @SerializedName("team_necromancer")
    @Expose
    private long teamNecromancer;
    @SerializedName("mob_kills_kit_mega_mega_scout")
    @Expose
    private long mobKillsKitMegaMegaScout;
    @SerializedName("mob_kills_kit_advanced_solo_armorer")
    @Expose
    private long mobKillsKitAdvancedSoloArmorer;
    @SerializedName("solo_necromancer")
    @Expose
    private long soloNecromancer;
    @SerializedName("mega_necromancer")
    @Expose
    private long megaNecromancer;
    @SerializedName("quickjoin_uses_HalloweenTribute")
    @Expose
    private long quickjoinUsesHalloweenTribute;
    @SerializedName("quickjoin_uses_LongIsland")
    @Expose
    private long quickjoinUsesLongIsland;
    @SerializedName("quickjoin_uses_HalloweenMemorial")
    @Expose
    private long quickjoinUsesHalloweenMemorial;
    @SerializedName("quickjoin_uses_HalloweenShire")
    @Expose
    private long quickjoinUsesHalloweenShire;
    @SerializedName("games_lab_team")
    @Expose
    private long gamesLabTeam;
    @SerializedName("games_lab_kit_defending_team_armorer")
    @Expose
    private long gamesLabKitDefendingTeamArmorer;
    @SerializedName("wins_lab_kit_defending_team_armorer")
    @Expose
    private long winsLabKitDefendingTeamArmorer;
    @SerializedName("lab_win_tnt_madness_lab_kit_defending_team_armorer")
    @Expose
    private long labWinTntMadnessLabKitDefendingTeamArmorer;
    @SerializedName("lab_win_tnt_madness_lab_team")
    @Expose
    private long labWinTntMadnessLabTeam;
    @SerializedName("winstreak_lab_team")
    @Expose
    private long winstreakLabTeam;
    @SerializedName("winstreak_lab_kit_defending_team_armorer")
    @Expose
    private long winstreakLabKitDefendingTeamArmorer;
    @SerializedName("killstreak_lab_kit_defending_team_armorer")
    @Expose
    private long killstreakLabKitDefendingTeamArmorer;
    @SerializedName("killstreak_lab_team")
    @Expose
    private long killstreakLabTeam;
    @SerializedName("wins_lab_team")
    @Expose
    private long winsLabTeam;
    @SerializedName("lab_win_tnt_madness_lab")
    @Expose
    private long labWinTntMadnessLab;
    @SerializedName("assists_lab_kit_defending_team_armorer")
    @Expose
    private long assistsLabKitDefendingTeamArmorer;
    @SerializedName("assists_lab_team")
    @Expose
    private long assistsLabTeam;
    @SerializedName("quickjoin_uses_Palette")
    @Expose
    private long quickjoinUsesPalette;
    @SerializedName("quickjoin_uses_Nomad")
    @Expose
    private long quickjoinUsesNomad;
    @SerializedName("quickjoin_uses_Desserted Islands")
    @Expose
    private long quickjoinUsesDessertedIslands;
    @SerializedName("longest_bow_kill")
    @Expose
    private long longestBowKill;
    @SerializedName("longest_bow_kill_kit_advanced_solo_armorer")
    @Expose
    private long longestBowKillKitAdvancedSoloArmorer;
    @SerializedName("longest_bow_kill_solo")
    @Expose
    private long longestBowKillSolo;
    @SerializedName("longest_bow_kill_kit_basic_solo_scout")
    @Expose
    private long longestBowKillKitBasicSoloScout;
    @SerializedName("longest_bow_kill_kit_defending_team_armorer")
    @Expose
    private long longestBowKillKitDefendingTeamArmorer;
    @SerializedName("longest_bow_kill_team")
    @Expose
    private long longestBowKillTeam;
    @SerializedName("longest_bow_kill_kit_ranked_ranked_scout")
    @Expose
    private long longestBowKillKitRankedRankedScout;
    @SerializedName("longest_bow_kill_ranked")
    @Expose
    private long longestBowKillRanked;
    @SerializedName("inGamePresentsCap_2017_1")
    @Expose
    private long inGamePresentsCap20171;
    @SerializedName("inGamePresentsCap_2017_2")
    @Expose
    private long inGamePresentsCap20172;
    @SerializedName("inGamePresentsCap_2017_3")
    @Expose
    private long inGamePresentsCap20173;
    @SerializedName("inGamePresentsCap_2017_5")
    @Expose
    private long inGamePresentsCap20175;
    @SerializedName("longest_bow_kill_kit_supporting_team_ecologist")
    @Expose
    private long longestBowKillKitSupportingTeamEcologist;
    @SerializedName("most_kills_game_kit_supporting_team_ecologist")
    @Expose
    private long mostKillsGameKitSupportingTeamEcologist;
    @SerializedName("melee_kills_kit_supporting_team_ecologist")
    @Expose
    private long meleeKillsKitSupportingTeamEcologist;
    @SerializedName("chests_opened_kit_supporting_team_ecologist")
    @Expose
    private long chestsOpenedKitSupportingTeamEcologist;
    @SerializedName("inGamePresentsCap_2017_7")
    @Expose
    private long inGamePresentsCap20177;
    @SerializedName("inGamePresentsCap_2017_10")
    @Expose
    private long inGamePresentsCap201710;
    @SerializedName("inGamePresentsCap_2017_11")
    @Expose
    private long inGamePresentsCap201711;
    @SerializedName("longest_bow_kill_kit_basic_solo_armorsmith")
    @Expose
    private long longestBowKillKitBasicSoloArmorsmith;
    @SerializedName("inGamePresentsCap_2017_12")
    @Expose
    private long inGamePresentsCap201712;
    @SerializedName("kit_mega_mega_armorsmith")
    @Expose
    private long kitMegaMegaArmorsmith;
    @SerializedName("kit_mega_mega_cannoneer")
    @Expose
    private long kitMegaMegaCannoneer;
    @SerializedName("kit_mega_mega_hunter")
    @Expose
    private long kitMegaMegaHunter;
    @SerializedName("kit_mega_mega_paladin")
    @Expose
    private long kitMegaMegaPaladin;
    @SerializedName("kit_mega_mega_skeletor")
    @Expose
    private long kitMegaMegaSkeletor;
    @SerializedName("kit_mega_mega_witch")
    @Expose
    private long kitMegaMegaWitch;
    @SerializedName("kit_mega_mega_hellhound")
    @Expose
    private long kitMegaMegaHellhound;
    @SerializedName("kit_mega_mega_fisherman")
    @Expose
    private long kitMegaMegaFisherman;
    @SerializedName("kit_mega_mega_pyromaniac")
    @Expose
    private long kitMegaMegaPyromaniac;
    @SerializedName("inGamePresentsCap_2017_14")
    @Expose
    private long inGamePresentsCap201714;
    @SerializedName("inGamePresentsCap_2017_15")
    @Expose
    private long inGamePresentsCap201715;
    @SerializedName("inGamePresentsCap_2017_16")
    @Expose
    private long inGamePresentsCap201716;
    @SerializedName("inGamePresentsCap_2017_17")
    @Expose
    private long inGamePresentsCap201717;
    @SerializedName("inGamePresentsCap_2017_19")
    @Expose
    private long inGamePresentsCap201719;
    @SerializedName("inGamePresentsCap_2017_20")
    @Expose
    private long inGamePresentsCap201720;
    @SerializedName("longest_bow_kill_kit_mega_mega_knight")
    @Expose
    private long longestBowKillKitMegaMegaKnight;
    @SerializedName("longest_bow_kill_mega")
    @Expose
    private long longestBowKillMega;
    @SerializedName("inGamePresentsCap_2017_21")
    @Expose
    private long inGamePresentsCap201721;
    @SerializedName("inGamePresentsCap_2017_23")
    @Expose
    private long inGamePresentsCap201723;
    @SerializedName("inGamePresentsCap_2017_24")
    @Expose
    private long inGamePresentsCap201724;
    @SerializedName("inGamePresentsCap_2017_25")
    @Expose
    private long inGamePresentsCap201725;
    @SerializedName("inGamePresentsCap_2017_27")
    @Expose
    private long inGamePresentsCap201727;
    @SerializedName("quickjoin_uses_Submerged")
    @Expose
    private long quickjoinUsesSubmerged;
    @SerializedName("inGamePresentsCap_2017_28")
    @Expose
    private long inGamePresentsCap201728;
    @SerializedName("inGamePresentsCap_2017_29")
    @Expose
    private long inGamePresentsCap201729;
    @SerializedName("inGamePresentsCap_2017_30")
    @Expose
    private long inGamePresentsCap201730;
    @SerializedName("inGamePresentsCap_2017_31")
    @Expose
    private long inGamePresentsCap201731;
    @SerializedName("inGamePresentsCap_2018_1")
    @Expose
    private long inGamePresentsCap20181;
    @SerializedName("quickjoin_uses_Strata")
    @Expose
    private long quickjoinUsesStrata;
    @SerializedName("inGamePresentsCap_2018_6")
    @Expose
    private long inGamePresentsCap20186;
    @SerializedName("inGamePresentsCap_2018_7")
    @Expose
    private long inGamePresentsCap20187;
    @SerializedName("longest_bow_kill_kit_basic_solo_ecologist")
    @Expose
    private long longestBowKillKitBasicSoloEcologist;
    @SerializedName("skywars_chests")
    @Expose
    private long skywarsChests;
    @SerializedName("SkyWars_openedChests")
    @Expose
    private long skyWarsOpenedChests;
    @SerializedName("SkyWars_openedCommons")
    @Expose
    private long skyWarsOpenedCommons;
    @SerializedName("cosmetic_tokens")
    @Expose
    private long cosmeticTokens;
    @SerializedName("skywars_chest_history")
    @Expose
    private List<String> skywarsChestHistory = null;
    @SerializedName("SkyWars_openedRares")
    @Expose
    private long skyWarsOpenedRares;
    @SerializedName("SkyWars_openedLegendaries")
    @Expose
    private long skyWarsOpenedLegendaries;
    @SerializedName("SkyWars_openedEpics")
    @Expose
    private long skyWarsOpenedEpics;
    @SerializedName("active_balloon")
    @Expose
    private String activeBalloon;
    @SerializedName("active_deathcry")
    @Expose
    private String activeDeathcry;
    @SerializedName("active_victorydance")
    @Expose
    private String activeVictorydance;
    @SerializedName("active_killeffect")
    @Expose
    private String activeKilleffect;
    @SerializedName("active_killmessages")
    @Expose
    private String activeKillmessages;
    @SerializedName("active_sprays")
    @Expose
    private String activeSprays;
    @SerializedName("active_cage")
    @Expose
    private String activeCage;
    @SerializedName("active_projectiletrail")
    @Expose
    private String activeProjectiletrail;
    @SerializedName("lucky_explained")
    @Expose
    private long luckyExplained;
    @SerializedName("lucky_explained_last")
    @Expose
    private long luckyExplainedLast;
    @SerializedName("losses_lab_kit_advanced_solo_armorer")
    @Expose
    private long lossesLabKitAdvancedSoloArmorer;
    @SerializedName("survived_players_lab_kit_advanced_solo_armorer")
    @Expose
    private long survivedPlayersLabKitAdvancedSoloArmorer;
    @SerializedName("deaths_lab_kit_advanced_solo_armorer")
    @Expose
    private long deathsLabKitAdvancedSoloArmorer;
    @SerializedName("kills_lab_kit_advanced_solo_armorer")
    @Expose
    private long killsLabKitAdvancedSoloArmorer;
    @SerializedName("chests_opened_lab_kit_advanced_solo_armorer")
    @Expose
    private long chestsOpenedLabKitAdvancedSoloArmorer;
    @SerializedName("void_kills_lab_kit_advanced_solo_armorer")
    @Expose
    private long voidKillsLabKitAdvancedSoloArmorer;
    @SerializedName("time_played_lab_kit_advanced_solo_armorer")
    @Expose
    private long timePlayedLabKitAdvancedSoloArmorer;
    @SerializedName("freeLootChestNpc")
    @Expose
    private long freeLootChestNpc;
    @SerializedName("quickjoin_uses_Villa")
    @Expose
    private long quickjoinUsesVilla;
    @SerializedName("quickjoin_uses_Firelink Shrine")
    @Expose
    private long quickjoinUsesFirelinkShrine;
    @SerializedName("longest_bow_kill_kit_blacksmith_ranked_blacksmith")
    @Expose
    private long longestBowKillKitBlacksmithRankedBlacksmith;
    @SerializedName("longest_bow_kill_kit_ranked_ranked_champion")
    @Expose
    private long longestBowKillKitRankedRankedChampion;
    @SerializedName("arrows_shot_lab_kit_advanced_solo_armorer")
    @Expose
    private long arrowsShotLabKitAdvancedSoloArmorer;
    @SerializedName("melee_kills_lab_kit_advanced_solo_armorer")
    @Expose
    private long meleeKillsLabKitAdvancedSoloArmorer;
    @SerializedName("arrows_hit_lab_kit_advanced_solo_armorer")
    @Expose
    private long arrowsHitLabKitAdvancedSoloArmorer;
    @SerializedName("assists_lab_kit_basic_solo_scout")
    @Expose
    private long assistsLabKitBasicSoloScout;

}
