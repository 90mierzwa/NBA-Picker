/*0 = Shooting %
1 = win %
2 = assists PG
3 = turnovers PG
4 = possessions PG
5 = fouls committed PG
6 = free throws made PG
7 = 3 Pointers made PG
8 = Off Reb PG
9 = Def Reb PG
10 = FG attempts 
11 = offensive rating
12 = def rating
13 = home court
14 = dist tavelled
15 = eff FG %
16 = avg scoring margin 
17 = win % last 7 games */
// Last updated BOS, BKN, IND, MEM, SAC, TOR, WAS, PHI, NY, NO, UTAH, MIA 11/16
// Last updated MIN, LAL, ORL, POR, SAN, GSW 11/18

package nbapicker;

public class teams {
    
    public static String[] chooseTeam = {"Atlanta Hawks: Record of 24-58", "Boston Celtics: Record of 55-27", "Brooklyn Nets: Record of 28-54" , "Charlotte Hornets: Record of 36-46", "Chicago Bulls: Record of 27-55", "Cleveland Cavaliers: Record of 50-32", "Dallas Mavericks: Record of 24-58", "Denver Nuggets: Record of 46-36", 
    "Detroit Pistons: Record of 39-43", "Golden State Warriors: Record of 58-24", "Houston Rockets: Record of 65-17", "Indiana Pacers: Record of 48-34", "Los Angeles Clippers: Record of 42-40", "Los Angeles Lakers: Record of 35-47", "Memphis Grizzlies: Record of 22-60", "Miami Heat: Record of 44-38", "Milwaukee Bucks: Record of 44-38", "Minnesota Timberwolves: Record of 47-35", "New Orleans Pelicans: Record of 48-34", "New York Knicks: Record of 29-53",
    "Oklahoma City Thunder: Record of 48-34", "Orlando Magic: Record of 25-57", "Philadelphia 76ers: Record of 52-30", "Phoenix Suns: Record of 21-61", "Portland Trailblazers: Record of 49-33", "Sacramento Kings: Record of 27-55", "San Antonio Spurs: Record of 47-35", "Toronto Raptors: Record of 59-23", "Utah Jazz: Record of 48-34", "Washington Wizards: Record of 43-39"};
    
    static float atlHawks[] =       { .447f, .273f, 25.5f, .33f, 0.0f, 23.6f, .743f, 11.5f, .4f, 33.5f, 0.0f, 102.9f, 111.0f, 0.0f, 118.2f, .512f, -9.2f, .68f, 0.7f};
    static float bosCeltics[] =     { .451f, .606f, 25.1f, .529f, 0.0f, 21.2f, .797f, 13.2f, .7f, 35.4f, 0.0f, 109.6f, 103.4f, 0.0f, 105.0f, .524f, 6.6f, .792f, 3.3f};
    
    static float brklndNets[] =     { .453f, .472f, 23.6f, .5f, 0.0f, 22.8f, .742f, 12.4f, .9f, 33.6f, 0.0f, 110.0f, 110.3f, 0.0f, 111.6f, .523f, -0.5f, .731f, 0.7f};
    static float charHornets[] =    { .455f, .485f, 24.2f, .55f, 0.0f, 19.8f, .794f, 11.9f, .5f, 34.4f, 0.0f, 110.9f, 109.1f, 1.0f, 111.5f, .52f, 1.9f, .778f, -2.0f};
    
    static float chicBulls[] =      { .445f, .265f, 21.8f, .235f, 0.0f, 20.8f, .773f, 9.4f, .4f, 33.8f, 0.0f, 100.2f, 109.7f, 0.0f, 110.2f, .498f, -9.5f, .733f, 1.7f};
    static float clvCavaliers[] =   { .444f, .229f, 19.7f, .22f, 0.0f, 20.7f, .782f, 8.9f, .4f, 32.1f, 0.0f, 105.6f, 115.0f, 0.0f, 111.1f, .494f, -8.8f, .755f, -14.7f};
    
    static float dalMavericks[] =   { .455f, .485f, 22.9f, .125f, 0.0f, 20.2f, .749f, 11.7f, .4f, 35.2f, 0.0f, 108.9f, 108.4f, 0.0f, 110.2f, .523f, 0.7f, .715f, -3.7f};
    static float denNuggets[] =     { .461f, .656f, 26.8f, .8125f, 0.0f, 20.5f, .749f, 10.5f, .6f, 34.7f, 0.0f, 110.8f, 105.4f, 1.0f, 104.5f, .52f, 5.3f, .725f, -7.0f};
    
    static float detPistons[] =     { .436f, .500f, 22.1f, .3f, 0.0f, 23.3f, .721f, 11.1f, .3f, 34.8f, 0.0f, 106.2f, 106.8f, 0.0f, 109.1f, .497f, 0.8f, .72f, -1.3f};
    static float goldstWarriors[] = { .482f, .657f, 27.6f, .75f, 0.0f, 22.2f, .83f, 12.0f, .7f, 35.9f, 0.0f, 112.9f, 109.0f, 1.0f, 111.5f, .549f, 4.0f, .797f, -6.7f};
    
    static float houRockets[] =     { .447f, .545f, 21.3f, .6875f, 0.0f, 23.1f, .759f, 14.6f, .7f, 30.6f, 0.0f, 112.0f, 111.2f, 1.0f, 108.5f, .532f, 0.8f, .756f, 3.0f};
    static float indPacers[] =      { .476f, .657f, 25.2f, .65f, 0.0f, 19.5f, .746f, 9.4f, .8f, 34.7f, 0.0f, 107.8f, 102.4f, 1.0f, 101.2f, .53f, 5.5f, .749f, 10.7f};
    
