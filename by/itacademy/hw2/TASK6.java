package by.itacademy.hw2;
import java.util.Scanner;

    public class TASK6{

        public static void main(String[] args){
            System.out.println("������� ������ �����:");
            Scanner scn1 = new Scanner(System.in);
            if (scn1.hasNextFloat()) {
                float a = Math.abs(scn1.nextFloat());
                System.out.println("������� ������ �����:");
                Scanner scn2 = new Scanner(System.in);
                if (scn2.hasNextFloat()) {
                    float b = Math.abs(scn2.nextFloat());
                    System.out.println("������� ������ �����:");
                    Scanner scn3 = new Scanner(System.in);
                    if (scn3.hasNextFloat()) {
                        float c = Math.abs(scn3.nextFloat());
                        if (a <= b & a <= c) {
                            System.out.println("������� ����� �� ������" + a);
                        }

                        if (b <= a & b <= c) {
                            System.out.println("������� ����� �� ������" + b);
                        }

                        if (c <= a & c <= b) {
                            System.out.println("������� ����� �� ������" + c);
                        }
                    } else {
                        System.out.println("���! ������� ������������ �����!");
                    }
                } else {
                    System.out.println("���! ������� ������������ �����!");
                }
            } else {
                System.out.println("���! ������� ������������ �����!");
            }

        }
    }
