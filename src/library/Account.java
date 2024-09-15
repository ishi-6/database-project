package library;

import java.util.*;

import javax.swing.JFrame;

import java.text.SimpleDateFormat;

public class Account {
    
    private List<Item> items = new ArrayList<Item>();
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private User user;  

    public Account(User u){
        //initialize everything about the user. list<Items> of rented stuff through itemsDB. Due dates. notifications. List<Courses>
        this.user = u;
        ItemDatabase db = new MaintainItemsProxy();
        try {
            db.load("notneeded");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //needs to only grab item by user
//        for (Item i : db.getItems()){
//            if(i.getOwner().getEmail().equals(u.getEmail())){
//                this.items.add(i);
//            }
//        }

    }

    public String getNotifications(){
        String urgentNotifications = "URGENT DUE DATES:";
        String notifications ="\n\nAll rented items:";


        for (Item i : items){
            Calendar today = Calendar.getInstance();
            today.setTime(new Date());

            Calendar calDueDate = Calendar.getInstance();
            calDueDate.setTime(i.getDueDate());

            //24 hours before due date
            Calendar calDueDate24 = Calendar.getInstance();
            calDueDate24.setTime(i.getDueDate());
            calDueDate24.add(Calendar.DAY_OF_MONTH, -1);

            //24 hours before due date
            Calendar calLostDate = Calendar.getInstance();
            calLostDate.setTime(i.getDueDate());
            calLostDate.add(Calendar.DAY_OF_MONTH, 15);

            if(today.after(calDueDate24)&&today.before(calDueDate)){
                urgentNotifications += "\n"+"Rented item: "+ i.getTitle() + " is due in less than 24 hours.";
            }
            else if (today.after(calDueDate)&&today.before(calLostDate)) {
                urgentNotifications += "\n"+"Rented item: "+ i.getTitle() + " is overdue";
            }
            else if (today.after(calLostDate)){
                urgentNotifications += "\n" +"Rented item: "+ i.getTitle() + " is lost";
            }


            notifications += "\n"+"Rented item: "+ i.getTitle() +"     Due: "+formatter.format(i.getDueDate());
        }

        if (urgentNotifications.equals("URGENT DUE DATES:")) {
            urgentNotifications += "No near due dates";
        }
        return urgentNotifications + notifications;
    }

	public List<Item> getItems() {
		return this.items;
	}

	public User getUser() {
		// TODO Auto-generated method stub
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
		
	}

	public void setItems(List<Item> items) {
		this.items = items;
		
	}
}
