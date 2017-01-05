package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
       Zerg zerg1 = new Zerg();
        zerg1.name = "Drone";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Overseer";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Roach";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Ravager";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Locust";
        Zerg zerg6 = new Zerg();
        zerg6.name = "Queen";
        Zerg zerg7 = new Zerg();
        zerg7.name = "Mutalisk";
        Zerg zerg8 = new Zerg();
        zerg8.name = "Guardian";
        Zerg zerg9 = new Zerg();
        zerg9.name = "Devourer";
        Zerg zerg10 = new Zerg();
        zerg10.name = "Corruptor";
        Protos protos1 = new Protos();
        protos1.name = "Probe";
        Protos protos2 = new Protos();
        protos2.name = "Zealot";
        Protos protos3 = new Protos();
        protos3.name = "Dragoon";
        Protos protos4 = new Protos();
        protos4.name = "Stalker";
        Protos protos5 = new Protos();
        protos5.name = "Immortal";
        Terran terran1 = new Terran ();
        terran1.name = "Marine";
        Terran terran2 = new Terran ();
        terran2.name = "Firebat";
        Terran terran3 = new Terran ();
        terran3.name = "Marauder";
        Terran terran4 = new Terran ();
        terran4.name = "Reaper";
        Terran terran5 = new Terran ();
        terran5.name = "Medic";
        Terran terran6 = new Terran ();
        terran6.name = "Ghost";
        Terran terran7 = new Terran ();
        terran7.name = "Spectre";
        Terran terran8 = new Terran ();
        terran8.name = "Vulture";
        Terran terran9 = new Terran ();
        terran9.name = "Hellion";
        Terran terran10 = new Terran ();
        terran10.name = "Hellbat";
        Terran terran11 = new Terran ();
        terran11.name = "Goliath";
        Terran terran12 = new Terran ();
        terran12.name = "Thor";
            }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}