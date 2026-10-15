# Solución Completa: Sistema de Alertas Universitarias (Patrón Bridge)

## 1. Diagrama UML en Imagen (Estilo Diapositiva)

Hemos recreado el diagrama visual respetando el estilo gráfico de tu diapositiva (fondo oscuro navy, cajas doradas y relaciones UML precisas):

- **Imagen PNG de alta definición:** [diagrama_uml_bridge.png](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/diagrama_uml_bridge.png)
- **Imagen Vectorial SVG (escalable para PowerPoint):** [diagrama_uml_bridge.svg](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/diagrama_uml_bridge.svg)

---

## 2. Código ANTES de Aplicar el Patrón (Diseño Original con Problemas)

Ubicado en la carpeta [`codigo_antes/`](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/codigo_antes):

- [Alert.java](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/codigo_antes/src/com/universidad/antes/Alert.java): Clase abstracta base original.
- [AcademicEmailAlert.java](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/codigo_antes/src/com/universidad/antes/AcademicEmailAlert.java): Subclase que une tipo académico con correo.
- [AcademicSMSAlert.java](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/codigo_antes/src/com/universidad/antes/AcademicSMSAlert.java): Subclase que une tipo académico con SMS.
- [UrgentEmailAlert.java](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/codigo_antes/src/com/universidad/antes/UrgentEmailAlert.java): Subclase que une tipo urgente con correo.
- [UrgentSMSAlert.java](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/codigo_antes/src/com/universidad/antes/UrgentSMSAlert.java): Subclase que une tipo urgente con SMS.
- [MainAntes.java](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/codigo_antes/src/com/universidad/antes/MainAntes.java): Demuestra la rigidez y el crecimiento multiplicativo ($N \times M$).
- [ejecutar_antes.bat](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/ejecutar_antes.bat): Script para ejecutar el código previo.

---

## 3. Código DESPUÉS de Aplicar el Patrón Bridge

Ubicado en la carpeta [`src/`](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/src) y compilado en [`bin/`](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/bin):

- [Alert.java](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/src/com/universidad/alertas/alerts/Alert.java): Abstracción base con el puente `# channel`.
- [AcademicAlert.java](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/src/com/universidad/alertas/alerts/AcademicAlert.java): Abstracción refinada académica.
- [UrgentAlert.java](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/src/com/universidad/alertas/alerts/UrgentAlert.java): Abstracción refinada urgente.
- [NotificationChannel.java](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/src/com/universidad/alertas/channels/NotificationChannel.java): Interfaz del implementador.
- [EmailChannel.java](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/src/com/universidad/alertas/channels/EmailChannel.java): Canal de correo.
- [SMSChannel.java](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/src/com/universidad/alertas/channels/SMSChannel.java): Canal de SMS.
- [WhatsAppChannel.java](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/src/com/universidad/alertas/channels/WhatsAppChannel.java): Canal de WhatsApp (**Reto 4: se agrega 1 sola clase**).
- [Main.java](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/src/com/universidad/alertas/Main.java): Clase principal ejecutable con los casos de prueba y cambio dinámico.
- [compilar_y_ejecutar.bat](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/compilar_y_ejecutar.bat) / [ejecutar.bat](file:///c:/Users/herna/Desktop/Solucion%20Ejercicio/ejecutar.bat): Scripts para compilar y correr la solución con Bridge.
