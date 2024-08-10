# Segundo Trabajo de Diseño y Arquitectura de Software

Este repositorio contiene el segundo trabajo de Diseño y Arquitectura de Software del grupo compuesto por Juan Camilo Portocarrero y Andres Felipe Camargo Pinilla.

## 1. Primer Caso - Clonación de Personajes en un Videojuego de Aventuras

En este caso, se nos muestra cómo clonar superhéroes ya creados. Esto se relaciona con el patrón de diseño creacional, específicamente el patrón **"Prototype"**. Este patrón permite copiar objetos existentes, lo cual es ideal para nuestro problema.

A continuación, se incluye el diagrama del código:

![image](https://github.com/Andrescampi/DisenoYArquitectura/blob/master/caso1.png)


## 2. Segundo Caso – Empresa de Mensajería

En este problema, se trata de una empresa que está desarrollando una app en la que se busca que, cuando un dispositivo vinculado a un usuario recibe una notificación, todos los dispositivos vinculados a ese usuario también reciban la notificación en tiempo real. El patrón de comportamiento que elegimos es **"Observer"**. Inicialmente, no estábamos convencidos ya que el patrón implicaba una suscripción para recibir notificaciones, pero luego lo vinculamos con el vínculo entre usuario y dispositivo.

A continuación, se incluye el diagrama de clases:
![image](https://github.com/Andrescampi/DisenoYArquitectura/blob/master/caso2.png)



## 3. Tercer Caso - Procesamiento de Ordenes.

Este caso requiere la gestión de diferentes tipos de pedidos, como bebidas, platos fuertes y postres. El patrón de diseño seleccionado es el patrón **"Template Method"**, ya que permite definir la estructura de procesamiento de pedidos en una clase base y delegar la implementación específica de cada tipo de pedido en subclases.

A continuación, se incluye el diagrama de clases:

## 4. Cuarto Caso - Sistema de Gestión de Tareas.

Este caso requiere la gestión de tareas de usuarios, como eliminar, editar, y crear. El patrón de diseño seleccionado es el patrón **"Command"**, ya que permite realizar múltiples acciones sobre una misma tarea.

A continuación, se incluye el diagrama de clases:

![image](https://github.com/Andrescampi/DisenoYArquitectura/blob/master/caso3.png)


## 5. Quinto Caso - Decoración de Habitaciones en un Hotel

En este caso, se nos pide desarrollar un sistema para gestionar la decoración de habitaciones en un hotel de lujo. Cada habitación tiene una decoración estándar, pero los huéspedes pueden solicitar una decoración personalizada. Para esto, se creó un sistema generalizado que usa el patrón **"Decorator"**, permitiendo añadir nuevos comportamientos a objetos ya creados, en este caso, añadir decoración a habitaciones existentes.

A continuación, se incluye el diagrama de clases:

![image](https://github.com/Andrescampi/DisenoYArquitectura/blob/master/caso5.png)

