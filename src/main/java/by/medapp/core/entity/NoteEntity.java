package by.medapp.core.entity;

import jakarta.persistence.*;

@Entity
@Table(schema = "app", name = "olddatenote")
public class NoteEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "comments")
    private String comments;
    @Column(name = "guid")
    private String guid;
    @Column(name = "modifiedDateTime")
    private String modifiedDateTime;
    @Column(name = "clientGuid")
    private String clientGuid;
    @Column(name = "datetime")
    private String datetime;
    @Column(name = "loggedUser")
    private String loggedUser;
    @Column(name = "createdDateTime")
    private String createdDateTime;

    public NoteEntity() {
    }

    public NoteEntity(Long id,
                      String comments,
                      String guid,
                      String modifiedDateTime,
                      String clientGuid,
                      String datetime,
                      String loggedUser,
                      String createdDateTime) {
        this.id = id;
        this.comments = comments;
        this.guid = guid;
        this.modifiedDateTime = modifiedDateTime;
        this.clientGuid = clientGuid;
        this.datetime = datetime;
        this.loggedUser = loggedUser;
        this.createdDateTime = createdDateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getModifiedDateTime() {
        return modifiedDateTime;
    }

    public void setModifiedDateTime(String modifiedDateTime) {
        this.modifiedDateTime = modifiedDateTime;
    }

    public String getClientGuid() {
        return clientGuid;
    }

    public void setClientGuid(String clientGuid) {
        this.clientGuid = clientGuid;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(String loggedUser) {
        this.loggedUser = loggedUser;
    }

    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
}
