package com.dekendesign.model;


import java.util.*;

public class Teams  {

    private ArrayList<HashMap> teamList = new ArrayList();

    private ArrayList selectedTeamList = new ArrayList();

    private ArrayList availableTeamList = new ArrayList();

    public Teams(){

        HashMap<String, String> team = new HashMap<String, String>();
        team.put("code", "ARI");
        team.put("name","Cardinals");
        team.put("full_name", "Arizona Cardinals");
        team.put("conf", "NFC");
        team.put("region", "West");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "ATL");
        team.put("name","Falcons");
        team.put("full_name", "Atlanta Falcons");
        team.put("conf", "NFC");
        team.put("region", "South");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "BAL");
        team.put("name","Ravens");
        team.put("full_name", "Baltimore Ravens");
        team.put("conf", "AFC");
        team.put("region", "North");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "BUF");
        team.put("name","Bills");
        team.put("full_name", "Buffalo Bills");
        team.put("conf", "AFC");
        team.put("region", "East");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "CAR");
        team.put("name","Panthers");
        team.put("full_name", "Carolina Panthers");
        team.put("conf", "NFC");
        team.put("region", "South");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "CHI");
        team.put("name","Bears");
        team.put("full_name", "Chicago Bears");
        team.put("conf", "NFC");
        team.put("region", "North");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "CIN");
        team.put("name","Bengals");
        team.put("full_name", "Cincinnati Bengals");
        team.put("conf", "AFC");
        team.put("region", "North");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "CLE");
        team.put("name","Browns");
        team.put("full_name", "Cleveland Browns");
        team.put("conf", "AFC");
        team.put("region", "North");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "DAL");
        team.put("name","Cowboys");
        team.put("full_name", "Dallas Cowboys");
        team.put("conf", "NFC");
        team.put("region", "East");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "DEN");
        team.put("name","Broncos");
        team.put("full_name", "Denver Broncos");
        team.put("conf", "AFC");
        team.put("region", "West");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "DET");
        team.put("name","Lions");
        team.put("full_name", "Detroit Lions");
        team.put("conf", "NFC");
        team.put("region", "North");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "GB");
        team.put("name","Packers");
        team.put("full_name", "Green Bay Packers");
        team.put("conf", "NFC");
        team.put("region", "North");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "HOU");
        team.put("name","Texans");
        team.put("full_name", "Houston Texans");
        team.put("conf", "AFC");
        team.put("region", "South");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "IND");
        team.put("name", "Colts");
        team.put("full_name", "Indianapolis Colts");
        team.put("conf", "AFC");
        team.put("region", "South");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "JAX");
        team.put("name", "Jaguars");
        team.put("full_name", "Jacksonville Jaguars");
        team.put("conf", "AFC");
        team.put("region", "South");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "KC");
        team.put("name", "Chiefs");
        team.put("full_name", "Kansas City Chiefs");
        team.put("conf", "AFC");
        team.put("region", "West");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "LAC");
        team.put("name", "Chargers");
        team.put("full_name", "Los Angeles Chargers");
        team.put("conf", "AFC");
        team.put("region", "West");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "LAR");
        team.put("name", "Rams");
        team.put("full_name", "Los Angeles Rams");
        team.put("conf", "NFC");
        team.put("region", "West");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "MIA");
        team.put("name", "Dolphins");
        team.put("full_name", "Miami Dolphins");
        team.put("conf", "AFC");
        team.put("region", "East");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "MIN");
        team.put("name", "Vikings");
        team.put("full_name", "Minnesota Vikings");
        team.put("conf", "NFC");
        team.put("region", "North");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "NE");
        team.put("name", "Patriots");
        team.put("full_name", "New England Patriots");
        team.put("conf", "AFC");
        team.put("region", "East");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "NO");
        team.put("name", "Saints");
        team.put("full_name", "New Orleans Saints");
        team.put("conf", "NFC");
        team.put("region", "South");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "NYG");
        team.put("name", "Giants");
        team.put("full_name", "New York Giants");
        team.put("conf", "NFC");
        team.put("region", "East");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "NYJ");
        team.put("name", "Jets");
        team.put("full_name", "New York Jets");
        team.put("conf", "AFC");
        team.put("region", "East");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "OAK");
        team.put("name", "Raiders");
        team.put("full_name", "Oakland Raiders");
        team.put("conf", "AFC");
        team.put("region", "West");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "PHI");
        team.put("name", "Eagles");
        team.put("full_name", "Philadelphia Eagles");
        team.put("conf", "NFC");
        team.put("region", "East");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "PIT");
        team.put("name", "Steelers");
        team.put("full_name", "Pittsburgh Steelers");
        team.put("conf", "AFC");
        team.put("region", "North");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "SF");
        team.put("name", "49ers");
        team.put("full_name", "San Francisco 49ers");
        team.put("conf", "NFC");
        team.put("region", "West");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "SEA");
        team.put("name", "Seahawks");
        team.put("full_name", "Seattle Seahawks");
        team.put("conf", "NFC");
        team.put("region", "West");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "TEN");
        team.put("name", "Titans");
        team.put("full_name", "Tennessee Titans");
        team.put("conf", "AFC");
        team.put("region", "South");
        teamList.add(team);

        team = new HashMap<String, String>();
        team.put("code", "WAS");
        team.put("name", "Commanders");
        team.put("full_name", "Washington Commanders");
        team.put("conf", "NFC");
        team.put("region", "East");
        teamList.add(team);

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


