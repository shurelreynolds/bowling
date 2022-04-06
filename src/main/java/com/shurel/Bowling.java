package com.shurel;

import java.util.Arrays;

public class Bowling {
  //  “turns”
  private Turn[] turns = new Turn[10];

  public Bowling() {
    Arrays.fill(turns, new Turn());
  }

  public int getScore() {
    int score = 0;

    for (Turn turn : turns) {
      for (Try t : turn.getTries()) {
        score += t.getKnockedDownPins();
      }
    }


    return score;
  }

  public boolean isGameOver() {


    return Arrays.asList(turns).parallelStream()
            .filter(tu -> tu.getTries().parallelStream()
                    .anyMatch(tr -> !tr.isUsed())).count() > 0;


  }
}
