package com.newpass.passbanao.Controller;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        // Generate the password using JavaScript logic
        String password = generatePassword(user.getFirstName(), user.getMiddleName(), user.getLastName());
        user.setPassword(password);

        // Save the user to the database
        User savedUser = userRepository.save(user);

        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // JavaScript password generation logic
    private String generatePassword(String firstName, String middleName, String lastName) {
        // Implement your JavaScript logic here
        // For example, you can use JavaScript engine in Java or call a JavaScript function

        // Generate a password based on the provided names
        // Example: (2 chars from each name + 3-digit random numbers)
        // Implement your password generation logic here

        return ""; // Replace with the generated password
    }
}

