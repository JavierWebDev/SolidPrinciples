# Ejercicios de Práctica - Principios SOLID

Este repositorio contiene una serie de ejercicios diseñados para practicar cada uno de los principios SOLID aplicados en Kotlin.

---

## 1. **Principio de Responsabilidad Única (SRP)**

### **Enunciado**
Diseña un sistema de **gestión de reportes** que cumpla con el principio de responsabilidad única:
- Una clase debe encargarse únicamente de la generación de reportes.
- Otra clase debe manejar la lógica de guardado (por ejemplo, guardar en archivo o base de datos).
- Otra clase debe manejar la presentación (impresión por consola).

**Objetivo:**  
Separar las responsabilidades para evitar que una sola clase maneje múltiples tareas.

---

## 2. **Principio Abierto/Cerrado (OCP)**

### **Ejercicio 1: Sistema de Pagos**
**Enunciado**  
Implementa un sistema que permita procesar diferentes tipos de pago:
- Tarjeta de crédito
- PayPal
- Criptomonedas

Debe ser posible agregar nuevos métodos de pago **sin modificar** el código existente del gestor principal.

---

### **Ejercicio 2: Sistema de Notificaciones**
**Enunciado**  
Crea un sistema de notificaciones:
- Email
- SMS

Posteriormente, agrega:
- Notificaciones push
- Notificaciones de WhatsApp

El gestor de notificaciones no debe modificarse para aceptar los nuevos canales.

---

## 3. **Principio de Sustitución de Liskov (LSP)**

### **Ejercicio: Jerarquía de Aves**
**Enunciado**  
Modela un sistema para representar aves:
- Todas las aves pueden hacer un sonido (`makeSound()`).
- Algunas aves pueden volar (`fly()`), pero otras como los pingüinos no.

Requisitos:
1. Crea una clase base `Bird` con el comportamiento común.
2. Crea una interfaz `FlyingBird` para las aves que sí vuelan.
3. Implementa clases como:
   - `Sparrow` (vuela)
   - `Penguin` (no vuela)
4. Crea funciones:
   - `makeSoundAll(birds: List<Bird>)` → hace sonar todas las aves.
   - `makeFly(birds: List<FlyingBird>)` → hace volar solo a las aves que implementan la interfaz.

**Objetivo:**  
Asegurarse de que sustituir una subclase por su superclase no rompa el comportamiento del sistema.
