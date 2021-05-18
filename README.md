# [LinkUp](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/apk/linkup.apk)
Creacion de una app que enlaza distintas funciones simples de Android.

## Como usar LinkUp 📋
1. Descargue la [aplicacion](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/apk/linkup.apk) e instalela.
1. Una vez abierta, deberá elegir una de las opciones mostradas.
1. Seleccionela, dependiendo de la opción, le pedirá unos datos.
1. Pase a introducir los datos requeridos.
1. Una vez introducidos, presione en enviar.
2. Pasará a mostrarse en pantalla el la actividad requerida.

### Ejemplo de uso de LinkUp 🚀
![Ejemplo](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp_Images/ejemplo.gif)


## Código ⚙️

La app se basa en el uso de empty activities en Android Studio.

### MainActivity
La primera empty Activity, será el main, la cual es denominada [MainActivity](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/app/src/main/java/com/chrsoft/linkup/MainActivity.java). Esta se encargará de llevar a cabo distintos metodos, según el boton que esté pulsado. El [diseño](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/app/src/main/res/layout/activity_main.xml) de la actividad es el siguiente:

![MainActivity_Design](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp_Images/MainActivity_Design.png)


### ActivityWeb
Como segunda actividad, tenemos [ActivityWeb](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/app/src/main/java/com/chrsoft/linkup/ActivityWeb.java). Esta actividad se encargara de pedir una URL al usuario y parsearla en el navegador.

![ActivityWeb_Design](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp_Images/ActivityWeb_Design.png)

### ActivityTel
Tercera actividad, [ActivityTel](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/app/src/main/java/com/chrsoft/linkup/ActivityTel.java).
La actividad se encarga de pedir un número de telefono al usuario, y a continuación llamar al numero deseado.

![ActivityTel_Design](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp_Images/ActivityTel_Design.png)

### ActivityMaps
Cuarta actividad, [ActivityMaps](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/app/src/main/java/com/chrsoft/linkup/ActivityMaps.java).
La actividad se encarga de pedir unas coordenadas (latitud y longitud) al usuario, y a continuación mostrar las siguientes en Google Maps.

![ActivityMaps_Design](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp_Images/ActivityMaps_Design.png)


### Cámara
Esta actividad se lleva a cabo en [MainActivity](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/app/src/main/java/com/chrsoft/linkup/MainActivity.java). Se encargará de abrir la app de Camara.


### ActivityCorreo
Quinta actividad, [ActivityCorreo](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/app/src/main/java/com/chrsoft/linkup/ActivityCorreo.java).
La actividad se encarga de pedir un destinatario, un asunto y un cuerpo del correo al usuario, y a continuación mostrar las siguientes en la app de Correo.

![ActivityMaps_Design](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp_Images/ActivityCorreo_Design.png)


## Depuración 🔧

LinkUp esta programada de tal manera, que toma en cuenta los simple errores de parseo que puedan ocurrir.

Por ejemplo:
* Si se escribe una URL incorrecta, pasara a mostrar el texto introducido como una búsqueda de Google.
* En el caso de no introducir ninguna coordenada, mostrará unas por defecto.
* Si no introduce ningun destinatario, asunto o cuerpo, mostrará los establecidos por defecto.


## Enlaces 🔗

* [LinkUp.apk](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/apk/linkup.apk)
* [MainActivity](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/app/src/main/java/com/chrsoft/linkup/MainActivity.java)
  * [Layout MainActivity](https://github.com/cdiazruiz525/MinCalc_ChristianDiazRuiz/blob/main/MinCalc/app/src/main/res/layout/activity_main.xml)
* [ActivityWeb](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/app/src/main/java/com/chrsoft/linkup/ActivityWeb.java)
  * [Layout ActivityWeb](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/app/src/main/res/layout/activity_web.xml)
* [ActivityTel](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/app/src/main/java/com/chrsoft/linkup/ActivityTel.java)
  * [Layout ActivityTel](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/app/src/main/res/layout/activity_tel.xml)
* [ActivityMaps](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/app/src/main/java/com/chrsoft/linkup/ActivityMaps.java)
  * [Layout ActivityMaps](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/app/src/main/res/layout/activity_maps.xml)
* [ActivityCorreo](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/app/src/main/java/com/chrsoft/linkup/ActivityCorreo.java)
  * [Layout ActivityCorreo](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/app/src/main/res/layout/activity_correo.xml)
* [Strings](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/app/src/main/res/values/strings.xml)
* [Manifest](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/blob/main/LinkUp/app/src/main/AndroidManifest.xml)
* [Carpeta de resources](https://github.com/cdiazruiz525/LinkUp_ChristianDiazRuiz/tree/main/LinkUp/app/src/main/res)


## Autor ✒️

* **Christian Díaz** - [cdiazruiz525](https://github.com/cdiazruiz525)