    static float laClippers[] =     { .477f, .588f, 22.6f, .44f, 1.0f, 22.6f, .805f, 9.6f, .4f, 36.0f, 0.0f, 112.1f, 110.8f, 0.0f, 114.7f, .532f, 1.2f, .763f, 9.3f};
    static float laLakers[] =       { .481f, .571f, 24.4f, .62f, 0.0f, 20.2f, .694f, 10.8f, .5f, 36.4f, 0.0f, 108.8f, 106.7f, 1.0f, 111.2f, .54f, 2.1f, .713f, 5.7f};  
    
    static float memGrizzlies[] =   { .455f, .528f, 23.1f, .63f, 0.0f, 22.4f, .758f, 9.6f, .3f, 31.9f, 0.0f, 105.1f, 104.7f, 1.0f, 101.7f, .515f, -0.2f, .81f, -0.7f};
    static float miaHeat[] =        { .434f, .485f, 22.9f, .563f, 0.0f, 22.2f, .695f, 12.1f, .7f, 35.3f, 0.0f, 105.9f, 105.8f, 1.0f, 106.3f, .502f, 0.1f, .626f, 9.7f} ;
    
    static float milBucks[] =       { .473f, .697f, 26.2f, .82f, 0.0f, 20.7f, .762f, 13.6f, .7f, 40.2f, 0.0f, 112.3f, 104.0f, 1.0f, 108.1f, .548f, 8.6f, .764f, 6.7f};
    static float minTimberwolves[]= { .45f, .471f, 24.3f, .71f, 0.0f, 20.0f, .803f, 10.3f, .4f, 33.3f, 0.0f, 109.2f, 109.4f, 1.0f, 111.1f, .507f, 0.0f, .81f, -0.3f};
    
    static float noPelicans[] =     { .476f, .429f, 27.1f, .69f, 0.0f, 22.7f, .766f, 10.1f, .3f, 36.0f, 0.0f, 111.8f, 111.4f, 1.0f, 115.6f, .531f, 0.8f, .702f, -5.3f};
    static float nyKnicks[] =       { .437f, .257f, 19.8f, .26f, 0.0f, 22.3f, .771f, 10.1f, .1f, 33.6f, 0.0f, 106.1f, 112.9f, 0.0f, 115.7f, .492f, -7.5f, .75f, -14.3f};  
    
    static float okcThunder[] =     { .456f, .636f, 22.6f, .55f, 1.0f, 22.6f, .704f, 9.9f, .5f, 35.7f, 0.0f, 108.0f, 102.2f, 0.0f, 105.8f, .51f, 6.1f, .677f, -1.7f};
    static float orlMagic[] =       { .443f, .424f, 24.5f, .421f, 0.0f, 19.8f, .773f, 11.2f, .3f, 33.2f, 0.0f, 104.0f, 108.8f, 1.0f, 107.6f, .506f, -4.6f, .785f, -12.0f};
    
    static float phil76ers[] =      { .467f, .629f, 26.8f, .38f, 0.0f, 22.7f, .774f, 11.2f, .5f, 37.4f, 0.0f, 110.1f, 107.5f, 0.0f, 112.0f, .531f, 2.5f, .742f, 13.3f};
    static float phnxSuns[] =       { .456f, .257f, 23.9f, .3125f, 0.0f, 23.5f, .784f, 10.0f, .5f, 32.4f, 0.0f, 103.4f, 111.6f, 1.0f, 113.6f, .514f, -8.5f, .753f, -3.0f};
    
    static float prtTrailblazers[]= { .456f, .559f, 21.1f, .3875f, 0.0f, 20.9f, .81f, 10.9f, .6f, 36.4f, 0.0f, 110.2f, 110.2f, 0.0f, 110.9f, .517f, 0.1f, .799f, -16.0f};
    static float sacKings[] =       { .472f, .545f, 25.5f, .53f, 0.0f, 22.3f, .706f, 11.6f, .6f, 34.0f, 0.0f, 109.4f, 110.5f, 1.0f, 116.4f, .535f, -1.3f, .705f, -3.7f};
    
    static float sanSpurs[] =       { .475f, .543f, 24.6f, .313f, 0.0f, 18.3f, .826f, 9.7f, .8f, 35.0f, 0.0f, 112.0f, 109.9f, 0.0f, 109.3f, .53f, 2.0f, .807f, 9.0f};
    static float torRaptors[] =     { .48f, .722f, 24.3f, .68f, 1.0f, 21.1f, .806f, 11.5f, .5f, 35.2f, 0.0f, 112.6f, 106.5f, 0.0f, 107.5f, .544f, 6.6f, .782f, -2.3f};
    
    static float utahJazz[] =       { .463f, .486f, 24.9f, .5f, 0.0f, 21.5f, .716f, 11.0f, .5f, 34.5f, 0.0f, 106.4f, 105.1f, 1.0f, 105.6f, .528f, 1.5f, .74f, 16.7f};
    static float washWizards[] =    { .465f, .371f, 24.9f, .56f, 0.0f, 22.2f, .756f, 10.8f, .2f, 31.3f, 0.0f, 107.8f, 112.5f, 1.0f, 117.7f, .525f, -5.0f, .769f, -8.0f};
    
}

