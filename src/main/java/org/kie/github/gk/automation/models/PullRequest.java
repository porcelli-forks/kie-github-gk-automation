package org.kie.github.gk.automation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PullRequest {

    private String url;
    private Integer id;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("diff_url")
    private String diffUrl;
    @JsonProperty("patch_url")
    private String patchUrl;
    @JsonProperty("issue_url")
    private String issueUrl;
    private Integer number;
    private State state;
    private boolean locked;
    private String title;
    private String body;
    private User user;
    private Head head;
    private Head base;
    private boolean merged;

    static enum State {
        OPEN, CLOSED;

        @JsonCreator
        public static State forValue( String value ) {
            return State.valueOf( value.toUpperCase() );
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl( final String url ) {
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId( final Integer id ) {
        this.id = id;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl( final String htmlUrl ) {
        this.htmlUrl = htmlUrl;
    }

    public String getDiffUrl() {
        return diffUrl;
    }

    public void setDiffUrl( final String diffUrl ) {
        this.diffUrl = diffUrl;
    }

    public String getPatchUrl() {
        return patchUrl;
    }

    public void setPatchUrl( final String patchUrl ) {
        this.patchUrl = patchUrl;
    }

    public String getIssueUrl() {
        return issueUrl;
    }

    public void setIssueUrl( final String issueUrl ) {
        this.issueUrl = issueUrl;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber( final Integer number ) {
        this.number = number;
    }

    public State getState() {
        return state;
    }

    public void setState( final State state ) {
        this.state = state;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked( final boolean locked ) {
        this.locked = locked;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle( final String title ) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody( final String body ) {
        this.body = body;
    }

    public User getUser() {
        return user;
    }

    public void setUser( final User user ) {
        this.user = user;
    }

    public Head getHead() {
        return head;
    }

    public void setHead( final Head head ) {
        this.head = head;
    }

    public Head getBase() {
        return base;
    }

    public void setBase( final Head base ) {
        this.base = base;
    }

    public boolean isMerged() {
        return merged;
    }

    public void setMerged( final boolean merged ) {
        this.merged = merged;
    }

    @Override
    public boolean equals( final Object o ) {
        if ( this == o ) {
            return true;
        }
        if ( !( o instanceof PullRequest ) ) {
            return false;
        }

        final PullRequest that = (PullRequest) o;

        if ( locked != that.locked ) {
            return false;
        }
        if ( merged != that.merged ) {
            return false;
        }
        if ( url != null ? !url.equals( that.url ) : that.url != null ) {
            return false;
        }
        if ( id != null ? !id.equals( that.id ) : that.id != null ) {
            return false;
        }
        if ( htmlUrl != null ? !htmlUrl.equals( that.htmlUrl ) : that.htmlUrl != null ) {
            return false;
        }
        if ( diffUrl != null ? !diffUrl.equals( that.diffUrl ) : that.diffUrl != null ) {
            return false;
        }
        if ( patchUrl != null ? !patchUrl.equals( that.patchUrl ) : that.patchUrl != null ) {
            return false;
        }
        if ( issueUrl != null ? !issueUrl.equals( that.issueUrl ) : that.issueUrl != null ) {
            return false;
        }
        if ( number != null ? !number.equals( that.number ) : that.number != null ) {
            return false;
        }
        if ( state != that.state ) {
            return false;
        }
        if ( title != null ? !title.equals( that.title ) : that.title != null ) {
            return false;
        }
        if ( body != null ? !body.equals( that.body ) : that.body != null ) {
            return false;
        }
        if ( user != null ? !user.equals( that.user ) : that.user != null ) {
            return false;
        }
        if ( head != null ? !head.equals( that.head ) : that.head != null ) {
            return false;
        }
        return base != null ? base.equals( that.base ) : that.base == null;
    }

    @Override
    public int hashCode() {
        int result = url != null ? url.hashCode() : 0;
        result = 31 * result + ( id != null ? id.hashCode() : 0 );
        result = 31 * result + ( htmlUrl != null ? htmlUrl.hashCode() : 0 );
        result = 31 * result + ( diffUrl != null ? diffUrl.hashCode() : 0 );
        result = 31 * result + ( patchUrl != null ? patchUrl.hashCode() : 0 );
        result = 31 * result + ( issueUrl != null ? issueUrl.hashCode() : 0 );
        result = 31 * result + ( number != null ? number.hashCode() : 0 );
        result = 31 * result + ( state != null ? state.hashCode() : 0 );
        result = 31 * result + ( locked ? 1 : 0 );
        result = 31 * result + ( title != null ? title.hashCode() : 0 );
        result = 31 * result + ( body != null ? body.hashCode() : 0 );
        result = 31 * result + ( user != null ? user.hashCode() : 0 );
        result = 31 * result + ( head != null ? head.hashCode() : 0 );
        result = 31 * result + ( base != null ? base.hashCode() : 0 );
        result = 31 * result + ( merged ? 1 : 0 );
        return result;
    }

    @Override
    public String toString() {
        return "PullRequest{" +
                "url='" + url + '\'' +
                ", id=" + id +
                ", htmlUrl='" + htmlUrl + '\'' +
                ", diffUrl='" + diffUrl + '\'' +
                ", patchUrl='" + patchUrl + '\'' +
                ", issueUrl='" + issueUrl + '\'' +
                ", number=" + number +
                ", state=" + state +
                ", locked=" + locked +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", user=" + user +
                ", head=" + head +
                ", base=" + base +
                ", merged=" + merged +
                '}';
    }
}