package com.javalearning.codevita.codekart;
import java.util.*;
public class Main {

    public static void main(String args[]) {
        HashMap cost = new HashMap();
        HashMap qty = new HashMap();
        Scanner sc = new Scanner(System.in);
      //  System.out.println("enter");
        String input = sc.nextLine();
        String command_split[] = input.split(" ");

        String role = command_split[1];
        String command = command_split[2];

        if(role == "SM"){
            if(command == " ADD "){

            }
            else if(command == "REMOVE"){

            }
            else if (command == " GET_QTY"){

            }
            else if (command == " INCR "){

            }
            else if (command == " DCR"){

            }
            else if (command == " SET_COST "){

            }
        }



    }
}
