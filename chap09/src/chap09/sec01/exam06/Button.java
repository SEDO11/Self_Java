package chap09.sec01.exam06;

public class Button {
	OnClickListener listener;
	
	void OnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	// ��ø �������̽�
	static interface OnClickListener {
		void onClick();
	}
}
