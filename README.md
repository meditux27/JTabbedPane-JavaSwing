# JTabbedPane - JavaSwing

<img title="" src="https://programchi.ir/wp-content/uploads/2018/04/JTabbedPane-java-min.png" alt="" width="429" data-align="center">

#### JTabbedPane es una clase en el lenguaje de programación Java que forma parte del conjunto de componentes de interfaz de usuario proporcionados por Swing

#### Se utiliza para crear una interfaz de pestañas en la que los usuarios pueden alternar entre diferentes conjuntos de componentes o paneles.Las pestañas son elementos gráficos que generalmente se muestran en la parte superior de un área de contenido y permiten al usuario seleccionar diferentes vistas o páginas de información. Cada pestaña generalmente se asocia con un panel o componente específico que se muestra cuando se selecciona esa pestaña.

---

:book:  **Las características más importantes de un `JTabbedPane` en Swing son las siguientes:**

1. **Organización en pestañas**: `JTabbedPane` organiza su contenido en pestañas, lo que permite al usuario alternar fácilmente entre diferentes conjuntos de componentes o paneles.

2. **Contenido personalizado**: Cada pestaña puede contener cualquier componente o panel que desees, lo que brinda flexibilidad para mostrar información, vistas o funcionalidad específica en cada pestaña.

3. **Navegación sencilla**: Los usuarios pueden cambiar entre pestañas haciendo clic en ellas, lo que facilita la navegación y la organización del contenido.

4. **Eventos de selección**: Puedes registrar manejadores de eventos para detectar cuándo el usuario selecciona una pestaña específica, lo que te permite realizar acciones específicas cuando se cambia la pestaña.

5. **Personalización visual**: `JTabbedPane` es altamente personalizable en cuanto a la apariencia y el comportamiento. Puedes cambiar el aspecto de las pestañas, como los colores, los íconos, las ubicaciones de las pestañas y más.

6. **Arrastrar y soltar**: En algunos casos, `JTabbedPane` es compatible con la función de arrastrar y soltar, lo que permite a los usuarios reorganizar las pestañas o transferir contenido entre ellas.

7. **Pestañas desplazables**: Cuando hay muchas pestañas y no caben en la pantalla, `JTabbedPane` puede mostrar botones de desplazamiento para permitir al usuario desplazarse por las pestañas ocultas.

8. **Atajos de teclado**: Los atajos de teclado están disponibles para permitir a los usuarios cambiar entre pestañas sin necesidad de utilizar el ratón.

9. **Uso en aplicaciones complejas**: `JTabbedPane` es una opción común para organizar la interfaz de usuario en aplicaciones más grandes y complejas, como aplicaciones de edición de texto, aplicaciones de diseño gráfico y aplicaciones de administración de bases de datos.

10. **Integración con otros componentes Swing**: `JTabbedPane` se integra bien con otros componentes Swing, como `JPanel`, `JLabel`, `JButton`, etc., lo que te permite construir interfaces gráficas completas y ricas en funcionalidad.

---

:clipboard: **Pasos para implementar JTabbedPane**

1. **Importar las clases necesarias**:
   Asegúrate de importar las clases necesarias al comienzo de tu archivo Java.  
   
   ```java
   import javax.swing.*;
   ```

2. **Crear una instancia de `JTabbedPane`**:
   Debes crear una instancia de `JTabbedPane` que servirá como el contenedor de tus pestañas y su contenido.
   
   ```java
   JFrame frame = new JFrame("Ejemplo de JTabbedPane");
   
   //Se crea la instancia JTabbedPane
   JTabbedPane tabbedPane = new JTabbedPane();
   ```

3. **Crear paneles o componentes para las pestañas**:
   Crea los paneles o componentes que deseas mostrar en cada pestaña. Puedes usar `JPanel` u otros componentes según tus necesidades.
   
   ```java
   JPanel panel1 = new JPanel();
   panel1.add(new JLabel("Contenido de la pestaña 1"));
   
   JPanel panel2 = new JPanel();
   panel2.add(new JLabel("Contenido de la pestaña 2"));
   ```

