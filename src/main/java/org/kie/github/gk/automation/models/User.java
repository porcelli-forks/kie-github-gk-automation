package org.kie.github.gk.automation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private String login;
    private Integer id;

    public String getLogin() {
        return login;
    }

    public void setLogin( final String login ) {
        this.login = login;
    }

    public Integer getId() {
        return id;
    }

    public void setId( final Integer id ) {
        this.id = id;
    }

    @Override
    public boolean equals( final Object o ) {
        if ( this == o ) {
            return true;
        }
        if ( !( o instanceof User ) ) {
            return false;
        }

        final User user = (User) o;

        if ( login != null ? !login.equals( user.login ) : user.login != null ) {
            return false;
        }
        return id != null ? id.equals( user.id ) : user.id == null;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + ( id != null ? id.hashCode() : 0 );
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", id=" + id +
                '}';
    }
}
