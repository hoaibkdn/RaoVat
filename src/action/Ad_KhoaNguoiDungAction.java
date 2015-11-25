package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.NguoiDungBean;
import model.bo.EmailUtility;
import model.bo.NguoiDungBo;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.Ad_DanhSachNguoiDungForm;

public class Ad_KhoaNguoiDungAction extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		Ad_DanhSachNguoiDungForm dsnguoidungform = (Ad_DanhSachNguoiDungForm)form;
		NguoiDungBo ndBo = new NguoiDungBo();
		String tenDangNhap = dsnguoidungform.getTenDangNhap();
		System.out.println("ten tai khoan: "+tenDangNhap);
		
		NguoiDungBo ndBO = new NguoiDungBo();
		ndBO.khoaNguoiDung(tenDangNhap);
//		if("active".equals(dsnguoidungform.getTrangThai()))
//		{
//			ndBo.khoaNguoiDung(tenDangNhap);
//		}
		
		//gởi phản hồi cho gmail
		NguoiDungBean ndBean = ndBO.getThongTin(tenDangNhap);
		
		//gởi phản hồi cho gmail
		//String to = ndBean.getEmail();
		String to = "hoaibkdn2012@gmail.com";
		System.out.println(to+"------------------");
		String subject = "See You Again!!!";
		String message = "Your account "+ndBean.getTenDangNhap()+" lasted login at : "+ndBean.getThoiGianDangNhapGanNhat()+" has blocked by admin website RaoVat.com";
		String username ="chodoimotngaymai@gmail.com";
		String password ="20122017bk";
		
		String host = "smtp.gmail.com";
		String port = "465";
		//String from = "chodoimotngaymai@gmail.com";
		
		//sendMail sendMail = new sendMail(from, to, subject, message,username,password);
		//sendMail.send();
		
		EmailUtility.sendEmail(host, port, username, password, to, subject, message);			
		return mapping.findForward("danhSachNguoiDung");
	}
}
