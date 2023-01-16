package com.dekendesign.model;

import java.util.ArrayList;

public class DraftUpdateTool implements DraftDAO{
    private ArrayList<Draft> drafts;

    public DraftUpdateTool(){
        drafts = new ArrayList<>();
    }

    @Override
    public boolean add(Draft draft) {
        return drafts.add(draft);
    }

    @Override
    public ArrayList<Draft> findAll() {
        return new ArrayList<>(drafts);
    }
}
