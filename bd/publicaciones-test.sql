--1
INSERT INTO rol_usuarios(rol_usuario_id, descripcion_rol)
VALUES(1, "usuario"),
(2, "empresa"),
(3, "admin");

--2
INSERT INTO usuario(id_usuario, nombre, apellido, email, contrasenha, direccion, fecha_creacion, nombre_empresa, telefono, telefono_empresa, rol_usuario_id)
VALUES(1, "Rodrigo", "Gonzalez", "rigoz@live.cl", "*###*as", "Valle Central 204", "2024-01-14", NULL, "+56958473456", NULL, 3),
(2, "Susan", "Navarro", "susanava@hotmail.com", "**###123", "Nevado Aca 1133", "2023-05-26", NULL, "+56933344853", NULL, 1);

--3
INSERT INTO publicacion(id_publicacion, cuerpo, imagen, precio, residuo, titulo, id_comuna, unidad_medida, id_usuario) 
VALUES(1, "Lote de palos en buenas condiciones", "imagen.jpg", 20000, "Madera", "Madera en buen estado", "m", 290, 1),
VALUES(2, "Marcos de ventana tamaño grando", "imagen.jpg", 35000, "Aluminio", "Marcos de ventana", "m²", 291, 1),
(3, "Planchas de zinc", "imagen.jpg", 10000, "Zinc", "Techo", "m²", 290, 2);



