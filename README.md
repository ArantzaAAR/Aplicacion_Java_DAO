# Aplicacion_Java_DAO

# ☕ Aplicación Java - DAO Pattern con JavaBeans

Este proyecto ha sido desarrollado como parte de la Unidad Formativa 6 (UF6) y tiene como objetivo principal aplicar el **patrón de diseño DAO (Data Access Object)** sobre clases tipo JavaBean. El patrón DAO es una técnica ampliamente utilizada para separar la lógica de acceso a datos del resto de la lógica de negocio, promoviendo un diseño más limpio, mantenible y escalable.

---

## 📁 Estructura del Proyecto

El proyecto original ha sido importado y renombrado como:  
`MINOMBREAPELLIDOS_Actividad4`, siguiendo las indicaciones del ejercicio.

A lo largo de su desarrollo se han trabajado dos interfaces clave:

- `IEmployeeDao`  
- `ILocationDao`  

Ambos definidos a partir de esquemas UML incluidos en el material adicional de la unidad.

---

## 🎯 Objetivos del Proyecto

- Implementar correctamente el patrón DAO sobre entidades JavaBean (`Employee`, `Location`).
- Aplicar principios de programación orientada a objetos: encapsulamiento, reutilización y responsabilidad única.
- Simular operaciones CRUD sobre listas en memoria como si se tratara de una base de datos.
- Estructurar correctamente el código en paquetes organizados, incluyendo pruebas unitarias simples.

---

## 🧩 Implementación de `IEmployeeDao`

### 🔧 Interface

Se ha creado el interface `IEmployeeDao` con los métodos definidos en el esquema UML, los cuales permiten operaciones como:

- Listar todos los empleados.
- Buscar un empleado por ID.
- Agregar un nuevo empleado.
- Eliminar un empleado existente.
- Modificar datos de un empleado.

### 🛠️ Clase `EmployeeDaoImplList`

Esta clase implementa el interface anterior y gestiona una lista de objetos `Employee` como si fuera una base de datos en memoria.

Se han creado múltiples objetos `Employee` para garantizar que cada uno de los métodos pueda ser probado de forma independiente.

---

## 🧩 Implementación de `ILocationDao`

### 🔧 Interface

Del mismo modo, se ha definido el interface `ILocationDao` con los métodos que permiten:

- Obtener todas las localizaciones.
- Buscar por ID o nombre.
- Insertar nuevas localizaciones.
- Eliminar o actualizar localizaciones existentes.

### 🛠️ Clase `LocationDaoImplList`

Implementa `ILocationDao` sobre una lista de objetos `Location`, también simulando persistencia en memoria.

Al igual que con los empleados, se han cargado suficientes objetos `Location` para validar cada funcionalidad del interface.

---

## 🧪 Pruebas

Para garantizar el correcto funcionamiento de todos los métodos, se ha creado un paquete adicional llamado `testactividad`.

Dentro de este paquete se encuentran dos clases de prueba principales:

- `TestEmployeeDao`: contiene métodos de testeo para todos los métodos definidos en `IEmployeeDao`.
- `TestLocationDao`: valida el comportamiento de los métodos en `ILocationDao`.

Cada clase está diseñada para ejecutarse de forma independiente y mostrar en consola los resultados esperados de las operaciones CRUD.

---

## ✅ Cómo Ejecutar el Proyecto

1. Abre tu IDE (recomendado: Eclipse o IntelliJ).
2. Importa el proyecto `MINOMBREAPELLIDOS_Actividad4`.
3. Ejecuta las clases del paquete `testactividad` para probar los métodos.
4. Observa los resultados en la consola para verificar el comportamiento de cada operación.

> Nota: Al trabajar sobre listas en memoria, no es necesario configurar una base de datos.

---

## 📌 Requisitos Técnicos

- JDK 8 o superior
- IDE Java (Eclipse, IntelliJ IDEA, NetBeans)
- Conocimiento básico de JavaBeans y colecciones

---

## 👨‍💻 Autoría

Este proyecto ha sido desarrollado como parte de la formación en desarrollo Java, siguiendo prácticas de diseño orientado a objetos.

**Autor:** Arantza Alcázar  
**Unidad Formativa:** UF6 - Programación en Java  
**Centro Educativo:** UNIR 

---
