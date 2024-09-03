class Solution {
    public String intToRoman(int num) {
        StringBuilder str = new StringBuilder();

        // Start with the largest possible values and work down
        if (num >= 1000) {
            while (num >= 1000) {
                str.append("M");
                num -= 1000;
            }
        }

        if (num >= 900) {
            str.append("CM");
            num -= 900;
        }

        if (num >= 500) {
            while (num >= 500) {
                str.append("D");
                num -= 500;
            }
        }

        if (num >= 400) {
            str.append("CD");
            num -= 400;
        }

        if (num >= 100) {
            while (num >= 100) {
                str.append("C");
                num -= 100;
            }
        }

        if (num >= 90) {
            str.append("XC");
            num -= 90;
        }

        if (num >= 50) {
            while (num >= 50) {
                str.append("L");
                num -= 50;
            }
        }

        if (num >= 40) {
            str.append("XL");
            num -= 40;
        }

        if (num >= 10) {
            while (num >= 10) {
                str.append("X");
                num -= 10;
            }
        }

        if (num >= 9) {
            str.append("IX");
            num -= 9;
        }

        if (num >= 5) {
            while (num >= 5) {
                str.append("V");
                num -= 5;
            }
        }

        if (num >= 4) {
            str.append("IV");
            num -= 4;
        }

        if (num >= 1) {
            while (num >= 1) {
                str.append("I");
                num -= 1;
            }
        }

        return str.toString();
    }
}
