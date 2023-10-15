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

[insertTab](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/ScrollPaneViewportExample.java)

---

> :beginner: **removeTabAt()**

- Descripción

Estos métodos permiten controlar, cuándo se mostrarán las barras de desplazamiento y cómo se comportarán en función de las necesidades de la aplicación.

- Sintaxis

```java
scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
```

- Nota

**setHorizontalScrollBarPolicy(int policy)**

Este método se utiliza para establecer la política de visualización de la barra de desplazamiento horizontal en un JScrollPane. Toma un argumento de tipo entero que especifica la política y puede ser uno de los siguientes valores:

- `JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED`: La barra de desplazamiento horizontal se mostrará automáticamente cuando sea necesario, es decir, cuando el contenido sea más ancho que el área visible en el JScrollPane.

- `JScrollPane.HORIZONTAL_SCROLLBAR_NEVER`: La barra de desplazamiento horizontal nunca se mostrará, incluso si el contenido es más ancho que el área visible. Esto puede ser útil si no deseas permitir el desplazamiento horizontal en absoluto.

- `JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS`: La barra de desplazamiento horizontal se mostrará siempre, independientemente de si el contenido es más ancho que el área visible o no.

**setVerticalScrollBarPolicy(int policy)**

Este método es similar al anterior, pero se utiliza para establecer la política de visualización de la barra de desplazamiento vertical en el JScrollPane. También toma un argumento de tipo entero que puede ser uno de los siguientes valores:

- `JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED`: La barra de desplazamiento vertical se mostrará automáticamente cuando sea necesario, es decir, cuando el contenido sea más alto que el área visible en el JScrollPane.

- `JScrollPane.VERTICAL_SCROLLBAR_NEVER`: La barra de desplazamiento vertical nunca se mostrará, incluso si el contenido es más alto que el área visible.

- `JScrollPane.VERTICAL_SCROLLBAR_ALWAYS`: La barra de desplazamiento vertical se mostrará siempre, independientemente de si el contenido es más alto que el área visible o no.

- Ejemplo:coffee:

[setHorizontalScrollBarPolicy() & setVerticalScrollBarPolicy()](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/JScrollPaneScrollbar.java)

---

> :beginner: **getTabCount()**

- Descripción

 Este método permite establecer el componente de contenido que se mostrará dentro del JScrollPane. El componente view será el contenido que se envuelve y se desplazará.

- Sintaxis

```java
scrollPane.setViewportView(textArea);
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

[getTabCount](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/JScrollPaneSetViewportViewExample.java)

---

> :beginner: **getComponentAt()**

- Descripción

 Este método permite establecer el componente de contenido que se mostrará dentro del JScrollPane. El componente view será el contenido que se envuelve y se desplazará.

- Sintaxis

```java
scrollPane.setViewportView(textArea);
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

[getComponentAt](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/JScrollPaneSetViewportViewExample.java)

---

> :beginner: **getTitleAt()**

- Descripción

 Este método permite establecer el componente de contenido que se mostrará dentro del JScrollPane. El componente view será el contenido que se envuelve y se desplazará.

- Sintaxis

```java
scrollPane.setViewportView(textArea);
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

[getTitleAt](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/JScrollPaneSetViewportViewExample.java)

---

> :beginner: **setSelectedIndex()**

- Descripción

 Este método permite establecer el componente de contenido que se mostrará dentro del JScrollPane. El componente view será el contenido que se envuelve y se desplazará.

- Sintaxis

```java
scrollPane.setViewportView(textArea);
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

[setSelectedIndex](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/JScrollPaneSetViewportViewExample.java)

---

> :beginner: **getSelectedIndex()**

- Descripción

 Este método permite establecer el componente de contenido que se mostrará dentro del JScrollPane. El componente view será el contenido que se envuelve y se desplazará.

- Sintaxis

```java
scrollPane.setViewportView(textArea);
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

[getSelectedIndex](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/JScrollPaneSetViewportViewExample.java)

---

> :beginner: **setTabLayoutPolicy()**

- Descripción

 Este método permite establecer el componente de contenido que se mostrará dentro del JScrollPane. El componente view será el contenido que se envuelve y se desplazará.

- Sintaxis

```java
scrollPane.setViewportView(textArea);
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

[setTabLayoutPolicy](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/JScrollPaneSetViewportViewExample.java)

---

> :beginner: **setTabPlacement()**

- Descripción

 Este método permite establecer el componente de contenido que se mostrará dentro del JScrollPane. El componente view será el contenido que se envuelve y se desplazará.

- Sintaxis

```java
scrollPane.setViewportView(textArea);
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

[setTabPlacement](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/JScrollPaneSetViewportViewExample.java)

---

> :beginner: **setMnemonicAt()**

- Descripción

 Este método permite establecer el componente de contenido que se mostrará dentro del JScrollPane. El componente view será el contenido que se envuelve y se desplazará.

- Sintaxis

```java
scrollPane.setViewportView(textArea);
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

[setMnemonicAt](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/JScrollPaneSetViewportViewExample.java)

---

> :beginner: **setIconAt()**

- Descripción

 Este método permite establecer el componente de contenido que se mostrará dentro del JScrollPane. El componente view será el contenido que se envuelve y se desplazará.

- Sintaxis

```java
scrollPane.setViewportView(textArea);
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

[setIconAt](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/JScrollPaneSetViewportViewExample.java)

---

> :beginner: **setEnabledAt()**

- Descripción

 Este método permite establecer el componente de contenido que se mostrará dentro del JScrollPane. El componente view será el contenido que se envuelve y se desplazará.

- Sintaxis

```java
scrollPane.setViewportView(textArea);
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

[setEnabledAt](https://github.com/meditux27/JScrollPane-JavaSwing/blob/main/example/JScrollPaneSetViewportViewExample.java)

---

> :beginner: **getToolTipTextAt()**

- Descripción

 Este método permite establecer el componente de contenido que se mostrará dentro del JScrollPane. El componente view será el contenido que se envuelve y se desplazará.

- Sintaxis

```java
scrollPane.setViewportView(textArea);
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
scrollPane.setViewportView(textArea);
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
