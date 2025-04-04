public class Attack_verdict {
    private String skillname;
    private int damage;
    private int attackrate;
    private int attackspeed;

    public String getSkillname() {
        return this.skillname;
    }

    public void setSkillname(String skillname) {
        this.skillname = skillname;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAttackrate() {
        return this.attackrate;
    }

    public void setAttackrate(int attackrate) {
        this.attackrate = attackrate;
    }

    public int getAttackspeed() {
        return this.attackspeed;
    }

    public void setAttacktimes(int attackspeed) {
        this.attackspeed = attackspeed;
    }

    public Attack_verdict(String skillname, int damage, int attackrate, int attackspeed) {
        this.skillname = skillname;
        this.damage = damage;
        this.attackrate = attackrate;
        this.attackspeed = attackspeed;
    }

}