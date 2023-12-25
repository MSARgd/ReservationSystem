//package ma.enset.ResourcesService.security;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity(prePostEnabled = true)
//public class SecurityConfig {
//    private JwtAuthConverter jwtAuthenticationConverter;
//    public SecurityConfig(JwtAuthConverter jwtAuthenticationConverter) {
//        this.jwtAuthenticationConverter = jwtAuthenticationConverter;
//    }
//    @Bean
//    public SecurityFilterChain securityFilterChain(
//            HttpSecurity httpSecurity
//    ) throws Exception {
//        return httpSecurity.cors(Customizer.withDefaults())
//                .authorizeHttpRequests(ar ->  ar.anyRequest().authenticated())
//                .oauth2ResourceServer(o2-> o2.jwt(jwt -> jwt.jwtAuthenticationConverter(jwtAuthenticationConverter)))
//                .headers(h->h.frameOptions(fo->fo.disable()))
//                .csrf(csrf->csrf.ignoringRequestMatchers("/public/**"))
//                .build();
//    }
//}