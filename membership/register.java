package membership;

import java.io.*;
import java.io.File;
import java.util.Scanner;

public class register {
    
    public static void main(String[] args) {
  
        int mainmenu = 0;
        int submenu = 0;
        String firstname = "";
        String lastname = "";
        String phone = "";
   /*   File file = new File("jasenrekisteri.txt");
        Scanner input = new Scanner(System.in);
        FileWriter fw = new FileWriter(file);
        FileReader fr = null;
        */
                try {
                    File Obj = new File("D:/gitrepot/Olio-ohjelmointi/membership/jasenrekisteri.txt");
                    //FileWriter fw = new FileWriter("D:/gitrepot/Olio-ohjelmointi/membership/jasenrekisteri.txt");
                    FileWriter fw = new FileWriter(Obj);
                    Scanner myReader = new Scanner(Obj);
                    Scanner input = new Scanner(System.in);
                    
                    while (mainmenu !=3) {
                        System.out.println("1. Lisää jäsen");
                        System.out.println("2. Listaa jäsenet");
                        System.out.println("3. Lopeta");
                        System.out.println("Valitse toiminto: ");
                        mainmenu = input.nextInt();
                        if (mainmenu == 1) {
                /*          System.out.println("1. Lisää jäsen");
                            System.out.println("2. Poista jäsen");
                            System.out.println("3. Paluu");
                            System.out.println("Valitse toiminto: ");
                            submenu = input.nextInt();
                         if (submenu == 1) { 
                            */ 
                                System.out.println("Syötä jäsenen etunimi: ");
                                firstname = input.next();
                                System.out.println("Syötä jäsenen sukunimi: ");
                                lastname = input.next();
                                System.out.println("Syötä jäsenen puhelinnumero: ");
                                phone = input.next();
                                String str = firstname + " " + lastname + " " + phone + "\n";
                                for (int i = 0; i < str.length(); i++)
                                fw.write(str.charAt(i)); 
                            } 
                            if (submenu == 2) {
                                System.out.println("Syötä jäsenen etunimi: ");
                                firstname = input.next();
                                System.out.println("Syötä jäsenen sukunimi: ");
                                lastname = input.next();
                                System.out.println("Syötä jäsenen puhelinnumero: ");
                                phone = input.next();
                                fw.write(firstname + " " + lastname + " " + phone + "\n");
                            }
                            if (submenu == 3) {
                                System.out.println("Paluu");
                            }
                        } if (mainmenu == 2) {
                            System.out.println("mainmenu 2");
                            String data = myReader.next();
                            System.out.println(data);
                           /* System.out.println("1. Listaa jäsenet");
                            System.out.println("2. Paluu");
                            System.out.println("Valitse toiminto: ");
*/
                            if (submenu == 1) {
                                System.out.println("1. Listaa jäsenet");
                                System.out.println("2. Paluu");
                                System.out.println("Valitse toiminto: ");
                                System.out.println("submenu on 1");
                                while (myReader.hasNextLine()) {
                                    System.out.println(myReader.nextLine());
                                }
                            }
                            if (submenu == 2) {
                                System.out.println("Paluu");
                            }
                        }
                        if (mainmenu == 3) {
                            System.out.println("Lopeta");
                        }
                        input.close();
                        fw.close();
                        myReader.close();

                } catch (IOException e) {

                    System.out.println("IOException");
                    e.printStackTrace();
                    
                }

            }
        }
        