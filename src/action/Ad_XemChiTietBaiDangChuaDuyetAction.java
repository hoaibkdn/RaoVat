package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.XemChiTietBaiDangBo;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.Ad_BaiDangChuaDuyetForm;

public class Ad_XemChiTietBaiDangChuaDuyetAction extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		
		Ad_BaiDangChuaDuyetForm chuaDuyetForm = (Ad_BaiDangChuaDuyetForm) form;
		XemChiTietBaiDangBo chiTietBo = new XemChiTietBaiDangBo();
		String idBaiDang = chuaDuyetForm.getIdBaiDang();
		chuaDuyetForm.setXemChiTiet(chiTietBo.getBaiDang(idBaiDang));
		return mapping.findForward("xemChiTiet");
	}
}
