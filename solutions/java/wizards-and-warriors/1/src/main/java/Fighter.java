class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{

    @Override
    boolean isVulnerable() {
        return false;
    }
    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()){
            return 10;
        }
        return 6;
    }


}
class Wizard extends Fighter{

    private boolean spellPrepped = false;
    @Override
    boolean isVulnerable() {
        return !this.spellPrepped;
    }

    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }


    public void prepareSpell(){
        this.spellPrepped = true;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        if (this.spellPrepped){
            return 12;
        }
        return 3;
    }
}
