package com.pfirewire.charactersheet.models.scores;

public abstract class AbilityScore {

    protected int value;

    int getValue() {
        return this.value;
    }

    void setValue(int value) {
        this.value = value;
    }
}
