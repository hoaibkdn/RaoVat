package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.dao.NguoiDungDao;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.NguoiDungForm;

public class DangXuatAction extends Action 
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		// TODO Auto-generated method stub
		HttpSession ss = request.getSession();
		ss.invalidate();
		return mapping.findForward("dangXuatThanhCong");
	}
}
