#!/usr/bin/python3
import time
#Llamamos al tipo de Operacion

def tipoOperacion():
    correcto = False
    num = 0
    while (not correcto):
        try:
            num = int(input("ESCOJA UNA OPCION: "))
            print("     ")
            correcto = True
        except ValueError:
            print('Error, introduce un numero e2ntero')

    return num


salir = False
opcion = 0
#LLamamos a la Opcion con el numero de valores a Operar
def numeroValores():
    bien = False
    n = 0
    while (not bien):
        try:
            n = int(input("ESCOJA UN NUMERO DE VALORES"))
            print("     ")
            bien = True
        except ValueError:
            print('Error, introduce un numero entero')

    return n


sal = False
op = 0

#Ordenamiento Por seleccion
def selectionsort(lista, tam):
    print("Arreglo Desordenado")
    print(lista)
    for i in range(0, tam - 1):
        min = i
        for j in range(i + 1, tam):
            if lista[min] > lista[j]:
                min = j
        aux = lista[min]
        lista[min] = lista[i]
        lista[i] = aux
    print ("Arreglo Ordenado")
    print lista

def ordenamiento_Combinacion(Lista):
    print("Dividir ",Lista)
    if len(Lista)>1:
        mitad = len(Lista)//2
        mitadIzquierda = Lista[:mitad]
        mitadDerecha = Lista[mitad:]

        ordenamiento_Combinacion(mitadIzquierda)
        ordenamiento_Combinacion(mitadDerecha)

        i=0
        j=0
        k=0
        while i < len(mitadIzquierda) and j < len(mitadDerecha):
            if mitadIzquierda[i] < mitadDerecha[j]:
                Lista[k]=mitadIzquierda[i]
                i=i+1
            else:
                Lista[k]=mitadDerecha[j]
                j=j+1
            k=k+1

        while i < len(mitadIzquierda):
            Lista[k]=mitadIzquierda[i]
            i=i+1
            k=k+1

        while j < len(mitadDerecha):
            Lista[k]=mitadDerecha[j]
            j=j+1
            k=k+1
    print("Mezclar ",Lista)

#Ordenamiento Por Ircecion
def ordenamiento_insercion(lista):
    print("Lista Desordenanda")
    for i in xrange(len(lista) - 1):
        if lista[i + 1] < lista[i]:
            reubicar(lista, i + 1)
        print "Despuesde Pasada :", i, ">", lista
    print("Arreglo Ordenado")
    print(lista)
def reubicar(lista, p):
    v = lista[p]
    j = p
    while j > 0 and v < lista[j - 1]:
        lista[j] = lista[j - 1]
        j -= 1
    lista[j] = v

#Leer Lista
def leeLista(op):
    if op ==1:
        archivo = open("100.txt", "r")
        contenido = archivo.readlines()
        lista_data = [int(r) for r in contenido]
        return lista_data
    elif op == 2:
        archivo = open("1000.txt", "r")
        contenido = archivo.readlines()
        lista_data = [int(r) for r in contenido]
        return lista_data
    elif op == 3:
        archivo = open("5000.txt", "r")
        contenido = archivo.readlines()
        lista_data = [int(r) for r in contenido]
        return lista_data
    elif op == 4:
        archivo = open("10000.txt", "r")
        contenido = archivo.readlines()
        lista_data = [int(r) for r in contenido]
        return lista_data
    elif op == 5:
        archivo = open("50000.txt", "r")
        contenido = archivo.readlines()
        lista_data = [int(r) for r in contenido]
        return lista_data
    elif op == 6:
        archivo = open("100000.txt", "r")
        contenido = archivo.readlines()
        lista_data = [int(r) for r in contenido]
        return lista_data
    elif op == 7:
        archivo = open("500000.txt", "r")
        contenido = archivo.readlines()
        lista_data = [int(r) for r in contenido]
        return lista_data
    elif op == 8:
        archivo = open("1000000.txt", "r")
        contenido = archivo.readlines()
        lista_data = [int(r) for r in contenido]
        return lista_data
    elif op == 9:
        archivo = open("2000000.txt", "r")
        contenido = archivo.readlines()
        lista_data = [int(r) for r in contenido]
        return lista_data



