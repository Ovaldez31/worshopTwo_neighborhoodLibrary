package com.ps;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList <Book> inventory = new ArrayList<>();


        inventory.add(new Book(1, "978-1-118-50923-4", "The 12 Week Year"));
        inventory.add(new Book(2, "978-0-316-55632-3","Circe"));
        inventory.add(new Book(3, "978-0-345-52277-1","French Lessons"));
        inventory.add(new Book(4, "978-1-44342-266-6","The Rosie Project"));
        inventory.add(new Book(5, "978-0-06-172683-5","Delirium"));
        inventory.add(new Book(6, "978-0-139-56638-2","Kokoro"));
        inventory.add(new Book(7, "978-0-593-12900-5","The Vanished Birds"));
        inventory.add(new Book(8, "978-0-525-54190-5","Such A Fun Age"));
        inventory.add(new Book(9, "978-1-4926-3611-3","Even If We Break"));
        inventory.add(new Book(10, "978-1-542-0458-8","The Unremembered Girl"));
        inventory.add(new Book(11, "978-1-803-3699-6","The Hollow and the Haunted"));
        inventory.add(new Book(12, "978-0-684-8015-2","The Great Gatsby"));
        inventory.add(new Book(13, "978-0-930-2892-3","Watchmen"));
        inventory.add(new Book(14, "978-1-416-9833-9","Tilt"));
        inventory.add(new Book(15, "978-0-345-3968-1","Scorched Grace"));
        inventory.add(new Book(16, "978-1-121-9228-2","Speak"));
        inventory.add(new Book(17, "978-1-416-9832-8","Smoke"));
        inventory.add(new Book(18, "978-0-307-2784-4","The Bluest Eye"));
        inventory.add(new Book(19, "978-1-250-0558-9","The Tattooed Soldier"));
        inventory.add(new Book(20, "978-1-250-7888-2","Siren Queen"));



        inventory.get(0).checkout("Hannah");



    }











}






