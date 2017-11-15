package study.java.vote.smile.dto;

/**
 * @author jackie chen
 * @create 2017/11/13
 * @description UserListResponse
 */
public class UserListResponse {
	private Integer Status;
	private String Message;
	private PageData Result;

	@Override
	public String toString() {
		return "UserListResponse{" +
				"Status=" + Status +
				", Message='" + Message + '\'' +
				", Result=" + Result +
				'}';
	}

	public Integer getStatus() {
		return Status;
	}

	public void setStatus(Integer status) {
		Status = status;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public PageData getResult() {
		return Result;
	}

	public void setResult(PageData result) {
		Result = result;
	}
}
