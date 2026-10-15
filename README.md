# 🌉 Patrón de Diseño Estructural: Bridge (Puente)

Este repositorio contiene material académico, teórico y práctico para comprender e implementar el **Patrón de Diseño Bridge** en Java, abordando los problemas típicos de la herencia rígida (explosión combinatoria de clases) y cómo solucionarlos mediante desacoplamiento y composición.

---

## 🎯 ¿Qué es el Patrón Bridge?

> *"Desacopla una abstracción de su implementación para que ambas puedan variar independientemente."*  
> — **Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides (Gang of Four)**

### 💡 Idea Central
En lugar de depender de una **herencia profunda y rígida** (`es-un`), el patrón Bridge aplica el principio de **composición sobre herencia** (`tiene-un`).  
Separa el dominio en dos jerarquías ortogonales e independientes conectadas por un puente (interfaz implementadora):

1. **Abstracción (Qué hace el objeto a alto nivel):** Define la lógica de negocio y mantiene una referencia al implementador.
2. **Implementación (Cómo se ejecuta a bajo nivel):** Interfaz que define las operaciones primitivas concretas de la plataforma o formato.

```
       [ Abstracción ] ------------ tiene-un (Puente) ------------> [ Implementor (Interfaz) ]
              ▲                                                                 ▲
              │                                                                 │
[ Abstracción Refinada ]                                           [ Implementación Concreta ]
```

---

## 📦 Contenido del Repositorio

