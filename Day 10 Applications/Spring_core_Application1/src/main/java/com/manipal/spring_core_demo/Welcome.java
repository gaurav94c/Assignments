package com.manipal.spring_core_demo;

public class Welcome {

		private String message;
		
		public Welcome() {
		}

		public Welcome(String message) {
			this.message=message;
			
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
		
		public void intialize() {
			System.out.println("Initialization Method....");
		}
		
		public void destroy() {
			System.out.println("Destroying , time to clean up....");

		}
		
		
}
