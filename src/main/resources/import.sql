
INSERT INTO bbdd_residuosnomas.region (id_region, nombre_region)
VALUES (1, 'Tarapacá'),
       (2, 'Antofagasta'),
       (3, 'Atacama'),
       (4, 'Coquimbo'),
       (5, 'Valparaíso'),
       (6, 'Región del Libertador Gral. Bernardo O’Higgins'),
       (7, 'Región del Maule'),
       (8, 'Región del Biobío'),
       (9, 'Región de la Araucania'),
       (10, 'Región de Los Lagos'),
       (11, 'Región Aisén del Gral. Carlos Ibáñez del Campo'),
       (12, 'Región de Magallanes y de la Antártica Chilena'),
       (13, 'Región Metropolitana de Santiago'),
       (14, 'Región de Los Ríos'),
       (15, 'Arica y Parinacota'),
       (16, 'Región de Ñuble');

INSERT INTO rol_usuarios (descripcion_rol)
VALUES
    ('Administrador'),
    ('Cliente');

DELETE FROM usuario;

INSERT INTO usuario (id_usuario, contrasenha, email, nombre, apellido, fecha_creacion, telefono, nombre_empresa, telefono_empresa, direccion, rol_usuario_id)
VALUES
    (1,'1234', 'admin@example.com', 'Juan', 'Pérez', '2024-03-10', '123456789', 'Empresa1', '987654321', 'Dirección1', 1),
    (2,'5678', 'user1@example.com', 'María', 'García', '2024-03-10', NULL, NULL, NULL, NULL, 2),
    (3,'secreto', 'user2@example.com', 'Pedro', 'López', '2024-03-10', NULL, NULL, NULL, NULL, 1);


