/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerarchivotexto2;

/**
 *
 * @author isra
 */
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class funciones {
private int countL = 1;    // Funcion para leer archivo
    public String leeArchivo(String nombre) {
        String cadena = "";
        try {
            // Abrimos el archivo
            //FileInputStream fstream = new FileInputStream("C:/JSP/"+nombre);
            FileInputStream fstream = new FileInputStream(nombre);///path
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;

            // Leer el archivo linea por linea
             countL = 0;
            while ((strLinea = buffer.readLine()) != null) {
                countL++;
                // Imprimimos la línea por pantalla
                cadena = cadena + strLinea;
            }
            countL++;
            // Cerramos el archivo
            entrada.close();
        } catch (Exception e) { //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        return cadena;
    }

    // funcion para saber si es palindromo
    public String palindrome(String cadena) {

        String textoinvertido = "";
        String respuesta = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            textoinvertido = textoinvertido.replace(" ", "") + cadena.charAt(i);
        }

        if (cadena.replace(" ", "").equalsIgnoreCase(textoinvertido)) {
            respuesta = "SI es palindromo";
        } else {
            respuesta = "NO es palindromo";
        }

        return respuesta;
    }

    // funcion para saber el numero de repeticiones de cada letra
    public String cuentaLetras(String cadena) {
        String resul = "";
        int no[] = new int[101];
        int i = 0;

        //\u00f1 sacar ñ
        for (i = 0; i < cadena.length(); i++) {

            switch (cadena.charAt(i)) {
                case 'a':
                    no[0] = no[0] + 1;
                    break;
                case 'b':
                    no[1] = no[1] + 1;
                    break;
                case 'c':
                    no[2] = no[2] + 1;
                    break;
                case 'd':
                    no[3] = no[3] + 1;
                    break;
                case 'e':
                    no[4] = no[4] + 1;
                    break;
                case 'f':
                    no[5] = no[5] + 1;
                    break;
                case 'g':
                    no[6] = no[6] + 1;
                    break;
                case 'h':
                    no[7] = no[7] + 1;
                    break;
                case 'i':
                    no[8] = no[8] + 1;
                    break;
                case 'j':
                    no[9] = no[9] + 1;
                    break;
                case 'k':
                    no[10] = no[10] + 1;
                    break;
                case 'l':
                    no[11] = no[11] + 1;
                    break;
                case 'm':
                    no[12] = no[12] + 1;
                    break;
                case 'n':
                    no[13] = no[13] + 1;
                    break;
                case '\u00f1':
                    no[14] = no[14] + 1;
                    break;
                case 'o':
                    no[15] = no[15] + 1;
                    break;
                case 'p':
                    no[16] = no[16] + 1;
                    break;
                case 'q':
                    no[17] = no[17] + 1;
                    break;
                case 'r':
                    no[18] = no[18] + 1;
                    break;
                case 's':
                    no[19] = no[19] + 1;
                    break;
                case 't':
                    no[20] = no[20] + 1;
                    break;
                case 'u':
                    no[21] = no[21] + 1;
                    break;
                case 'v':
                    no[22] = no[22] + 1;
                    break;
                case 'w':
                    no[23] = no[23] + 1;
                    break;
                case 'x':
                    no[24] = no[24] + 1;
                    break;
                case 'y':
                    no[25] = no[25] + 1;
                    break;
                case 'z':
                    no[26] = no[26] + 1;
                    break;
                case '0':
                    no[27] = no[27] + 1;
                    break;
                case '1':
                    no[28] = no[28] + 1;
                    break;
                case '2':
                    no[29] = no[29] + 1;
                    break;
                case '3':
                    no[30] = no[30] + 1;
                    break;
                case '4':
                    no[31] = no[31] + 1;
                    break;
                case '5':
                    no[32] = no[32] + 1;
                    break;
                case '6':
                    no[33] = no[33] + 1;
                    break;
                case '7':
                    no[34] = no[34] + 1;
                    break;
                case '8':
                    no[35] = no[35] + 1;
                    break;
                case '9':
                    no[36] = no[36] + 1;
                    break;
                case ',':
                    no[37] = no[37] + 1;
                    break;
                case '.':
                    no[38] = no[38] + 1;
                    break;
                case '-':
                    no[39] = no[39] + 1;
                    break;
                case '_':
                    no[40] = no[40] + 1;
                    break;
                case '{':
                    no[41] = no[41] + 1;
                    break;
                case '}':
                    no[42] = no[42] + 1;
                    break;
                case '´':
                    no[43] = no[43] + 1;
                    break;
                case '+':
                    no[44] = no[44] + 1;
                    break;
                case '*':
                    no[45] = no[45] + 1;
                    break;
                case '[':
                    no[46] = no[46] + 1;
                    break;
                case ']':
                    no[47] = no[47] + 1;
                    break;
                case '¡':
                    no[48] = no[48] + 1;
                    break;
                case '¬':
                    no[49] = no[49] + 1;
                    break;
                case '!':
                    no[50] = no[50] + 1;
                    break;
                case '¿':
                    no[51] = no[51] + 1;
                    break;
                case '?':
                    no[52] = no[52] + 1;
                    break;
                case '"':
                    no[53] = no[53] + 1;
                    break;
                case '#':
                    no[54] = no[54] + 1;
                    break;
                case '$':
                    no[55] = no[55] + 1;
                    break;
                case '%':
                    no[56] = no[56] + 1;
                    break;
                case '&':
                    no[57] = no[57] + 1;
                    break;
                case '(':
                    no[58] = no[58] + 1;
                    break;
                case ')':
                    no[59] = no[59] + 1;
                    break;
                case '=':
                    no[60] = no[60] + 1;
                    break;
                case ';':
                    no[61] = no[61] + 1;
                    break;
                case ':':
                    no[62] = no[62] + 1;
                    break;
                case '¨':
                    no[63] = no[63] + 1;
                    break;
                case '^':
                    no[64] = no[64] + 1;
                    break;
                case '@':
                    no[65] = no[65] + 1;
                    break;
                case '~':
                    no[66] = no[66] + 1;
                    break;
                case '/':
                    no[67] = no[67] + 1;
                    break;
                case '<':
                    no[68] = no[68] + 1;
                    break;
                case '>':
                    no[69] = no[69] + 1;
                    break;
                case '|':
                    no[70] = no[70] + 1;
                    break;
                case '°':
                    no[71] = no[71] + 1;
                    break;
                case ' ':
                    no[72] = no[72] + 1;
                    break;
                case 'A':
                    no[73] = no[73] + 1;
                    break;
                case 'B':
                    no[74] = no[74] + 1;
                    break;
                case 'C':
                    no[75] = no[75] + 1;
                    break;
                case 'D':
                    no[76] = no[76] + 1;
                    break;
                case 'E':
                    no[77] = no[77] + 1;
                    break;
                case 'F':
                    no[78] = no[78] + 1;
                    break;
                case 'G':
                    no[79] = no[79] + 1;
                    break;
                case 'H':
                    no[80] = no[80] + 1;
                    break;
                case 'I':
                    no[81] = no[81] + 1;
                    break;
                case 'J':
                    no[82] = no[82] + 1;
                    break;
                case 'K':
                    no[83] = no[83] + 1;
                    break;
                case 'L':
                    no[84] = no[84] + 1;
                    break;
                case 'M':
                    no[85] = no[85] + 1;
                    break;
                case 'N':
                    no[86] = no[86] + 1;
                    break;
                case '\u00d1':
                    no[87] = no[87] + 1;
                    break;
                case 'O':
                    no[88] = no[88] + 1;
                    break;
                case 'P':
                    no[89] = no[89] + 1;
                    break;
                case 'Q':
                    no[90] = no[90] + 1;
                    break;
                case 'R':
                    no[91] = no[91] + 1;
                    break;
                case 'S':
                    no[92] = no[92] + 1;
                    break;
                case 'T':
                    no[93] = no[93] + 1;
                    break;
                case 'U':
                    no[94] = no[94] + 1;
                    break;
                case 'V':
                    no[95] = no[95] + 1;
                    break;
                case 'W':
                    no[96] = no[96] + 1;
                    break;
                case 'X':
                    no[97] = no[97] + 1;
                    break;
                case 'Y':
                    no[98] = no[98] + 1;
                    break;
                case 'Z':
                    no[99] = no[99] + 1;
                    break;
                default:
                    no[100] = no[100] + 1;
                    break;

            }
        }

        resul += "<table BORDER='2'>";
        resul += "<tr><TD>MINUSCULAS</TD><td> a </td> <td> b </td> <td> c </td> <td> d </td> <td> e </td> <td> f </td> <td> g </td>"
                + "<td> h </td><td> i </td><td> j </td><td> k </td><td> l </td><td> m </td><td> n </td><td> ñ </td><td> o </td>"
                + "<td> p </td><td> q </td><td> r </td><td> s </td><td> t </td><td> u </td><td> v </td><td> w </td><td> x </td><td> y </td><td> z </td> </TR>";

        resul += "<TR><TD>REPETICIONES</TD><td>" + no[0] + "</td><td>" + no[1] + "</td><td>" + no[2] + "</td><td>" + no[3] + "</td><td>" + no[4] + "</td><td>" + no[5] + "</td><td>" + no[6] + "</td>"
                + "<td>" + no[7] + "</td><td>" + no[8] + "</td><td>" + no[9] + "</td><td>" + no[10] + "</td><td>" + no[11] + "</td><td>" + no[12] + "</td><td>" + no[13] + "</td><td>" + no[14] + "</td>"
                + "<td>" + no[15] + "</td><td>" + no[16] + "</td><td>" + no[17] + "</td><td>" + no[18] + "</td><td>" + no[19] + "</td><td>" + no[20] + "</td><td>" + no[21] + "</td><td>" + no[22] + "</td>"
                + "<td>" + no[23] + "</td><td>" + no[24] + "</td><td>" + no[25] + "</td><td>" + no[26] + "</td></BR>";

        resul += "</table>";

        resul += "<table BORDER='2'>";
        resul += "<tr><TD>MAYUSCULAS</TD><td> A </td> <td> B </td> <td> C </td> <td> D </td> <td> E </td> <td> F </td> <td> G </td>"
                + "<td> H </td><td> I </td><td> J </td><td> K </td><td> L </td><td> M </td><td> N </td><td> Ñ </td><td> O </td>"
                + "<td> P </td><td> Q </td><td> R </td><td> S </td><td> T </td><td> U </td><td> V </td><td> W </td><td> X </td><td> Y </td><td> Z </td> </TR>";

        resul += "<TR><TD>REPETICIONES</TD><td>" + no[73] + "</td><td>" + no[74] + "</td><td>" + no[75] + "</td><td>" + no[76] + "</td><td>" + no[77] + "</td><td>" + no[78] + "</td><td>" + no[79] + "</td>"
                + "<td>" + no[80] + "</td><td>" + no[81] + "</td><td>" + no[82] + "</td><td>" + no[83] + "</td><td>" + no[84] + "</td><td>" + no[85] + "</td><td>" + no[86] + "</td><td>" + no[87] + "</td>"
                + "<td>" + no[88] + "</td><td>" + no[89] + "</td><td>" + no[90] + "</td><td>" + no[91] + "</td><td>" + no[92] + "</td><td>" + no[93] + "</td><td>" + no[94] + "</td><td>" + no[95] + "</td>"
                + "<td>" + no[96] + "</td><td>" + no[97] + "</td><td>" + no[98] + "</td><td>" + no[99] + "</td></BR>";

        resul += "</table>";

        resul += "<table BORDER='2'>";
        resul += "<tr><TD>SIGNOS</TD><td> 0 </td> <td> 1 </td> <td> 2 </td> <td> 3 </td> <td> 4 </td> <td> 5 </td> <td> 6 </td>"
                + "<td> 7 </td><td> 8 </td><td> 9 </td><td> , </td><td> . </td><td> - </td><td> _ </td><td> { </td><td> } </td>"
                + "<td> ´ </td><td> + </td><td> * </td><td> [ </td><td> ] </td><td> ¡ </td><td> ¬ </td><td> ! </td><td> ¿ </td><td> ? </td><td> \" </td><td> # </td><td> $ </td><td> % </td>"
                + "<td> $ </td><td> ( </td><td> ) </td><td> = </td><td> ; </td><td> : </td><td> ¨ </td><td> ^ </td><td> @ </td><td> ~ </td><td> / </td><td> < </td><td> > </td>"
                + "<td> | </td><td> ° </td><td>ESPACIOS</td><td>ENTERS</td></TR>";
        resul += "<TR><TD>REPETICIONES</TD><td>" + no[27] + "</td><td>" + no[28] + "</td><td>" + no[29] + "</td><td>" + no[30] + "</td><td>" + no[31] + "</td><td>" + no[32] + "</td><td>" + no[33] + "</td>"
                + "<td>" + no[34] + "</td><td>" + no[35] + "</td><td>" + no[36] + "</td><td>" + no[37] + "</td><td>" + no[38] + "</td><td>" + no[39] + "</td><td>" + no[40] + "</td><td>" + no[41] + "</td>"
                + "<td>" + no[42] + "</td><td>" + no[43] + "</td><td>" + no[44] + "</td><td>" + no[45] + "</td><td>" + no[46] + "</td><td>" + no[47] + "</td><td>" + no[48] + "</td><td>" + no[49] + "</td>"
                + "<td>" + no[50] + "</td><td>" + no[51] + "</td><td>" + no[52] + "</td><td>" + no[53] + "</td>"
                + "<td>" + no[54] + "</td><td>" + no[55] + "</td><td>" + no[56] + "</td><td>" + no[57] + "</td><td>" + no[58] + "</td><td>" + no[59] + "</td><td>" + no[60] + "</td>"
                + "<td>" + no[61] + "</td><td>" + no[62] + "</td><td>" + no[63] + "</td><td>" + no[64] + "</td><td>" + no[65] + "</td><td>" + no[66] + "</td><td>" + no[67] + "</td><td>" + no[68] + "</td>"
                + "<td>" + no[69] + "</td><td>" + no[70] + "</td><td>" + no[71] + "</td><td>" + no[72] + "</td><td>" + countL + "</td></BR>";

        resul += "</table>";

        return resul;

    }

    public String buscaCadena(String cadenaBuscada, String cadena) {
        String resul = "";
        String caden = "";

        cadena = cadena.toLowerCase();
        cadenaBuscada = cadenaBuscada.toLowerCase();
        int count = 0, fromIndex = 0;
        resul += "<table BORDER='2'>";
        while ((fromIndex = cadena.indexOf(cadenaBuscada, fromIndex)) != -1) {
            caden += "Encontrada en la posicion: " + fromIndex + "<br>";
            count++;
            fromIndex++;
        }
        resul += "<tr><TD><center>CADENA " + cadenaBuscada + "</center></TD><td> " + caden + "</td></TR>";
        resul += "<TR><TD>TOTAL DE VECES ENCONTRADA LA CADENA: " + cadenaBuscada + "</TD><td>" + count + "</td></BR>";
        resul+= "<br>Total de veces encontrada la cadena "+cadenaBuscada+" : " + count;    
        resul += "</table>";
        return resul;
    }

}
