package ksmybatis.admin.vendor.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmybatis.admin.vendor.domain.Vendor;

@Mapper
public interface VendorMapper {
	
	// 판매자 거래처 삭제
	int removeVendorsBySellerId(String sellerId);
	
	// 판매처 목록조회
	List<Vendor> getVendorList();
	
}
