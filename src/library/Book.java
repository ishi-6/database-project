package library;

import java.util.Calendar;
import java.util.Date;

public class Book implements Item {

	// ----- constructor attributes -----
	private String itemType;
	private String title;
	private String ID;
	private String location;
	private String publisher;
	private String edition; 

	// ----- rentable attributes ------
	private boolean rentable;
	private Date borrowedDate;
	private Date dueDate;

	private Date lostDay;
	private boolean isLost; // the purpose of this var is to show item is unrentable bc it is lost

	private User owner;
	private Double cost; // means fee
	
	
    // manages permanent items and discounts
    private boolean purchasable;
    private boolean onDiscount;

		
		

		// ----- req 7 ----- 
//		private boolean isPurchasable;
//		private Double price;

		// basic constructors
		public Book() {

		}


		public Book(String itemType, String title, String iD, String location, boolean rentable, Date borrowedDate,
				Date dueDate, User owner, String publisher, Double cost, String purchasable, String onDiscount, String edition) {
			super();
			this.itemType = itemType;
			this.title = title;
			this.ID = iD;
			this.location = location;
			this.publisher = publisher;


			this.rentable = rentable;
			this.borrowedDate = borrowedDate;
			this.dueDate = dueDate;
			this.owner = owner;
			this.cost = cost;
			
			this.edition=edition;
			
			this.setPurchasable(purchasable);
            this.setOnDiscount(onDiscount);
		}

		// ------ RENTING SETTERS ---- THE LOGIC FOR REQUIREMENTS
		
		//	DUEDATE & LOSTDATE SETTERS NOT NEEDED BECAUSE NO ONE SETS IT MANUALLY 
		@Override
		public void setBorrowedDate(Date borrowedDate) {
			this.borrowedDate = borrowedDate;
			
			Calendar c = Calendar.getInstance(); 	// the date import cannot do everything by itself. 

			c.setTime(borrowedDate);
			if(purchasable == false) {
				c.add(Calendar.MONTH, 1); 				// due +1month after borrow
				this.dueDate = c.getTime();

				c.add(Calendar.DATE, 15); 				// considered lost +15d after due
				this.lostDay = c.getTime();
			}
			else {
				this.dueDate = null;
				this.lostDay = null;
			}

		}
		
		public void calcCost(Date date) { // CALCULATING FEE

			if ((date.after(this.dueDate)) && (isPurchasable() == false)) {

				considerIfLost(date);
				if (!isLost) {

					double differenceUnit = date.getTime() - this.dueDate.getTime(); 
					// time will bee some huge ass number ok. in milliseconds 
					// i cant see any method in the import that gives us days

					double differenceDays = differenceUnit/ (24*60*60*1000);
					this.cost = differenceDays * 0.5;



				} else if (isLost) {
					this.cost = 15*0.5; 
				}

			}


		}
		
		public void considerIfLost(Date date) {
			if (date == null) {
				this.isLost = false;
			}
			else if (date.after(lostDay)) {
				this.isLost = true;
				this.rentable = false;
			}
		}
		
		@Override
		public void setOwner(User user) {
			
			this.owner = user;

		}
		
		// NO POINT OF THIS SETTER TBH!
		@Override
		public void setCost(Double cost) { 		
			this.cost = cost;
		}
		// NO POINT ITS CALCULATED BASED ON BORROWED DATE
		@Override
		public void setDueDate(Date dueDate) {
			this.dueDate = dueDate;
		}
		@Override
		public void setLostDate(Date date) {
			this.lostDay = date;
		}
		
		@Override
		public void setRentable(String rentable) {
			if (rentable.equals("true")) {
				this.rentable = true;
			}
			else {
				this.rentable = false;
			}
		}
		
		// ----- RENTING GETTERS
		
		@Override
		public boolean isRentable() {
			return rentable;
		}
		@Override
		public Date getBorrowedDate() {
			return borrowedDate;
		}
		@Override
		public Date getDueDate() {
			return dueDate;
		}
		
		@Override
		public Date getLostDate() {
			return this.lostDay;
		}
		
		@Override
		public User getOwner() {
			return owner;
		}

		@Override
		public Double getCost() {
			return cost;
		}
		@Override
		public String getRentable() {
			if (rentable == true) {
				return "true";
			}
			else {
				return "false";
			}
		}

		// ---- CONSTRUCTOR GETTER/SETTERS
		
		@Override
		public String getItemType() {
			return itemType;
		}
		@Override
		public void setItemType(String itemType) {
			this.itemType = itemType;
		}
		@Override
		public String getTitle() {
			return title;
		}
		@Override
		public void setTitle(String title) {
			this.title = title;
		}
		@Override
		public String getID() {
			return ID;
		}
		@Override
		public void setID(String iD) {
			this.ID = iD;
		}
		@Override
		public String getLocation() {
			return location;
		}
		@Override
		public void setLocation(String location) {
			this.location = location;
		}
		@Override
		public String getPublisher() {
			return publisher;
		}
		@Override
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		
		public String getEdition() {
			return edition;
		}
		public void setEdition(String edition) {
			this.edition = edition;
		}
		
		//
		
        @Override
        public boolean isPurchasable() {
                return this.purchasable;
        }
		@Override
		public void setPurchasable(String purchasable) {
			if (purchasable.equals("true")) {
				this.rentable = false;
				this.dueDate = null;
				this.lostDay = null;
				this.purchasable = true;
			}
			else {
				this.onDiscount = false;
				this.purchasable = false;
			}
		}
        @Override
        public String getPurchasable() {
                if (purchasable == true) {
                        return "true";
                }
                else {
                        return "false";
                }
        }
        @Override
        public boolean isOnDiscount() {
                return this.onDiscount;
        }
	@Override
	public void setOnDiscount(String onDiscount) {
		if ((onDiscount.equals("true")) && (isPurchasable() == true)) {
			this.onDiscount = true;
		}
		else {
			this.onDiscount = false;
		}
	}
        @Override
        public String getOnDiscount() {
                if (onDiscount == true) {
                        return "true";
                }
                else {
                        return "false";
                }
        }
        @Override
        public boolean getIfLost() {
                return this.isLost;
        }
        
        //
        public void setLost(boolean isLost) {
                this.isLost = isLost;
        }
}