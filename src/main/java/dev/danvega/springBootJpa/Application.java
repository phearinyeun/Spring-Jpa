package dev.danvega.springBootJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
//	@Rule
//	public JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation("target/generated-snippets");
//
//	@Autowired
//	private WebApplicationContext context;
//	private MockMvc mockMvc;
//
//	@Before("docs")
//	public void setUp(){
//		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context)
//				.apply(documentationConfiguration(this.restDocumentation))
//				.build();
//	}
//
//
//	public void setUp(WebApplicationContext webApplicationContext,
//					  RestDocumentationContextProvider restDocumentation) {
//		this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
//				.apply(documentationConfiguration(restDocumentation)).build();
//	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
