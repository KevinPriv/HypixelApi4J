package me.kbrewster.hypixelapi.player.stats.skyclash;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class SkyClash {
    @SerializedName("active_class")
    @Expose
    private long activeClass;
    @SerializedName("fastest_win_doubles")
    @Expose
    private long fastestWinDoubles;
    @SerializedName("fastest_win_doubles_kit_swordsman")
    @Expose
    private long fastestWinDoublesKitSwordsman;
    @SerializedName("longest_bow_shot_kit_swordsman")
    @Expose
    private long longestBowShotKitSwordsman;
    @SerializedName("longest_bow_kill")
    @Expose
    private long longestBowKill;
    @SerializedName("win_streak")
    @Expose
    private long winStreak;
    @SerializedName("longest_bow_shot")
    @Expose
    private long longestBowShot;
    @SerializedName("longest_bow_kill_kit_swordsman")
    @Expose
    private long longestBowKillKitSwordsman;
    @SerializedName("bow_shots_kit_swordsman")
    @Expose
    private long bowShotsKitSwordsman;
    @SerializedName("bow_kills")
    @Expose
    private long bowKills;
    @SerializedName("assists_kit_swordsman")
    @Expose
    private long assistsKitSwordsman;
    @SerializedName("doubles_wins")
    @Expose
    private long doublesWins;
    @SerializedName("kills")
    @Expose
    private long kills;
    @SerializedName("kills_kit_swordsman")
    @Expose
    private long killsKitSwordsman;
    @SerializedName("games_played")
    @Expose
    private long gamesPlayed;
    @SerializedName("wins_doubles")
    @Expose
    private long winsDoubles;
    @SerializedName("bow_hits_kit_swordsman")
    @Expose
    private long bowHitsKitSwordsman;
    @SerializedName("bow_shots")
    @Expose
    private long bowShots;
    @SerializedName("bow_kills_kit_swordsman")
    @Expose
    private long bowKillsKitSwordsman;
    @SerializedName("most_kills_game_kit_swordsman")
    @Expose
    private long mostKillsGameKitSwordsman;
    @SerializedName("void_kills")
    @Expose
    private long voidKills;
    @SerializedName("kills_doubles")
    @Expose
    private long killsDoubles;
    @SerializedName("bow_hits")
    @Expose
    private long bowHits;
    @SerializedName("games")
    @Expose
    private long games;
    @SerializedName("assists")
    @Expose
    private long assists;
    @SerializedName("most_kills_game")
    @Expose
    private long mostKillsGame;
    @SerializedName("wins")
    @Expose
    private long wins;
    @SerializedName("melee_kills")
    @Expose
    private long meleeKills;
    @SerializedName("void_kills_kit_swordsman")
    @Expose
    private long voidKillsKitSwordsman;
    @SerializedName("kills_monthly_b")
    @Expose
    private long killsMonthlyB;
    @SerializedName("games_played_kit_swordsman")
    @Expose
    private long gamesPlayedKitSwordsman;
    @SerializedName("coins")
    @Expose
    private long coins;
    @SerializedName("melee_kills_kit_swordsman")
    @Expose
    private long meleeKillsKitSwordsman;
    @SerializedName("doubles_wins_kit_swordsman")
    @Expose
    private long doublesWinsKitSwordsman;
    @SerializedName("kills_weekly_b")
    @Expose
    private long killsWeeklyB;
    @SerializedName("spawn_at_witch")
    @Expose
    private long spawnAtWitch;
    @SerializedName("play_streak")
    @Expose
    private long playStreak;
    @SerializedName("card_packs")
    @Expose
    private long cardPacks;
    @SerializedName("packages")
    @Expose
    private List<String> packages = null;
    @SerializedName("class_0")
    @Expose
    private String class0;
    @SerializedName("perk_alchemy_new")
    @Expose
    private boolean perkAlchemyNew;
    @SerializedName("perk_void_magnet_duplicates")
    @Expose
    private long perkVoidMagnetDuplicates;
    @SerializedName("perk_void_magnet_new")
    @Expose
    private boolean perkVoidMagnetNew;
    @SerializedName("perk_void_magnet")
    @Expose
    private long perkVoidMagnet;
    @SerializedName("perk_alchemy")
    @Expose
    private long perkAlchemy;
    @SerializedName("killstreak")
    @Expose
    private long killstreak;
    @SerializedName("playstreak")
    @Expose
    private long playstreak;
    @SerializedName("losses_doubles")
    @Expose
    private long lossesDoubles;
    @SerializedName("deaths_kit_frost_knight")
    @Expose
    private long deathsKitFrostKnight;
    @SerializedName("losses")
    @Expose
    private long losses;
    @SerializedName("assists_kit_frost_knight")
    @Expose
    private long assistsKitFrostKnight;
    @SerializedName("deaths")
    @Expose
    private long deaths;
    @SerializedName("deaths_doubles")
    @Expose
    private long deathsDoubles;
    @SerializedName("quits")
    @Expose
    private long quits;
    @SerializedName("games_played_kit_frost_knight")
    @Expose
    private long gamesPlayedKitFrostKnight;
    @SerializedName("highestKillstreak")
    @Expose
    private long highestKillstreak;
    @SerializedName("mobs_killed_kit_frost_knight")
    @Expose
    private long mobsKilledKitFrostKnight;
    @SerializedName("melee_kills_kit_frost_knight")
    @Expose
    private long meleeKillsKitFrostKnight;
    @SerializedName("kills_kit_frost_knight")
    @Expose
    private long killsKitFrostKnight;
    @SerializedName("most_kills_game_kit_frost_knight")
    @Expose
    private long mostKillsGameKitFrostKnight;
    @SerializedName("mobs_killed")
    @Expose
    private long mobsKilled;
    @SerializedName("enderchests_opened_kit_frost_knight")
    @Expose
    private long enderchestsOpenedKitFrostKnight;
    @SerializedName("enderchests_opened")
    @Expose
    private long enderchestsOpened;
    @SerializedName("fastest_win_solo_kit_frost_knight")
    @Expose
    private long fastestWinSoloKitFrostKnight;
    @SerializedName("fastest_win_solo")
    @Expose
    private long fastestWinSolo;
    @SerializedName("longest_bow_shot_kit_frost_knight")
    @Expose
    private long longestBowShotKitFrostKnight;
    @SerializedName("bow_shots_kit_frost_knight")
    @Expose
    private long bowShotsKitFrostKnight;
    @SerializedName("solo_wins_kit_frost_knight")
    @Expose
    private long soloWinsKitFrostKnight;
    @SerializedName("bow_hits_kit_frost_knight")
    @Expose
    private long bowHitsKitFrostKnight;
    @SerializedName("kills_solo")
    @Expose
    private long killsSolo;
    @SerializedName("solo_wins")
    @Expose
    private long soloWins;
    @SerializedName("wins_solo")
    @Expose
    private long winsSolo;
    @SerializedName("void_kills_kit_frost_knight")
    @Expose
    private long voidKillsKitFrostKnight;
    @SerializedName("perk_fruit_finder_new")
    @Expose
    private boolean perkFruitFinderNew;
    @SerializedName("perk_alchemy_duplicates")
    @Expose
    private long perkAlchemyDuplicates;
    @SerializedName("perk_fruit_finder")
    @Expose
    private long perkFruitFinder;
    @SerializedName("perk_skeleton_jockey_new")
    @Expose
    private boolean perkSkeletonJockeyNew;
    @SerializedName("perk_pacify")
    @Expose
    private long perkPacify;
    @SerializedName("perk_pacify_new")
    @Expose
    private boolean perkPacifyNew;
    @SerializedName("perk_skeleton_jockey")
    @Expose
    private long perkSkeletonJockey;
    @SerializedName("perk_hit_and_run_duplicates")
    @Expose
    private long perkHitAndRunDuplicates;
    @SerializedName("losses_solo")
    @Expose
    private long lossesSolo;
    @SerializedName("deaths_solo")
    @Expose
    private long deathsSolo;
    @SerializedName("kit_frost_knight_minor")
    @Expose
    private long kitFrostKnightMinor;
    @SerializedName("perk_pacify_duplicates")
    @Expose
    private long perkPacifyDuplicates;
    @SerializedName("perk_blast_protection")
    @Expose
    private long perkBlastProtection;
    @SerializedName("perk_skeleton_jockey_duplicates")
    @Expose
    private long perkSkeletonJockeyDuplicates;
    @SerializedName("perk_blast_protection_new")
    @Expose
    private boolean perkBlastProtectionNew;
    @SerializedName("perk_marksman_duplicates")
    @Expose
    private long perkMarksmanDuplicates;
    @SerializedName("perk_endless_quiver_new")
    @Expose
    private boolean perkEndlessQuiverNew;
    @SerializedName("perk_endless_quiver")
    @Expose
    private long perkEndlessQuiver;
    @SerializedName("perk_resistant_duplicates")
    @Expose
    private long perkResistantDuplicates;
    @SerializedName("perk_arrow_deflection_new")
    @Expose
    private boolean perkArrowDeflectionNew;
    @SerializedName("perk_arrow_deflection")
    @Expose
    private long perkArrowDeflection;
    @SerializedName("perk_hit_and_run")
    @Expose
    private long perkHitAndRun;
    @SerializedName("perk_damage_potion")
    @Expose
    private long perkDamagePotion;
    @SerializedName("perk_damage_potion_new")
    @Expose
    private boolean perkDamagePotionNew;
    @SerializedName("perk_hearty_start_duplicates")
    @Expose
    private long perkHeartyStartDuplicates;
    @SerializedName("perk_marksman")
    @Expose
    private long perkMarksman;
    @SerializedName("perk_resistant")
    @Expose
    private long perkResistant;
    @SerializedName("kills_monthly_a")
    @Expose
    private long killsMonthlyA;
    @SerializedName("kills_weekly_a")
    @Expose
    private long killsWeeklyA;
    @SerializedName("perk_supply_drop_new")
    @Expose
    private boolean perkSupplyDropNew;
    @SerializedName("perk_supply_drop")
    @Expose
    private long perkSupplyDrop;
    @SerializedName("perk_supply_drop_duplicates")
    @Expose
    private long perkSupplyDropDuplicates;
    @SerializedName("longest_bow_kill_kit_frost_knight")
    @Expose
    private long longestBowKillKitFrostKnight;
    @SerializedName("bow_kills_kit_frost_knight")
    @Expose
    private long bowKillsKitFrostKnight;
    @SerializedName("perk_enderman_new")
    @Expose
    private boolean perkEndermanNew;
    @SerializedName("perk_enderman")
    @Expose
    private long perkEnderman;
    @SerializedName("perk_blast_protection_duplicates")
    @Expose
    private long perkBlastProtectionDuplicates;
    @SerializedName("perk_witch")
    @Expose
    private long perkWitch;
    @SerializedName("perk_witch_new")
    @Expose
    private boolean perkWitchNew;
    @SerializedName("perk_creeper_new")
    @Expose
    private boolean perkCreeperNew;
    @SerializedName("perk_creeper")
    @Expose
    private long perkCreeper;
    @SerializedName("perk_hearty_start")
    @Expose
    private long perkHeartyStart;
    @SerializedName("perk_damage_potion_duplicates")
    @Expose
    private long perkDamagePotionDuplicates;
    @SerializedName("perk_creeper_duplicates")
    @Expose
    private long perkCreeperDuplicates;
    @SerializedName("perk_regeneration_duplicates")
    @Expose
    private long perkRegenerationDuplicates;
    @SerializedName("perk_sugar_rush")
    @Expose
    private long perkSugarRush;
    @SerializedName("perk_sugar_rush_new")
    @Expose
    private boolean perkSugarRushNew;
    @SerializedName("perk_honed_bow_new")
    @Expose
    private boolean perkHonedBowNew;
    @SerializedName("perk_honed_bow")
    @Expose
    private long perkHonedBow;
    @SerializedName("perk_regeneration")
    @Expose
    private long perkRegeneration;
    @SerializedName("perk_sugar_rush_duplicates")
    @Expose
    private long perkSugarRushDuplicates;
    @SerializedName("perk_arrow_deflection_duplicates")
    @Expose
    private long perkArrowDeflectionDuplicates;
    @SerializedName("perk_snow_golem")
    @Expose
    private long perkSnowGolem;
    @SerializedName("perk_snow_golem_new")
    @Expose
    private boolean perkSnowGolemNew;
    @SerializedName("class_1")
    @Expose
    private String class1;
    @SerializedName("games_played_kit_assassin")
    @Expose
    private long gamesPlayedKitAssassin;
    @SerializedName("deaths_kit_assassin")
    @Expose
    private long deathsKitAssassin;
    @SerializedName("most_kills_game_kit_assassin")
    @Expose
    private long mostKillsGameKitAssassin;
    @SerializedName("melee_kills_kit_assassin")
    @Expose
    private long meleeKillsKitAssassin;
    @SerializedName("void_kills_kit_assassin")
    @Expose
    private long voidKillsKitAssassin;
    @SerializedName("kills_kit_assassin")
    @Expose
    private long killsKitAssassin;
    @SerializedName("enderchests_opened_kit_assassin")
    @Expose
    private long enderchestsOpenedKitAssassin;
    @SerializedName("mobs_killed_kit_assassin")
    @Expose
    private long mobsKilledKitAssassin;
    @SerializedName("fastest_win_solo_kit_assassin")
    @Expose
    private long fastestWinSoloKitAssassin;
    @SerializedName("solo_wins_kit_assassin")
    @Expose
    private long soloWinsKitAssassin;
    @SerializedName("assists_kit_assassin")
    @Expose
    private long assistsKitAssassin;
    @SerializedName("perk_endless_quiver_duplicates")
    @Expose
    private long perkEndlessQuiverDuplicates;
    @SerializedName("perk_nutritious_new")
    @Expose
    private boolean perkNutritiousNew;
    @SerializedName("perk_nutritious")
    @Expose
    private long perkNutritious;
    @SerializedName("perk_witch_duplicates")
    @Expose
    private long perkWitchDuplicates;
    @SerializedName("bow_shots_kit_assassin")
    @Expose
    private long bowShotsKitAssassin;
    @SerializedName("mob_kills_kit_assassin")
    @Expose
    private long mobKillsKitAssassin;
    @SerializedName("mob_kills")
    @Expose
    private long mobKills;
    @SerializedName("perk_enderman_duplicates")
    @Expose
    private long perkEndermanDuplicates;
    @SerializedName("perk_invisibility")
    @Expose
    private long perkInvisibility;
    @SerializedName("perk_void_warranty")
    @Expose
    private long perkVoidWarranty;
    @SerializedName("perk_void_warranty_new")
    @Expose
    private boolean perkVoidWarrantyNew;
    @SerializedName("perk_invisibility_new")
    @Expose
    private boolean perkInvisibilityNew;
    @SerializedName("perk_tripleshot")
    @Expose
    private long perkTripleshot;
    @SerializedName("perk_tripleshot_new")
    @Expose
    private boolean perkTripleshotNew;
    @SerializedName("kit_assassin_minor")
    @Expose
    private long kitAssassinMinor;
    @SerializedName("longest_bow_shot_kit_assassin")
    @Expose
    private long longestBowShotKitAssassin;
    @SerializedName("bow_hits_kit_assassin")
    @Expose
    private long bowHitsKitAssassin;
    @SerializedName("perk_tripleshot_duplicates")
    @Expose
    private long perkTripleshotDuplicates;
    @SerializedName("perk_pearl_absorption_duplicates")
    @Expose
    private long perkPearlAbsorptionDuplicates;
    @SerializedName("perk_pearl_absorption")
    @Expose
    private long perkPearlAbsorption;
    @SerializedName("perk_pearl_absorption_new")
    @Expose
    private boolean perkPearlAbsorptionNew;
    @SerializedName("perk_chicken_bow_new")
    @Expose
    private boolean perkChickenBowNew;
    @SerializedName("perk_chicken_bow")
    @Expose
    private long perkChickenBow;
    @SerializedName("perk_fruit_finder_duplicates")
    @Expose
    private long perkFruitFinderDuplicates;
    @SerializedName("longest_bow_kill_kit_assassin")
    @Expose
    private long longestBowKillKitAssassin;
    @SerializedName("bow_kills_kit_assassin")
    @Expose
    private long bowKillsKitAssassin;
    @SerializedName("perk_winged_boots")
    @Expose
    private long perkWingedBoots;
    @SerializedName("perk_winged_boots_new")
    @Expose
    private boolean perkWingedBootsNew;
    @SerializedName("perk_energy_drink_new")
    @Expose
    private boolean perkEnergyDrinkNew;
    @SerializedName("perk_energy_drink")
    @Expose
    private long perkEnergyDrink;
    @SerializedName("perk_headstart")
    @Expose
    private long perkHeadstart;
    @SerializedName("perk_headstart_new")
    @Expose
    private boolean perkHeadstartNew;
    @SerializedName("perk_winged_boots_duplicates")
    @Expose
    private long perkWingedBootsDuplicates;
    @SerializedName("perk_explosive_bow_new")
    @Expose
    private boolean perkExplosiveBowNew;
    @SerializedName("perk_explosive_bow")
    @Expose
    private long perkExplosiveBow;
    @SerializedName("perk_honed_bow_duplicates")
    @Expose
    private long perkHonedBowDuplicates;
    @SerializedName("perk_guardian")
    @Expose
    private long perkGuardian;
    @SerializedName("perk_guardian_new")
    @Expose
    private boolean perkGuardianNew;
    @SerializedName("perk_energy_drink_duplicates")
    @Expose
    private long perkEnergyDrinkDuplicates;
    @SerializedName("perk_explosive_bow_duplicates")
    @Expose
    private long perkExplosiveBowDuplicates;
    @SerializedName("perk_snow_golem_duplicates")
    @Expose
    private long perkSnowGolemDuplicates;
    @SerializedName("perk_sharpened_sword_new")
    @Expose
    private boolean perkSharpenedSwordNew;
    @SerializedName("perk_sharpened_sword")
    @Expose
    private long perkSharpenedSword;
    @SerializedName("assassin_inventory_auto_equip_armor")
    @Expose
    private boolean assassinInventoryAutoEquipArmor;
    @SerializedName("perk_void_warranty_duplicates")
    @Expose
    private long perkVoidWarrantyDuplicates;
    @SerializedName("perk_blazing_arrows")
    @Expose
    private long perkBlazingArrows;
    @SerializedName("perk_blazing_arrows_new")
    @Expose
    private boolean perkBlazingArrowsNew;
    @SerializedName("perk_guardian_duplicates")
    @Expose
    private long perkGuardianDuplicates;
    @SerializedName("fastest_win_doubles_kit_assassin")
    @Expose
    private long fastestWinDoublesKitAssassin;
    @SerializedName("doubles_wins_kit_assassin")
    @Expose
    private long doublesWinsKitAssassin;
    @SerializedName("perk_nutritious_duplicates")
    @Expose
    private long perkNutritiousDuplicates;
    @SerializedName("perk_invisibility_duplicates")
    @Expose
    private long perkInvisibilityDuplicates;
    @SerializedName("perk_chicken_bow_duplicates")
    @Expose
    private long perkChickenBowDuplicates;
    @SerializedName("fastest_win_team_war_kit_assassin")
    @Expose
    private long fastestWinTeamWarKitAssassin;
    @SerializedName("fastest_win_team_war")
    @Expose
    private long fastestWinTeamWar;
    @SerializedName("team_war_wins_kit_assassin")
    @Expose
    private long teamWarWinsKitAssassin;
    @SerializedName("team_war_wins")
    @Expose
    private long teamWarWins;
    @SerializedName("kills_team_war")
    @Expose
    private long killsTeamWar;
    @SerializedName("wins_team_war")
    @Expose
    private long winsTeamWar;
    @SerializedName("deaths_team_war")
    @Expose
    private long deathsTeamWar;
    @SerializedName("fastest_win_team_war_kit_guardian")
    @Expose
    private long fastestWinTeamWarKitGuardian;
    @SerializedName("enderchests_opened_kit_guardian")
    @Expose
    private long enderchestsOpenedKitGuardian;
    @SerializedName("team_war_wins_kit_guardian")
    @Expose
    private long teamWarWinsKitGuardian;
    @SerializedName("melee_kills_kit_guardian")
    @Expose
    private long meleeKillsKitGuardian;
    @SerializedName("games_played_kit_guardian")
    @Expose
    private long gamesPlayedKitGuardian;
    @SerializedName("most_kills_game_kit_guardian")
    @Expose
    private long mostKillsGameKitGuardian;
    @SerializedName("kills_kit_guardian")
    @Expose
    private long killsKitGuardian;
    @SerializedName("games_played_kit_scout")
    @Expose
    private long gamesPlayedKitScout;
    @SerializedName("losses_mega")
    @Expose
    private long lossesMega;
    @SerializedName("deaths_mega")
    @Expose
    private long deathsMega;
    @SerializedName("deaths_kit_scout")
    @Expose
    private long deathsKitScout;
    @SerializedName("mobs_killed_kit_scout")
    @Expose
    private long mobsKilledKitScout;
    @SerializedName("enderchests_opened_kit_scout")
    @Expose
    private long enderchestsOpenedKitScout;
    @SerializedName("fastest_win_mega_kit_assassin")
    @Expose
    private long fastestWinMegaKitAssassin;
    @SerializedName("fastest_win_mega")
    @Expose
    private long fastestWinMega;
    @SerializedName("wins_mega")
    @Expose
    private long winsMega;
    @SerializedName("kills_mega")
    @Expose
    private long killsMega;
    @SerializedName("mega_wins_kit_assassin")
    @Expose
    private long megaWinsKitAssassin;
    @SerializedName("mega_wins")
    @Expose
    private long megaWins;
    @SerializedName("perk_rampage_duplicates")
    @Expose
    private long perkRampageDuplicates;
    @SerializedName("perk_iron_golem")
    @Expose
    private long perkIronGolem;
    @SerializedName("perk_iron_golem_new")
    @Expose
    private boolean perkIronGolemNew;
    @SerializedName("perk_rampage")
    @Expose
    private long perkRampage;
    @SerializedName("perk_sharpened_sword_duplicates")
    @Expose
    private long perkSharpenedSwordDuplicates;
    @SerializedName("perk_iron_golem_duplicates")
    @Expose
    private long perkIronGolemDuplicates;
    @SerializedName("perk_headstart_duplicates")
    @Expose
    private long perkHeadstartDuplicates;
    @SerializedName("perk_blazing_arrows_duplicates")
    @Expose
    private long perkBlazingArrowsDuplicates;
    @SerializedName("losses_team_war")
    @Expose
    private long lossesTeamWar;
    @SerializedName("deaths_perk_headstart")
    @Expose
    private long deathsPerkHeadstart;
    @SerializedName("deaths_perk_pearl_absorption")
    @Expose
    private long deathsPerkPearlAbsorption;
    @SerializedName("losses_perk_pearl_absorption")
    @Expose
    private long lossesPerkPearlAbsorption;
    @SerializedName("kills_perk_sharpened_sword")
    @Expose
    private long killsPerkSharpenedSword;
    @SerializedName("losses_perk_sharpened_sword")
    @Expose
    private long lossesPerkSharpenedSword;
    @SerializedName("deaths_perk_sharpened_sword")
    @Expose
    private long deathsPerkSharpenedSword;
    @SerializedName("kills_perk_headstart")
    @Expose
    private long killsPerkHeadstart;
    @SerializedName("losses_perk_headstart")
    @Expose
    private long lossesPerkHeadstart;
    @SerializedName("kills_perk_pearl_absorption")
    @Expose
    private long killsPerkPearlAbsorption;

}
