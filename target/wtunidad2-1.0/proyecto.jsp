<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>Palindromo</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    </head>
    <body>		
        <%
                            
leerarchivotexto2.funciones ar= new leerarchivotexto2.funciones();
        
String nombre=request.getParameter("archivo");
String nombre2=request.getParameter("archivo2");
String nombre3=request.getParameter("archivo3");
String nombre4=request.getParameter("archivo4");
//        String cadenaBuscada=request.getParameter("cadenaBuscada");
        
String cadena= ar.leeArchivo(nombre)+ ar.leeArchivo(nombre2) + ar.leeArchivo(nombre3) + ar.leeArchivo(nombre4);
        
out.println("<br><br>");
out.println("Contenido del archivo:  <br>");
out.println(cadena);
        
out.println("<br><br>");
out.println("Resultado: <br>");
out.println(ar.palindrome(cadena));
        
out.println("<br><br>");
out.println("Cuenta letras y signos: <br>");
out.println(ar.cuentaLetras(cadena));
        
//        out.println(ar.buscaCadena(cadenaBuscada,cadena));
        %>	
    </body>
</html>
