package com.swp;

public class Utils {

    public static final String ANSI_RESET = "\u001B[0m";

    public static String colorNameToAnsi(String c){
        if(c != null && !c.isEmpty()){
            if(c.toLowerCase().equals("red") || c.toLowerCase().equals("r")){
                return "\u001B[31m";
            }else if(c.toLowerCase().equals("blue") || c.toLowerCase().equals("b")){
                return "\u001B[34m";
            }else if(c.toLowerCase().equals("white") || c.toLowerCase().equals("w")){
                return "\u001B[37m";
            }else if(c.toLowerCase().equals("cyan") || c.toLowerCase().equals("c")){
                return "\u001B[36m";
            }else if(c.toLowerCase().equals("purple") || c.toLowerCase().equals("p")){
                return "\u001B[35m";
            }else if(c.toLowerCase().equals("yellow") || c.toLowerCase().equals("y")){
                return "\u001B[33m";
            }else if(c.toLowerCase().equals("green") || c.toLowerCase().equals("g")){
                return "\u001B[32m";
            }
        }
        return "\u001B[0m";
    }

}