| Recurso | Tipo | Descripción |
| :--- | :--- | :--- |
| 📊 [Patrón_de_diseño_Bridge.pptx](file:///c:/Users/herna/Desktop/Patron%20Bridge/Patr%C3%B3n_de_dise%C3%B1o_Bridge.pptx) | Diapositivas | Presentación visual para exposición en clase con fundamentos, diagramas y casos de uso. |
| 📑 [Infografia.pdf](file:///c:/Users/herna/Desktop/Patron%20Bridge/Infografia.pdf) | Documento PDF | Infografía resumen con los puntos clave, ventajas y estructura del patrón. |
| 📁 [EjemploBridge/](file:///c:/Users/herna/Desktop/Patron%20Bridge/EjemploBridge) | Proyecto Java | **Sistema de Reportes**: Demuestra la transición de herencia rígida a Bridge con exportación a PDF, HTML y JSON. |
| 📁 [Solucion Ejercicio/](file:///c:/Users/herna/Desktop/Patron%20Bridge/Solucion%20Ejercicio) | Proyecto Java | **Sistema de Alertas Universitarias**: Ejercicio práctico con alertas (Académica/Urgente) y canales (Email, SMS, WhatsApp). |

---

## 🏗️ Proyectos Prácticos Incluidos

### 1. Sistema de Generación de Reportes (`EjemploBridge/`)
- **Problema Inicial (`antes/`):** Al combinar tipos de reporte (`ReporteVentas`, `ReporteFinanciero`) con formatos de salida (`PDF`, `HTML`), se requieren $N \times M = 4$ clases derivadas. Si se añade un formato JSON y un nuevo tipo de reporte, la cantidad de subclases se dispara exponencialmente.
- **Solución con Bridge (`despues/`):**
  - **Abstracción:** `Reporte` y sus variantes `ReporteVentas`, `ReporteFinanciero`.
  - **Puente / Implementor:** Interfaz `FormatoReporte`.
  - **Implementaciones Concretas:** `FormatoPDF`, `FormatoHTML`, `FormatoJSON`.
  - **Beneficio adicional:** Posibilidad de cambiar el formato en tiempo de ejecución (`setFormato(...)`).

### 2. Sistema de Alertas Universitarias (`Solucion Ejercicio/`)
- **Problema Inicial (`codigo_antes/`):** Clases híbridas como `AcademicEmailAlert`, `AcademicSMSAlert`, `UrgentEmailAlert`, etc.
- **Solución con Bridge (`src/`):**
  - **Abstracción:** `Alert` (con referencia `# channel`) y subclases `AcademicAlert`, `UrgentAlert`.
  - **Puente / Implementor:** Interfaz `NotificationChannel`.
  - **Implementaciones Concretas:** `EmailChannel`, `SMSChannel` y la extensión modular `WhatsAppChannel`.
  - **Diagrama UML:** Disponible en [diagrama_uml_bridge.png](file:///c:/Users/herna/Desktop/Patron%20Bridge/Solucion%20Ejercicio/diagrama_uml_bridge.png).

---

## ⚖️ Comparativa: Herencia Clásica vs. Patrón Bridge

| Aspecto | Herencia Rígida (Sin Bridge) | Patrón Bridge |
| :--- | :--- | :--- |
| **Relación** | Acoplamiento estático (`extends`) | Composición dinámica (`tiene-un`) |
| **Crecimiento de clases** | Multiplicativo ($N \times M$) | Aditivo ($N + M$) |
| **Extensibilidad** | Agregar 1 formato requiere modificar o crear múltiples subclases | Agregar 1 formato o 1 tipo solo requiere 1 nueva clase |
| **Flexibilidad en Runtime** | Fijado en tiempo de compilación | El implementador puede sustituirse dinámicamente |
| **Principios SOLID** | Viola OCP y SRP (mezcla negocio con formato/canal) | Cumple con OCP (abierto/cerrado) y SRP |

---

## 🚀 Guía de Compilación y Ejecución

Asegúrate de tener instalado Java SDK (JDK 8 o superior).

### Ejecutar Ejemplo 1: Sistema de Reportes (`EjemploBridge`)

```powershell
# Moverse al directorio del proyecto
cd "c:\Users\herna\Desktop\Patron Bridge\EjemploBridge"

# 1. Compilar todo el código fuente
javac -d bin src/antes/*.java src/despues/formato/*.java src/despues/reporte/*.java src/despues/*.java

# 2. Ejecutar caso ANTES (Herencia rígida)
java -cp bin antes.MainAntes

# 3. Ejecutar caso DESPUÉS (Patrón Bridge)
java -cp bin despues.MainDespues
```

### Ejecutar Ejemplo 2: Sistema de Alertas (`Solucion Ejercicio`)

```powershell
# Moverse al directorio del proyecto
cd "c:\Users\herna\Desktop\Patron Bridge\Solucion Ejercicio"

# 1. Compilar y ejecutar el caso previo (Sin Bridge)
javac -d codigo_antes/bin codigo_antes/src/com/universidad/antes/*.java
java -cp codigo_antes/bin com.universidad.antes.MainAntes

# 2. Compilar y ejecutar la solución con Bridge
javac -d bin -sourcepath src src/com/universidad/alertas/Main.java
java -cp bin com.universidad.alertas.Main
```

---

## 📂 Estructura General del Directorio

```text
Patron Bridge/
├── 📄 Infografia.pdf                     # Infografía explicativa del patrón
├── 📊 Patrón_de_diseño_Bridge.pptx       # Presentación en diapositivas
├── 📖 README.md                          # Documentación general del repositorio
│
├── 📁 EjemploBridge/                     # Caso práctico: Sistema de Reportes
│   ├── 📖 README.md                      # Detalle paso a paso del ejemplo
│   ├── 🖼️ Antes.jpg                      # Diagrama conceptual previo
│   ├── 🖼️ Despues.jpg                    # Diagrama conceptual con Bridge
│   └── 📁 src/
│       ├── 📁 antes/                     # Código con herencia directa
│       └── 📁 despues/                   # Código desacoplado con Bridge
│
└── 📁 Solucion Ejercicio/                # Reto resuelto: Alertas Universitarias
    ├── 📖 README.md                      # Documentación del reto
    ├── 🖼️ diagrama_uml_bridge.png        # Diagrama UML exportado
    ├── 📁 codigo_antes/                  # Código antes de refactorizar
    └── 📁 src/                           # Solución modular con Bridge
```
