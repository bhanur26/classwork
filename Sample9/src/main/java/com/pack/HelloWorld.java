package com.pack;

public class HelloWorld {

		private String message;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
		public void init()
		{
			System.out.println("HI");
		}
		public void destroy()
		{
			System.out.println("Destroy");
		}
	
}
