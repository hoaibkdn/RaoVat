package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.BaiDangBean;
import model.bo.BaiDangBo;
import model.bo.XemChiTietBaiDangBo;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.BaiDangBanForm;
import form.DanhSachBaiDangBanForm;

public class User_SuaBaiDangAction extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		// TODO Auto-generated method stub
		BaiDangBanForm suaBaiForm = (BaiDangBanForm)form;
		BaiDangBo suaBo = new BaiDangBo();
		HttpSession session = request.getSession();
		String idBaiDang = (String)session.getAttribute("idBaiDang");
		BaiDangBean baiFix = new BaiDangBean();
		baiFix = suaBo.getFix(idBaiDang);
		suaBaiForm.setTenBaiDang(baiFix.getTenBaiDang());
		suaBaiForm.setIdDanhMuc(baiFix.getIdDanhMuc());
		suaBaiForm.setNamSanXuat(baiFix.getNamSanXuat());
		suaBaiForm.setNoiDung(baiFix.getNoiDung());
		suaBaiForm.setHinhAnh(baiFix.getHinhAnh());
		suaBaiForm.setGia(baiFix.getGia());
		if("Sửa".equals(suaBaiForm.getSubmit()))
		{
			String tenBaiDang = suaBaiForm.getTenBaiDang();
			String idDanhMuc = suaBaiForm.getIdDanhMuc();
			String namSanXuat = suaBaiForm.getNamSanXuat();
			String noiDung = suaBaiForm.getNoiDung();
			String hinhAnh = suaBaiForm.getHinhAnh();
			float dinhGia = suaBaiForm.getGia();
			boolean suaOk = suaBo.updateBaiDang(tenBaiDang, idDanhMuc, namSanXuat, hinhAnh, noiDung, dinhGia);
			System.out.println(suaOk);
			return mapping.findForward("suaThanhCong");
		}
		return mapping.findForward("suaBaiDang");
	}
}
