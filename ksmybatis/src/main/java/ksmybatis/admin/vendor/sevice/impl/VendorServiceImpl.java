package ksmybatis.admin.vendor.sevice.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmybatis.admin.vendor.domain.Vendor;
import ksmybatis.admin.vendor.mapper.VendorMapper;
import ksmybatis.admin.vendor.sevice.VendorService;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class VendorServiceImpl implements VendorService{
	
	private final VendorMapper vendorMapper;
	
	public List<Vendor> getVendorList() {
		
		var vendorList = vendorMapper.getVendorList();
		
		return vendorList;
	}
}
