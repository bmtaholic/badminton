package com.bmtaholic.badminton.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.bmtaholic.badminton.utils.converter.All2StringConverter;

import net.sf.cglib.beans.BeanCopier;

public class ListUtil {
	public static <T, K> List<K> copyList(List<T> list, Class<K> obj) {
		List<K> resList = new ArrayList<K>();
		for (T item : list) {
			try {
				K copyItem = obj.newInstance();
				BeanUtils.copyProperties(item, copyItem);
				resList.add(copyItem);
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return resList;
	}

	public static <T, K> List<K> copyToStringList(List<T> list, Class<K> obj) {
		List<K> resList = new ArrayList<K>();
		for (T item : list) {
			try {
				K copyItem = obj.newInstance();
				BeanCopier copier = BeanCopier.create(item.getClass(), copyItem.getClass(), true);
				copier.copy(item, copyItem, new All2StringConverter());
				resList.add(copyItem);
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return resList;
	}
}
