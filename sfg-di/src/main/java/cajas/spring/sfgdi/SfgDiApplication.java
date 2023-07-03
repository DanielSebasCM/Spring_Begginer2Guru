package cajas.spring.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import cajas.spring.sfgdi.controllers.MyController;
import cajas.spring.sfgdi.controllers.PetController;
import cajas.spring.sfgdi.controllers.PropertyInjectedController;
import cajas.spring.sfgdi.controllers.SetterInjectedController;
import cajas.spring.sfgdi.datasource.FakeDataSource;
import cajas.spring.sfgdi.config.SfgConstructorConfig;
import cajas.spring.sfgdi.controllers.ConstructorInjectedController;
import cajas.spring.sfgdi.controllers.I18nController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		System.out.println("--- Lnaguage Profile ---");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("--- Default injection Bean ---");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("--- Property injection ---");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx
				.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--- Setter injection ---");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx
				.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--- Constructor injection ---");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx
				.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("--- Fake Data Source ---");
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcurl());

		System.out.println("--- Sfg Config ---");
		SfgConstructorConfig sfgConfig = ctx.getBean(SfgConstructorConfig.class);
		System.out.println(sfgConfig.getUsername());
		System.out.println(sfgConfig.getPassword());
		System.out.println(sfgConfig.getJdbcurl());
	}

}