4. **Agregar las pestañas al `JTabbedPane`**:
   Para cada pestaña, utiliza el método `addTab()` del `JTabbedPane` para agregar el contenido y especificar un título para la pestaña. Esto asocia un panel o componente con una pestaña específica.
   
   ```java
   tabbedPane.addTab("Pestaña 1", panel1);
   tabbedPane.addTab("Pestaña 2", panel2);
   ```

5. **Agregar el `JTabbedPane` a un contenedor principal**:
   Añade el `JTabbedPane` al contenedor principal de tu aplicación, como un `JFrame` en la mayoría de los casos.
   
   ```java
    frame.add(tabbedPane);
   ```

6. **Configurar la interfaz de usuario y eventos(opcional)**:
   Configura el `JFrame` y otros componentes según tus necesidades. Puedes agregar controladores de eventos para detectar cuando se selecciona una pestaña específica si deseas realizar acciones específicas en respuesta a la selección de una pestaña.

7. **Hacer visible la ventana principal**:
   Asegúrate de que la ventana principal (normalmente un `JFrame`) sea visible llamando a `setVisible(true)`.
   
   ```java
    frame.setVisible(true);
   ```

:coffee: [Estructura basica](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/TabbedPaneExample.java)

---

> :beginner: **addTab()**

- Descripción

 Este método se utiliza para agregar una nueva pestaña a un JTabbedPane. Esta pestaña contendrá un componente que normalmente es un panel o un contenedor

- Sintaxis

```java
tabbedPane.addTab("Pestaña 1", panel1);
```

- Nota

Previamente al usuo de .addTab se debe instanciar tanto JTabbedPane como los componentes que se uniran por medio de .addTab

//creación de JTabbedPane y componentes para adicionar

`JTabbedPane tabbedPane = new JTabbedPane();`

`JPanel panel1 = new JPanel();`
` panel1.add(new JLabel("Contenido de la pestaña 1"));`

//uso de .addTab para agregar los componentes

`tabbedPane.addTab("Pestaña 1", panel1);`

Los parámetros de este método son los siguientes:

- `Pestaña 1`: Es una cadena de texto que especifica el título de la nueva pestaña. Este título se mostrará en la pestaña misma para que el usuario pueda identificarla.

- `panel1`: Es un objeto Component que representa el contenido que se asociará con esta pestaña.

- Ejemplo:coffee:

[ addTab]( https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/AddTab_example.java)

---

> :beginner: **insertTab()**

- Descripción

Este método se utiliza para insertar una nueva pestaña en una posición específica dentro de un `JTabbedPane`. A diferencia del método `addTab`, que agrega pestañas al final de la lista de pestañas, `insertTab` te permite especificar ordenadamente la posición en la que deseas insertar la pestaña.

- Sintaxis

```java
tabbedPane.insertTab("Pestaña 2", null, panel2, "Tooltip de la Pestaña 2", 0);
```

- Nota

Para la compresión del metodo es necesario dividirlo y analizar cada parámetro 

`tabbedPane.insertTab("title",icon,component, "tip", index);`

1. `title`: Es una cadena de texto que especifica el título de la nueva pestaña.

2. `icon`: Es un objeto `Icon` que representa un ícono que se mostrará en la pestaña. Puede ser `null` si no deseas mostrar un ícono.

3. `component`: Es un objeto `Component` que representa el contenido que se asociará con esta pestaña.

4. `tip`: Es una cadena de texto que especifica el texto de información sobre herramientas (tooltip) que se mostrará cuando el usuario pase el puntero del ratón sobre la pestaña. Puede ser `null` si no deseas proporcionar un tooltip.

