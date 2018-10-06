public abstract class MoodyObject {
    //returns sad or happy - depending on which object sends the message
    protected abstract String getMood();

    //each object express a different emotion
    protected abstract void expressFeelings();

    //an object responds according to how it feels, print "I feel happy(or sad) today!"
    public void queryMood(){
        System.out.println(this.getMood());

    }



}

 class SadObject extends MoodyObject{

    //returns a string indicating sad
    protected String getMood(){
        return ("I feel sad today.");

    }

    //print crying string:"'wah''boo hoo''weep'sob''weep'"
    public void expressFeelings(){
    System.out.println("'wah''boo hoo''weep'sob''weep'");

    }

    //returns message about self:"Subject cries a lot"
    public String toString(){
        return ("Subject cries a lot");

    }


}

 class HappyObject extends MoodyObject{
    //returns a string indicating happy
    protected String getMood(){
        return ("I feel happy today!");

    }

    //print laughter string:"hehehe...hahahah...HAHAHAHAHA!!!"
    public void expressFeelings(){
        System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");

    }

    //returns message about self:"Subject laughs a lot"
    public String toString(){
        return ("Subject laughs a lot");

    }

}
class driver {
    public static void main(String[] Args) {
        SadObject Sad1 = new SadObject();
        HappyObject Happy1 = new HappyObject();

        PsychiatristObject P = new PsychiatristObject();
        P.examine(Sad1);
        Sad1.queryMood();

        P.examine(Happy1);
        Happy1.queryMood();

        Happy1.expressFeelings();
        P.observe(Happy1);

        Sad1.expressFeelings();
        P.observe(Sad1);
    }

}
