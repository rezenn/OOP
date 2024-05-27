

public class secondOop {
    public static void main(String[] args) {
        Human p = new Human();
        p.name = "Ram";
        p.age = 10;
        
        p.personInfo();

        Human p2 = new Human();
        p2.name = "Shyam";
        p2.age = 10;
        
        p2.personInfo();
        p2.setPhNumber();

        Football f1 = new Football();
        f1.homeTeam = "England";
        f1.awayTeam = "Spain";
        f1.time = 91;
        f1.setterForGoal(4);
        f1. setWinner("England");
        f1.detail();


    }
    
}

class Human{
    String name;
    int age;
    // access modifier, it is "default" if not specified
    private String phNumber;
    public int salary;

    void personInfo(){
        System.out.println(name);
    }
    void setPhNumber(){
       this. phNumber = "3443647";
    }
    void setNewPhNumber(String num){
        this.phNumber = num;
    }
    String getPhNumber(){
        return phNumber;
    }
    void setThisNumber(String Number){
        this.phNumber = Number;
    }

    /*task
     * create a class Football
     * make two attribute
     * string homeTeam and awayteam
     * make another attridute time
     * mAKE private attribute goal
     * make a setter for goal
     * make a getter for goal
     * make private attribute winner as string
     * make only setter for winner
     * make function detail() => print winner name, time and total goal
     * make object of football and fill all the attribute
     */
    class Football{
        String hometeam;
        String awayTeam;
        private int goal;
        String time;
        private String winner;
        void setterForGoal( int goal){
            this.goal = goal;
        }
        int getterForGoal(){
            return this.goal;
        }
        void setWinner(String winner){
            this.winner = winner;
        }
        void detail(){
            System.out.println("Winner: "+ winner + " Time: "+ time+ " Goals: "+ goal);
        }
    }
}