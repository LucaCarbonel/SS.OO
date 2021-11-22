#!/bin/bash

while [ "$opcion" != "3" ]; do

echo elija una opcion
echo 1- Opciones
echo 2- Registrarse
echo 3- Salir

read opcion

case $opcion in

1)
  echo INICIO DE SESION
  echo Ingrese su usuario
  read usuario
  echo Ingrese su contraseña
  read contraseña
  if [ $contraseña = Admin ] && [ $usuario = Admin ]
  then
    sh admin.sh
  fi

 ;;

2) echo hola;;

3)
echo nos vemos
;;

esac
done
