class Customer {
    private String name;
    private boolean member;
    private String memberType;

    public Customer(String name, boolean member, String memberType) {
        this.name = name;
        this.member = member;
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }
    public boolean isMember() {
        return member;
    }
    public String getMemberType() {
        return memberType;
    }
    public String setMemberType (String memberType) {
        this.memberType = memberType;
        return memberType;
    }
}

class Discount {
    public static double getDiscountRate(Customer customer) {
        String memberType = customer.getMemberType();

        if (memberType.equalsIgnoreCase("Premium")) {
            double serviceDiscount = 0.2;
            return serviceDiscount;
        } else if (memberType.equalsIgnoreCase("Gold")) {
            double serviceDiscount = 0.15;
            return serviceDiscount;
        } else if (memberType.equalsIgnoreCase("Silver")) {
            double serviceDiscount = 0.1;
            return serviceDiscount;
        }
        return 0;
    }
}

class Visit {
    private Customer customer;
    private double serviceCost;
    private double productCost;
    private String date;

    public Visit(Customer customer, double serviceCost, double productCost, String date) {
        this.customer = customer;
        this.serviceCost = serviceCost;
        this.productCost = productCost;
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }
    public double getServiceExpense() {
        return serviceCost;
    }
    public double getProductExpense() {
        return productCost;
    }
    public String getDate() {
        return date;
    }

    public double getTotalExpense() {
        double totalCost = 0;
        if (customer.isMember()) {
            double discount = Discount.getDiscountRate(customer);
            serviceCost = serviceCost * (1 - discount);
            productCost = productCost * (.9);
            totalCost = (serviceCost + productCost);
        } else {
            totalCost = serviceCost + productCost;
        }
        return totalCost;
    }
    
}

public class Salon {
    public static void main(String[] args) {
        // Create customer
        Customer premiumCustomer = new Customer("Customer One", true, "Premium");
        Customer goldCustomer = new Customer("Customer Two", true, "Gold");
        Customer silverCustomer = new Customer("Customer Three", true, "Silver");

        // Create visit
        Visit premiumVisit = new Visit(premiumCustomer, 100, 50, "2024-03-05");
        Visit goldVisit = new Visit(goldCustomer, 100, 50, "2024-03-05");
        Visit silverVisit = new Visit(silverCustomer, 100, 50, "2024-03-05");

        // Calculate total expense
        double premiumExpense = premiumVisit.getTotalExpense();
        double goldExpense = goldVisit.getTotalExpense();
        double silverExpense = silverVisit.getTotalExpense();

        // Print the total expense
        System.out.println("Premium(150 spent): " + premiumExpense + " on " + premiumVisit.getDate());
        System.out.println("Gold(150 spent): " + goldExpense + " on " + goldVisit.getDate());
        System.out.println("Silver(150 spent): " + silverExpense + " on " + silverVisit.getDate());
    }
}