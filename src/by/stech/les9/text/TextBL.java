package by.stech.les9.text;

import java.util.Scanner;

public class TextBL {

	
	public Word addWord() {

		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();

		Word newWord = new Word(word);
		return newWord;
	}

	public Sentence createSentence() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type of sentence? ");
		String type = sc.nextLine();
		Sentence newSentence = new Sentence(type);
		int param = 0;
		newSentence.setSent(addWord().getWord() + " ");
		do {
			newSentence.setSent(newSentence.getSent() + addWord().getWord() + " ");
			System.out.println("If you want to enter anothe word press 1");
			param = sc.nextInt();
		} while (param == 1);
		newSentence.setSent(newSentence.getSent() + type);
		return newSentence;
	}

	public void printHeadLine(Text text) {

		System.out.println(text.getHeadline());

		return;

	}

	public void printText(Text text) {

		Sentence[] printArray = text.getText();
		for (Sentence s : printArray) {

			System.out.print(s.getSent() + "\n");

		}
		return;

	}

	public Sentence[] createText(Text text) {
		Sentence[] sentAr = new Sentence[text.getCountOfSentences()];

		for (int i = 0; i < sentAr.length; i++) {

			sentAr[i] = createSentence();
			if (i != sentAr.length - 1) {
				System.out.println("Next sentense");
			}
		}

		return sentAr;

	}

}
