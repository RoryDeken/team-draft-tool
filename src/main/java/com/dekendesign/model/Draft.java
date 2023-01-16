package com.dekendesign.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Draft {
    private Integer currentPick = 0;
    private Integer managerNum;
    private ArrayList managers;
    private Boolean isPlayoffs = true;
    private ArrayList unSelected;
    private ArrayList selected;
    public Draft(ArrayList unSelected, ArrayList selected, ArrayList managers, Boolean isPlayoffs) {
        this.managers = managers;
        this.isPlayoffs = isPlayoffs;
        this.unSelected = unSelected;
        this.selected = selected;
    }
    public Integer getCurrentPick() {
        return currentPick;
    }
    public void setCurrentPick(Integer currentPick) {
        this.currentPick = currentPick;
    }

    public Integer getManagerNum() {
        return managers.size();
    }

    public ArrayList getManagers() {
        return managers;
    }

    public void addManager(List manager) {
        this.managers.add(manager);
    }

    public Boolean getPlayoffs() {
        return isPlayoffs;
    }

    public void setPlayoffs(Boolean playoffs) {
        isPlayoffs = playoffs;
    }

    public ArrayList getUnSelected() {
        return unSelected;
    }


    public ArrayList getSelected() {
        return selected;
    }

    public void setSelected(ArrayList selected) {
        unSelected.remove(selected);
        this.selected.add(selected);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Draft draft = (Draft) o;
        return Objects.equals(currentPick, draft.currentPick) && Objects.equals(managerNum, draft.managerNum) && Objects.equals(managers, draft.managers) && Objects.equals(isPlayoffs, draft.isPlayoffs) && Objects.equals(unSelected, draft.unSelected) && Objects.equals(selected, draft.selected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentPick, managerNum, managers, isPlayoffs, unSelected, selected);
    }
}
/*
1. Start with a list of unselected teams
eg CIN: Cincinnati Bengals

2. allow manager to pick a team

3. add that team to the list of selected teams and remove from unselected with the id of the manager that picked it

4. Display updated lists of selected and unselected teams
Draft [
{team: CIN, selected: true, manager: rory}
]

5. Allow the commissioner to edit the draft

 */