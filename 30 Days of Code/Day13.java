//this code is part of requried code to run.
//You cannot run this code alone
//If you want to run this code
//please visit,
//https://www.hackerrank.com/challenges/30-abstract-classes

class MyBook extends Book{
    int price;
    
    MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }
    
    public void display(){
        System.out.println(
                "Title: " + this.title + "\n"
            +   "Author: " + this.author + "\n"
            +   "Price: " + this.price
        );
    }
}
