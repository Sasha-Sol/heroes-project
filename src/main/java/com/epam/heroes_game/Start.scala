package com.epam.heroes_game

import com.epam.heroes_game.models.GameManager

object Start extends Exception {
  def main(args: Array[String]): Unit = {

    val hero1 = HeroFactory.createCharacter
    val hero2 = HeroFactory.createCharacter

    GameManager.fight(hero1, hero2)
  }

}
