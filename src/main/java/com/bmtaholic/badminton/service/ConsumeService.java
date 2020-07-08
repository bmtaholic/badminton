package com.bmtaholic.badminton.service;

import com.bmtaholic.badminton.pojo.info.ConsumeInfo;

public interface ConsumeService {
	ConsumeInfo queryByPhone(String phone);
}
