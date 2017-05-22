
public class SocialNetworks {
    private String name;
    private String url;
    private String faviconcolour;
    private String userscount;
    private int rating;
    private String founder;
    private int creationyear;
    private boolean avaliable;

    public SocialNetworks(String name, String founder, int creationyear) {
        this.name = name;
        this.founder = founder;
        this.creationyear = creationyear;
    }

    //get methods:
    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getFaviconcolour() {
        return faviconcolour;
    }

    public String getUserscount() {
        return userscount;
    }

    public int getRating() {
        return rating;
    }

    public String getFounder() {
        return founder;
    }

    public int getCreationyear() {
        return creationyear;
    }

    //set methods:
    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setFaviconcolour(String faviconcolour) {
        this.faviconcolour = faviconcolour;
    }

    public void setUserscount(String userscount) {
        this.userscount = userscount;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public void setCreationyear(int creationyear) {
        this.creationyear = creationyear;
    }

    public static void main(String args[])

    {
        SocialNetworks object1 = new SocialNetworks("Facebook", "Mark Zukenberg", 2005);
        SocialNetworks object2 = new SocialNetworks("vkontakte", "Pavel Durov", 2007);
        System.out.println(object1.getName() + " was found by " + object1.getFounder() + " in " + object1.getCreationyear());
        object2.setFaviconcolour("blue");
        System.out.println("The network " + object2.getName() + " has " + object2.getFaviconcolour() + " favicon");
    }
}
