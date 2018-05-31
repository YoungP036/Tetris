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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStreakMultiplier() {
        return streakMultiplier;
    }

    public void setStreakMultiplier(int streakMultiplier) {
        this.streakMultiplier = streakMultiplier;
    }

    public LocalTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
