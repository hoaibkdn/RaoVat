package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bo.NguoiDungBo;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.NguoiDungForm;

public class DangNhapAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		NguoiDungForm ndForm = (NguoiDungForm)form;
		NguoiDungBo ndBo = new NguoiDungBo();
		String tenDangNhap = ndForm.getTenDangNhap();
		String matKhau = ndForm.getMatKhau();
		HttpSession ss = request.getSession();
		ss.setAttribute("tenDangNhap", tenDangNhap);
		System.out.println("ten dang nhap: " + tenDangNhap);
		System.out.println("mat khau: " + matKhau);
		String trangThai = ndBo.getTrangThaiNd(tenDangNhap);
		
		//neu press Dang nhap thi chuyen den trang chu
		//neu k lam gi ca thi van o trang dang nhap
		if("Dang nhap".equals(ndForm.getSubmit()))
		{

			//kiem tra tai khoan bi block chua
			if(trangThai.equals("active"))
			{
				// kiem tra tai khoan dung mat khau k
				String mk = ndBo.getMatKhau(tenDangNhap);
				if(matKhau.equals(mk))
				{
					//kiem tra quyen dang nhap
					if(matKhau.equals("admin"))
					{
						ndForm.setTenDangNhap(tenDangNhap);
						return mapping.findForward("adminPage");
					}
					else
					{
						ndForm.setTenDangNhap(tenDangNhap);
						return mapping.findForward("thanhCong");
					}
					
				}
				else
				{
					ndForm.setThongBaoDangNhap("Tên đăng nhập hoặc Mật khẩu không đúng");
					return mapping.findForward("thatBai");
				}
				
			}
			else
			{
				ndForm.setThongBaoDangNhap("Tài khoản đã bị khóa");
				return mapping.findForward("thatBai");
			}
		}
		return mapping.findForward("thatBai");
	}
}