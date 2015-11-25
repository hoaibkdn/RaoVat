package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.BaiDangBean;
import model.bo.BaiDangBo;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.Nd_LichSuDangBaiForm;

public class User_LichSuDangBaiAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Nd_LichSuDangBaiForm lichSuForm = (Nd_LichSuDangBaiForm)form;
		BaiDangBo bdBo = new BaiDangBo();
		
		//kiem tra dang nhap
		HttpSession session = request.getSession();
		String tenDangNhap = (String)session.getAttribute("tenDangNhap");
		if(tenDangNhap == null) 
				return mapping.findForward("nguoiDungDangNhap");
		
		
		//get list bai da dang 
		ArrayList<BaiDangBean> tatCaBaiDang = new ArrayList<BaiDangBean>();
		tatCaBaiDang = bdBo.getLichSu(tenDangNhap);
		
		//neu press vao Tim kiem thi hien thi danh sach bai 
		//neu khong lam gi thi van o trang lich su dang
		System.out.println(lichSuForm.getSubmit());
		if("Tim Kiem".equals(lichSuForm.getSubmit()))
		{
			//tim kiem theo loai bai dang
			String loaiBaiDang = lichSuForm.getLoai();
			String trangThai = lichSuForm.getTrangThai();
			System.out.println("loai bai dang:" +loaiBaiDang);
			System.out.println("trạng thái:" +trangThai);
			if((loaiBaiDang == null && trangThai == null) || (loaiBaiDang.equals("Tat ca") && trangThai.equals("Tat ca")))
			{
				lichSuForm.setLichSuDang(bdBo.getLichSu(tenDangNhap));
			}
			else
			{
				ArrayList<BaiDangBean> dsDangBan = new ArrayList<BaiDangBean>();
				
				//get list dang ban
				if("Dang ban".equals(loaiBaiDang) && (trangThai == null || "Tat ca".equals(trangThai)))
				{
					for(int i = 0; i<tatCaBaiDang.size(); i++)
					{
						if("LBD1".equals(tatCaBaiDang.get(i).getIdLoaiBaiDang()))
						{
							dsDangBan.add(tatCaBaiDang.get(i));
						}
					}
				}
				
				//get list dang mua
				if("Dang mua".equals(loaiBaiDang) && (trangThai == null || trangThai.equals("Tat ca")))
				{
					for(int i = 0; i<tatCaBaiDang.size(); i++)
					{
						if("LBD2".equals(tatCaBaiDang.get(i).getIdLoaiBaiDang()))
						{
							dsDangBan.add(tatCaBaiDang.get(i));
						}
					}
				}
				
				//get dang ban va trang thai da duyet
				if("Dang ban".equals(loaiBaiDang) && trangThai.equals("Da duyet") )
				{
					for(int i = 0; i<tatCaBaiDang.size(); i++)
					{
						if("LBD1".equals(tatCaBaiDang.get(i).getIdLoaiBaiDang()) && tatCaBaiDang.get(i).getTrangThai() == 0)
						{
							dsDangBan.add(tatCaBaiDang.get(i));
						}
					}
				}
				
				//get dang mua va trang thai chua duyet
				if("Dang mua".equals(loaiBaiDang) && trangThai.equals("Chua duyet") )
				{
					for(int i = 0; i<tatCaBaiDang.size(); i++)
					{
						if("LBD2".equals(tatCaBaiDang.get(i).getIdLoaiBaiDang()) && tatCaBaiDang.get(i).getTrangThai() != 0)
						{
							dsDangBan.add(tatCaBaiDang.get(i));
						}
					}
				}
				
				//get tat ca chua duyet
				if((loaiBaiDang == null || loaiBaiDang.equals("Tat ca")) && trangThai.equals("Chua duyet"))
				{
					for(int i = 0; i<tatCaBaiDang.size(); i++)
					{
						if(tatCaBaiDang.get(i).getTrangThai() != 0)
						{
							dsDangBan.add(tatCaBaiDang.get(i));
						}
					}
				}
				
				//get tat ca da duyet
				if((loaiBaiDang == null || loaiBaiDang.equals("Tat ca")) && trangThai.equals("Da duyet"))
				{
					for(int i = 0; i<tatCaBaiDang.size(); i++)
					{
						if(tatCaBaiDang.get(i).getTrangThai() == 0)
						{
							dsDangBan.add(tatCaBaiDang.get(i));
						}
					}
				}
				lichSuForm.setLichSuDang(dsDangBan);
			}
		}
		else
		{
			lichSuForm.setLichSuDang(tatCaBaiDang);
		}
		System.out.println("toi cho ni");
		System.out.println(lichSuForm.getBtnSua());
		//neu thuc hien chuc nang sua
		if("Sửa".equals(lichSuForm.getBtnSua()))
		{
			System.out.println("toi cho sua bai dang");
			String idBaiDang = lichSuForm.getIdBaiDang();
			HttpSession ss = request.getSession();
			ss.setAttribute("idBaiDang", idBaiDang);
			return mapping.findForward("suaBaiDang");
		}
		
		
		return mapping.findForward("lichSuBaiDang");
	}
}
