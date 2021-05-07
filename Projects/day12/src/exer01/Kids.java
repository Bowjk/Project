package exer01;

public class Kids extends ManKind{
    private int yearsOld;

    public Kids(){

    }
    public Kids(int yearsOld){
        this.yearsOld = yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
    public int getYearsOld() {
        return yearsOld;
    }

    public void printAge(){
        System.out.println("I am " + yearsOld + " years old.");
    }

    /*
    修改练习中定义的类Kids，在Kids中重新定义employed()方法
    覆盖父类ManKind中定义的employed()方法
    编出“kids should study and no job.”
     */

    @Override
    public void employed() {
        System.out.println("kids should study and no job.");
    }
}
