package appforograils

class Post {

    String topic
    Date dateCreated
    Date lastupdate
    Date currentDay = new Date()
    boolean itsAllowed

    static constraints = {
        topic(blank:false, nullable: false, minSize: 3, maxSize: 50)
        dateCreated(blank:false,nullable: false, min: currentDay)
        lastupdate(blank:false,nullable: false, min: currentDay)
		itsAllowed (blank:false, nullable:false)

    }
}
