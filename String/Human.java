package String;
//1. secret - каждый человек имеет секрет, которым он бы не хотел делиться ни с кем.
//2. news - каждый человек знает новость, которую он хотел бы рассказать всем, кто его об этом спросит.
//3. experience - опыт. Каждый человек обладает некоторым жизненным опытом, делиться с которыми он хотел бы либо с детьми,
// либо с теми, с кем находится в одном доме (пакете)
//4. gossip - сплетни. Все любят сплетничать, но делают это все как правило внутри дома (пакета).
//Добавьте в класс Human 4 метода:

//1. getSecret()
//2. getNews()
//3. getExperience()
//4. getGossip()
//которые помогут ему реализовать его желание делиться разной информацией с разными людьми. Для этого используйте с методами нуные модификаторы доступа.
public class Human {
private final String secret; //секретики
public String news; //новости
protected final String experience; //опыт
final String gossip; //сплетни


public Human(String secret, String news, String experience, String gossip) {
    this.secret = secret;
    this.news = news;
    this.experience = experience;
    this.gossip = gossip;
}


void setNews(){
    System.out.println("Новости сегодня хорошие");
}

private String getSecret() {
    return secret;
}

public String getNews() {
    return news;
}

protected String getExperience() {
    return experience;
}

String getGossip() {
    return gossip;
}


}
 class Child extends Human {

 int dog =5 ;
     public Child(String secret, String news, String experience, String gossip) {
         super(secret, news, experience, gossip);

         getExperience();
     }

     @Override
     void setNews() {
         super.setNews();
     }

     public static void main(String[] args) {


     }
 }
