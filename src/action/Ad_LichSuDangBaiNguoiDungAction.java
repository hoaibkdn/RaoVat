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

import form.Ad_LichSuNguoiDungDangBaiForm;

public class Ad_LichSuDangBaiNguoiDungAction extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		// TODO Auto-generated method stub
		Ad_LichSuNguoiDungDangBaiForm lichSuDangForm = (Ad_LichSuNguoiDungDangBaiForm)form;
		BaiDangBo bdBo = new BaiDangBo();
		
		//hien thi danh sach bai dang nguoi dung da dang
		ArrayList<BaiDangBean> baiDangLst = new ArrayList<BaiDangBean>();
		baiDangLst = bdBo.getAllBaiDang();
		lichSuDangForm.setListBaiDang(baiDangLst);
		System.out.println("da dua danh sach vao");
		return mapping.findForward("tatCaBaiDang");
	}
	
	
}