INSERT INTO comuna (id_comuna, nombre_comuna, id_region)
VALUES(1, "Iquique", 1),
      (2, "Alto Hospicio", 1),
      (3, "Pozo Almonte", 1),
      (4, "Camiña", 1),
      (5, "Colchane", 1),
      (6, "Huara", 1),
      (7, "Pica", 1),
      (8, "Antofagasta", 2),
      (9, "Calama", 2),
      (10, "Tocopilla", 2),
      (11, "Mejillones", 2),
      (12, "María Elena", 2),
      (13, "Taltal", 2),
      (14, "Sierra Gorda", 2),
      (15, "San Pedro de Atacama", 2),
      (16, "Ollagüe", 2),
      (17, "Chañaral", 3),
      (18, "Diego de Almagro", 3),
      (19, "Caldera", 3),
      (20, "Copiapó", 3),
      (21, "Tierra Amarilla", 3),
      (22, "Huasco", 3),
      (23, "Freirina", 3),
      (24, "Vallenar", 3),
      (25, "Alto del Carmen", 3),
      (26, "La Serena", 4),
      (27, "Coquimbo", 4),
      (28, "Andacollo", 4),
      (29, "La Higuera", 4),
      (30, "Paihuano", 4),
      (31, "Vicuña", 4),
      (32, "Ovalle", 4),
      (33, "Combarbalá", 4),
      (34, "Monte Patria", 4),
      (35, "Punitaqui", 4),
      (36, "Río Hurtado", 4),
      (37, "Illapel", 4),
      (38, "Salamanca", 4),
      (39, "Los Vilos", 4),
      (40, "Canela", 4),
      (41, "Isla de Pascua", 5),
      (42, "Los Andes", 5),
      (43, "San Esteban", 5),
      (44, "Calle Larga", 5),
      (45, "Rinconada", 5),
      (46, "La Ligua", 5),
      (47, "Cabildo", 5),
      (48, "Zapallar", 5),
      (49, "Papudo", 5),
      (50, "Petorca", 5),
      (51, "Quillota", 5),
      (52, "La Cruz", 5),
      (53, "La Calera", 5),
      (54, "Nogales", 5),
      (55, "Hijuelas", 5),
      (56, "San Antonio", 5),
      (57, "Cartagena", 5),
      (58, "El Tabo", 5),
      (59, "El Quisco", 5),
      (60, "Algarrobo", 5),
      (61, "Santo Domingo", 5),
      (62, "San Felipe", 5),
      (63, "Llaillay", 5),
      (64, "Putaendo", 5),
      (65, "Santa María", 5),
      (66, "Catemu", 5),
      (67, "Panquehue", 5),
      (68, "Quilpué", 5),
      (69, "Villa Alemana", 5),
      (70, "Limache", 5),
      (71, "Olmué", 5),
      (72, "Viña del Mar", 5),
      (73, "Quintero", 5),
      (74, "Valparaíso", 5),
      (75, "Casablanca", 5),
      (76, "Puchuncaví", 5),
      (77, "Juan Fernández", 5),
      (78, "Concón", 5),
      (79, "Rancagua", 6),
      (80, "Codegua", 6),
      (81, "Machalí", 6),
      (82, "Graneros", 6),
      (83, "Mostazal", 6),
      (84, "Malloa", 6),
      (85, "Olivar", 6),
      (86, "Doñihue", 6),
      (87, "Coinco", 6),
      (88, "Coltauco", 6),
      (89, "Quinta de Tilcoco", 6),
      (90, "Rengo", 6),
      (91, "Requínoa", 6),
      (92, "Las Cabras", 6),
      (93, "Peumo", 6),
      (94, "Pichidegua", 6),
      (95, "San Vicente de Tagua Tagua", 6),
      (96, "Pichilemu", 6),
      (97, "La Estrella", 6),
      (98, "Litueche", 6),
      (99, "Marchihüe", 6),
      (100, "Navidad", 6),
      (101, "Paredones", 6),
      (102, "San Fernando", 6),
      (103, "Chépica", 6),
      (104, "Chimbarongo", 6),
      (105, "Lolol", 6),
      (106, "Nancagua", 6),
      (107, "Palmilla", 6),
      (108, "Peralillo", 6),
      (109, "Placilla", 6),
      (110, "Pumanque", 6),
      (111, "Santa Cruz", 6),
      (112, "Cauquenes", 7),
      (113, "Chanco", 7),
      (114, "Pelluhue", 7),
      (115, "Curicó", 7),
      (116, "Hualañé", 7),
      (117, "Licantén", 7),
      (118, "Molina", 7),
      (119, "Rauco", 7),
      (120, "Romeral", 7),
      (121, "Sagrada Familia", 7),
      (122, "Teno", 7),
      (123, "Vichuquén", 7),
      (124, "Colbún", 7),
      (125, "Linares", 7),
      (126, "Longaví", 7),
      (127, "Parral", 7),
      (128, "Retiro", 7),
      (129, "San Javier", 7),
      (130, "Villa Alegre", 7),
      (131, "Yerbas Buenas", 7),
      (132, "Constitución", 7),
      (133, "Curepto", 7),
      (134, "Empedrado", 7),
      (135, "Maule", 7),
      (136, "Pelarco", 7),
      (137, "Pencahue", 7),
      (138, "Río Claro", 7),
      (139, "San Clemente", 7),
      (140, "San Rafael", 7),
      (141, "Talca", 7),
      (142, "Arauco", 8),
      (143, "Cañete", 8),
      (144, "Contulmo", 8),
      (145, "Curanilahue", 8),
      (146, "Lebu", 8),
      (147, "Los Álamos", 8),
      (148, "Tirúa", 8),
      (149, "Alto Biobío", 8),
      (150, "Antuco", 8),
      (151, "Cabrero", 8),
      (152, "Laja", 8),
      (153, "Los Ángeles", 8),
      (154, "Mulchén", 8),
      (155, "Nacimiento", 8),
      (156, "Negrete", 8),
      (157, "Quilaco", 8),
      (158, "Quilleco", 8),
      (159, "San Rosendo", 8),
      (160, "Santa Bárbara", 8),
      (161, "Tucapel", 8),
      (162, "Yumbel", 8),
      (163, "Chiguayante", 8),
      (164, "Concepción", 8),
      (165, "Coronel", 8),
      (166, "Florida", 8),
      (167, "Hualpén", 8),
      (168, "Hualqui", 8),
      (169, "Lota", 8),
      (170, "Penco", 8),
      (171, "San Pedro de la Paz", 8),
      (172, "Santa Juana", 8),
      (173, "Talcahuano", 8),
      (174, "Tomé", 8),
      (175, "Temuco", 9),
      (176, "Carahue", 9),
      (177, "Cholchol", 9),
      (178, "Cunco", 9),
      (179, "Curarrehue", 9),
      (180, "Freire", 9),
      (181, "Galvarino", 9),
      (182, "Gorbea", 9),
      (183, "Lautaro", 9),
      (184, "Loncoche", 9),
      (185, "Melipeuco", 9),
      (186, "Nueva Imperial", 9),
      (187, "Padre Las Casas", 9),
      (188, "Perquenco", 9),
      (189, "Pitrufquén", 9),
      (190, "Pucón", 9),
      (191, "Puerto Saavedra", 9),
      (192, "Teodoro Schmidt", 9),
      (193, "Toltén", 9),
      (194, "Vilcún", 9),
      (195, "Villarrica", 9),
      (196, "Angol", 9),
      (197, "Collipulli", 9),
      (198, "Curacautín", 9),
      (199, "Ercilla", 9),
      (200, "Lonquimay", 9),
      (201, "Los Sauces", 9),
      (202, "Lumaco", 9),
      (203, "Purén", 9),
      (204, "Renaico", 9),
      (205, "Traiguén", 9),
      (206, "Victoria", 9),
      (207, "Ancud", 10),
      (208, "Castro", 10),
      (209, "Chonchi", 10),
      (210, "Curaco de Vélez", 10),
      (211, "Dalcahue", 10),
      (212, "Puqueldón", 10),
      (213, "Queilén", 10),
      (214, "Quemchi", 10),
      (215, "Quellón", 10),
      (216, "Quinchao", 10),
      (217, "Calbuco", 10),
      (218, "Cochamó", 10),
      (219, "Fresia", 10),
      (220, "Frutillar", 10),
      (221, "Llanquihue", 10),
      (222, "Los Muermos", 10),
      (223, "Maullín", 10),
      (224, "Puerto Montt", 10),
      (225, "Puerto Varas", 10),
      (226, "Osorno", 10),
      (227, "Puerto Octay", 10),
      (228, "Purranque", 10),
      (229, "Puyehue", 10),
      (230, "Río Negro", 10),
      (231, "San Juan de la Costa", 10),
      (232, "San Pablo", 10),
      (233, "Chaitén", 10),
      (234, "Futaleufú", 10),
      (235, "Hualaihué", 10),
      (236, "Palena", 10),
      (237, "Aysén", 11),
      (238, "Cisnes", 11),
      (239, "Guaitecas", 11),
      (240, "Cochrane", 11),
      (241, "O' Higgins", 11),
      (242, "Tortel", 11),
      (243, "Coyhaique", 11),
      (244, "Lago Verde", 11),
      (245, "Chile Chico", 11),
      (246, "Río Ibáñez", 11),
      (247, "Natales", 12),
      (248, "Torres del Paine", 12),
      (249, "Punta Arenas", 12),
      (250, "Río Verde", 12),
      (251, "Laguna Blanca", 12),
      (252, "San Gregorio", 12),
      (253, "Porvenir", 12),
      (254, "Primavera", 12),
      (255, "Timaukel", 12),
      (256, "Cabo de Hornos", 12),
      (257, "Antártica", 12),
      (258, "Cerrillos", 13),
      (259, "Cerro Navia", 13),
      (260, "Conchalí", 13),
      (261, "El Bosque", 13),
      (262, "Estación Central", 13),
      (263, "Huechuraba", 13),
      (264, "Independencia", 13),
      (265, "La Cisterna", 13),
      (266, "La Florida", 13),
      (267, "La Granja", 13),
      (268, "La Pintana", 13),
      (269, "La Reina", 13),
      (270, "Las Condes", 13),
      (271, "Lo Barnechea", 13),
      (272, "Lo Espejo", 13),
      (273, "Lo Prado", 13),
      (274, "Macul", 13),
      (275, "Maipú", 13),
      (276, "Ñuñoa", 13),
      (277, "Pedro Aguirre Cerda", 13),
      (278, "Peñalolén", 13),
      (279, "Providencia", 13),
      (280, "Pudahuel", 13),
      (281, "Quilicura", 13),
      (282, "Quinta Normal", 13),
      (283, "Recoleta", 13),
      (284, "Renca", 13),
      (285, "San Joaquín", 13),
      (286, "San Miguel", 13),
      (287, "San Ramón", 13),
      (288, "Santiago", 13),
      (289, "Vitacura", 13),
      (290, "Puente Alto", 13),
      (291, "Pirque", 13),
      (292, "San José de Maipo", 13),
      (293, "Colina", 13),
      (294, "Lampa", 13),
      (295, "Tiltil", 13),
      (296, "San Bernardo", 13),
      (297, "Buin", 13),
      (298, "Calera de Tango", 13),
      (299, "Paine", 13),
      (300, "Melipilla", 13),
      (301, "Alhué", 13),
      (302, "Curacaví", 13),
      (303, "María Pinto", 13),
      (304, "San Pedro", 13),
      (305, "Talagante", 13),
      (306, "El Monte", 13),
      (307, "Isla de Maipo", 13),
      (308, "Padre Hurtado", 13),
      (309, "Peñaflor", 13),
      (310, "Valdivia", 14),
      (311, "Corral", 14),
      (312, "Lanco", 14),
      (313, "Los Lagos", 14),
      (314, "Máfil", 14),
      (315, "Mariquina", 14),
      (316, "Paillaco", 14),
      (317, "Panguipulli", 14),
      (318, "La Unión", 14),
      (319, "Futrono", 14),
      (320, "Lago Ranco", 14),
      (321, "Río Bueno", 14),
      (322, "Arica", 15),
      (323, "Camarones", 15),
      (324, "Putre", 15),
      (325, "General Lagos", 15),
      (326, "Bulnes", 16),
      (327, "Chillán", 16),
      (328, "Chillán Viejo", 16),
      (329, "El Carmen", 16),
      (330, "Pemuco", 16),
      (331, "Pinto", 16),
      (332, "Quillón", 16),
      (333, "San Ignacio", 16),
      (334, "Yungay", 16),
      (335, "Cobquecura", 16),
      (336, "Coelemu", 16),
      (337, "Ninhue", 16),
      (338, "Ñiquén", 16),
      (339, "Portezuelo", 16),
      (340, "Quirihue", 16),
      (341, "Ránquil", 16),
      (342, "Treguaco", 16),
      (343, "Coihueco", 16),
      (344, "San Carlos", 16),
      (345, "San Fabián", 16),
      (346, "San Nicolás", 16);