5. `index`: Es un entero que especifica la posición en la que deseas insertar la nueva pestaña. Las posiciones se cuentan desde 0 para la primera pestaña y aumentan a medida que se agregan más pestañas.
- Ejemplo:coffee:

[insertTab](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/InsertTab_example.java)

---

> :beginner: **removeTabAt()**

- Descripción

Este método se utiliza para eliminar una pestaña específica de un `JTabbedPane`. El parámetro `0` especifica la posición de la pestaña que deseas eliminar, y las posiciones comienzan en 0 para la primera pestaña y aumenta dependiendo de la posición a la que se desea eliminar 

- Sintaxis

```java
 tabbedPane.removeTabAt(0);
```

- Nota

Se debe tener en cuenta su estructura basica, el cual explicara su funcionamiento

`void removeTabAt(int index)`

- `index`: Un entero que especifica la posición de la pestaña que deseas eliminar.

Este método permite la eliminación de pestañas de forma dinámica durante la ejecución de la aplicación, lo que puede ser útil cuando se necesita agregar o quitar pestañas en respuesta a la interacción del usuario o a cambios en el estado de la aplicación.

- Ejemplo:coffee:

[removeTabAt](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/RemoveTabAtExample.java)

---

> :beginner: **getTabCount()**

- Descripción

Puedes utilizar este método para determinar cuántas pestañas hay en un JTabbedPane en un momento dado. Esto es útil si necesitas realizar operaciones específicas basadas en la cantidad de pestañas

- Sintaxis

```java
int numTabs = tabbedPane.getTabCount();
```

- Nota

Este método no toma ningún argumento y devuelve un valor entero que representa la cantidad de pestañas en el `JTabbedPane`.

Para ver el funcionamiento de este metodo es necesario ingresar el resultado del metodo en una variable de tipo estero

//Se crea el componente tabbedPane 

`JTabbedPane tabbedPane = new JTabbedPane();`

//Se agregan los componentes previamente creados

`JPanel panel1 = new JPanel();`
 `panel1.add(new JLabel("Contenido de la pestaña 1"));`

`tabbedPane.addTab("Pestaña 1", panel1);`

//Se obtiene el numero de pestañas con el metodo 

`int numTabs = tabbedPane.getTabCount();`

- Ejemplo:coffee:

[getTabCount](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/GetTabCount_example.java)

---

> :beginner: **getComponentAt()**

- Descripción

 Este método permite guardar los componentes o caractericas de una pestaña en especifico

- Sintaxis

```java
Component componente = tabbedPane.getComponentAt(index);
```

- Nota

Para poder utilizar este metodo es necesario previamente realizar la creacion de las pestañas (paneles) posteriormente adicionarlas con el metodo .addTab.

Con lo dicho anteriormente se puede implementar el metodo

`Component componente = tabbedPane.getComponentAt(index);`

Donde `index` es la posición de la pestaña cuyo componente deseas obtener. Ten en cuenta que esta posición comienza en 0 para la primera pestaña y aumenta a medida que se agregan más pestañas.

[getComponentAt](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/GetComponentAt_example.java)

---

> :beginner: **getTitleAt()**

- Descripción

 Este método se utiliza para obtener el título de una pestaña específica en un componente `JTabbedPane`

- Sintaxis

```java
String title = tabbedPane.getTitleAt(0);
```

- Nota

`tabbedPane.addTab("Tab 1", new JPanel());`
`tabbedPane.addTab("Tab 2", new JPanel());`
`tabbedPane.addTab("Tab 3", new JPanel());`

En este ejemplo, creamos un `JTabbedPane` y agregamos tres pestañas con títulos "Tab 1", "Tab 2" y "Tab 3". Luego, utilizamos `getTitleAt(0)` para obtener el título de la primera pestaña y lo mostramos en la consola.

- Ejemplo:coffee:

[getTitleAt](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/GetTitleAt_example.java)

---

> :beginner: **setSelectedIndex()**

