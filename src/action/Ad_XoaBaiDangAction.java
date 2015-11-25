package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bo.BaiDangBo;
import model.bo.PhanHoiBo;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.Ad_BaiDangChuaDuyetForm;

public class Ad_XoaBaiDangAction extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		// TODO Auto-generated method stub
		
		Ad_BaiDangChuaDuyetForm chuaDuyetForm = (Ad_BaiDangChuaDuyetForm)form;
		BaiDangBo bdBo = new BaiDangBo();
		
		String idBaiDang = chuaDuyetForm.getIdBaiDang();
		bdBo.xoaBai(idBaiDang);
		HttpSession session = request.getSession();
		String tenDangNhap = (String)session.getAttribute("tenDangNhap");
		
		String noiDung = "Bài đăng của bạn không hợp lệ, vì vậy bài đăng này đã bị xóa.";
		chuaDuyetForm.setPhanHoi(noiDung);
		//goi phan hoi
		PhanHoiBo phanHoiBo = new PhanHoiBo();
		boolean phanHoi = phanHoiBo.instPhanHoi(idBaiDang, tenDangNhap, noiDung);
		
		return mapping.findForward("xoaThanhCong");
	}
}
