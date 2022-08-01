package by.itacademy.hw2;
import java.util.Scanner;

    public class TASK6{

        public static void main(String[] args){
            System.out.println("¬ведите первое число:");
            Scanner scn1 = new Scanner(System.in);
            if (scn1.hasNextFloat()) {
                float a = Math.abs(scn1.nextFloat());
                System.out.println("¬ведите второе число:");
                Scanner scn2 = new Scanner(System.in);
                if (scn2.hasNextFloat()) {
                    float b = Math.abs(scn2.nextFloat());
                    System.out.println("¬ведите третье число:");
                    Scanner scn3 = new Scanner(System.in);
                    if (scn3.hasNextFloat()) {
                        float c = Math.abs(scn3.nextFloat());
                        if (a <= b & a <= c) {
                            System.out.println("ћеньшее число по модулю" + a);
                        }

                        if (b <= a & b <= c) {
                            System.out.println("ћеньшее число по модулю" + b);
                        }

                        if (c <= a & c <= b) {
                            System.out.println("ћеньшее число по модулю" + c);
                        }
                    } else {
                        System.out.println("”ѕ—! ¬ведите ¬≈ў≈—“¬≈ЌЌќ≈ число!");
                    }
                } else {
                    System.out.println("”ѕ—! ¬ведите ¬≈ў≈—“¬≈ЌЌќ≈ число!");
                }
            } else {
                System.out.println("”ѕ—! ¬ведите ¬≈ў≈—“¬≈ЌЌќ≈ число!");
            }

        }
    }
