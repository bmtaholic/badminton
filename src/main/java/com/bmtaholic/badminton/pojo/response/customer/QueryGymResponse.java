package com.bmtaholic.badminton.pojo.response.customer;

import java.util.List;

import com.bmtaholic.badminton.pojo.response.item.GymItem;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

public class QueryGymResponse {
	List<GymItem> list;
}
