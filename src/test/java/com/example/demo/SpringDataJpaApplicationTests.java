package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.repository.ChuyenBayRepository;
import com.example.demo.repository.MayBayRepository;
import com.example.demo.repository.NhanVienRepository;



@SpringBootTest
class SpringDataJpaApplicationTests {
	
	@Autowired
	ChuyenBayRepository chuyenBayRepository;
	@Autowired
	MayBayRepository mayBayRepository;
	@Autowired
    NhanVienRepository nhanVienRepository;
	
//	@Test
//	void cau1() {
//		chuyenBayRespository.listCau1()
//        .forEach(e -> {
//            System.out.println(e.toString());
//        });
//	}
//	@Test
//    void cau2() {
//        mayBayRepository.listCau2().forEach(System.out::println);
//    }		
//	@Test
//    void cau3NhanVien() {
//        nhanVienRepository.findCau3().forEach(System.out::println);
//    }	
//	 @Test
//	    void cau4() {
//		 chuyenBayRespository.listCau4().forEach(System.out::println);
//	    }
//	 @Test
//	    void cau5() {
//	        chuyenBayRepository.listCau5().forEach(System.out::println);
//	    }
//	@Test
//    void cau6() {
//        System.out.println("Số chuyến bay : " + chuyenBayRepository.ListCau6());
//    }
//	
//	 @Test
//	    void cau7() {
//	        System.out.println("số loại máy bay boeing : " + mayBayRepository.countCau7());
//	    }
//	@Test
//    void cau8() {
//        System.out.println("tổng số lương phải trả cho nhân viên : " + nhanVienRepository.sumCau8());
//    }
//	@Test
//    void cau9() {
//        nhanVienRepository.findCau9().forEach(e -> System.out.println("Mã số của các phi công lái máy bay boeing:" + e));
//    }
//	@Test
//    void cau10() {
//		System.out.println(" các nhân viên có thể lái máy bay có mã số 747");
//        nhanVienRepository.findCau10().forEach(System.out::println);
//    }
//	@Test
//    void cau11() {
//        mayBayRepository.findCau11().forEach(e -> System.out.println("mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái: " + e));
//    }
//	@Test
//    void cau12() {
//        nhanVienRepository.findCau12().forEach(e -> System.out.println("mã số của các phi công vừa lái được Boeing vừa lái được Airbus: "+e));
//    }
//	@Test
//    void cau13() {
//		System.out.println("các loại máy bay có thể thực hiện chuyến bay VN280: ");
//        mayBayRepository.listCau13().forEach(System.out::println);
//    }
//	 @Test
//	    void cau14() {
//		 	System.out.println("Các chuyến bay có thể được thực hiện bởi máy bay Airbus A320: ");
//	        mayBayRepository.listCau14().forEach(System.out::println);
//	    }
//	 @Test
//	    void cau15() {
//	        nhanVienRepository.findCau15().forEach(e -> System.out.println("tên của các phi công lái máy bay Boeing: " +e));
//	    }
//	@Test
//    void cau17() {
//		System.out.println("Các đường bay đi thẳng từ ga A tới ga B rồi quay trở lại ga A phù hợp với yêu cầu khách hàng là: ");
//        mayBayRepository.listCau17().forEach(e -> System.out.println(e));
//    }
//	@Test
//    void cau20() {
//        mayBayRepository.listCau20().forEach(e -> System.out.println(e));
//    }
//}
//	@Test
//    void cau22() {
//		System.out.println("mã số của các phi công chỉ lái được 3 loại máy bay: ");
//        nhanVienRepository.findCau22().forEach(System.out::println);
//    }
//	@Test
//    void cau23() {
//		System.out.println("Với mỗi phi công có thể lái nhiều hơn 3 loại máy bay,  mã số phi công và tầm bay lớn "
//				+ "nhất của các loại máy bay mà phi công đó có thể lái: ");
//        nhanVienRepository.findCau23().forEach(System.out::println);
//    }
//	 @Test
//	    void cau24NhanVien() {
//		 	System.out.println("Với mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi công đó có thể lái: ");
//	        nhanVienRepository.findCau24().forEach(System.out::println);
//	    }
//	@Test
//    void cau25() {
//		System.out.println("các nhân viên không phải là phi công là: ");
//        nhanVienRepository.findCau25().forEach(System.out::println);
//    }
//	@Test
//    void cau26() {
//		System.out.println(" mã số của các nhân viên có lương cao nhất: ");
//        nhanVienRepository.findCau26().forEach(System.out::println);
//    }
//	@Test
//    void cau27() {
//        System.out.println("Số lương phải trả cho các phi công là : " + nhanVienRepository.sumCau27());
//    }
	@Test
    void cau28() {
		System.out.println("Các chuyến bay có thể được thực hiện bởi tất cả các loại máy bay Boeing: ");
        chuyenBayRepository.listCau28().forEach(System.out::println);
    }
}