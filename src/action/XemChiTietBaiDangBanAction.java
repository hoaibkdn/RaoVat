package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.XemChiTietBaiDangBo;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.DanhSachBaiDangBanForm;

public class XemChiTietBaiDangBanAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		DanhSachBaiDangBanForm dsBaiDang = (DanhSachBaiDangBanForm)form;
		XemChiTietBaiDangBo chiTietBo = new XemChiTietBaiDangBo();
		
		String idBaiDang = dsBaiDang.getIdBaiDang();
		//String thoiGianDang = dsBaiDang.getThoiGianDang();
		//System.out.println(thoiGianDang);
		System.out.println(idBaiDang);
		
		//tang luot xem
		chiTietBo.tangLuotView(idBaiDang);
		
		//lay bai dang chi tiet hien thi
		dsBaiDang.setDangBanChiTiet(chiTietBo.getBaiDang(idBaiDang));
		
		return mapping.findForward("xemChiTietDangBan");
	}
}
