package com.jeff.intern.MyConsole;

import java.io.File;
import java.io.Reader;
import java.io.StringReader;
import java.util.Scanner;

import net.sf.json.JSONObject;

public class Main {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub            
        MyConsole myConsole;
        myConsole=MyConsole.getMyConsole();        
        myConsole.start();        
    }
}
