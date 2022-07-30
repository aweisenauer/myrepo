package com.techelevator.reader;

import com.techelevator.application.VendingMachine;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AuditFile {
public static void auditWriter(String action, double newMoney, double leftOverMoney){
    File audit = new File("Audit.txt");
    try{
        if (!audit.exists()){
            audit.createNewFile();
        }
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
        String formatDateTime = LocalDateTime.now().format(format);
        FileOutputStream fileOutputStream = new FileOutputStream(audit, true);
        PrintWriter writer = new PrintWriter(fileOutputStream);
        writer.println(formatDateTime + " " + String.format("%-19s", action) +" "+ newMoney + " "+leftOverMoney);
        writer.flush();
        writer.close();

    } catch (Exception e) {
        e.printStackTrace();
    }

}

    }

