package com.company;

public class Main implements OnClickListener {

    public static void main(String[] args) {
	// write your code here
        Button button = new Button();
        button.setListener(new Main());


        Button button2 = new Button();
        button2.setListener(new Main());

        button.onTouch(1); // нажатие на кнопку
        button2.onTouch(2);
    }

    @Override
    public void onClick(int vi) {
        if (vi == 1) {
            System.out.println("Button1 - onClick() in Main");
        }
        else  if (vi == 2){
            System.out.println("Button2 - onClick() in Main");
        }
    }
}
