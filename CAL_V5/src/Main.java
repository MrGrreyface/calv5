import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            System.out.println(calc(input));
        }

        public static String calc(String input) throws Exception{
            String[] act = {"+", "-", "*", "/"};
            String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                    "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
            int res = 0;
            int actIn = -1;
            int num1 = 0, num2 = 0;
            boolean itsRoman1=false, itsRoman2 = false;
            input = input.replace(" ", "");
            for (int i = 0; i < act.length; i++) {
                if (input.contains(act[i])) {
                    actIn = i;
                    break;
                }
            }
            if (actIn == -1) {
                throw new Exception();
            }

            String[] splitStr = input.split("[+-/*]");
            if (splitStr.length != 2){
                throw new Exception();
            }
            else {

                switch (splitStr[0]) {
                    case "I" -> {
                        num1 = 1;
                        itsRoman1 = true;
                    }
                    case "II" -> {
                        num1 = 2;
                        itsRoman1 = true;
                    }
                    case "III" -> {
                        num1 = 3;
                        itsRoman1 = true;
                    }
                    case "IV" -> {
                        num1 = 4;
                        itsRoman1 = true;
                    }
                    case "V" -> {
                        num1 = 5;
                        itsRoman1 = true;
                    }
                    case "VI" -> {
                        num1 = 6;
                        itsRoman1 = true;
                    }
                    case "VII" -> {
                        num1 = 7;
                        itsRoman1 = true;
                    }
                    case "VIII" -> {
                        num1 = 8;
                        itsRoman1 = true;
                    }
                    case "IX" -> {
                        num1 = 9;
                        itsRoman1 = true;
                    }
                    case "X" -> {
                        num1 = 10;
                        itsRoman1 = true;
                    }
                    default -> {
                        try {
                            num1 = Integer.parseInt(splitStr[0]);

                        } catch (NumberFormatException e) {
                            throw new Exception();
                        }
                    }
                }
                switch (splitStr[1]) {
                    case "I" -> {
                        num2 = 1;
                        itsRoman2 = true;
                    }
                    case "II" -> {
                        num2 = 2;
                        itsRoman2 = true;
                    }
                    case "III" -> {
                        num2 = 3;
                        itsRoman2 = true;
                    }
                    case "IV" -> {
                        num2 = 4;
                        itsRoman2 = true;
                    }
                    case "V" -> {
                        num2 = 5;
                        itsRoman2 = true;
                    }
                    case "VI" -> {
                        num2 = 6;
                        itsRoman2 = true;
                    }
                    case "VII" -> {
                        num2 = 7;
                        itsRoman2 = true;
                    }
                    case "VIII" -> {
                        num2 = 8;
                        itsRoman2 = true;
                    }
                    case "IX" -> {
                        num2 = 9;
                        itsRoman2 = true;
                    }
                    case "X" -> {
                        num2 = 10;
                        itsRoman2 = true;
                    }
                    default -> {
                        try {
                            num2 = Integer.parseInt(splitStr[1]);

                        } catch (NumberFormatException e) {
                            throw new Exception();
                        }
                    }
                }
                if (num1 > 0 && num2 > 0 && itsRoman1 && itsRoman2 && num1 <= 10 && num2 <= 10) {
                    switch (act[actIn]) {
                        case "+": {
                            res = num1 + num2;
                            break;
                        }
                        case "-": {
                            res = num1 - num2;
                            break;
                        }
                        case "*": {
                            res = num1 * num2;
                            break;
                        }
                        case "/": {
                            res = num1 / num2;
                            break;

                        }
                        default:
                            throw new Exception();

                    }
                }else if (num1 > 0 && num2 > 0 && !itsRoman1 && !itsRoman2 && num1 <= 10 && num2 <= 10) {
                    switch (act[actIn]) {
                        case "+": {
                            res = num1 + num2;
                            break;
                        }
                        case "-": {
                            res = num1 - num2;
                            break;
                        }
                        case "*": {
                            res = num1 * num2;
                            break;
                        }
                        case "/": {
                            res = num1 / num2;
                            break;
                        }

                        default:
                            throw new Exception();}
                }
            else {
              throw new Exception();}
                if (itsRoman1 && itsRoman2) try {
                    input = roman[res-1];
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new Exception();
                }
                else {
                    input = String.valueOf(res);

        }}
            return input;
        }}