package com.bmtaholic.badminton.mapper;

import java.util.List;
import com.bmtaholic.badminton.entity.BookOrderRel;

public interface BookOrderRelMapper {
	int insert(BookOrderRel record);

	int insertSelective(BookOrderRel record);

	int insert4list(List<BookOrderRel> record);
}