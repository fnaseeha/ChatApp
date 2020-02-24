package lk.naseeha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int port = sc.nextInt();

      /*  if ( < 1) {
            System.out.println("Syntax: java lk.naseeha.ChatServer <port-number>");
            System.exit(0);
        }*/

       // int port = Integer.parseInt(args[0]);

        ChatServer server = new ChatServer(port);
        server.execute();
    }
}
