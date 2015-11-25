package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.BaiDangBo;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.Ad_BaiDangChuaDuyetForm;

public class Ad_DuyetBaiDangAction extends Action
{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		
		Ad_BaiDangChuaDuyetForm duyetBanForm = (Ad_BaiDangChuaDuyetForm)form;
		BaiDangBo bdBo = new BaiDangBo();
		
		//duyet bai dang ban
		String idBaiDang = duyetBanForm.getIdBaiDang();
		bdBo.duyetBai(idBaiDang);
		System.out.println("duyet bai thanh cong");
		return mapping.findForward("duyetDangBanThanhCong");
	}
}
