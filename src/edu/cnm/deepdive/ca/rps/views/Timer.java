package edu.cnm.deepdive.ca.rps.views;

import javafx.animation.AnimationTimer;

/**
 *
 */
public class Timer extends AnimationTimer {

  private TerrainView view;

  /**
   *
   * @param view
   */
  public Timer (TerrainView view) {
    this.view = view;
  }

  @Override
  public void handle(long now) {
    view.draw();
  }
}
