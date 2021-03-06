USE [master]
GO
/****** Object:  Database [chivo_Mark3t]    Script Date: 02/12/2021 12:48:09 ******/
CREATE DATABASE [chivo_Mark3t]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'chivo_Mark3t', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\chivo_Mark3t.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'chivo_Mark3t_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\chivo_Mark3t_log.ldf' , SIZE = 73728KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [chivo_Mark3t] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [chivo_Mark3t].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [chivo_Mark3t] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET ARITHABORT OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [chivo_Mark3t] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [chivo_Mark3t] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET  ENABLE_BROKER 
GO
ALTER DATABASE [chivo_Mark3t] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [chivo_Mark3t] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET RECOVERY FULL 
GO
ALTER DATABASE [chivo_Mark3t] SET  MULTI_USER 
GO
ALTER DATABASE [chivo_Mark3t] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [chivo_Mark3t] SET DB_CHAINING OFF 
GO
ALTER DATABASE [chivo_Mark3t] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [chivo_Mark3t] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [chivo_Mark3t] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [chivo_Mark3t] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'chivo_Mark3t', N'ON'
GO
ALTER DATABASE [chivo_Mark3t] SET QUERY_STORE = OFF
GO
USE [chivo_Mark3t]
GO
/****** Object:  User [invitado]    Script Date: 02/12/2021 12:48:09 ******/
CREATE USER [invitado] FOR LOGIN [invitado] WITH DEFAULT_SCHEMA=[dbo]
GO
/****** Object:  Table [dbo].[categorias]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[categorias](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](500) NOT NULL,
	[descripcion] [varchar](1000) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Cliente]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cliente](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Nickname] [varchar](700) NOT NULL,
	[Contrasena] [varchar](200) NOT NULL,
	[Correo] [varchar](300) NOT NULL,
	[telefono] [varchar](8) NOT NULL,
	[ID_Rol] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Pedidos]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Pedidos](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](400) NOT NULL,
	[precio] [decimal](6, 2) NOT NULL,
	[cantidad] [int] NOT NULL,
	[Estado] [bit] NOT NULL,
	[ID_Usuario] [int] NULL,
	[ID_Producto] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[productos]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[productos](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](500) NOT NULL,
	[imagen] [varchar](500) NOT NULL,
	[precio] [decimal](5, 2) NOT NULL,
	[cantidad] [int] NULL,
	[ID_Categoria] [int] NULL,
	[Descripcion] [varchar](900) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[roles]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[roles](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](300) NOT NULL,
 CONSTRAINT [PK_roles] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Ticket]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Ticket](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](400) NOT NULL,
	[precio] [decimal](6, 2) NOT NULL,
	[cantidad] [int] NOT NULL,
	[Estado] [bit] NOT NULL,
	[ID_Usuario] [int] NULL,
	[ID_Producto] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Trabajador]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Trabajador](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Nickname] [varchar](500) NOT NULL,
	[Correo] [varchar](500) NOT NULL,
	[Contrasena] [varchar](100) NOT NULL,
	[Numero] [varchar](8) NOT NULL,
	[DUI] [varchar](10) NOT NULL,
	[ID_Rol] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Cliente]  WITH CHECK ADD FOREIGN KEY([ID_Rol])
REFERENCES [dbo].[roles] ([ID])
GO
ALTER TABLE [dbo].[Pedidos]  WITH CHECK ADD FOREIGN KEY([ID_Producto])
REFERENCES [dbo].[productos] ([ID])
GO
ALTER TABLE [dbo].[Pedidos]  WITH CHECK ADD FOREIGN KEY([ID_Usuario])
REFERENCES [dbo].[Cliente] ([ID])
GO
ALTER TABLE [dbo].[productos]  WITH CHECK ADD FOREIGN KEY([ID_Categoria])
REFERENCES [dbo].[categorias] ([ID])
GO
ALTER TABLE [dbo].[Ticket]  WITH CHECK ADD FOREIGN KEY([ID_Usuario])
REFERENCES [dbo].[Cliente] ([ID])
GO
ALTER TABLE [dbo].[Trabajador]  WITH CHECK ADD FOREIGN KEY([ID_Rol])
REFERENCES [dbo].[roles] ([ID])
GO
/****** Object:  StoredProcedure [dbo].[PR_Register]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[PR_Register]

@Nickname varchar(700),
@contrasena varchar(200),
@correo varchar(300),
@telefono varchar(8)
as
begin 
insert into Cliente values(@Nickname,@contrasena,@correo,@telefono,3)
end;
GO
/****** Object:  StoredProcedure [dbo].[PR_VALIDACION]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[PR_VALIDACION]
@contrasena varchar(200),
@correo varchar(300)
AS
BEGIN
SELECT *FROM CLIENTE WHERE CORREO=@correo AND CONTRASENA=@contrasena
return 1 
END;
GO
/****** Object:  StoredProcedure [dbo].[SP_Actualizar_Pedido]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create procedure [dbo].[SP_Actualizar_Pedido]
@ID_Pedido int,
@ID_Producto int,
@Cantidad int,
@Devuelto int
as
begin
Update Pedidos set cantidad=@Cantidad where ID=@ID_Pedido
update productos set cantidad=cantidad+@Devuelto where ID=@ID_Producto
end;
GO
/****** Object:  StoredProcedure [dbo].[SP_Actualizar_Producto]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
 CREATE procedure [dbo].[SP_Actualizar_Producto]
 @NOMBRE_PRODUCTO VARCHAR(500),
 @ID int,
 @Cantidad int,
 @precio decimal(6,2),
 @ID_CATEGORIA INT,
 @IMAGEN VARCHAR(1000),
 @Descripcion varchar(900)
 as 
 begin
UPDATE productos set Nombre=@NOMBRE_PRODUCTO, cantidad=@Cantidad,precio=@precio,ID_Categoria=@ID_CATEGORIA, imagen=@IMAGEN,Descripcion=@Descripcion
where ID=@ID
end;
GO
/****** Object:  StoredProcedure [dbo].[SP_Actualizar_Ticket]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create procedure [dbo].[SP_Actualizar_Ticket]
@ID_Ticket int,
@ID_Producto int,
@Cantidad int,
@Devuelto int
as
begin
Update Ticket set cantidad=@Cantidad where ID=@ID_Ticket
update productos set cantidad=cantidad+@Devuelto where ID=@ID_Producto
end;
GO
/****** Object:  StoredProcedure [dbo].[SP_BUSCAR_CATEGORIA]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[SP_BUSCAR_CATEGORIA]
@ID_Categoria int
as 
begin
Select *from productos where ID_Categoria LIKE @ID_Categoria
END;
GO
/****** Object:  StoredProcedure [dbo].[SP_BUSCAR_PENDIENTE]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
 CREATE PROCEDURE [dbo].[SP_BUSCAR_PENDIENTE]
  @ID_Usuario int
  as
  begin
  Select*from Pedidos where ID_Usuario=@ID_Usuario
  END;
GO
/****** Object:  StoredProcedure [dbo].[SP_BUSCAR_PRODUCTO_SECCION]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[SP_BUSCAR_PRODUCTO_SECCION]
@ID int
as
begin
Select*from productos where ID=@ID
end;
GO
/****** Object:  StoredProcedure [dbo].[SP_BUSQUEDA_Ticket]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create procedure [dbo].[SP_BUSQUEDA_Ticket]
@ID_usuario int
as
begin
Select*from Ticket where ID_Usuario=@ID_usuario and Estado=1
end;
GO
/****** Object:  StoredProcedure [dbo].[SP_CANCELAR_TICKET]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create procedure [dbo].[SP_CANCELAR_TICKET]
@ID_Usuario int
as
begin
Update Ticket set Estado=0 where ID_Usuario=@ID_Usuario
end;
GO
/****** Object:  StoredProcedure [dbo].[SP_Delete_Pedido]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[SP_Delete_Pedido]
@ID_Producto int,
@ID_usuario int
as
begin
delete from Pedidos where ID=@ID_Producto AND ID_Usuario=@ID_usuario 
end;
GO
/****** Object:  StoredProcedure [dbo].[SP_DELETE_PRODUCTO]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[SP_DELETE_PRODUCTO]
@ID INT
AS
BEGIN
DELETE FROM productos WHERE ID=@ID
END;
GO
/****** Object:  StoredProcedure [dbo].[SP_DELETE_TRABAJADOR]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create procedure [dbo].[SP_DELETE_TRABAJADOR]
@ID INT
as
begin
DELETE Trabajador WHERE ID=@ID
end;
GO
/****** Object:  StoredProcedure [dbo].[SP_Eliminar_Ticket]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create procedure [dbo].[SP_Eliminar_Ticket]
@ID_Ticket int,
@ID_producto int,
@Cantidad int
as
begin
delete Ticket where ID=@ID_Ticket
UPDATE productos SET cantidad=cantidad+@Cantidad where ID=@ID_producto
END;
GO
/****** Object:  StoredProcedure [dbo].[SP_INSERT_PRODUCTO]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[SP_INSERT_PRODUCTO]
@NOMBRE VARCHAR(500),
@IMAGEN VARCHAR(1000),
@PRECIO DECIMAL(6,2),
@CANTIDAD DECIMAL(6,2),
@CATEGORIA INT,
@Descripcion varchar(900)
AS
BEGIN
INSERT INTO productos VALUES(@NOMBRE,@IMAGEN,@PRECIO,@CANTIDAD,@CATEGORIA,@Descripcion)
END;
GO
/****** Object:  StoredProcedure [dbo].[SP_INSERT_TICKET]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[SP_INSERT_TICKET]
@ID_USUARIO INT
AS
BEGIN
INSERT INTO Ticket Select Nombre,precio,cantidad,Estado,ID_Usuario,ID_Producto from Pedidos where (ID_Usuario=@ID_USUARIO)
delete from Pedidos where ID_Usuario=@ID_usuario 
end;
GO
/****** Object:  StoredProcedure [dbo].[SP_INSERT_Trabajador]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create procedure [dbo].[SP_INSERT_Trabajador]
@Nickname varchar(500),
@Correo varchar(500),
@contrasena varchar(100),
@Numero varchar(8),
@DUI varchar(10),
@ID_ROL int
as
begin
insert into Trabajador values (@Nickname,@Correo,@contrasena,@Numero,@DUI,@ID_ROL)
end;
GO
/****** Object:  StoredProcedure [dbo].[SP_Insertar_Pedido]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[SP_Insertar_Pedido]
@Nombre varchar(400),
@precio decimal(6,2),
@cantidad int,
@Estado bit,
@ID_Usuario int,
@ID_Producto int
as
begin
Insert into Pedidos values (@Nombre,@precio,@cantidad,@Estado,@ID_Usuario,@ID_Producto)
end;
GO
/****** Object:  StoredProcedure [dbo].[SP_LISTAR_PRODUCTOS]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[SP_LISTAR_PRODUCTOS]
AS
BEGIN
SELECT*FROM PRODUCTOS
END;
GO
/****** Object:  StoredProcedure [dbo].[SP_Listar_Trabajador]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create procedure [dbo].[SP_Listar_Trabajador]
as
begin
select*from Trabajador
end;
GO
/****** Object:  StoredProcedure [dbo].[SP_Listar_Trabajador_Especifico]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create procedure [dbo].[SP_Listar_Trabajador_Especifico]
@ID int
as
begin
select*from Trabajador where ID=@ID
end;
GO
/****** Object:  StoredProcedure [dbo].[SP_Login_Trabajador]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create procedure [dbo].[SP_Login_Trabajador]
@Correo varchar(500),
@Contrasena varchar(100)
as
begin
select*from Trabajador where Correo=@Correo and Contrasena	=@Contrasena
end;
GO
/****** Object:  StoredProcedure [dbo].[SP_Modificar_Cantidad]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[SP_Modificar_Cantidad]
@ID int ,
@Cantidad int
as
begin
UPDATE productos set cantidad=cantidad+@Cantidad where ID=@ID
end;
GO
/****** Object:  StoredProcedure [dbo].[SP_UPDATE_TRABAJADOR]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[SP_UPDATE_TRABAJADOR]
@ID int,
@Nickname varchar(500),
@Correo varchar(500),
@contrasena varchar(100),
@Numero varchar(8),
@DUI varchar(10),
@ID_ROL int
as
begin
UPDATE Trabajador SET Nickname=@Nickname,Correo=@Correo,Contrasena=@contrasena,
Numero=@Numero,DUI=@DUI,ID_Rol=@ID_ROL where ID=@ID
end;
GO
/****** Object:  StoredProcedure [dbo].[SP_verificador]    Script Date: 02/12/2021 12:48:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create procedure [dbo].[SP_verificador]
@Correo varchar(300)
as
begin
select*from Cliente where correo=@Correo
end;
GO
USE [master]
GO
ALTER DATABASE [chivo_Mark3t] SET  READ_WRITE 
GO
