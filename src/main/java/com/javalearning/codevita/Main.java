package com.javalearning.codevita;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i=0;i<n;i++) {
            Inventory inv = new Inventory();
            Cart cart = new Cart();
            while (sc.hasNext()) {
                String command = sc.nextLine();
                if (!command.equals("END")) {
                    new Main().commandRunner(command,inv,cart);
                }
                }
            }
    }

    public void commandRunner(String command,Inventory inv,Cart cart) {

        String[] cmdArray = command.split(" ");

        String user = cmdArray[1];
        String func = cmdArray[2];
        String param ="";
        String name = "";

        if(cmdArray.length == 5){
            name = cmdArray[3];
            param = cmdArray[4];
        }else if(cmdArray.length == 4){
            name = cmdArray[3];
        }

        if (user.equals("SM")) {

            switch (func) {
                case "ADD":
                    print(inv.addItem(name, Integer.valueOf(param)));
                    break;
                case "REMOVE":
                    print(inv.removeItem(name));
                    break;
                case "GET_QTY":
                    print(inv.getQuantity(name));
                    break;
                case "INCR":
                    print(inv.increment(name, Integer.valueOf(param)));
                    break;
                case "DCR":
                    print(inv.decrement(name, Integer.valueOf(param)));
                    break;
                case "SET_COST":
                    inv.setCost(name, Double.valueOf(param));
                    break;
            }
        }

        if (user.equals("S")) {
            switch (func) {
            case "ADD":
                print(cart.addItem(name, Integer.valueOf(param)));
                break;
            case "REMOVE":
                print(cart.removeItem(name));
                break;
            case "INCR":
                print(cart.increment(name, Integer.valueOf(param)));
                break;
            case "DCR":
                print(cart.decrement(name, Integer.valueOf(param)));
                break;
            case "GET_ORDER_AMOUNT":
                print(cart.getOrderAmount()); break;
            }
        }

    }

    public void print(Object obj) {
        System.out.println(obj);
    }
}
