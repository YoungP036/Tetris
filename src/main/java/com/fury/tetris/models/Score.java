package com.fury.tetris.models;

import java.time.LocalTime;

public class Score {
    private int score;
    private int streakMultiplier;
    private LocalTime lastUpdateTime;

    public Score() {
        this.score = 0;
        this.streakMultiplier = 0;
        this.lastUpdateTime = LocalTime.now();
    }

    public void updateScore(int comboMagnitude) {
        // update score based on current multiplier and time of last update
    }

    public void updateMultiplier(int comboMagnitute) {
        // increase multiplier based on combo magnitude(from 1-4)
        // decrease multiplier if no combo
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setStreakMultiplier(int streakMultiplier) {
        this.streakMultiplier = streakMultiplier;
    }

    public int getScore() {
        return score;
    }

    public int getStreakMultiplier() {
        return streakMultiplier;
    }

}
