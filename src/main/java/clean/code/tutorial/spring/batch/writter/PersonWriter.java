package clean.code.tutorial.spring.batch.writter;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import clean.code.tutorial.spring.batch.core.Person;

/**
 * Person writer
 * 
 * @author fnsanzabandi
 *
 */
public class PersonWriter implements ItemWriter<Person> {

	private final Logger logger = LoggerFactory.getLogger(PersonWriter.class);

	/**
	 * Write the processed persons
	 * 
	 * @param persons
	 *            list
	 * @author fnsanzabandi
	 */
	public void write(final List<? extends Person> persons) throws Exception {
		for (Person person : persons) {
			logger.info("Person: {}", person.toString());
		}
	}
}
