package com.vaecn.sunflower.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author sifan
 * @since 2017-09-04
 */
@Data
public class User  extends Model<User> implements Serializable {

    private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Integer age;

	@Override
	protected Serializable pkVal() {
		return this.id;
	}
}
