package com.humbughq.mobile;

public class Person {

    private String name;
    private String email;
    private String avatarURL;

    public Person(String name, String email) {
        this.setName(name);
        this.setEmail(email);
    }

    public Person(String name, String email, String avatarURL) {
        this(name, email);
        this.setAvatarURL(avatarURL);
    }

    /**
     * Construct an empty Person object.
     */
    public Person() {

    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        if (email != null) {
            this.email = email.toLowerCase();
        }
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    /**
     * Calculate the Humbug realm for the person, currently by splitting the
     * email address.
     * 
     * In the future, realms may be distinct from your email hostname.
     * 
     * @return the Person's realm.
     */
    public String getRealm() {
        String[] split_email = this.getEmail().split("@");
        return split_email[split_email.length - 1];
    }

    public boolean equals(Person obj) {
        return (this.name.equals(obj.getName()) && this.email.equals(obj
                .getEmail()));
    }

    public int hashCode() {
        // Joshua Bloch's standard recipe
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }
}
