package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.MayBay;

public interface MayBayRepository extends JpaRepository<MayBay, Long> {

  // 2.Cho biết các loại máy bay có tầm bay lớn hơn 10,000km
  @Query(value = "select * from maybay where TamBay > 10000", nativeQuery = true)
  public List<MayBay> listCau2();

  // 7. Có bao nhiêu loại máy báy Boeing.
  @Query(value = "select count(*) from maybay where loai like 'Boeing%'", nativeQuery = true)
  public int countCau7();

  // 11. Cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái
  @Query(value = "select mb.mamb from nhanvien nv JOIN chungnhan cn on nv.MaNV = cn.manv Join maybay mb on mb.MaMB = cn.MaMB where nv.ten like 'nguyen%' ", nativeQuery = true)
  public List<String> findCau11();

  // 13. Cho biết các loại máy bay có thể thực hiện chuyến bay VN280
  @Query(value = "select * from maybay where TamBay >= 11979", nativeQuery = true)
  public List<MayBay> listCau13();

  // 14. Cho biết các loại máy bay có thể thực hiện chuyến bay Airbus A320
  @Query(value = "select * from maybay where TamBay >= 4168", nativeQuery = true)
  public List<MayBay> listCau14();



  // 17. Giả sử một hành khách muốn đi thẳng từ ga A đến ga B rồi quay trở về ga A Cho biết các đường bay nào có thể đáp ứng yêu cầu này.
  @Query(value = "select * from maybay where TamBay > 8200", nativeQuery = true)
  public List<MayBay> listCau17();

  // 20. Cho biết danh sách các chuyến bay có thể khởi hành trước 12:00
  @Query(value = "SELECT * FROM CHUYENBAY WHERE GioDi < '12:00'GROUP BY GaDi", nativeQuery = true)
  public List<String> listCau20();

}