- Descripción

Este método permite establecer que pestaña se presentara al ejecutar el programa en primer lugar

- Sintaxis

```java
tabbedPane.setSelectedIndex(1);
```

- Nota

Este método es útil cuando deseas cambiar programáticamente la pestaña activa en un `JTabbedPane`, por ejemplo, en respuesta a eventos o acciones del usuario.

Por lo cual se debe tener en cuenta su estructura basica

`.setSelectedIndex(int index)`

El índex representa la posición de la pestaña que deseas seleccionar, comenzando desde 0 para la primera pestaña, 1 para la segunda y así sucesivamente

- Ejemplo:coffee:

[setSelectedIndex](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/SetSelectedIndex_example.java)

---

> :beginner: **getSelectedIndex()**

- Descripción

se utiliza para obtener el índice de la pestaña actualmente seleccionada en el componente `JTabbedPane`. El índice representa la posición de la pestaña seleccionada, comenzando desde 0 para la primera pestaña, 1 para la segunda, y así sucesivamente.

- Sintaxis

```java
  int selectedIndex = tabbedPane.getSelectedIndex();
```

- Nota

`int variable=tabbedPane.getSelectedIndex()`

Debe tener en cuenta que el resultado del metodo es un dato tipo entero, por lo cual se debe manipular teniendo en cuenta esto para representarlos al momento de imprimir o manipular.

Este método es útil cuando deseas conocer la pestaña que está actualmente seleccionada en un `JTabbedPane`, por ejemplo, para realizar acciones basadas en la pestaña activa en respuesta a eventos del usuario.

- Ejemplo:coffee:

[getSelectedIndex](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/GetSelectedIndex_example.java)

---

> :beginner: **setTabLayoutPolicy()**

- Descripción

e utiliza para establecer la política de diseño de las pestañas en un `JTabbedPane`. La política de diseño determina cómo se manejarán las pestañas cuando el espacio en el `JTabbedPane` es limitado.

- Sintaxis

```java
tabbedPane.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
```

- Nota

El parámetro `policy` es un entero que puede tomar uno de los siguientes valores:

1. `JTabbedPane.WRAP_TAB_LAYOUT`: Este es el valor predeterminado. En este modo, las pestañas se envuelven y se muestran en varias filas si no caben en el espacio disponible. Esto permite que todas las pestañas sean visibles, pero puede hacer que el `JTabbedPane` ocupe más espacio vertical.

2. `JTabbedPane.SCROLL_TAB_LAYOUT`: En este modo, se utiliza un botón de desplazamiento para permitir al usuario desplazarse a través de las pestañas si no caben en el espacio disponible. Esto ahorra espacio vertical, pero puede requerir que el usuario haga clic en el botón de desplazamiento para acceder a pestañas fuera de la vista.
- Ejemplo:coffee:

[WRAP_TAB_LAYOUT](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/SetTabLayoutPolicy_WRAP_TAB_LAYOUT_example.java)

[SCROLL_TAB_LAYOUT](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/SetTabLayoutPolicy_SCROLL_TAB_LAYOUT_example.java)

---

> :beginner: **setTabPlacement()**

- Descripción

se utiliza para establecer la ubicación de las pestañas en el componente `JTabbedPane`.

- Sintaxis

```java
tabbedPane.setTabPlacement(JTabbedPane.LEFT);
```

- Nota

`setTabPlacement(int tabPlacement)` 

La ubicación de las pestañas se refiere a dónde se mostrarán las pestañas en relación con el área de contenido de `JTabbedPane`.

El parámetro `tabPlacement` es un valor entero que puede tomar uno de los siguientes valores predefinidos:

1. `JTabbedPane.TOP`: Este es el valor predeterminado. Coloca las pestañas en la parte superior del `JTabbedPane`, y el contenido se muestra debajo de las pestañas.

