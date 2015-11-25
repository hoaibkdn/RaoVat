package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.NguoiDungBean;
import model.bo.NguoiDungBo;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.Ad_DanhSachNguoiDungForm;

public class Ad_QuanLyNguoiDungAction extends Action 
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		Ad_DanhSachNguoiDungForm dsnguoidungForm = (Ad_DanhSachNguoiDungForm)form;
		NguoiDungBo ndBO = new NguoiDungBo();
		ArrayList<NguoiDungBean> listNguoiDung = new ArrayList<NguoiDungBean>();
		listNguoiDung = ndBO.getListNguoiDung();
		ArrayList<NguoiDungBean> ndLst = new ArrayList<NguoiDungBean>();
		for(int i=0; i<listNguoiDung.size(); i++)
		{
			if(listNguoiDung.get(i).getPhanQuyen() == 0)
			{
				ndLst.add(listNguoiDung.get(i));
			}
		}
		dsnguoidungForm.setListNguoiDung(ndLst);
		System.out.println(dsnguoidungForm.getSubmit());
		
		//tim kiem 
		if("TÃ¬m kiáº¿m".equals(dsnguoidungForm.getSubmit()))
		{
			ArrayList<NguoiDungBean> ndSearch = new ArrayList<NguoiDungBean>();
			String textSearch = dsnguoidungForm.getTimKiemText();
			String trangThai = dsnguoidungForm.getTrangThai();
			System.out.println(textSearch);
			System.out.println(trangThai);
			if(textSearch != null  )
			{
				ndSearch = ndBO.getNdSearch(textSearch);
				ArrayList<NguoiDungBean> lstAll = new ArrayList<NguoiDungBean>();
				if("Tat ca".equals(trangThai))
				{
					lstAll = ndSearch;
					dsnguoidungForm.setListNguoiDung(lstAll);
					System.out.println("vo di");
				}
				if("block".equals(trangThai))
				{
					
					for(int i = 0; i<ndSearch.size(); i++)
					{
						if("block".equals(ndSearch.get(i).getTrangThai()))
						{
							lstAll.add(ndSearch.get(i));
						}
					}
				}
				if("active".equals(dsnguoidungForm.getTrangThai()))
				{
					
					for(int i = 0; i<ndSearch.size(); i++)
					{
						if("active".equals(ndSearch.get(i).getTrangThai()))
						{
							lstAll.add(ndSearch.get(i));
						}
					}
				}
				dsnguoidungForm.setListNguoiDung(lstAll);
			}
			if((textSearch == null) || "".equals(textSearch))
			{
				ArrayList<NguoiDungBean> searchTT = new ArrayList<NguoiDungBean>();
				if("Tat ca".equals(trangThai))
				{
					searchTT = ndLst;
				}
				if("block".equals(trangThai))
				{
					
					for(int i = 0; i<ndLst.size(); i++)
					{
						if("block".equals(ndLst.get(i).getTrangThai()))
						{
							searchTT.add(ndLst.get(i));
						}
					}
				}
				if("active".equals(trangThai))
				{
					
					for(int i = 0; i<ndLst.size(); i++)
					{
						if("active".equals(ndLst.get(i).getTrangThai()))
						{
							searchTT.add(ndLst.get(i));
						}
					}
				}
				dsnguoidungForm.setListNguoiDung(searchTT);
			}
			return mapping.findForward("nguoiDungTimKiem");
		}
		return mapping.findForward("danhSachNguoiDung");
	}
}
