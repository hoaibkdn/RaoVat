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

public class Ad_DanhSachDangBanChuaDuyetAction extends Action
{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		Ad_BaiDangChuaDuyetForm chuaDuyetForm = (Ad_BaiDangChuaDuyetForm) form;
		BaiDangBo bdBo = new BaiDangBo();
		
		//hien thi danh sach bai dang ban chua duyet
		ArrayList<BaiDangBean> dangBanLst = new ArrayList<BaiDangBean>();
		dangBanLst = bdBo.getBaiDangList("LBD1", 0);
		chuaDuyetForm.setListBaiDang(dangBanLst);
		
		//tim kiem theo tu khoa
		if("TÃ¬m kiáº¿m".equals(chuaDuyetForm.getSubmit()))
		{
			ArrayList<BaiDangBean> timKiemLst = new ArrayList<BaiDangBean>();
			String timKiem = chuaDuyetForm.getTimKiem();
			if(timKiem == null || "".equals(timKiem)) return mapping.findForward("danhSachDangBanChuaDuyet"); 
			else
			{
				timKiemLst = bdBo.getTK(timKiem, "LBD1", 0);
				chuaDuyetForm.setListBaiDang(timKiemLst);
				return mapping.findForward("danhSachDangBanChuaDuyet");
			}
		}
		
		System.out.println("danh sach chua duyet");
		return mapping.findForward("danhSachDangBanChuaDuyet");
	}
}
