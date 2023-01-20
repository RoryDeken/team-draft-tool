package com.dekendesign.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Draft {
    private Integer currentPick = 0;
    private Integer managerNum;
    private String managerTitle;

    public String getManagerTitle() {
        return managerTitle;
    }

    public void setManagerTitle(String managerTitle) {
        this.managerTitle = managerTitle;
    }

    private ArrayList managers;
    private Boolean isPlayoffs = true;

    public Draft(String managerTitle) {
        this.managerTitle = managerTitle;
       // this.managers = managers;
        //this.isPlayoffs = isPlayoffs;
        //this.unSelected = unSelected;
        //this.selected = selected;
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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Draft draft = (Draft) o;
        return Objects.equals(currentPick, draft.currentPick) && Objects.equals(managerNum, draft.managerNum) && Objects.equals(managers, draft.managers) && Objects.equals(isPlayoffs, draft.isPlayoffs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentPick, managerNum, managers, isPlayoffs);
    }
}
