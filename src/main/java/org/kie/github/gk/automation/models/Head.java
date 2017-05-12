package org.kie.github.gk.automation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Head {

    private String label;
    private String ref;
    private String sha;
    private User user;
    private Repository repo;

    public String getLabel() {
        return label;
    }

    public void setLabel( final String label ) {
        this.label = label;
    }

    public String getRef() {
        return ref;
    }

    public void setRef( final String ref ) {
        this.ref = ref;
    }

    public String getSha() {
        return sha;
    }

    public void setSha( final String sha ) {
        this.sha = sha;
    }

    public User getUser() {
        return user;
    }

    public void setUser( final User user ) {
        this.user = user;
    }

    public Repository getRepo() {
        return repo;
    }

    public void setRepo( final Repository repo ) {
        this.repo = repo;
    }

    @Override
    public boolean equals( final Object o ) {
        if ( this == o ) {
            return true;
        }
        if ( !( o instanceof Head ) ) {
            return false;
        }

        final Head head = (Head) o;

        if ( label != null ? !label.equals( head.label ) : head.label != null ) {
            return false;
        }
        if ( ref != null ? !ref.equals( head.ref ) : head.ref != null ) {
            return false;
        }
        if ( sha != null ? !sha.equals( head.sha ) : head.sha != null ) {
            return false;
        }
        if ( user != null ? !user.equals( head.user ) : head.user != null ) {
            return false;
        }
        return repo != null ? repo.equals( head.repo ) : head.repo == null;
    }

    @Override
    public int hashCode() {
        int result = label != null ? label.hashCode() : 0;
        result = 31 * result + ( ref != null ? ref.hashCode() : 0 );
        result = 31 * result + ( sha != null ? sha.hashCode() : 0 );
        result = 31 * result + ( user != null ? user.hashCode() : 0 );
        result = 31 * result + ( repo != null ? repo.hashCode() : 0 );
        return result;
    }

    @Override
    public String toString() {
        return "Head{" +
                "label='" + label + '\'' +
                ", ref='" + ref + '\'' +
                ", sha='" + sha + '\'' +
                ", user=" + user +
                ", repo=" + repo +
                '}';
    }
}
