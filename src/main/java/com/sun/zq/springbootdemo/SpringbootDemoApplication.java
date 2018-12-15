package com.sun.zq.springbootdemo;

import com.sun.zq.model.Address;
import com.sun.zq.model.Book;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "")//引入配置文件
@ServletComponentScan
@Slf4j
@EnableAdminServer
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootDemoApplication.class, args);
		SpringApplication app = new SpringApplication(SpringbootDemoApplication.class);
		//app.setBannerMode( Mode.OFF);
		ApplicationContext context = app.run();
		Binder binder = Binder.get(context.getEnvironment());
		Book book = binder.bind("book", Bindable.of(Book.class)).get();
		System.out.println(book.getAuthor());

		List<String> list = binder.bind("list.str", Bindable.listOf(String.class)).get();
		for (String str : list) {
			System.out.println(str);
		}

		book = binder.bind("book", Bindable.of(Book.class)).get();
		for (Address address : book.getAddressList()) {
			System.out.println(address.getAddress()+","+address.getStreet());
		}
		System.out.println("-----------------------");

		List<Address> addressList = binder.bind("address",Bindable.listOf(Address.class)).get();
		for (Address address : addressList) {
			System.out.println(address.getAddress()+","+address.getStreet());
		}

		log.info("Spring Boot Demo Application Started");
		System.out.println("Spring Boot Demo Application Started");

	}

	@Bean
	public Queue setQueue(){
		return new Queue("my-queue");
	}





}
