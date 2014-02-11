/*
 * Realizar un programa q muestre el diguiente pensamiento:
 * "Ama a tu prjimo como te gustaria ser amado."
 */
package sbrpas;

/**
 *
 * @author GRUPO Z
 */
public class Ter {

    /**
     * @fecha 07/01/2014--08/02/2014
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opc1 = 0, opc2 = 0, x = 0;
        int R = 0;



        do {

            opc1 = MenuPrincipal();
            if (opc1 == 1) {
                opc2 = SubMenu();
                Facil();

            } else {
                if (opc1 == 2) {
                    INSTRUCCIONES();
                    System.out.println("DESEA VOLVER AL MENU ANTERIOR? ");
                    x = inputInt("1.- SI 2.- NO    ");
                } else {
                    if (opc1 == 3) {
                        MasJuegos();
                        System.out.println("DESEA VOLVER AL MENU ANTERIOR? ");
                        x = inputInt("1.- SI 2.- NO    ");
                    } else {
                        System.out.println("GRACIAS POR NO HACER NADA .-.");
                    }
                }
            }
        } while (x == 1);







    }//fin del Main

    //funciones dada por el BI  
    static String input(String prompt) {
        String inputLine = " ";
        System.out.print(prompt);
        try {
            inputLine = (new java.io.BufferedReader(
                    new java.io.InputStreamReader(System.in))).readLine();
        } catch (Exception e) {
            String err = e.toString();
            System.out.println(err);
            inputLine = " ";
        }
        return inputLine;
    }

    static String inputString(String prompt) {
        return input(prompt);

    }

    static int inputInt(String prompt) {
        int result = 0;
        try {
            result = Integer.valueOf(
                    input(prompt).trim()).intValue();
        } catch (Exception e) {
            result = 0;
        }
        return result;
    }

    static double inputDouble(String prompt) {
        double result = 0;
        try {
            result = Double.valueOf(
                    input(prompt).trim()).doubleValue();
        } catch (Exception e) {
            result = 0;
        }
        return result;
    }//fin de los metodos o funciones

    static int MenuPrincipal() {
        boolean r = true;//respuesta de la funcion 
        int opc = 0;     //variable que representara la respuesta

        do {//Empieza el lazo que dara inicio al menu
            System.out.println("----------------------");
            System.out.println("----------------------");
            System.out.println("               MENU ");
            System.out.println("Elija una Opcion y Escribala Abajo");
            System.out.println("1.- Jugar");
            System.out.println("2.- Como Jugar");
            System.out.println("3.- Mas Juegos");
            System.out.println("4.- Salir");
            System.out.println("----------------------");
            System.out.println("----------------------");
            opc = inputInt("     ingrese su opcion: ");
            System.out.println("----------------------");

            if (opc <= 4) //Verifico si la opcion ingresada es correcta
            {
                if (opc >= 1) {

                    r = true;
                } else {
                    System.out.println("ERROR!!! INGRESE NUEVAMENTE");
                    System.out.println("----------------------");
                    r = false;
                }

            } else {
                System.out.println("ERROR!!! INGRESE NUEVAMENTE");
                System.out.println("----------------------");
                r = false;
            }


        } while (r == false);

        return opc; //retorna la opcion escogida

    } //Elaborado y terinado el 07/01/2014

    static int SubMenu() {
        boolean r = true;//respuesta de la funcion 
        int opc = 0;     //variable que representara la respuesta

        do {//Empieza el lazo que dara inicio al menu de dificultades
            System.out.println("----------------------");
            System.out.println("----------------------");
            System.out.println("              DIFICULTAD            ");
            System.out.println("    Elija la dificultad de juego");
            System.out.println("1.- FACIL");
            System.out.println("2.- INTERMEDIO");
            System.out.println("3.- DIFICIL");
            System.out.println("4.- DIOS");
            System.out.println("----------------------");
            System.out.println("----------------------");
            opc = inputInt("     ingrese su opcion: ");
            System.out.println("----------------------");

            if (opc <= 4) //Verifico si la opcion ingresada es correcta
            {
                if (opc >= 1) {

                    r = true;
                } else {
                    System.out.println("ERROR!!! INGRESE NUEVAMENTE");
                    System.out.println("----------------------");
                    r = false;
                }

            } else {
                System.out.println("ERROR!!! INGRESE NUEVAMENTE");
                System.out.println("----------------------");
                r = false;
            }


        } while (r == false);

        return opc; //retorna la opcion escogida

    } //Elaborado y terinado el 07/01/2014

    static void INSTRUCCIONES() {
        System.out.println("----------------------------------");
        System.out.println("          Bienvenido a Super 3 en Raya");
        System.out.println("----------------------------------");
        System.out.println("Este emocionante juego consiste en amargarte la  ");
        System.out.println("vida y de imposibilitarte la victoria.            ");
        System.out.println("----------------------------------");
        System.out.println("se estableceran posiciones para poder jugar, desde");
        System.out.println("1A hasta 3C y se ganara cuando se alinien 3 figuras ");
        System.out.println("similares.");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("Simbolos a Elegir para jugar:");
        System.out.println("Circulo = ?");
        System.out.println("Equiz   = X");
        System.out.println("Play    = ?");
        System.out.println("------------------------------");
        System.out.println("Y SI NO ENTENDIÓ, VAYA Y PREGUNTE!");
        System.out.println("------------------------------");
    }

    static void MasJuegos() {
        System.out.println("----------------------------------");
        System.out.println("         SI QUIERES SABER MAS DE NUESTROS JUEGOS");
        System.out.println("----------------------------------");
        System.out.println("WWW.MINIJUEGOS.COM");
        System.out.println("WWW.ABCJUEGOS.COM");
        System.out.println("WWW.GIRLSGAMES.COM (Miguel)");
        System.out.println("------------------------------");
        System.out.println("Y SI NO QUIERE JUGAR LARGUESE!");
        System.out.println("------------------------------");
    }

    static void Facil() {
        // Juego de 3 en raya

        String z = "", jd = "", a="vacio";
        int c = 0, ju = 1;
        boolean m = false, n = false;
        int pos[];
        String jug[];
        int j = 0, cpu = 0;
        boolean s = true;

        System.out.println("-------------");
        System.out.println(" Bienvenido Al Juego");
        System.out.println("-------------");

        pos = new int[9];
        jug = new String[9];

        do {
            jug[c] = a;
            System.out.println("hola" + jug[c]);
            c++;
        } while (c <=8);

        c = 0;
        System.out.println("--------------------");
        System.out.println("    El Juego Está Por Empezar");
        System.out.println("--------------------");
        jd = inputString("ELija Su Simbolo: X - O =>");
        if ("X".equals(jd)) {
            z = "O";
        } else {
            z = "X";
        }

        do {
            do {
                System.out.println("          TURNO#" + c);
                System.out.println("--------------------");
                System.out.println("elija entre: 0 1 2");
                System.out.println("             3 4 5");
                System.out.println("             6 7 8");
                System.out.println("--------------------");
                j = inputInt("Ingrese la posicion que desea utilizar ");
                System.out.println("--------------------");

                if (j >= 0) {
                    if (j <= 8) {
                        s = false;
                        pos[j] = ju;
                        jug[j] = jd;
                    } else {
                        s = true;
                        System.out.println("Error!");
                    }
                } else {
                    s = true;
                    System.out.println("Error!");
                }



            } while (s == true);


            System.out.println("  Usted Ha Elejido La Posicion" + j);
            System.out.println("------------------------");
            System.out.println("         Turno del cpu");
            System.out.println("------------------------");

            s = true;
            do {


                if ((j <= 0) && (j <= 7)) {
                    cpu = j + 1;
                } else {
                    cpu = j - 1;
                }




                if (jug[cpu].equals(a)) {
                    jug[cpu] = z;
                } else {
                    cpu = cpu + 1;
                }


            } while (s == false);

            System.out.println(" La Computadora ha elejido la posicion" + cpu);

            m = false;

            //EMEZAREMOS CON LA VERIFICACION DEL CAMPEON


            
            if(c==2)
            {
              System.out.println("l");  
            }



            m =VerificacionJ(jug,jd);  
            if (m == true) {
                
            System.out.println("Usted Ha Ganado");
            } else {
            System.out.println("-----");
            }
            
            n =VerificacionC(jug,z);
            if (n == true) {
            System.out.println("La computadora Ha Ganado");
             } else {
            System.out.println("-----");
            }
            



            c++;
        } while (m == false);
    }

    static boolean VerificacionJ(String jug[], String z) {
        boolean r = false;

        if (jug[0].equals(z)) {
            if (jug[1].equals(z)) {
                if (jug[2].equals(z)) {
                    r = true;
                } else {
                    r = false;
                }
            } else {
                if (jug[3].equals(z)) {
                    if (jug[6].equals(z)) {
                        r = true;
                    } else {
                        r = false;
                    }
                } else {
                    if (jug[4].equals(z)) {
                        if (jug[8].equals(z)) {
                            r = true;
                        } else {
                            r = false;
                        }
                    } else {
                        r = false;
                    }
                }
            }
        } else {
            if (jug[1].equals(z)) {
                               
                if (jug[4].equals(z)) 
                    
                {
                    if (jug[7].contains(z)) {
                        r = true;
                    } else {
                        r = false;
                    }
                } else {
                    r = false;
                }
            } else {
                if (jug[2].equals(z)) {
                    if (jug[5].equals(z)) {
                        if (jug[8].equals(z)) {
                            r = true;
                        } else {
                            r = false;
                        }
                    } else {
                        r = false;
                    }
                } else {
                    if (jug[3].equals(z)) {
                        if (jug[4].equals(z)) {
                            if (jug[5].equals(z)) {
                                r = true;
                            } else {
                                r = false;
                            }
                        } else {
                            r = false;
                        }
                    } else {
                        if (jug[6].equals(z)) {
                            if (jug[7].equals(z)) {
                                if (jug[8].equals(z)) {
                                    r = true;
                                } else {
                                    r = false;
                                }
                            } else {
                                r = false;
                            }
                        } else {
                            r = false;
                        }
                    }
                }
            }
        }
        
        return r;
    }

    static boolean VerificacionC(String jug[], String z) {
        boolean r = false;

        if (jug[0].equals(z)) {
            if (jug[1].equals(z)) {
                if (jug[2].equals(z)) {
                    r = true;
                } else {
                    r = false;
                }
            } else {
                if (jug[3].equals(z)) {
                    if (jug[6].equals(z)) {
                        r = true;
                    } else {
                        r = false;
                    }
                } else {
                    if (jug[4].equals(z)) {
                        if (jug[8].equals(z)) {
                            r = true;
                        } else {
                            r = false;
                        }
                    } else {
                        r = false;
                    }
                }
            }
        } else {
            if (jug[1].equals(z)) {
                if (jug[4].equals(z)) {
                    if (jug[7].contains(z)) {
                        r = true;
                    } else {
                        r = false;
                    }
                } else {
                    r = false;
                }
            } else {
                if (jug[2].equals(z)) {
                    if (jug[5].equals(z)) {
                        if (jug[8].equals(z)) {
                            r = true;
                        } else {
                            r = false;
                        }
                    } else {
                        r = false;
                    }
                } else {
                    if (jug[3].equals(z)) {
                        if (jug[4].equals(z)) {
                            if (jug[5].equals(z)) {
                                r = true;
                            } else {
                                r = false;
                            }
                        } else {
                            r = false;
                        }
                    } else {
                        if (jug[6].equals(z)) {
                            if (jug[7].equals(z)) {
                                if (jug[8].equals(z)) {
                                    r = true;
                                } else {
                                    r = false;
                                }
                            } else {
                                r = false;
                            }
                        } else {
                            r = false;
                        }
                    }
                }
            }
        }
        
        return r;
    }
}//Fin de la clase