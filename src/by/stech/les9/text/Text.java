package by.stech.les9.text;

public class Text {

	public String headline;
	public String style;
	private int countOfSentences;
	private Sentence[] text;

	public Text() {
	}

	public Text(String headline, String style, int countOfSentences) {
	
		this.headline = headline;
		this.style = style;
		this.countOfSentences = countOfSentences;

	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public int getCountOfSentences() {
		return countOfSentences;
	}

	public void setCountOfSentences(int countOfSentences) {
		this.countOfSentences = countOfSentences;
	}

	public Sentence[] getText() {
		return text;
	}

	public void setText(Sentence[] text) {
		this.text = text;
	}

}
