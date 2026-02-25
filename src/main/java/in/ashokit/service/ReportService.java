package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.ReportDao;

@Service
public class ReportService {

	private ReportDao reportDao;
	
	/*
	 * @Autowired
	 * 
	 * @Qualifier("oracle") public void setReportDao(ReportDao reportDao) {
	 * System.out.println("set call dao method"); this.reportDao = reportDao; }
	 */

	@Autowired
	public ReportService(ReportDao reportDao) {
		System.out.println("ReportDao :: Param Constructor called.....");
		this.reportDao = reportDao;
	}

	public ReportService() {
		System.out.println("ReportDao :: Param Constructor called.....");
	}

	public void generateReport() {
		reportDao.findData();
		System.out.println("generating report.....");
	}

}
