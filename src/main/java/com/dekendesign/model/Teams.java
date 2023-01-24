package com.dekendesign.model;


import com.google.gson.Gson;

import com.google.gson.reflect.TypeToken;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Teams  {
    private ArrayList teamList = new ArrayList();
    private ArrayList selectedTeamList = new ArrayList();

    private ArrayList availableTeamList = new ArrayList();

    public Teams(){
        createTeamList();
    }

    public ArrayList getSelectedTeamList() {
        return selectedTeamList;
    }

    public boolean updateSelectedTeamList(String team, String manager) {
        HashMap selectedTeam = new HashMap();
        if(isTeamAvailable(team)) {
            selectedTeam.put(manager, team);
            selectedTeamList.add(selectedTeam);
            removeFromAvailableTeamList(team);
            return true;
        }else {
            return false;
        }
    }
     public ArrayList getAvailableTeamList(){
        return availableTeamList;
     }
    public void removeFromAvailableTeamList(String team){
        for (int i =0; i<availableTeamList.size();i++)
        {
            HashMap<String, String> data = (HashMap<String, String>) availableTeamList.get(i);
            Set<String> key = data.keySet();
            Iterator it = key.iterator();
            while (it.hasNext()) {
                String iKey = (String)it.next();
                String iData = (String) data.get(iKey);
                if(iKey.equals(team)){
                    availableTeamList.remove(i);
                }
            }
        }
    }

    public ArrayList getTeamList() {
        return teamList;
    }

    private void createTeamList(){

        // Create an list of maps from nfl_teams.json file
        // return that list and copy it to available teams
        createAvailableTeamList();
       // System.out.println(teamList.toString());
       // System.out.println(availableTeamList.toString());
    }

    private void createAvailableTeamList(){
        availableTeamList = teamList;
    }

    private boolean isTeamAvailable(String team){
        boolean isAvailable = true;

        for (int i =0; i<selectedTeamList.size();i++)
        {
            HashMap<String, String> data = (HashMap<String, String>) selectedTeamList.get(i);
            Set<String> key = data.keySet();
            Iterator it = key.iterator();
            while (it.hasNext()) {
                String iKey = (String)it.next();
                String iData = (String) data.get(iKey);
                System.out.println("Data: "+iKey +" Key: "+iData);
                if(iData.equals(team)){
                    isAvailable = false;
                    System.out.println("Team has already been selected");
                }
            }

        }
        return isAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teams teams = (Teams) o;
        return Objects.equals(teamList, teams.teamList) && Objects.equals(selectedTeamList, teams.selectedTeamList) && Objects.equals(availableTeamList, teams.availableTeamList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamList, selectedTeamList, availableTeamList);
    }
}


