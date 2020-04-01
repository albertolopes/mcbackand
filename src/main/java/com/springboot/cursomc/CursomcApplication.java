package com.springboot.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import com.springboot.cursomc.domain.*;
import com.springboot.cursomc.domain.enums.EstadoPagamento;
import com.springboot.cursomc.domain.enums.TipoCliente;
import com.springboot.cursomc.repositories.*;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}

