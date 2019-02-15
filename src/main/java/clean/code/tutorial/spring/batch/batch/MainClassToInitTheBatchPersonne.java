package clean.code.tutorial.spring.batch.batch;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The main class of our batch
 * 
 * @author fnsanzabandi
 *
 */
public class MainClassToInitTheBatchPersonne {

	private MainClassToInitTheBatchPersonne() {
		// Private constructor to hide the implicit public one.
	}

	/**
	 * Main to launch our program
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(final String[] args) throws Exception {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("job.xml");
		classPathXmlApplicationContext.start();
		JobLauncher jobLauncher = (JobLauncher) classPathXmlApplicationContext.getBean("jobLauncher");
		Job job = (Job) classPathXmlApplicationContext.getBean("importPersonnes");
		JobParameters parameter = new JobParametersBuilder().addDate("date", new Date()).addString("input.file", "personnes.txt").toJobParameters();
		jobLauncher.run(job, parameter);
		classPathXmlApplicationContext.close();
	}
}