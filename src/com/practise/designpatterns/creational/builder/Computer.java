package com.practise.designpatterns.creational.builder;

/*
   Builder pattern is used if you want to construct objects that contains lot of parameters and want to make object immutable
   after Constructing it.

   Examples are : StringBuilder,DocumentBuilder,LocaleBuilder
 */
public class Computer {

    //required parameters
    private String HDD;
    private String RAM;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;


    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    // Step 4 - Need to have private constructor in the outer class with builderclass as argument and set all the outer arguments
    //with builder arguments.
    private Computer(ComputerBuilder builder) {
        this.HDD=builder.HDD;
        this.RAM=builder.RAM;
        this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled=builder.isBluetoothEnabled;
    }

    //Step1: Create a static nested classs and copy all arguments from outer class to the builder class
    public static class ComputerBuilder{

        // required parameters
        private String HDD;
        private String RAM;

        // optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        //Public constructor with all required attributes as parameters.
        public ComputerBuilder(String hdd, String ram){
            this.HDD=hdd;
            this.RAM=ram;
        }

        // Should have methods to set optinal parameters and should return the same builder object after setting
        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        //provide a build method in the builder class that will return the object needed.
        public Computer build(){
            return new Computer(this);
        }

    }

}