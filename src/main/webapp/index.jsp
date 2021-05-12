<script language="javascript">
    function validate()
    {
        var bandera = false;
        var permitida = false;
        var form = document.archivo;
        var f = form.archivo.value;
        var f2 = form.archivo2.value;
        var f3 = form.archivo3.value;
        var f4 = form.archivo4.value;

        var extensiones_permitidas = new Array(".txt");


        var extension = (f.substring(f.lastIndexOf("."))).toLowerCase();
        var extension2 = (f2.substring(f2.lastIndexOf("."))).toLowerCase();
        var extension3 = (f3.substring(f3.lastIndexOf("."))).toLowerCase();
        var extension4 = (f4.substring(f4.lastIndexOf("."))).toLowerCase();

        for (var i = 0; i < extensiones_permitidas.length; i++) {
            if (extensiones_permitidas[i] == extension ||
                    extensiones_permitidas[i] == extension2 ||
                    extensiones_permitidas[i] == extension3 ||
                    extensiones_permitidas[i] == extension4) {
                permitida = true;
                break;
            }
        }

        if (f == "" && f2 == "" && f3 == "" && f4 == "")
            alert("Debes elegir un archivo txt para enviarlo a revision");
        else if (!permitida)
            alert("Solo se permiten archivos con terminacion .txt");

        else
            bandera = true;

        return bandera;
    }


</script>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Palindromo</title>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body><center>
        <h1>Palindromo </h1>
        <br>

        <form name="archivo" method="post" action="proyecto.jsp">
            Selecciona el archivo 1: <input type="file" name="archivo" required></input><br></br>
            Selecciona el archivo 2: <input type="file" name="archivo2" required></input><br></br>
            Selecciona el archivo 3: <input type="file" name="archivo3" required></input><br></br>
            Selecciona el archivo 4: <input type="file" name="archivo4" required></input><br></br>
            <!--                la cadena a buscar: <input type="text" name="cadenaBuscada" required></input><br></br>-->
            <input type="submit" value="enviar" onclick="return validate();">
        </form>
    </center>
</body>
</html>