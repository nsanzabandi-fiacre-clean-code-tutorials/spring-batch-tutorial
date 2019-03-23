package clean.code.tutorial.spring.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import clean.code.tutorial.spring.batch.core.Person;

/**
 * Person processor
 * 
 * @author fnsanzabandi
 *
 */
public class PersonProcessor implements ItemProcessor<Person, Person> {

	/**
	 * Process the read person
	 * 
	 * @param personneInput
	 * @return the read person
	 * @author fnsanzabandi
	 */
	public Person process(final Person personneInput) throws Exception {
		Person personneOutput = null;

		// si la civilite a la valeur M la personne sera ecrite en base sinon on la rejette
		//if ("M".equals(personneInput.getCivilite()) && personneInput.getNom().startsWith("D")) {
			personneOutput = new Person();
			personneOutput.setCivilite(personneInput.getCivilite());
			personneOutput.setId(personneInput.getId());
			personneOutput.setNom(personneInput.getNom());
			personneOutput.setPrenom(personneInput.getPrenom());
			personneOutput.setTaille(personneInput.getTaille());
		//}
		return personneOutput;
	}
}