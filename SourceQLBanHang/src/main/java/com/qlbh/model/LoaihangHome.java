package com.qlbh.model;
// Generated 24/09/2016 3:27:00 PM by Hibernate Tools 5.2.0.Beta1

import java.util.List;

import javax.ejb.Stateless;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.qlbh.model.common.AbstractDao;
import com.qlbh.pojo.Loaihang;
import com.qlbh.util.DataAccessLayerException;

/**
 * Home object for domain model class Loaihang.
 * 
 * @see com.qlbh.model.Loaihang
 * @author Hibernate Tools
 */
@Stateless
public class LoaihangHome extends AbstractDao {

	private static final Log log = LogFactory.getLog(LoaihangHome.class);

	public List findAll() throws DataAccessLayerException {
		return super.findAll(Loaihang.class);
	}

	public void save(Loaihang lh) {
		super.save(lh);
		super.saveNhatKy("Loại hoàng hóa", "Thêm");
	}

	public void update(Loaihang lh) {
		super.update(lh);
		super.saveNhatKy("Loại hoàng hóa", "Cập nhật");
	}

	public void delete(Loaihang lh) {
		lh.setActivity(false);
		super.update(lh);
		super.saveNhatKy("Loại hoàng hóa", "Xóa");
	}
}
