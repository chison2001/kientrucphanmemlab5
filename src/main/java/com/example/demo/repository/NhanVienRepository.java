package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.*;

public interface NhanVienRepository extends JpaRepository<NhanVien, String> {

  // 3. Tìm các nhân viên có lương nhỏ hơn 10,000.
  @Query(value = "select * from nhanvien where luong < 10000", nativeQuery = true)
  public List<NhanVien> findCau3();

  // 8. Cho biết tổng số lương phải trả cho các nhân viên..
  @Query(value = "select sum(luong) as luong from nhanvien ", nativeQuery = true)
  public Long sumCau8();

  // 9. Cho biết mã số của các phi công lái máy báy Boeing.
  @Query(value = "select nv.manv from nhanvien nv JOIN chungnhan cn on nv.MaNV = cn.manv Join maybay mb on mb.MaMB = cn.MaMB where mb.Loai like 'Boeing%' group by nv.MaNV, nv.Ten", nativeQuery = true)
  public List<String> findCau9();

  // 10. Cho biết các nhân viên có thể lái máy bay có mã số 747
  @Query(value = "select * from nhanvien nv JOIN chungnhan cn on nv.MaNV = cn.manv Join maybay mb on mb.MaMB = cn.MaMB where mb.mamb=747", nativeQuery = true)
  public List<NhanVien> findCau10();

  // 12. Cho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus
  @Query(value = "SELECT * FROM nhanvien WHERE MaNV In (select cn.MaNV from chungnhan cn inner join maybay mb on mb.MaMB = cn.MaMB where mb.Loai like '%Airbus%' or mb.Loai like '%Boeing%')", nativeQuery = true)
  public List<NhanVien> findCau12();

  // 15. Cho biết tên của các phi công lái máy bay Boeing\
  @Query(value = "select nv.Ten from maybay mb join chungnhan cn on mb.mamb = cn.MaMB join nhanvien nv on cn.MaNV = nv.MaNV where mb.loai like 'boeing%' group by nv.ten, nv.manv", nativeQuery = true)
  public List<String> findCau15();

  // 22. Cho biết mã số của các phi công chỉ lái được 3 loại máy bay
  @Query(value = "SELECT nv.MaNV, Ten, COUNT(MAMB) AS 'Số lượng'FROM NHANVIEN nv, CHUNGNHAN cn WHERE nv.MaNV = cn.MaNV GROUP BY NV.MaNV,Ten HAVING COUNT(MAMB) = 3", nativeQuery = true)
  public List<String> findCau22();

  // 23. Với mỗi phi công có thể lái nhiều hơn 3 loại máy bay, cho biết mã số phi công và tầm bay lớn nhất của các loại máy bay mà phi công đó có thể lái.
  @Query(value = "SELECT cn.MaNV, TamBay FROM NHANVIEN nv, MAYBAY mb, CHUNGNHAN cn WHERE nv.MaNV = cn.MaNV AND mb.MaMB = cn.MaMB AND cn.MaNV IN (SELECT nv.MaNV FROM NHANVIEN nv, CHUNGNHAN cn WHERE nv.MaNV = cn.MaNV GROUP BY NV.MaNV HAVING COUNT(MAMB) > 3)", nativeQuery = true)
  public List<String> findCau23();

  // 24. Với mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi công đó có thể lái.
  @Query(value = "SELECT nv.MaNV, COUNT(mb.MaMB) FROM NHANVIEN " +
      "nv, CHUNGNHAN cn, MAYBAY mb WHERE nv.MaNV = cn.MaNV AND "
      + "mb.MaMB = cn.MaMB AND nv.MANV IN(SELECT MaNV FROM CHUNGNHAN) "
      + "GROUP BY nv.MaNV,Ten", nativeQuery = true)
  public List<String> findCau24();

  // 25. Tìm các nhân viên không phải là phi công.
  @Query(value = "SELECT MaNV, Ten FROM NHANVIEN " +
      "WHERE MANV NOT IN(SELECT MaNV FROM CHUNGNHAN) ", nativeQuery = true)
  public List<String> findCau25();

  // 26. Cho biết mã số của các nhân viên có lương cao nhất.
  @Query(value = "SELECT MaNV, Luong FROM NHANVIEN " +
      "WHERE MANV IN(SELECT MaNV FROM CHUNGNHAN) AND Luong IN (SELECT MAX(Luong) FROM NHANVIEN) ", nativeQuery = true)
  public List<String> findCau26();

  // 27. Cho biết tổng số lương phải trả cho các phi công.
  @Query(value = "SELECT SUM(LUONG) FROM NHANVIEN", nativeQuery = true)
  public int sumCau27();
}
