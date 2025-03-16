# Central de Pacientes

## Descripción
Central de Pacientes es una aplicación desarrollada en **Java** con **Swing** que permite la gestión de pacientes utilizando una **lista enlazada simple** como estructura de datos.

El sistema permite registrar, buscar, eliminar y visualizar pacientes con sus datos personales y la clínica donde reciben atención.

## Características
- **Registro de Pacientes**: Permite agregar pacientes con un ID único, nombre, edad y clínica donde recibe atención.
- **Gestión de Pacientes**:
  - Agregar nuevos pacientes.
  - Buscar pacientes por ID.
  - Eliminar pacientes del sistema.
  - Listar todos los pacientes registrados.
- **Interfaz Gráfica con Swing**: Diseño intuitivo y fácil de usar.
- **Estructura de Datos**: Implementación de una **lista enlazada simple** para la gestión eficiente de los pacientes.

## Tecnologías Utilizadas
- **Lenguaje**: Java (versión 23)
- **Interfaz Gráfica**: Swing
- **IDE**: IntelliJ IDEA
- **Control de Versiones**: Git y GitHub

## Estructura del Proyecto
```
Central_De_Pacientes/
│── src/
│   ├── modelos/
│   │   ├── Paciente.java
│   │   ├── NodoPaciente.java
│   │   ├── ListaPacientes.java
│   ├── interfaz/
│   │   ├── VentanaPrincipal.java
│   │   ├── FormularioPaciente.java
│   ├── controladores/
│   │   ├── ControladorPacientes.java
│   ├── Main.java
│── README.md
│── .gitignore
│── diagrama.puml
```

## Instalación y Uso
### Prerequisitos
- Tener **Java 23** instalado.
- Utilizar **IntelliJ IDEA** u otro IDE compatible.

### Ejecución
1. Clonar el repositorio:
   ```sh
   git clone https://github.com/usuario/Central_De_Pacientes.git
   ```
2. Abrir el proyecto en **IntelliJ IDEA**.
3. Ejecutar `Main.java` para iniciar la aplicación.

## Contribuciones
¡Las contribuciones son bienvenidas! Para contribuir:
1. Haz un **fork** del repositorio.
2. Crea una **rama** con tus cambios: `git checkout -b nueva-funcionalidad`.
3. Realiza un **commit**: `git commit -m "Agregada nueva funcionalidad"`.
4. Haz un **push** a la rama: `git push origin nueva-funcionalidad`.
5. Abre un **Pull Request**.

## Autor
- **[Tu Nombre]** - Desarrollo y documentación.

## Licencia
Este proyecto está bajo la licencia **MIT**.

