USE [Park]
GO
/****** Object:  Table [dbo].[ThongTinVaoRa_XeMay]    Script Date: 07/22/2016 11:40:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThongTinVaoRa_XeMay](
	[ThongTinVaoRa_ID] [nvarchar](50) NOT NULL,
	[BienSo] [nvarchar](50) NULL,
 CONSTRAINT [PK_ThongTinVaoRa_XeMay] PRIMARY KEY CLUSTERED 
(
	[ThongTinVaoRa_ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ThongTinVaoRa_XeMay] ([ThongTinVaoRa_ID], [BienSo]) VALUES (N'2', N'75A-1234')
/****** Object:  Table [dbo].[ThongTinVaoRa_XeHoi]    Script Date: 07/22/2016 11:40:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThongTinVaoRa_XeHoi](
	[ThongTinVaoRa_ID] [nvarchar](50) NOT NULL,
	[BienSo] [nvarchar](50) NULL,
	[TinhTrangKhiVao] [nvarchar](50) NULL,
	[TinhTrangKhiRa] [nvarchar](50) NULL,
 CONSTRAINT [PK_ThongTinVaoRa_XeHoi] PRIMARY KEY CLUSTERED 
(
	[ThongTinVaoRa_ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ThongTinVaoRa_XeHoi] ([ThongTinVaoRa_ID], [BienSo], [TinhTrangKhiVao], [TinhTrangKhiRa]) VALUES (N'3', N'37A-1234', N'Trầy xước phía cửa trước', NULL)
INSERT [dbo].[ThongTinVaoRa_XeHoi] ([ThongTinVaoRa_ID], [BienSo], [TinhTrangKhiVao], [TinhTrangKhiRa]) VALUES (N'4', N'37A-3521', N'Bình thường', NULL)
/****** Object:  Table [dbo].[ThongTinVaoRa_XeDap]    Script Date: 07/22/2016 11:40:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThongTinVaoRa_XeDap](
	[ThongTinVaoRa_ID] [nvarchar](50) NOT NULL,
	[SoVe] [nvarchar](50) NULL,
 CONSTRAINT [PK_ThongTinVaoRa_XeDap] PRIMARY KEY CLUSTERED 
(
	[ThongTinVaoRa_ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ThongTinVaoRa_XeDap] ([ThongTinVaoRa_ID], [SoVe]) VALUES (N'1', N'112')
/****** Object:  Table [dbo].[ThongTinVaoRa]    Script Date: 07/22/2016 11:40:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThongTinVaoRa](
	[ThongTinVaoRa_ID] [nvarchar](50) NOT NULL,
	[LoaiXe] [int] NOT NULL,
	[ThoiDiemVao] [datetime] NOT NULL,
	[ThoiDiemRa] [datetime] NULL,
 CONSTRAINT [PK_ThongTinVaoRa] PRIMARY KEY CLUSTERED 
(
	[ThongTinVaoRa_ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ThongTinVaoRa] ([ThongTinVaoRa_ID], [LoaiXe], [ThoiDiemVao], [ThoiDiemRa]) VALUES (N'1', 0, CAST(0x0000A4C9009DEDB0 AS DateTime), NULL)
INSERT [dbo].[ThongTinVaoRa] ([ThongTinVaoRa_ID], [LoaiXe], [ThoiDiemVao], [ThoiDiemRa]) VALUES (N'2', 2, CAST(0x0000A4C9018344A0 AS DateTime), NULL)
INSERT [dbo].[ThongTinVaoRa] ([ThongTinVaoRa_ID], [LoaiXe], [ThoiDiemVao], [ThoiDiemRa]) VALUES (N'3', 4, CAST(0x0000A57E015A11C0 AS DateTime), NULL)
INSERT [dbo].[ThongTinVaoRa] ([ThongTinVaoRa_ID], [LoaiXe], [ThoiDiemVao], [ThoiDiemRa]) VALUES (N'4', 4, CAST(0x0000A57E00FF6EA0 AS DateTime), NULL)
/****** Object:  ForeignKey [FK_ThongTinVaoRa_ThongTinVaoRa_XeDap]    Script Date: 07/22/2016 11:40:04 ******/
ALTER TABLE [dbo].[ThongTinVaoRa]  WITH NOCHECK ADD  CONSTRAINT [FK_ThongTinVaoRa_ThongTinVaoRa_XeDap] FOREIGN KEY([ThongTinVaoRa_ID])
REFERENCES [dbo].[ThongTinVaoRa_XeDap] ([ThongTinVaoRa_ID])
GO
ALTER TABLE [dbo].[ThongTinVaoRa] NOCHECK CONSTRAINT [FK_ThongTinVaoRa_ThongTinVaoRa_XeDap]
GO
/****** Object:  ForeignKey [FK_ThongTinVaoRa_ThongTinVaoRa_XeHoi]    Script Date: 07/22/2016 11:40:04 ******/
ALTER TABLE [dbo].[ThongTinVaoRa]  WITH NOCHECK ADD  CONSTRAINT [FK_ThongTinVaoRa_ThongTinVaoRa_XeHoi] FOREIGN KEY([ThongTinVaoRa_ID])
REFERENCES [dbo].[ThongTinVaoRa_XeHoi] ([ThongTinVaoRa_ID])
GO
ALTER TABLE [dbo].[ThongTinVaoRa] NOCHECK CONSTRAINT [FK_ThongTinVaoRa_ThongTinVaoRa_XeHoi]
GO
/****** Object:  ForeignKey [FK_ThongTinVaoRa_ThongTinVaoRa_XeMay]    Script Date: 07/22/2016 11:40:04 ******/
ALTER TABLE [dbo].[ThongTinVaoRa]  WITH NOCHECK ADD  CONSTRAINT [FK_ThongTinVaoRa_ThongTinVaoRa_XeMay] FOREIGN KEY([ThongTinVaoRa_ID])
REFERENCES [dbo].[ThongTinVaoRa_XeMay] ([ThongTinVaoRa_ID])
GO
ALTER TABLE [dbo].[ThongTinVaoRa] NOCHECK CONSTRAINT [FK_ThongTinVaoRa_ThongTinVaoRa_XeMay]
GO
