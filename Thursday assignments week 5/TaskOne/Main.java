//1. a
public class Main {
    public static void main(String[] args) {

        //1. g
        Team greenTeam = new Team("The Green Machine");

        //1. i
        greenTeam.setRank(5);

        //1. j
        System.out.println(greenTeam.toString());

        //1. k
        String[] teams = {"Blue Blazers", "Silver Sharks", "Violet Vortex", "Purple Panthers", "Ruby Raptors"};
        int[] teamsRank = {10, 7, 12, 3, 5};

        Team[] team = new Team[teams.length];

        for (int i = 0; i < teams.length; i++) {
            team[i] = new Team(teams[i]);
            team[i].setRank(teamsRank[i]);
            System.out.println(team[i].toString());
        }

        greenTeam.addPlayer("Styrse");
        greenTeam.addPlayer("Jesper");
        greenTeam.addPlayer("Niki");

        System.out.println(greenTeam.toString());
    }
}