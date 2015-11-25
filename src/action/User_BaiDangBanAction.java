package action;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.DanhMucBean;
import model.bean.NguoiDungBean;
import model.bo.BaiDangBo;
import model.bo.DanhMucBo;
import model.bo.NguoiDungBo;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import form.BaiDangBanForm;

public class User_BaiDangBanAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		BaiDangBanForm themBDForm = (BaiDangBanForm)form;
		BaiDangBo bdBO = new BaiDangBo();
		DanhMucBo dmBO = new DanhMucBo();
		NguoiDungBo ndBo = new NguoiDungBo();
		
		//kiem tra nguoi dung dang nhap chua
		HttpSession session = request.getSession();
		String tenDangNhap = (String)session.getAttribute("tenDangNhap");
		if(tenDangNhap == null) 
			return mapping.findForward("nguoiDungDangNhap");
		
		//neu bam vao dang bai thi xuat thong bao dang thanh cong
		//neu khong lam gi thi van o trang dang bai
		if("submit".equals(themBDForm.getSubmit()))
		{
			//get thong tin tu  form
			String tenBaiDang = themBDForm.getTenBaiDang();
			System.out.println("tên bài đăng: "+tenBaiDang);
			String loaiSP = themBDForm.getTenLoaiBaiDang();
			System.out.println("loại sản phẩm: "+loaiSP);
			String idDanhMuc = themBDForm.getIdDanhMuc();
			System.out.println(idDanhMuc);
			String idLoaiBaiDang = "LBD1";
			String timeSX = themBDForm.getNamSanXuat();
			String noiDung = themBDForm.getNoiDung();
			Float gia = themBDForm.getGia();
			//upload anh
			String idBaiDang=bdBO.getIdBaiDang();
			
			//Get the servers upload directory real path name
			String filePath = getServlet().getServletContext().getInitParameter("filePath");
			
			 //create the upload folder if not exists
		    File folder = new File(filePath);
		    if(!folder.exists()){
		    	folder.mkdir();
		    }
		    FormFile file = themBDForm.getFileHinhAnh();
		    String linkAnh = idBaiDang+file.getFileName();
			if(!("").equals(linkAnh)){		    
		        File newFile = new File(filePath, linkAnh);
		        if(!newFile.exists()){
		        	FileOutputStream fos = new FileOutputStream(newFile);
		        	fos.write(file.getFileData());
		        	fos.flush();
		        	fos.close();
		        	file.destroy();
		        }
		        themBDForm.setHinhAnh("imagebaiviet/"+linkAnh);
		    }
			
			
			System.out.println(tenDangNhap);
			String hinhAnh=themBDForm.getHinhAnh();
			int luotXem=0;
			int luotLike=0;
			int trangThai=0;
			String thoiGianViet=bdBO.getThoiGianHienTai();
			//String thoiGianDang="";
			boolean kt = bdBO.InsBaiDang(idBaiDang, tenDangNhap, idDanhMuc, tenBaiDang, 
					noiDung, hinhAnh, thoiGianViet, gia, idLoaiBaiDang, trangThai, 
					luotLike, luotXem,timeSX);
			System.out.println(kt);
			return mapping.findForward("hienthiThanhCong");
		}
		ArrayList<DanhMucBean> dmLst = new ArrayList<DanhMucBean>();
		dmLst = dmBO.getDanhMucLst();
		System.out.println(dmLst);
		themBDForm.setDmLst(dmLst);
		System.out.println("ok di con");
		return mapping.findForward("themBaiDang");
	}
}