2. `JTabbedPane.BOTTOM`: Coloca las pestañas en la parte inferior del `JTabbedPane`, y el contenido se muestra arriba de las pestañas.

3. `JTabbedPane.LEFT`: Coloca las pestañas en el lado izquierdo del `JTabbedPane`, y el contenido se muestra a la derecha de las pestañas.

4. `JTabbedPane.RIGHT`: Coloca las pestañas en el lado derecho del `JTabbedPane`, y el contenido se muestra a la izquierda de las pestañas.
- Ejemplo:coffee:

[setTabPlacement](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/SetTabPlacement_example.java)

[setTabPlacement_test](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/SetTabPlacement_test.java)

---

> :beginner: **setIconAt()**

- Descripción

 Este método se utiliza para establecer un ícono en una pestaña específica de un `JTabbedPane`. El ícono se mostrará junto al título de la pestaña y proporciona una representación visual adicional para la pestaña.

- Sintaxis

```java
ImageIcon icon = new ImageIcon("icono.png"); 
// Reemplaza "icono.png" con la ubicación de tu ícono
tabbedPane.setIconAt(1, icon);
```

- Nota

En el método `setIconAt(int tabIndex, Icon icon)`

El primer argumento, `tabIndex`, es el índice de la pestaña a la que deseas asignar un ícono, y el segundo argumento, `icon`, es el objeto `Icon` que representa el ícono que se mostrará en esa pestaña.

- Ejemplo:coffee:

[setIconAt](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/SetIconAt_example.java)

---

> :beginner: **setEnabledAt()**

- Descripción

se utiliza para habilitar o deshabilitar una pestaña específica en un `JTabbedPane`.

- Sintaxis

```java
 tabbedPane.setEnabledAt(1, false);
```

- Nota

`setEnabledAt(int tabIndex, boolean enabled)`

Este método permite controlar la capacidad de interactuar con una pestaña, lo que puede ser útil en situaciones donde deseas habilitar o deshabilitar el acceso a ciertas partes de tu aplicación según el contexto.

El primer argumento, `tabIndex`, es el índice de la pestaña a la que deseas habilitar o deshabilitar, y el segundo argumento, `enabled`, es un valor booleano que determina si la pestaña estará habilitada (`true`) o deshabilitada (`false`).

- Ejemplo:coffee:

[setEnabledAt](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/SetEnabledAt_example.java)

[setEnabledAt_test](https://github.com/meditux27/JTabbedPane-JavaSwing/blob/main/examples/SetEnabledAt_test.java)

---

> :beginner: **getToolTipTextAt()**

- Descripción

 Este método permite establecer el componente de contenido que se mostrará dentro del JScrollPane. El componente view será el contenido que se envuelve y se desplazará.

- Sintaxis

```java

```

- Nota

Por lo general, se pasa el componente que deseas hacer desplazable, como un JTextArea o un JPanel.

creación de scrollpane

`JScrollPane scrollPane = new JScrollPane();`

creación de textarea

`JTextArea textArea = new JTextArea(10, 20);`

Se agrega el componente

`scrollPane.setViewportView(textArea);`

- Ejemplo:coffee:

[getToolTipTextAt](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/JScrollPaneSetViewportViewExample.java)

---

> :beginner: **setToolTipTextAt()**

- Descripción

 Este método permite establecer el componente de contenido que se mostrará dentro del JScrollPane. El componente view será el contenido que se envuelve y se desplazará.

- Sintaxis

```java

```

- Nota

Por lo general, se pasa el componente que deseas hacer desplazable, como un JTextArea o un JPanel.

creación de scrollpane

`JScrollPane scrollPane = new JScrollPane();`

creación de textarea

`JTextArea textArea = new JTextArea(10, 20);`

Se agrega el componente

`scrollPane.setViewportView(textArea);`

- Ejemplo:coffee:

[setToolTipTextAt](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/JScrollPaneSetViewportViewExample.java)
