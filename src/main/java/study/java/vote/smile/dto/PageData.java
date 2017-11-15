package study.java.vote.smile.dto;

import java.util.List;

/**
 * @author jackie chen
 * @create 2017/11/13
 * @description PageData
 */
public class PageData {
	private Boolean IsLastPage;
	private Integer ItemEnd;
	private Integer ItemStart;
	private Integer PageCount;
	private Integer PageIndex;
	private Integer PageNumber;
	private Integer PageSize;
	private Integer TotalItemCount;
	private List<UserInfoDTO> DataList = null;

	@Override
	public String toString() {
		return "PageData{" +
				"IsLastPage=" + IsLastPage +
				", ItemEnd=" + ItemEnd +
				", ItemStart=" + ItemStart +
				", PageCount=" + PageCount +
				", PageIndex=" + PageIndex +
				", PageNumber=" + PageNumber +
				", PageSize=" + PageSize +
				", TotalItemCount=" + TotalItemCount +
				", DataList=" + DataList +
				'}';
	}

	public Boolean getLastPage() {
		return IsLastPage;
	}

	public void setLastPage(Boolean lastPage) {
		IsLastPage = lastPage;
	}

	public Integer getItemEnd() {
		return ItemEnd;
	}

	public void setItemEnd(Integer itemEnd) {
		ItemEnd = itemEnd;
	}

	public Integer getItemStart() {
		return ItemStart;
	}

	public void setItemStart(Integer itemStart) {
		ItemStart = itemStart;
	}

	public Integer getPageCount() {
		return PageCount;
	}

	public void setPageCount(Integer pageCount) {
		PageCount = pageCount;
	}

	public Integer getPageIndex() {
		return PageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		PageIndex = pageIndex;
	}

	public Integer getPageNumber() {
		return PageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		PageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return PageSize;
	}

	public void setPageSize(Integer pageSize) {
		PageSize = pageSize;
	}

	public Integer getTotalItemCount() {
		return TotalItemCount;
	}

	public void setTotalItemCount(Integer totalItemCount) {
		TotalItemCount = totalItemCount;
	}

	public List<UserInfoDTO> getDataList() {
		return DataList;
	}

	public void setDataList(List<UserInfoDTO> dataList) {
		DataList = dataList;
	}
}
