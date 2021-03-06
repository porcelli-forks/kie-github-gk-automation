package org.kie.github.gk.automation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PullRequestEvent extends Payload {

    public PullRequestEvent() {
        setEventType( EventType.PULL_REQUEST );
    }

    private Action action;

    private Integer number;

    @JsonProperty("pull_request")
    private PullRequest pullRequest;

    private Repository repository;

    private User sender;

    public enum Action {
        ASSGIGNED, UNASSIGNED, LABELED, UNLABELED, OPENED, CLOSED, REOPENED, SYNCHRONIZE;

        @JsonCreator
        public static Action forValue( String value ) {
            return Action.valueOf( value.toUpperCase() );
        }
    }

    public Action getAction() {
        return action;
    }

    public void setAction( final Action action ) {
        this.action = action;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber( final Integer number ) {
        this.number = number;
    }

    public PullRequest getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest( final PullRequest pullRequest ) {
        this.pullRequest = pullRequest;
    }

    public Repository getRepository() {
        return repository;
    }

    public void setRepository( final Repository repository ) {
        this.repository = repository;
    }

    public User getSender() {
        return sender;
    }

    public void setSender( final User sender ) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "PullRequestEvent{" +
                "action=" + action +
                ", number=" + number +
                ", pullRequest=" + pullRequest +
                ", repository=" + repository +
                ", sender=" + sender +
                ", eventType=" + getEventType() +
                '}';
    }
}
