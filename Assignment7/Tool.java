 class Tool {
    protected int strength;
    protected char type;

    void setStrength(int n){
        this.strength = n;
    }
}

 class Rock extends Tool {
    public Rock(int strength){
        this.strength = strength;
        this.type ='r';
    }

    public boolean fight(Tool tool){
        if (tool.type == 's'){
            this.strength *= 2.0;
        }
        if (tool.type == 'p'){
            this.strength /= 2.0;
        }
        return this.strength > tool.strength;
    }

}

 class Scissors extends Tool {
    public Scissors(int strength){
        this.strength = strength;
        this.type ='s';
    }

    public boolean fight(Tool tool){
        if (tool.type == 'p'){
            this.strength *= 2.0;
        }
        if (tool.type == 'r'){
            this.strength /= 2.0;
        }
        return this.strength > tool.strength;
    }

}

 class Paper extends Tool {
    public Paper(int strength){
        this.strength = strength;
        this.type ='p';
    }

    public boolean fight(Tool tool){
        if (tool.type == 'r'){
            this.strength *= 2.0;
        }
        if (tool.type == 's'){
            this.strength /= 2.0;
        }
        return this.strength > tool.strength;
    }

}

class RockPaperScissorsGame{
    public static void main(String args[]){
        Scissors s = new Scissors(5);
        Paper p = new Paper(7);
        Rock r = new Rock(15);
        System.out.println(s.fight(p) + " , "+ p.fight(s) );
        System.out.println(p.fight(r) + " , "+ r.fight(p) );
        System.out.println(r.fight(s) + " , "+ s.fight(r) );

        System.out.println("-------------Unit test-------------");
        System.out.println("should be true, actually is " + s.fight(p) + " , "+"should be false, actually is " + p.fight(s) );
        System.out.println("should be false, actually is " + p.fight(r) + " , "+ "should be true, actually is " + r.fight(p) );
        System.out.println("should be true, actually is " + r.fight(s) + " , "+ "should be false, actually is " + s.fight(r) );

    }
}
