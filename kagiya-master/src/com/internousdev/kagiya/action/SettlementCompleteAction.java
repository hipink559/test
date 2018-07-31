package com.internousdev.kagiya.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kagiya.dao.CartInfoDAO;
import com.internousdev.kagiya.dao.ProductInfoDAO;
import com.internousdev.kagiya.dao.PurchaseHistoryInfoDAO;
import com.internousdev.kagiya.dto.CartInfoDTO;
import com.internousdev.kagiya.dto.DestinationInfoDTO;
import com.internousdev.kagiya.dto.ProductInfoDTO;
import com.internousdev.kagiya.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementCompleteAction extends ActionSupport implements SessionAware {

	private String id;
	private String categoryId;
	private Map<String, Object> session;
	private String errorMessage;
	private List<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();

	public String execute() {
		String result = ERROR;

		@SuppressWarnings("unchecked")
		ArrayList<PurchaseHistoryInfoDTO> purchaseHistoryInfoDtoList = (ArrayList<PurchaseHistoryInfoDTO>) session
				.get("purchaseHistoryInfoDtoList");

		if(session.get("destinationInfoDtoList") == null) {
			errorMessage = "新規登録をしてください";
			return result;
		}

		if(!session.containsKey("checked2")) {
			result = "fail";
			return result;
		}

		@SuppressWarnings("unchecked")
		ArrayList<DestinationInfoDTO> destinationInfoDtoList = (ArrayList<DestinationInfoDTO>) session
				.get("destinationInfoDtoList");
		for (int i = 0; i < purchaseHistoryInfoDtoList.size(); i++) {
			purchaseHistoryInfoDtoList.get(i).setDestinationId(destinationInfoDtoList.get(0).getId());
		}

		PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();
		//指定した(前ページで選択した)商品の情報を取得
		ProductInfoDAO productInfoDAO = new ProductInfoDAO();
		ProductInfoDTO productInfoDTO = new ProductInfoDTO();
		int count = 0;
		String date = null;

		for (int i = 0; i < purchaseHistoryInfoDtoList.size(); i++) {

			productInfoDTO = productInfoDAO.selectByProductId
					(purchaseHistoryInfoDtoList.get(i).getProductId());

			date = new SimpleDateFormat("yy/MM/dd").format(productInfoDTO.getReleaseDate());

			count += purchaseHistoryInfoDAO.regist(
					String.valueOf(session.get("loginId")),
					purchaseHistoryInfoDtoList.get(i).getProductId(),
					purchaseHistoryInfoDtoList.get(i).getProductCount(),
					purchaseHistoryInfoDtoList.get(i).getDestinationId(),
					purchaseHistoryInfoDtoList.get(i).getSubtotal(),
					productInfoDTO.getProductName(),
					productInfoDTO.getProductNameKana(),
					productInfoDTO.getImageFilePath(),
					productInfoDTO.getImageFileName(),
					date,
					productInfoDTO.getReleaseCompany());

		}

		if (count > 0) {
			CartInfoDAO cartInfoDAO = new CartInfoDAO();
			count = cartInfoDAO.deleteAll(String.valueOf(session.get("loginId")));
			if (count > 0) {
				List<CartInfoDTO> cartInfoDtoList = new ArrayList<CartInfoDTO>();
				cartInfoDtoList = cartInfoDAO.getCartInfoDtoList(String.valueOf(session.get("loginId")));
				Iterator<CartInfoDTO> iterator = cartInfoDtoList.iterator();
				if (!(iterator.hasNext())) {
					cartInfoDtoList = null;
				}
				session.put("cartInfoDtoList", cartInfoDtoList);

				int totalPrice = Integer
						.parseInt(String.valueOf(cartInfoDAO.getTotalPrice(String.valueOf(session.get("loginId")))));
				session.put("totalPrice", totalPrice);
				result = SUCCESS;
			}
		}
		session.remove("checked2");
		return result;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<ProductInfoDTO> getProductInfoDTOList() {
		return productInfoDTOList;
	}

	public void setProductInfoDTOList(List<ProductInfoDTO> productInfoDTOList) {
		this.productInfoDTOList = productInfoDTOList;
	}
}
