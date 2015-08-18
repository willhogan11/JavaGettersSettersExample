package getterssettersexample;

public class GettersSettersEtc {
    private String name = "";
    private int num1 = 0;
    private int num2 = 0;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public String toString(){
        return ("Your name is " + name + "\nThe numbers you entered were " + num1 + " and " + num2);
    }
}