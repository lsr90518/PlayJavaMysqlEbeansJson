package controllers;

import java.util.List;

import models.Parent;
import play.*;
import play.db.ebean.Model.Finder;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

import com.avaje.ebean.Ebean;  
import com.avaje.ebean.Query;
import com.avaje.ebean.config.GlobalProperties;  

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }
  
  public static Result adduser(String username){
	  
	  //insert
//	  Parent p1 = new Parent();
//	  p1.name = username;
//	  p1.save();
	  
	  //search
//	  Finder<Long, Parent> finder = new Finder<Long, Parent>(Long.class, Parent.class);
//	  Parent p2 = finder.byId((long) 1);
	  
	  //update
//	  Finder<Long, Parent> finder = new Finder<Long, Parent>(Long.class, Parent.class);
//	  Parent p3 = finder.byId((long) 1);
//	  p3.name="lsr3";
//	  p3.update();
	  
	  
	  //delete
//	  Finder<Long, Parent> finder = new Finder<Long, Parent>(Long.class, Parent.class);
//	  Parent p4 = finder.byId((long) 1);
//	  p4.delete();
	  
	  return ok(adduser.render("hello "+username));
  }
  
  public static Result getUserByName(String name){
	  
	  Finder<Long, Parent> finder = new Finder<Long, Parent>(Long.class, Parent.class);
	  Query<Parent> query = finder.where("name='lsr3'");
      List<Parent> parents =query.findList();
	  System.out.println(parents.size());
	  return ok(Json.toJson(parents));
  }
  
}