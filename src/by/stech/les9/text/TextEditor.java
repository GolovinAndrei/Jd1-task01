package by.stech.les9.text;

public class TextEditor {

	public static void main(String[] args) {
		TextBL bis = new TextBL();
		Text my_story = new Text("About me", "Tale", 2);

		my_story.setText(bis.createText(my_story));

		bis.printHeadLine(my_story);
		bis.printText(my_story);
	}

}
