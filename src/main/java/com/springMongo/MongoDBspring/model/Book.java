package com.springMongo.MongoDBspring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Book")
public class Book {

		@Id
		public int id;
		public String Bookname;
		public String Authorname;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getBookname() {
			return Bookname;
		}
		public void setBookname(String bookname) {
			Bookname = bookname;
		}
		public String getAuthorname() {
			return Authorname;
		}
		public void setAuthorname(String authorname) {
			Authorname = authorname;
		}
		

		@Override
		public String toString() {
			return "Book [id=" + id + ", Bookname=" + Bookname + ", Authorname=" + Authorname + "]";
		}
		
}
