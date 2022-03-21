package com.company;

public class Main {

    public static void main(String[] args) {
        //making variables
        int noOfBricks = 67;
        int contCap = 8;



        //getting number of full containers
        int noOfFullCont = noOfBricks/contCap;
        System.out.println("we get " + noOfFullCont + " full containers");

        //getting total number of containers
        int totNoOfCont = noOfFullCont +1;
        System.out.println("we get " + totNoOfCont + " containers\n");
    }
}
