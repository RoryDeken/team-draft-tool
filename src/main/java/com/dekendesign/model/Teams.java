package com.dekendesign.model;
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
        HashMap team = new HashMap<>();
        team.put("ARI","Arizona Cardinals");
        teamList.add(team);
        team.put( "ATL","Atlanta Falcons");
        teamList.add(team);
        team.put("BAL","Baltimore Ravens");
        teamList.add(team);
        team.put("BUF", "Buffalo Bills");
        teamList.add(team);
        team.put("CAR","Carolina Panthers");
        teamList.add(team);
        team.put("CHI","Chicago Bears");
        teamList.add(team);
        team.put("CIN","Cincinnati Bengals");
        teamList.add(team);
        team.put("CLE","Cleveland Browns");
        teamList.add(team);
        team.put("DAL","Dallas Cowboys");
        teamList.add(team);
        team.put("DEN", "Denver Broncos");
        teamList.add(team);
        team.put("DET", "Detroit Lions");
        teamList.add(team);
        team.put("GB", "Green Bay Packers");
        teamList.add(team);
        team.put("HOU", "Houston Texans");
        teamList.add(team);
        team.put("IND", "Indianapolis Colts");
        teamList.add(team);
        team.put("JAX", "Jacksonville Jaguars");
        teamList.add(team);
        team.put("KC", "Kansas City Chiefs");
        teamList.add(team);
        team.put("LA", "Los Angeles Rams");
        teamList.add(team);
        team.put("LAC", "Los Angeles Chargers");
        teamList.add(team);
        team.put("LV", "Las Vegas Raiders");
        teamList.add(team);
        team.put("MIA", "Miami Dolphins");
        teamList.add(team);
        team.put("MIN", "Minnesota Vikings");
        teamList.add(team);
        team.put("NE", "New England Patriots");
        teamList.add(team);
        team.put("NO", "New Orleans Saints");
        teamList.add(team);
        team.put("NYG", "New York Giants");
        teamList.add(team);
        team.put("NYJ","New York Jets");
        teamList.add(team);
        team.put("PHI", "Philadelphia Eagles");
        teamList.add(team);
        team.put("PIT", "Pittsburgh Steelers");
        teamList.add(team);
        team.put("SEA","Seattle Seahawks");
        teamList.add(team);
        team.put("SF","San Francisco 49ers");
        teamList.add(team);
        team.put("TB","Tampa Bay Buccaneers");
        teamList.add(team);
        team.put("TEN", "Tennessee Titans");
        teamList.add(team);
        team.put("WAS", "Washington Commanders");
        teamList.add(team);
        createAvailableTeamList();
        System.out.println(teamList.toString());
        System.out.println(availableTeamList.toString());
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


