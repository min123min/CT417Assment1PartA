package com.mycompany.assigment1;
// oisin curran ID: 14378786
import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.List;
public class course {
	
		
		private String name;
		private List<module> modules;
		private DateTime startDate;
		private DateTime endDate;
		
		public course(String n, List<module> subjects, DateTime start, DateTime end){
			
			this.setName(n);
			this.setModules(subjects);
			this.setStartDate(start);
			this.setEndDate(end);	
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<module> getModules() {
			return modules;
		}

		public void setModules(List<module> modules) {
			this.modules = modules;
		}

		public DateTime getStartDate() {
			return startDate;
		}

		public void setStartDate(DateTime startDate) {
			this.startDate = startDate;
		}

		public DateTime getEndDate() {
			return endDate;
		}

		public void setEndDate(DateTime endDate) {
			this.endDate = endDate;
		}

	}
