package com.koreaIT.java.AM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private static List<Article> articles;
	
	static { // static 생성자
		articles = new ArrayList<>();
	} 	// 그냥 값을 넣어주지 말고 생성자 안에서 값을 넣어주는 것이 좋다.
		// Static은 Static 끼리만 통신 가능
	
	
	// public은 외부에서 호출이 가능한 것.
	
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");

		makeTestData();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.printf("명령어) ");
			String command = sc.nextLine().trim();

			if (command.length() == 0) {
				continue;
			}

			if (command.equals("system exit")) {
				break;
			}

			if (command.equals("article write")) {
				int id = articles.size() + 1;
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();

				Article article = new Article(id, title, body);
				articles.add(article);

				System.out.printf("%d번글이 생성되었습니다\n", id);

			} else if (command.equals("article list")) {
				if (articles.size() == 0) {
					System.out.println("게시물이 없습니다.");
					continue;
				}
				System.out.println("번호 |  조회  |  제목");
				for (int i = articles.size() - 1; i >= 0; i--) {
					Article article = articles.get(i);

					System.out.printf("%d   |  %d   | %s\n", article.id, article.hit, article.title);
				}
			} else if (command.startsWith("article detail ")) {

				String[] commandBits = command.split(" ");
				int id = Integer.parseInt(commandBits[2]); // "1" -> 1

				Article foundArticle = null;

				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);

					if (article.id == id) {
						foundArticle = article;
						break;
					}
				}

				if (foundArticle == null) {
					System.out.printf("%d번 게시물은 존재하지 않습니다.\n", id);
					continue;
				}

				foundArticle.increasehit();

				System.out.printf("번호 : %d\n", foundArticle.id);
				System.out.printf("날짜 : 2022-12-12 12:12:12\n");
				System.out.printf("제목 : %s\n", foundArticle.title);
				System.out.printf("내용 : %s\n", foundArticle.body);
				System.out.printf("조회 : %d\n", foundArticle.hit);

			} else if (command.startsWith("article delete ")) {

				String[] commandBits = command.split(" ");
				int id = Integer.parseInt(commandBits[2]); // "1" -> 1

				int foundIndex = -1;

				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);

					if (article.id == id) {
						foundIndex = i;
						break;
					}
				}

				if (foundIndex == -1) {
					System.out.printf("%d번 게시물은 존재하지 않습니다.\n", id);
					continue;
				}

				articles.remove(foundIndex);

				System.out.printf("%d번 게시물이 삭제되었습니다.\n", id);

			} else if (command.startsWith("article modify ")) {
				String[] commandBits = command.split(" ");
				int id = Integer.parseInt(commandBits[2]); // "1" -> 1

				Article foundArticle = null;

				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);

					if (article.id == id) {
						foundArticle = article;
						break;
					}
				}

				if (foundArticle == null) {
					System.out.printf("%d번 게시물은 존재하지 않습니다.\n", id);
					continue;
				}
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();

				foundArticle.title = title;
				foundArticle.body = body;
				System.out.printf("%d번 게시물이 수정되었습니다.\n", id);
			}

			else {
				System.out.printf("%s는(은) 존재하지 않는 명령어 입니다.\n", command);
			}
		}

		sc.close();
		System.out.println("== 프로그램 끝 ==");
	}
	
	private static void makeTestData() {
		System.out.println("테스트를 위한 데이터를 생성합니다.");
		
		articles.add(new Article(1,"제목1","내용1",11));
		articles.add(new Article(2,"제목2","내용2",22));
		articles.add(new Article(3,"제목3","내용3",33));
		
	}

}

class Article {

	int id;
	String title;
	String body;
	int hit;

	public Article(int id, String title, String body) {
		this(id, title, body,0);
	}
	public Article(int id, String title, String body, int hit) {
		this.id = id;
		this.title = title;
		this.body = body;
		this.hit = hit;
	}
	public void increasehit() {
		hit++; // 자주 쓰는 기능들은 호출형식으로!
	}

}
