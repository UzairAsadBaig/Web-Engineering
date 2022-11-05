package myPack;
import java.io.*; 
public class Book implements Serializable {
  private String title;
  private String author;
  private String publisher;
  private String genre;
  private String link;
  private int id;
  
  public Book(){

  }

  public Book(String title,String author,String publisher,String genre,String link,int id){
  this.title=title;
  this.author=author;
  this.publisher=publisher;
  this.genre=genre;
  this.link=link;
  this.id=id;
  }
  public Book(String title,String author,String publisher,String genre,String link){
  this.title=title;
  this.author=author;
  this.publisher=publisher;
  this.genre=genre;
  this.link=link;
  }
  
  // Getters
  public String getTitle( ){ 
    return title; 
   } 
  public String getAuthor( ){ 
    return author; 
   } 
  public String getPublisher( ){ 
    return publisher; 
   } 
  public String getGenre( ){ 
    return genre; 
   } 
  public String getLink( ){ 
    return link; 
   } 
  public int getId( ){ 
    return id; 
   } 
   

  //Setters
  public void setTitle(String c){ 
    title = c; 
   } 
  public void setAuthor(String c){ 
    author = c; 
   } 
  public void setPublisher(String c){ 
    publisher = c; 
   } 
  public void setGenre(String c){ 
    genre = c; 
   } 
  public void setLink(String c){ 
    link = c; 
   } 
  public void setId(int c){ 
    id = c; 
   } 



  public String toString(){
   return "\nTitle : "+this.title+" Author: "+this.author+"\n";
  }

}
