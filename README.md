# Programación Multimedia y Dispositivos Móviles

### 2º DAM — Desarrollo de Aplicaciones Multiplataforma

---

## Descripción

Repositorio con los proyectos y ejercicios de la asignatura **Programación Multimedia y Dispositivos Móviles** del segundo año de DAM, centrada en el desarrollo de aplicaciones Android con Kotlin y Jetpack Compose.

> Este repositorio se mantiene fuera de la carpeta principal de 2º DAM porque el Android Gradle Plugin no admite rutas con caracteres no ASCII (`ñ`, tildes) en Windows.

---

## Estructura

```
Programacion-Multimedia-y-Dispositivos-Moviles/
├── Tema 1/
│   ├── 01-10-2026/    # App "TestPM": primer proyecto con Jetpack Compose
│   └── 08-10-2026/    # App "MisTareas": proyecto Android con Compose y Material 3
└── README.md
```

---

## Proyectos

### Tema 1 — 01-10-2026 · TestPM
Primer proyecto Android del curso. Aplicación básica con Jetpack Compose que muestra un saludo en pantalla y sirve como toma de contacto con el entorno, Gradle y la estructura de un proyecto Android.

- Paquete: `com.example.testpm`
- App: **TestPM**

### Tema 1 — 08-10-2026 · MisTareas
Proyecto Android con Jetpack Compose y Material 3. Punto de partida para una aplicación de gestión de tareas.

- Paquete: `com.example.mistareas`
- App: **MisTareas**
- Tema: `MisTareasTheme`

---

## Tecnologías Utilizadas

- **Lenguaje:** Kotlin
- **UI:** Jetpack Compose, Material 3
- **Build:** Gradle (Kotlin DSL), Android Gradle Plugin
- **IDE:** Android Studio
- **SDK:** Android SDK

---

## Cómo abrir los proyectos

1. Abre Android Studio.
2. `File > Open` y selecciona la carpeta del proyecto, por ejemplo:
   `Tema 1\08-10-2026`
3. Espera a que Gradle sincronice.
4. Ejecuta la app en un emulador o dispositivo físico.

> **Importante:** abre siempre con `Open` sobre la carpeta del proyecto. No crees un proyecto nuevo dentro de estas carpetas o el asistente sobrescribirá los ficheros.

---

*Segundo año DAM — Curso 2026/2027*
