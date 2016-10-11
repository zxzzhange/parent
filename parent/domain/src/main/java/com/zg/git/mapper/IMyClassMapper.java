package com.zg.git.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import com.zg.git.beans.MyClass;

public interface IMyClassMapper {

	@Insert("INSERT INTO _myClass(_methodName, _name) VALUES(#{mc.methoName}, #{mc.name})")
	@Options(useGeneratedKeys=true, keyProperty="mc.id", timeout=1000)
	public int insertClass(@Param("mc") MyClass mc);
	
}
