package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.BaiDangBean;
import model.bo.BaiDangBo;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.Ad_BaiDangChuaDuyetForm;

public class Ad_DanhSachDangMuaChuaDuyetAction extends Action
{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		
		Ad_BaiDangChuaDuyetForm chuaDuyetForm = (Ad_BaiDangChuaDuyetForm)form;
		BaiDangBo bdBo = new BaiDangBo();
		
		//hien thi danh sach dang mua chua duyet
		ArrayList<BaiDangBean> dangMuaLst = new ArrayList<BaiDangBean>();
		dangMuaLst = bdBo.getBaiDangList("LBD2", 0);
		chuaDuyetForm.setListBaiDang(dangMuaLst);
		//tim kiem theo tu khoa
		if("Tìm kiếm".equals(chuaDuyetForm.getSubmit()))
		{
			ArrayList<BaiDangBean> timKiemLst = new ArrayList<BaiDangBean>();
			String timKiem = chuaDuyetForm.getTimKiem();
			if(timKiem == null || "".equals(timKiem)) return mapping.findForward("danhSachDangMuaChuaDuyet"); 
			else
			{
				timKiemLst = bdBo.getTK(timKiem, "LBD2", 0);
				chuaDuyetForm.setListBaiDang(timKiemLst);
				return mapping.findForward("danhSachDangMuaChuaDuyet");
			}
		}
		return mapping.findForward("danhSachDangMuaChuaDuyet");
	}
}
