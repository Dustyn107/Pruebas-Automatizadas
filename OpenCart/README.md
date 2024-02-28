-----------------------------
| Readme                    |
-----------------------------


Este proyecto es un ejemplo de implementación de pruebas de aceptación utilizando Serenity BDD con el patrón de diseño Screenplay y gestionado con Maven.


1. Prerequisitos:
   Antes de comenzar con la ejecución de las pruebas, asegúrate de tener instalados los siguientes componentes:

   - Maquina local con el sistema operativo Windows 11
   - IDE IntelliJ version 2023.1
   - Maven version 3.9.4 (debe estar en la variable de entorno)
   - JDK versión 17.0.4 (debe estar en la variable de entorno)

2. Configuración
   
   - Clona este repositorio en tu máquina local https://github.com/Dustyn107/Pruebas-Automatizadas.git
   - Asegúrate de tener maven instalado y configurado en tu sistema.

3. Instrucciones para ejecutar los test

   Para realizar la ejecuciones las pruebas se puede realizar de dos maneras
   - Ejecutar el runner de que ejecuta los steps
   - Abrir una consola de comando ejecutar el comando mvn clean verify

4. Estructura del proyecto
   El proyecto está organizado de la siguiente manera: 
   • main/java/ec/com/practice: En esta carpeta se encuentran las carpetas de question, task, ui 
   • test/java/ec/com/practice: encontramos las carpetas de runner, stpes, navigation
     En el directorio resource encontremos la carpeta feature y el archivo.feature en donde describen los casos de prueba utilizando la sintaxis de Gherkin. 
   
5. Reporte
   Después de ejecutar las pruebas, los informes de Serenity estarán disponibles en el directorio target/site/serenity.index.html Puedes abrir el archivo index.html en un navegador web para ver los resultados detallados de las pruebas. Tambien se pueden consultar en la terminar de comando una vez que la ejecucion de la prueba ha terminado se indicara como SERENITY REPORTS full report.



