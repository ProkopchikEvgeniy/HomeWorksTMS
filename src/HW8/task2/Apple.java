package HW8.task2;

public class Apple {
    private String color = "Red";

    public String getColor(){
        return color;
    }

    public class ChangeColor{
        public void changeColor(String newColor){
            color=newColor;
        }
    }
}
