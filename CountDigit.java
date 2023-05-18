String code = "123456ak25";
int digitCount = 0;

for (int i = 0; i < code.length(); i++) {
    if (Character.isDigit(code.charAt(i))) {
        digitCount++;
    }
}

System.out.println("Number of digits in the code: " + digitCount);