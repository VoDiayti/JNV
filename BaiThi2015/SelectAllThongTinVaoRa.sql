select vr.ThongTinVaoRa_ID as ID, vr.LoaiXe, 'Not Available' as BienSo, SoVe, ThoiDiemVao, ThoiDiemRa, 'Not Available' as TinhTrangKhiVao
from ThongTinVaoRa vr inner join ThongTinVaoRa_XeDap xd on vr.ThongTinVaoRa_ID = xd.ThongTinVaoRa_ID
union
SELECT vr.ThongTinVaoRa_ID as ID, vr.LoaiXe, BienSo, 'Not Available' as SoVe, ThoiDiemVao, ThoiDiemRa, 'Not Available'  as TinhTrangKhiVao
FROM ThongTinVaoRa AS vr INNER JOIN ThongTinVaoRa_XeMay AS xm ON vr.ThongTinVaoRa_ID = xm.ThongTinVaoRa_ID
union
select vr.ThongTinVaoRa_ID as ID, vr.LoaiXe, BienSo, 'Not Available' as SoVe, ThoiDiemVao, ThoiDiemRa, TinhTrangKhiVao
from ThongTinVaoRa vr inner join ThongTinVaoRa_XeHoi xh on vr.ThongTinVaoRa_ID = xh.ThongTinVaoRa_ID
