package com.hillel.lessons.HomeWork5;

public class ChinaDynasties {
    public static void main(String[] args) {
        int attMilitaryLi = 13;
        int attTargetLi = 24;
        int attRiderLi = 46;
        int attMilitaryMin = 9;
        int attTargetMin = 35;
        int attRiderMin = 12;
        int soldiersLi = 860;
        double soldiersMin = soldiersLi * 1.5;
        int attMilitaryBySoldiersLi = attMilitaryLi * soldiersLi;
        int attTargetBySoldiersLi = attTargetLi * soldiersLi;
        int attRiderBySoldiersLi = attRiderLi * soldiersLi;
        double attMilitaryBySoldiersMin = attMilitaryMin * soldiersMin;
        double attTargetBySoldiersMin = attTargetMin * soldiersMin;
        double attRiderBySoldiersMin = attRiderMin * soldiersMin;
        int attackCommonLi = attMilitaryBySoldiersLi + attTargetBySoldiersLi + attRiderBySoldiersLi;
        double attackCommonMin = attMilitaryBySoldiersMin + attTargetBySoldiersMin + attRiderBySoldiersMin;

        System.out.println("Загальна атака армії Лі = " + attackCommonLi);
        System.out.println("Загальна атака армії Мінь = " + attackCommonMin);

    }
}
