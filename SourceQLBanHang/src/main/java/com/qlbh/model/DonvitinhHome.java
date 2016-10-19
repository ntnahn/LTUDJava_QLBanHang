package com.qlbh.model;
// Generated 24/09/2016 3:27:00 PM by Hibernate Tools 5.2.0.Beta1

import java.util.List;

import javax.ejb.Stateless;

import com.qlbh.model.common.AbstractDao;
import com.qlbh.pojo.Donvitinh;
import com.qlbh.util.DataAccessLayerException;

@Stateless
public class DonvitinhHome extends AbstractDao {

	public List findAll() throws DataAccessLayerException {
		return super.findAll(Donvitinh.class);
	}

	public void save(Donvitinh dvt) {
		super.save(dvt);
	}

	public void update(Donvitinh dvt) {
		super.update(dvt);
	}

	public void delete(Donvitinh dvt) {
		dvt.setActivite(false);
		super.update(dvt);
	}
}
