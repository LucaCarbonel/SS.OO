#!/bin/bash

echo Hola Sr.Admin

while : do

echo ingrese una opcion
echo 1- Listar alumnos y docentes
echo 2- Ver registros de mas inasistencias
echo 3- Agregar grupos
echo 4- Agregar tutores
echo 5- Volver

read opcion

case $opcion in

1)
  ;;
2)

;;
3)

;;
4)
  echo Ingrese nombre del nuevo tutor
  read nombretutor
  adduser 
;;
5)
bash proyecto.sh
;;
*)
echo opcion invalida
;;
done
