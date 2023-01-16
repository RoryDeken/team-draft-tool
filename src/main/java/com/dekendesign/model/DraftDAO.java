package com.dekendesign.model;

import java.util.ArrayList;

public interface DraftDAO {
    boolean add(Draft draft);
    ArrayList<Draft> findAll();
}
