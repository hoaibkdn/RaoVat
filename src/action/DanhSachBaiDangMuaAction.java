package action;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.BaiDangBean;
import model.bean.DanhMucBean;
import model.bo.BaiDangBo;
import model.bo.DanhMucBo;
import model.bo.NguoiDungBo;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import form.BaiDangBanForm;
import form.DanhSachBaiDangBanForm;

public class DanhSachBaiDangMuaAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		
		DanhSachBaiDangBanForm dangBanForm = (DanhSachBaiDangBanForm)form;
		BaiDangBo bdBo = new BaiDangBo();
		DanhMucBo dmBo = new DanhMucBo();
		System.out.println("vo roi");
		
		//get list bai dang ban
		ArrayList<BaiDangBean> baiDangLst = new ArrayList<BaiDangBean>();
		baiDangLst = bdBo.getBaiDangList("LBD2",1);
		System.out.println("list bai dang mua: ");
		System.out.println(baiDangLst);
		dangBanForm.setBaiDangBanLst(baiDangLst);
		dangBanForm.setXemThem(1);
		System.out.println("idBaiViet: "+ dangBanForm.getIdBaiDang());
		dangBanForm.setDmLst(dmBo.getDanhMucLst());
		System.out.println(dangBanForm.getSubmit());
		
		//get list bai dang theo tim kiem
		if("TÃ¬m kiáº¿m".equals(dangBanForm.getSubmit()))
		{
			//System.out.println(dangBanForm.getSubmit());
			System.out.println("vo di con");
			String tenSanPham = dangBanForm.getTenSanPham();
			String namSanXuat = dangBanForm.getNamSanXuat();
			String idDanhMuc = dangBanForm.getIdDanhMuc();
			String giaThap = dangBanForm.getGiaThap();
			String giaCao = dangBanForm.getGiaCao();
			String tatCa = dangBanForm.getTatCa();
			System.out.println(tatCa);
			System.out.println("ten: "+tenSanPham);
			ArrayList<BaiDangBean> baiDangTimKiem = new ArrayList<BaiDangBean>();
			
			//tim kiem tong quat tat ca
			if(tatCa != null && ((tenSanPham == null && namSanXuat == null)|| ("".equalsIgnoreCase(tenSanPham)) && "".equals(namSanXuat))
					&&((idDanhMuc == null && giaThap == null && giaCao == null )
					|| (idDanhMuc.equals("0") && giaThap.equals("0") && giaCao.equals("0"))))
			{
				baiDangTimKiem = bdBo.getBaiDangTuKhoa(tatCa, "LBD2");
				System.out.println("tat ca bai dang");
			}
			else
			{
				//tim kiem theo gia
				if(tatCa == null && tenSanPham == null && namSanXuat == null && idDanhMuc == null && giaThap != null && giaCao != null )
				{
					
					if(giaThap.equals("3trieu"))
					{
						if(giaCao.equals("10triệu")) baiDangTimKiem = bdBo.bdGia(3000000, 10000000);
						if(giaCao.equals("50triệu")) baiDangTimKiem = bdBo.bdGia(3000000, 50000000);
						if(giaCao.equals("100triệu")) baiDangTimKiem = bdBo.bdGia(3000000, 100000000);
						if(giaCao.equals("caoHon")) baiDangTimKiem = bdBo.bdGia(3000000, 1000000000);
					}
					if(giaThap.equals("2trieu"))
					{
						if(giaCao.equals("10triệu")) baiDangTimKiem = bdBo.bdGia(2000000, 10000000);
						if(giaCao.equals("50triệu")) baiDangTimKiem = bdBo.bdGia(2000000, 50000000);
						if(giaCao.equals("100triệu")) baiDangTimKiem = bdBo.bdGia(2000000, 100000000);
						if(giaCao.equals("caoHon")) baiDangTimKiem = bdBo.bdGia(2000000, 1000000000);
					}
					if(giaThap.equals("1trieu"))
					{
						if(giaCao.equals("10triệu")) baiDangTimKiem = bdBo.bdGia(1000000, 10000000);
						if(giaCao.equals("50triệu")) baiDangTimKiem = bdBo.bdGia(1000000, 50000000);
						if(giaCao.equals("100triệu")) baiDangTimKiem = bdBo.bdGia(1000000, 100000000);
						if(giaCao.equals("caoHon")) baiDangTimKiem = bdBo.bdGia(1000000, 1000000000);
					}
					if(giaThap.equals("thapHon") || giaThap.equals("0"))
					{
						if(giaCao.equals("10triệu")) baiDangTimKiem = bdBo.bdGia(0, 10000000);
						if(giaCao.equals("50triệu")) baiDangTimKiem = bdBo.bdGia(0, 50000000);
						if(giaCao.equals("100triệu")) baiDangTimKiem = bdBo.bdGia(0, 100000000);
						if(giaCao.equals("caoHon")) baiDangTimKiem = bdBo.getAllBaiDang();
					}
					if(giaThap.equals("0"))
					{
						if(giaCao.equals("0")) baiDangTimKiem = bdBo.getAllBaiDang();
					}
				}
				
				//tim kiem theo ten san pham
				if(tatCa == null && tenSanPham != null && namSanXuat == null && idDanhMuc == null && 
						((giaThap == null && giaCao == null) || (giaThap.equals("0") && giaCao.equals("0"))
							||	(giaThap == null && giaCao.equals("0")) || (giaThap.equals("0") && giaCao==null)))
				{
					baiDangTimKiem = bdBo.getbdTen(tenSanPham);
				}
				
				//tim kiem theo nam san xuat
				if(tatCa == null && tenSanPham == null && namSanXuat != null && idDanhMuc == null && 
						((giaThap == null && giaCao == null) || (giaThap.equals("0") && giaCao.equals("0"))
							||	(giaThap == null && giaCao.equals("0")) || (giaThap.equals("0") && giaCao==null)))
				{
					baiDangTimKiem = bdBo.getbdNam(namSanXuat);
				}
				
				//tim kiem theo danh muc
				if(tatCa == null && tenSanPham == null && namSanXuat == null && idDanhMuc != null && 
						((giaThap == null && giaCao == null) || (giaThap.equals("0") && giaCao.equals("0"))
							||	(giaThap == null && giaCao.equals("0")) || (giaThap.equals("0") && giaCao==null)))
				{
					baiDangTimKiem = bdBo.getbdDanhMuc(idDanhMuc);
				}
			}
			dangBanForm.setBaiDangBanLst(baiDangTimKiem);
			return mapping.findForward("timKiemThanhCong");
		}
		return mapping.findForward("danhSachDangBan");
	}
}