INSERT INTO publicacion(id_publicacion, cuerpo, imagen, precio, residuo, titulo, id_comuna, unidad_medida, id_usuario)
VALUES(1, "Lote de palos en buenas condiciones", "imagen1.jpg", 20000.0, "Madera", "Madera en buen estado", 290, "m", 1),
      (2, "Marcos de ventana tamaño grande", "imagen2.jpg", 35000.0, "Aluminio", "Marcos de ventana", 291, "m²", 1),
      (3, "Planchas de zinc", "imagen3.jpg", 10000.0, "Zinc", "Techo", 290, "m²", 2),
      (4, "Lote de muebles de madera", "imagen4.jpg", 45000.0, "Madera", "Muebles de madera", 292, "unidad", 1),
      (5, "Herramientas de jardín", "imagen5.jpg", 15000.0, "Acero", "Herramientas de jardín", 293, "unidad", 1),
      (6, "Sofá de cuero", "imagen6.jpg", 30000.0, "Cuero", "Sofá de cuero", 294, "unidad", 2),
      (7, "Escritorio de madera", "imagen7.jpg", 25000.0, "Madera", "Escritorio de madera", 295, "unidad", 2),
      (8, "Vajilla de porcelana", "imagen8.jpg", 20000.0, "Porcelana", "Vajilla de porcelana", 296, "unidad", 1),
      (9, "Ropa de segunda mano", "imagen9.jpg", 5000.0, "Tela", "Ropa de segunda mano", 297, "unidad", 2),
      (10, "Mesa de comedor", "imagen10.jpg", 40000.0, "Madera", "Mesa de comedor", 298, "unidad", 1);