while not salir:

    print ("1: Ordenamiento Por Seleccion")
    print ("2: Ordenamiento Por combinacion")
    print ("3: Ordenamiento Por Inserccion")
    print ("4: SALIR")

    print ("Elige una opcion")

    opcion = tipoOperacion()

    if opcion == 1:

        print ("A SELECCIONADO LA OPCION :", "Ordenamiento Por Seleccion")
        while not sal:
            print ("1: (100)")
            print ("2: (1000)")
            print ("3: (5000)")
            print ("4: (10000)")
            print ("5: (50000)")
            print ("6: (100000)")
            print ("7: (500000)")
            print ("8: (1000000)")
            print ("9: (2000000)")
            print("0: Salir")
            print ("Ingrese la Opcion con el Numero de valores a Operar")
            op = numeroValores()
            if op == 1:
                print("A seleccionado la operacion con 100 valores")
                #leeArchivo()
                starting_point = time.time()
                A = leeLista(op)
                selectionsort(A, len(A))

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes ,"Segundos: ", elapsed_time_seconds)
            elif op ==2:

                print("A seleccionado la operacion con 1000 valores")
                # leeArchivo()
                starting_point = time.time()
                A = leeLista(op)
                selectionsort(A, len(A))

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)

            elif op ==3:
                print ("A seleccionado la operacion con 5000 valores")
                # leeArchivo()
                starting_point = time.time()
                A = leeLista(op)
                selectionsort(A, len(A))

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)

            elif op == 4:
                print ("A seleccionado la operacion con 10000 valores")
                starting_point = time.time()
                A = leeLista(op)
                selectionsort(A, len(A))

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)

            elif op == 5:
                print ("A seleccionado la operacion con 50000 valores")
                starting_point = time.time()
                A = leeLista(op)
                selectionsort(A, len(A))

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)

            elif op == 6:
                print ("A seleccionado la operacion con 500000 valores")
                starting_point = time.time()
                A = leeLista(op)
                selectionsort(A, len(A))

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)

            elif op == 7:
                print ("A seleccionado la operacion con 100000 valores")
                starting_point = time.time()
                A = leeLista(op)
                selectionsort(A, len(A))

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)

            elif op == 8:
                print ("A seleccionado la operacion con 1000000 valores")
                starting_point = time.time()
                A = leeLista(op)
                selectionsort(A, len(A))

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)
            elif op == 9:
                print ("A seleccionado la operacion con 2000000 valores")
                starting_point = time.time()
                A = leeLista(op)
                selectionsort(A, len(A))

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)
            elif op == 0:
                sal = True
            else:
                print ("Introduce un numero entre 1 y 9")
        print ("Fin")
        print ("    ")
    elif opcion == 2:
        print ("A SELECCIONADO LA OPCION 2:", "Ordenamiento por Combinacion")
        while not sal:
            print ("1: (100)")
            print ("2: (1000)")
            print ("3: (5000)")
            print ("4: (10000)")
            print ("5: (50000)")
            print ("6: (100000)")
            print ("7: (500000)")
            print ("8: (1000000)")
            print ("9: (2000000)")
            print("0: Salir")
            print ("Ingrese la Opcion con el Numero de valores a Operar")
            op = numeroValores()
            if op == 1:
                print("A seleccionado la operacion con 100 valores")
                starting_point = time.time()
                B = leeLista(op)
                ordenamiento_Combinacion(B)

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)
            elif op == 2:

                print("A seleccionado la operacion con 1000 valores")
                starting_point = time.time()
                B = leeLista(op)
                ordenamiento_Combinacion(B)

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)

            elif op == 3:
                print ("A seleccionado la operacion con 5000 valores")
                starting_point = time.time()
                B = leeLista(op)
                ordenamiento_Combinacion(B)

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)

            elif op == 4:
                print ("A seleccionado la operacion con 10000 valores")
                starting_point = time.time()
                B = leeLista(op)
                ordenamiento_Combinacion(B)

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)

            elif op == 5:
                print ("A seleccionado la operacion con 50000 valores")
                starting_point = time.time()
                B = leeLista(op)
                ordenamiento_Combinacion(B)

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)

            elif op == 6:
                print ("A seleccionado la operacion con 500000 valores")
                starting_point = time.time()
                B = leeLista(op)
                ordenamiento_Combinacion(B)

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)

            elif op == 7:
                print ("A seleccionado la operacion con 100000 valores")
                starting_point = time.time()
                B = leeLista(op)
                ordenamiento_Combinacion(B)

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)

            elif op == 8:
                print ("A seleccionado la operacion con 1000000 valores")
                starting_point = time.time()
                B = leeLista(op)
                ordenamiento_Combinacion(B)

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)
            elif op == 9:
                print ("A seleccionado la operacion con 2000000 valores")
                starting_point = time.time()
                B = leeLista(op)
                ordenamiento_Combinacion(B)

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)
            elif op == 0:
                sal = True
            else:
                print ("Introduce un numero entre 1 y 9")
        print ("Fin")
        print ("    ")
    elif opcion == 3:
        print ("A SELECCIONADO LA OPCION 3 :", "Ordenamiento por Insercion")
        while not sal:
            print ("1: (100)")
            print ("2: (1000)")
            print ("3: (5000)")
            print ("4: (10000)")
            print ("5: (50000)")
            print ("6: (100000)")
            print ("7: (500000)")
            print ("8: (1000000)")
            print ("9: (2000000)")
            print("0: Salir")
            print ("Ingrese la Opcion con el Numero de valores a Operar")
            op = numeroValores()
            if op == 1:
                print("A seleccionado la operacion con 100 valores")
                starting_point = time.time()
                B = leeLista(op)
                ordenamiento_insercion(B)

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)
            elif op == 2:

                print("A seleccionado la operacion con 1000 valores")
                starting_point = time.time()
                B = leeLista(op)
                ordenamiento_insercion(B)

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)

            elif op == 3:
                print ("A seleccionado la operacion con 5000 valores")
                starting_point = time.time()
                B = leeLista(op)
                ordenamiento_insercion(B)

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)

            elif op == 4:
                print ("A seleccionado la operacion con 10000 valores")
                starting_point = time.time()
                B = leeLista(op)
                ordenamiento_insercion(B)

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)

            elif op == 5:
                print ("A seleccionado la operacion con 50000 valores")
                starting_point = time.time()
                B = leeLista(op)
                ordenamiento_insercion(B)

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)

            elif op == 6:
                print ("A seleccionado la operacion con 500000 valores")
                starting_point = time.time()
                B = leeLista(op)
                ordenamiento_insercion(B)

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)

            elif op == 7:
                print ("A seleccionado la operacion con 100000 valores")
                starting_point = time.time()
                B = leeLista(op)
                ordenamiento_insercion(B)

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)

            elif op == 8:
                print ("A seleccionado la operacion con 1000000 valores")
                starting_point = time.time()
                B = leeLista(op)
                ordenamiento_insercion(B)

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)
            elif op == 9:
                print ("A seleccionado la operacion con 2000000 valores")
                starting_point = time.time()
                B = leeLista(op)
                ordenamiento_insercion(B)

                elapsed_time = time.time() - starting_point
                elapsed_time_minutes = elapsed_time / 60
                elapsed_time_seconds = elapsed_time % 60
                print ("Tiempo", "Minutos:", elapsed_time_minutes, "Segundos: ", elapsed_time_seconds)
            elif op == 0:
                sal = True
            else:
                print ("Introduce un numero entre 1 y 9")
        print ("Fin")
        print ("    ")

    elif opcion == 4:
        salir = True
    else:
        print ("Introduce un numero entre 1 y 3")

print ("Fin")