//package ru.kata.spring.boot_security.demo.configs;
//
//import org.springframework.context.annotation.Configuration;
//import ru.kata.spring.boot_security.demo.entity.Role;
//import ru.kata.spring.boot_security.demo.entity.User;
//import ru.kata.spring.boot_security.demo.service.RoleService;
//import ru.kata.spring.boot_security.demo.service.UserService;
//
//import javax.annotation.PostConstruct;
//import java.util.HashSet;
//import java.util.Set;
//
//@Configuration
//public class DBConfig {
//    private final RoleService roleService;
//    private final UserService userService;
//
//    DBConfig (RoleService roleService, UserService userService) {
//        this.roleService = roleService;
//        this.userService = userService;
//    }
//
//    @PostConstruct
//    public void createData() {
//        roleService.save(new Role("ROLE_ADMIN"));
//        roleService.save(new Role("ROLE_USER"));
//        User user = new User();
//        User admin = new User();
//        user.setUsername("user");
//        user.setPassword("100");
//        admin.setUsername("admin");
//        admin.setPassword("100");
//        admin.setRoles(new HashSet<>(roleService.getAllRole()));
//        userService.saveNewUser(user);
//        userService.saveNewUser(admin);
//    }
//}
