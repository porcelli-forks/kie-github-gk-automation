package org.kie.github.gk.automation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Repository {

    private Integer id;
    private String name;
    @JsonProperty("full_name")
    private String fullName;
    private User owner;
    @JsonProperty("private")
    private boolean privateRepository;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("clone_url")
    private String cloneUrl;
    private String description;
    private boolean fork;

    public Integer getId() {
        return id;
    }

    public void setId( final Integer id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( final String name ) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName( final String fullName ) {
        this.fullName = fullName;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner( final User owner ) {
        this.owner = owner;
    }

    public boolean isPrivateRepository() {
        return privateRepository;
    }

    public void setPrivateRepository( final boolean privateRepository ) {
        this.privateRepository = privateRepository;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl( final String htmlUrl ) {
        this.htmlUrl = htmlUrl;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl( final String cloneUrl ) {
        this.cloneUrl = cloneUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( final String description ) {
        this.description = description;
    }

    public boolean isFork() {
        return fork;
    }

    public void setFork( final boolean fork ) {
        this.fork = fork;
    }

    @Override
    public boolean equals( final Object o ) {
        if ( this == o ) {
            return true;
        }
        if ( !( o instanceof Repository ) ) {
            return false;
        }

        final Repository that = (Repository) o;

        if ( privateRepository != that.privateRepository ) {
            return false;
        }
        if ( fork != that.fork ) {
            return false;
        }
        if ( id != null ? !id.equals( that.id ) : that.id != null ) {
            return false;
        }
        if ( name != null ? !name.equals( that.name ) : that.name != null ) {
            return false;
        }
        if ( fullName != null ? !fullName.equals( that.fullName ) : that.fullName != null ) {
            return false;
        }
        if ( owner != null ? !owner.equals( that.owner ) : that.owner != null ) {
            return false;
        }
        if ( htmlUrl != null ? !htmlUrl.equals( that.htmlUrl ) : that.htmlUrl != null ) {
            return false;
        }
        if ( cloneUrl != null ? !cloneUrl.equals( that.cloneUrl ) : that.cloneUrl != null ) {
            return false;
        }
        return description != null ? description.equals( that.description ) : that.description == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + ( name != null ? name.hashCode() : 0 );
        result = 31 * result + ( fullName != null ? fullName.hashCode() : 0 );
        result = 31 * result + ( owner != null ? owner.hashCode() : 0 );
        result = 31 * result + ( privateRepository ? 1 : 0 );
        result = 31 * result + ( htmlUrl != null ? htmlUrl.hashCode() : 0 );
        result = 31 * result + ( cloneUrl != null ? cloneUrl.hashCode() : 0 );
        result = 31 * result + ( description != null ? description.hashCode() : 0 );
        result = 31 * result + ( fork ? 1 : 0 );
        return result;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", owner=" + owner +
                ", privateRepository=" + privateRepository +
                ", htmlUrl='" + htmlUrl + '\'' +
                ", cloneUrl='" + cloneUrl + '\'' +
                ", description='" + description + '\'' +
                ", fork=" + fork +
                '}';
    }
}
