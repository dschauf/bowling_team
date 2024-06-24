// Chapter 8 exercise

public class BowlingTeam {

// instance variables for this class
     private String teamName;
     private String[] members = new String[4];

// class methods for the teamName variable
     public void setTeamName(String team) {
          teamName = team;    
     } // end of setTeamName()

     public String getTeamName() {
          return teamName;
     } // end of getTeamName()

     public void setMember(int number, String name) {
          members[number] = name;
     } // end of setMember()

     public String getMember(int number) {
          return members[number];
     } // end of getMember()

}