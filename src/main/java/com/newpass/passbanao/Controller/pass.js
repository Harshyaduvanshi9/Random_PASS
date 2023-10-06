function generatePassword(firstName, middleName, lastName) {
    // Extract the first 2 characters from each name
    const firstTwoCharsFirstName = firstName.slice(0, 2);
    const firstTwoCharsMiddleName = middleName.slice(0, 2);
    const firstTwoCharsLastName = lastName.slice(0, 2);

    // Generate a 3-digit random number
    const randomDigits = Math.floor(Math.random() * 900) + 100;

    // Concatenate the extracted characters and random digits
    const password = firstTwoCharsFirstName + firstTwoCharsMiddleName + firstTwoCharsLastName + randomDigits;

    return password;
}

// Example usage:
const firstName = "John";
const middleName = "Doe";
const lastName = "Smith";
const password = generatePassword(firstName, middleName, lastName);
console.log("Generated Password:", password);
