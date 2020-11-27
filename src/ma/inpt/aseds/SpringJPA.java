package ma.inpt.aseds;
import  org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.inpt.servlet.Form;


public class SpringJPA {

 	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		JPA_DAO JpaDao = ctx.getBean(JPA_DAO.class);
		
		Person prs = new Person("khal","0611111111","test2@gmail.com");
		Message msg = new Message("test",prs);
		prs.getMsgs().add(msg);
		JpaDao.save(createPerson(JpaDao,1,"khalid","0611111111","test@gmail.com",33,"thats my test message"));
		System.out.print("the persons" + JpaDao.findAll());
		Person prs2 = JpaDao.findAll().get(1);
		
		System.out.println(prs2.getMsgs());  
		}
	

	private static Person createPerson(JPA_DAO jpaDao,int id,  String name, String phone, String email,int id_msg, String msg) {
		Person prs = new Person(name,phone,email);
		prs.toString();
		prs.getMsgs().add(new Message(msg, prs));
		
		return prs;
	}

}
