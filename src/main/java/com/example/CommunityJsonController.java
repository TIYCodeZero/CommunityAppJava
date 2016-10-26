package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bearden-tellez on 10/10/16.
 */

@RestController
public class CommunityJsonController {

    @Autowired
    MemberRepository members;

    @Autowired
    PostRepository posts;

    @Autowired
    EventRepository events;

    @Autowired
    MemberEventRepository memberevents;

    @Autowired
    OrganizationRepository organizations;

    @Autowired
    OrganizationMemberRepository organizationMembers;

    @Autowired
    InvitationRepository invitations;

    @RequestMapping(path = "/createDemoData.json", method = RequestMethod.GET)
    public void demoData(HttpSession session) throws Exception {

        Organization techOrg = new Organization();
        techOrg.name= "All Things Tech";
        organizations.save(techOrg);

        Organization quakersOrg = new Organization();
        quakersOrg.name ="Atlanta Friends Meeting";
        organizations.save(quakersOrg);

        Organization swimmerOrg = new Organization();
        swimmerOrg.name= "Atlanta Swim Team";
        organizations.save(swimmerOrg);

        Organization bookOrg = new Organization();
        bookOrg.name= "Decatur Book Club";
        organizations.save(bookOrg);

        Organization chessOrg = new Organization();
        chessOrg.name= "Chess Club";
        organizations.save(chessOrg);

        Member demoMemberRBT = new Member();
        demoMemberRBT.firstName = "Rebecca";
        demoMemberRBT.lastName = "Bearden-Tellez";
        demoMemberRBT.email = "rebecca.m.bearden@gmail.com";
        demoMemberRBT.password = "password";
        demoMemberRBT.streetAddress = "1600 Penn Ave";
        demoMemberRBT.photoURL = "https://s9.postimg.org/47zz5c4ez/Rebecca.jpg";
        members.save(demoMemberRBT);

        OrganizationMember newOrgMember = new OrganizationMember(techOrg, demoMemberRBT);
        organizationMembers.save(newOrgMember);

        OrganizationMember qOneMember = new OrganizationMember(quakersOrg, demoMemberRBT);
        organizationMembers.save(qOneMember);

        Member demoMemberDG = new Member();
        demoMemberDG.firstName = "Donald";
        demoMemberDG.lastName = "Gowens";
        demoMemberDG.streetAddress = "382 Penn Ave";
        demoMemberDG.email= "dgowens@gmail.com";
        demoMemberDG.password= "candycorn";
        demoMemberDG.photoURL= "https://s9.postimg.org/k4yr21wt7/Donald.jpg";
        members.save(demoMemberDG);

        OrganizationMember secondOrgMember = new OrganizationMember(techOrg, demoMemberDG);
        organizationMembers.save(secondOrgMember);

        OrganizationMember qThreeMember = new OrganizationMember(quakersOrg, demoMemberDG);
        organizationMembers.save(qThreeMember);

        Member demoMemberDE = new Member();
        demoMemberDE.firstName = "Dan";
        demoMemberDE.lastName = "Esrey";
        demoMemberDE.streetAddress = "485 Penn Ave";
        demoMemberDE.email= "dan.esrey@gmail.com";
        demoMemberDE.password= "97thpercentile";
        demoMemberDE.photoURL= "https://s9.postimg.org/w5k72s47v/Daniel_E.jpg";
        members.save(demoMemberDE);

        OrganizationMember thirdOrgMember = new OrganizationMember(techOrg, demoMemberDE);
        organizationMembers.save(thirdOrgMember);

        OrganizationMember qTwoMember = new OrganizationMember(quakersOrg, demoMemberDE);
        organizationMembers.save(qTwoMember);

        Member demoMemberHP = new Member();
        demoMemberHP.firstName = "Harry";
        demoMemberHP.lastName = "Potter";
        demoMemberHP.streetAddress = "485 Hwy 12";
        demoMemberHP.email= "hp@gmail.com";
        demoMemberHP.password= "mischiefManaged";
        demoMemberHP.photoURL= "http://vignette1.wikia.nocookie.net/harrypotter/images/b/b2/2001-Harry-Potter-and-the-Sorcerer-s-Stone-Promotional-Shoot-HQ-harry-potter-11097228-1600-1960.jpg/revision/latest/scale-to-width-down/163?cb=20141122213655";
        members.save(demoMemberHP);

        OrganizationMember hpTechMember = new OrganizationMember(techOrg, demoMemberHP);
        organizationMembers.save(hpTechMember);

        OrganizationMember qHpMember = new OrganizationMember(quakersOrg, demoMemberHP);
        organizationMembers.save(qHpMember);

        OrganizationMember swimmerHpMember = new OrganizationMember(swimmerOrg, demoMemberHP);
        organizationMembers.save(swimmerHpMember);

        Member demoMemberWS = new Member();
        demoMemberWS.firstName = "Will";
        demoMemberWS.lastName = "Smith";
        demoMemberWS.streetAddress = "900 West Philborn Lane";
        demoMemberWS.email= "wildwildwest@gmail.com";
        demoMemberWS.password= "freshprince";
        demoMemberWS.photoURL= "https://s-media-cache-ak0.pinimg.com/originals/c6/e8/f1/c6e8f16711706e5506e1a39c121e61ed.jpg";
        members.save(demoMemberWS);

        OrganizationMember wsTechMember = new OrganizationMember(techOrg, demoMemberWS);
        organizationMembers.save(wsTechMember);

        OrganizationMember wsBookMember = new OrganizationMember(bookOrg, demoMemberWS);
        organizationMembers.save(wsBookMember);

        Member demoMemberTH = new Member();
        demoMemberTH.firstName = "Taraji P";
        demoMemberTH.lastName = "Henson";
        demoMemberTH.streetAddress = "900 West Philborn Lane";
        demoMemberTH.email= "tph@gmail.com";
        demoMemberTH.password= "cookie";
        demoMemberTH.photoURL= "http://www.indiewire.com/wp-content/uploads/2015/06/taraji-p-henson-as-cookie-in-foxs-empire.-Henson-as-Cookie-Lyon-1.jpg";
        members.save(demoMemberTH);

        OrganizationMember tpTechMember = new OrganizationMember(techOrg, demoMemberTH);
        organizationMembers.save(tpTechMember);

        OrganizationMember tpChessMember = new OrganizationMember(chessOrg, demoMemberTH);
        organizationMembers.save(tpChessMember);

        Event liveToLead = new Event();
        liveToLead.name = "Live2Lead";
        liveToLead.location = "Atlanta Tech Village 3423 Piedmont Rd. NE Atlanta, Georgia 30305";
        liveToLead.date= "2016-11-05T09:00:01Z";
        liveToLead.information = "Live2Lead is a half-day leader development experience designed to equip you with new perspectives, practical tools and key takeaways. ";
        liveToLead.organizer = demoMemberTH;
        liveToLead.organization = techOrg;
        events.save(liveToLead);

        Event ironPints = new Event();
        ironPints.name= "The Iron Yard Atlanta";
        ironPints.location = "115 M.L.K. Jr Dr SW #400, Atlanta, GA 30303";
        ironPints.date= "2016-11-18T16:00:01Z";
        ironPints.information= "Community Iron Pints is the 3rd Friday of every month when we open up our campus to the public for a relaxed social gathering.";
        ironPints.organization = techOrg;
        ironPints.organizer = demoMemberDE;
        events.save(ironPints);

        Event tagEvent = new Event();
        tagEvent.name= "Technology Association of Georgia: Moving and Modernizing Legacy Applications and Data to the Cloud";
        tagEvent.date = "2016-11-03T18:00:01Z";
        tagEvent.location = "1175 Peachtree Street NE, Suite 1400, Atlanta, GA 30309";
        tagEvent.information= "Join TAG Cloud as we Dive into ways of Modernizing and Moving Legacy Applications to the Cloud.";
        tagEvent.organization = techOrg;
        tagEvent.organizer = demoMemberHP;
        events.save(tagEvent);

        Event garnishEvent = new Event();
        garnishEvent.name = "HBS: Women’s SIG Wine and Food Tasting";
        garnishEvent.date = "2016-11-06T16:00:01Z";
        garnishEvent.location = "925 Garrett Street, Atlanta, GA 30316 United States";
        garnishEvent.information = "Emily Golub, the founder of Garnish & Gather, will be hosting us for a food and wine tasting at Joseph & Co.  ";
        garnishEvent.organizer = demoMemberRBT;
        garnishEvent.organization = techOrg;
        events.save(garnishEvent);

        Event devFest = new Event();
        devFest.name = "Google Developer DevFest";
        devFest.date = "2016-11-12T10:00:01Z";
        devFest.location = "675 Ponce de Leon Avenue NE, 2nd Floor, Atlanta, GA 30308 United States";
        devFest.information= "Programming DevFest offers talks and code labs that are accessible to both new and seasoned developers.";
        devFest.organizer= demoMemberWS;
        devFest.organization= techOrg;
        events.save(devFest);

        Post networkingPost = new Post();
        networkingPost.title = "Networking Tips";
        networkingPost.date = "2016-10-27T13:00:01Z ";
        networkingPost.body= "1. Have an Intro 2. Research attendees 3. Strategically Place Yourself 4. Follow Up";
        networkingPost.author = demoMemberDG;
        networkingPost.organization= techOrg;
        posts.save(networkingPost);

        Post hackathonIdeas = new Post();
        hackathonIdeas.title = "Hackathon Ideas?";
        hackathonIdeas.date= "2016-10-28T13:00:01Z";
        hackathonIdeas.body= "I am currently planning for a Hackathon, but am out of ideas for the event. Please email me at dev@gmail.com if you would like to throw some ideas out. Any input is appreciated!";
        hackathonIdeas.author = demoMemberDE;
        hackathonIdeas.organization = techOrg;
        posts.save(hackathonIdeas);

        Post slackChannel = new Post();
        slackChannel.title = "New Slack Channel";
        slackChannel.date= "2016-10-28T10:00:01Z";
        slackChannel.body= "TechOrg is our new slack channel!";
        slackChannel.author= demoMemberRBT;
        slackChannel.organization = techOrg;
        posts.save(slackChannel);

        Event qOneEvent = new Event();
        qOneEvent.name= "Free Breakfast";
        qOneEvent.location= "701 W Howard Ave, Decatur, GA 30030";
        qOneEvent.information= "Free breakfast to the public";
        qOneEvent.date = "2016-11-06T09:00:01Z";
        qOneEvent.organization= quakersOrg;
        qOneEvent.organizer= demoMemberHP;
        events.save(qOneEvent);

        Event qTwoEvent = new Event();
        qTwoEvent.name= "Morning Worship";
        qTwoEvent.date= "2016-11-02T08:30:01Z";
        qTwoEvent.location= "701 W Howard Ave, Decatur, GA 30030";
        qTwoEvent.information= "Silent worship";
        qTwoEvent.organizer= demoMemberHP;
        qTwoEvent.organization= quakersOrg;
        events.save(qTwoEvent);

        Event qThreeEvent = new Event();
        qThreeEvent.name= "Potluck";
        qThreeEvent.date= "2016-11-06T11:30:01Z";
        qThreeEvent.information= "Bring your favorite dish to our monthly potluck!";
        qThreeEvent.location= "701 W Howard Ave, Decatur, GA 30030";
        qThreeEvent.organizer= demoMemberHP;
        qThreeEvent.organization= quakersOrg;
        events.save(qThreeEvent);

        Post qOnePost = new Post();
        qOnePost.title= "Campfire";
        qOnePost.body= "I had a nice campfire this evening and silent reflection. I highly recommend it. ";
        qOnePost.date= "2016-10-25T15:00:01Z";
        qOnePost.author= demoMemberHP;
        qOnePost.organization= quakersOrg;
        posts.save(qOnePost);

        Post qTwoPost = new Post();
        qTwoPost.title= "Programs?";
        qTwoPost.body= "Anyone have any thoughts about more outreach opportunities?";
        qTwoPost.date= "2016-10-25T15:00:01Z";
        qTwoPost.author= demoMemberHP;
        qTwoPost.organization= quakersOrg;
        posts.save(qTwoPost);

        Post qThreePost = new Post();
        qThreePost.title= "Found Dog";
        qThreePost.body= "I found a dog outside the church this morning. She looks like a pit mix with brown and white markings. No collar, but I will be checking at a vet to check for a microchip.";
        qThreePost.date= "2016-10-27T15:00:01Z";
        qThreePost.author= demoMemberHP;
        qThreePost.organization= quakersOrg;
        posts.save(qThreePost);

        Post postOutsideHP = new Post();
        postOutsideHP.title= "Streches";
        postOutsideHP.body= "Please stretch before the meet next week, remember the regiment we went over in practice.";
        postOutsideHP.date= "2016-10-27T15:00:01Z";
        postOutsideHP.author= demoMemberHP;
        postOutsideHP.organization= swimmerOrg;
        posts.save(postOutsideHP);

        Event eventOutsideWS = new Event();
        eventOutsideWS.name= "New Book";
        eventOutsideWS.date= "2016-11-06T11:30:01Z";
        eventOutsideWS.information= "Please read Life After the Fresh Prince for our next meeting.";
        eventOutsideWS.location= "100 Peachtree St NW, Atlanta, GA 30303";
        eventOutsideWS.organizer= demoMemberWS;
        eventOutsideWS.organization= bookOrg;
        events.save(eventOutsideWS);

        Post postOutsideTP = new Post();
        postOutsideTP.title= "Difficulty Level";
        postOutsideTP.body= "Please choose your difficulty level for the next meet on Friday. If you need assistance, please let me know and we can guage your level.";
        postOutsideTP.date= "2016-10-28T12:00:01Z";
        postOutsideTP.author= demoMemberTH;
        postOutsideTP.organization= chessOrg;
        posts.save(postOutsideTP);
    }

    @RequestMapping(path = "/login.json", method = RequestMethod.POST)
    public MemberResponseContainer login(HttpSession session, @RequestBody Member member) throws Exception {
        MemberResponseContainer myResponse = new MemberResponseContainer();
        Member newMember = members.findFirstByEmail(member.email);
        try {
            if (newMember == null) {
                myResponse.errorMessage = "User does not exist or was input incorrectly";
                System.out.println(" Username was null");
            } else if (!member.password.equals(newMember.getPassword())) {
                myResponse.errorMessage = "Incorrect password";
                System.out.println("Password attempt failed. Incorrect password");
            } else if (newMember != null && newMember.password.equals(newMember.getPassword())) {
                System.out.println(newMember.firstName + " " + newMember.lastName + " is logging in");
                if (newMember.photoURL == null) {
                    newMember.setPhotoURL("dummy photo URL");
                }
                session.setAttribute("member", newMember);
                myResponse.responseMember = newMember;
            }
        }catch (Exception ex) {
            myResponse.setErrorMessage("An exception occurred while logging in");
            ex.printStackTrace();
        }
        return myResponse;
    }

    @RequestMapping(path = "/register.json", method = RequestMethod.POST)
    public MemberResponseContainer newMemberInfo(HttpSession session, @RequestBody Member member) throws Exception {
        MemberResponseContainer myResponse = new MemberResponseContainer();
        Member newMember = members.findFirstByEmail(member.email);
        System.out.println(member.email + " is about to be created");
        try {
            if (newMember == null) {
                ArrayList<Invitation> listInvites = invitations.findByInvitedEmail(member.getEmail());
                int size = listInvites.size();
                if (size>=1) {
                    ArrayList<Invitation> allInvites = invitations.findByInvitedEmail(member.getEmail());
                    for (Invitation currentInvite : allInvites) {
                        Organization organization = currentInvite.getOrganization();
                        member = new Member(member.firstName, member.lastName, member.email, member.password, member.streetAddress, member.photoURL);
                        if (member.photoURL == null) {
                            member.setPhotoURL("dummy photo URL");
                        }
                        members.save(member);
                        OrganizationMember organizationMemberAssociation = new OrganizationMember(organization, member);
                        organizationMemberAssociation.setOrganization(organization);
                        organizationMembers.save(organizationMemberAssociation);
                        myResponse.responseMember = member;
                    }
                } else {
                    member = new Member(member.firstName, member.lastName, member.email, member.password, member.streetAddress, member.photoURL);
                    if (member.photoURL == null) {
                        member.setPhotoURL("dummy photo URL");
                    }
                    members.save(member);
                    myResponse.responseMember = member;
                    session.setAttribute("member", member);
                    //later they would create an org
                }
            } else {
                    myResponse.setErrorMessage("User already exists");
            }
        }catch (Exception ex) {
            myResponse.setErrorMessage("An exception occurred while registering");
            ex.printStackTrace();
        }
        return myResponse;
    }

    @RequestMapping(path = "/editMember.json", method = RequestMethod.POST)
    public MemberResponseContainer editMember(HttpSession session, @RequestBody Member chosenMember) {
        Member member = (Member) session.getAttribute("member");
        MemberResponseContainer myResponse = new MemberResponseContainer();
        chosenMember = new Member(chosenMember.firstName, chosenMember.lastName, chosenMember.email, chosenMember.password, chosenMember.streetAddress, chosenMember.photoURL);
        try {
            if (member.id == (chosenMember.id)) {
                members.save(chosenMember);
                System.out.println("Saving edited member");
                myResponse.responseMember= members.findFirstByEmail(chosenMember.email);
                System.out.println("Returning updated member");
            } else {
                myResponse.errorMessage = "Member can't edit an acount that isn't theirs. ";
            }
        } catch (Exception ex){
            myResponse.errorMessage = "An Error occurred while editing the member";
            ex.printStackTrace();
        }
        return myResponse;
    }

    @RequestMapping(path = "/createPost.json", method = RequestMethod.POST)
    public PostContainer createPost(HttpSession session, @RequestBody Post incomingPost) {
        Member author = (Member) session.getAttribute("member");  //changed member to author
        System.out.println("Organization in post = " + incomingPost.organization);
        PostContainer postContainer = new PostContainer();
        try {
            if (incomingPost == null) {
                postContainer.setErrorMessage("Post was empty and therefore cannot be saved");

            } else {
                Post newPost = new Post(incomingPost.date, incomingPost.title,
                                        incomingPost.body, incomingPost.author, incomingPost.organization);
                System.out.println("Organization in newly created post = " + newPost.getOrganization());
                newPost.setMember(author);
                posts.save(newPost);
                postContainer.setPostList(getAllPostsByAuthor(author));
                System.out.println("post id = " + newPost.id);
            }
        } catch (Exception ex){
            postContainer.setErrorMessage("An exception occurred creating a post");
            ex.printStackTrace();
        }
        return postContainer;
    }

    @RequestMapping(path = "/memberList.json", method = RequestMethod.GET)
    public List<Member> getMemberList() {
        List<Member> memberList = new ArrayList<>();
        Iterable <Member> allMembers = members.findAll();
        for (Member member : allMembers) {
            memberList.add(member);
        }
        return memberList;
    }

    public List<Post> getAllPostsByAuthor(Member author) {
        Iterable<Post> allPosts = posts.findByAuthorOrderByDateAsc(author);
        List<Post> postList = new ArrayList<>();
        for (Post currentPost : allPosts) {
            postList.add(currentPost);

        }
        System.out.println("after iterable");
        return postList;
    }

    @RequestMapping(path = "/postsListByMember.json", method = RequestMethod.POST)
    public PostContainer getAllPostsByAuthorWithEndpoint(@RequestBody Member member) {
        PostContainer postContainer = new PostContainer();
        System.out.println("Looking for posts from: " + member.firstName + " " + member.lastName);

        try {
            member = members.findFirstByEmail(member.email);
            Iterable<Post> allPosts = posts.findByAuthorOrderByDateAsc(member);
            Long allPostsSize = allPosts.spliterator().getExactSizeIfKnown();
            if (allPostsSize == 0) {
                postContainer.setErrorMessage("Post list was empty and therefore cannot be saved");
            } else {
                List<Post> postList = new ArrayList<>();
                for (Post currentPost : allPosts) {
                    postList.add(currentPost);
                    postContainer.setPostList(postList);
                    System.out.println("post id = " + postList.indexOf(currentPost));
                }
            }
            System.out.println("after iterable");
        } catch (Exception ex) {
            postContainer.setErrorMessage("An exception occurred creating a post list");
            ex.printStackTrace();
        }
        return postContainer;
    }

    @RequestMapping(path = "/postsList.json", method = RequestMethod.GET)
    public List<Post> getAllPosts() {
        Iterable<Post> allPosts = posts.findAll();
        List<Post> postList = new ArrayList<>();
        for (Post currentPost : allPosts) {
            postList.add(currentPost);
        }
        return postList;
    }

    @RequestMapping(path = "/editPost.json", method = RequestMethod.POST)
    public PostContainer editPost(HttpSession session, @RequestBody Post thispost) {
        Member author = (Member) session.getAttribute("author");
        PostContainer myResponse = new PostContainer();
        try {
            if (author == (thispost.author)) {

                posts.save(thispost);

                System.out.println("Saving edited post");

                myResponse.postList = posts.findByAuthorOrderByDateAsc(author);
                System.out.println("Returning list of posts by  author");
            } else {
                myResponse.errorMessage = "Member did not create post and thus cannot edit it.";
            }
        } catch (Exception ex){
            myResponse.errorMessage = "An Error occurred while editing a post";
            ex.printStackTrace();
        }
        return myResponse;
    }

    @RequestMapping(path = "/singlePost.json", method = RequestMethod.GET)
    public PostContainer getSpecificPost(Integer postID) {
        System.out.println("finding post with post id " + postID);
        PostContainer myResponse = new PostContainer();

        Post myPost = posts.findById(postID);
        try {
            if (myPost == null) {
                myResponse.setErrorMessage("No post found");
            } else {
                System.out.println("Found post with title:" + myPost.title);
                myResponse.setResponsePost(myPost);
            }
        } catch (Exception ex){
            myResponse.setErrorMessage("Exception while getting single post");
            ex.printStackTrace();
        }
        return myResponse;
    }

    @RequestMapping(path = "/createEvent.json", method = RequestMethod.POST)
    public EventContainer createEvent(HttpSession session, @RequestBody Event incomingEvent) {
        Member member = (Member) session.getAttribute("member");
        System.out.println("Organization in event = " + incomingEvent.organization);
        EventContainer myResponse = new EventContainer();
        try{
            if(incomingEvent == null) {
               myResponse.setErrorMessage("Retrieved a null event");

            } else {
                Event newEvent = new Event(incomingEvent.name,incomingEvent.date, incomingEvent.location, incomingEvent.information, incomingEvent.organizer, incomingEvent.organization);
                System.out.println("Organization in newly created event = " + newEvent.getOrganization());
                newEvent.setOrganizer(member);
                events.save(newEvent);
                System.out.println("Creating event");
                System.out.println("event id = " + newEvent.id);
                myResponse.setEventList(getAllEvents());
                System.out.println("Returning list of events");
            }
        } catch (Exception ex){
            myResponse.setErrorMessage("An Error occurred while creating an event");
            ex.printStackTrace();
        }
        return myResponse;
    }

    @RequestMapping(path = "/editEvent.json", method = RequestMethod.POST)
    public EventContainer editEvent(HttpSession session, @RequestBody Event thisEvent) {
        Member member = (Member) session.getAttribute("member");
        EventContainer myResponse = new EventContainer();
        try {
            if (member == (thisEvent.organizer)) {

                events.save(thisEvent);

                System.out.println("Saving edited event");

                myResponse.setEventList(getAllEvents());
                System.out.println("Returning list of events");
            } else {
                myResponse.setErrorMessage("Member did not create event and thus cannot edit it.");
            }
        } catch (Exception ex){
            myResponse.setErrorMessage("An Error occurred while editing an event");
            ex.printStackTrace();
        }
        return myResponse;
    }

    @RequestMapping(path = "/eventsList.json", method = RequestMethod.GET)
    public EventContainer eventThings(HttpSession session) {
        EventContainer myResponse = new EventContainer();
        ArrayList<Event> myEvents = getAllEvents();
        int myEventListSize = myEvents.size();

        if (myEventListSize == 0) {
            myResponse.setErrorMessage("No events to display");

        } else {
            myResponse.setEventList(myEvents);
        }
        return myResponse;
    }

    ArrayList<Event> getAllEvents() {
        ArrayList<Event> eventList = new ArrayList<Event>();
        Iterable<Event> allEvents = events.findAll();

        for (Event currentEvent : allEvents) {
            eventList.add(currentEvent);

        }
        return eventList;
    }

    @RequestMapping(path = "/eventsListByMember.json", method = RequestMethod.POST)
    public EventContainer getAllEventsByAuthorWithEndpoint(@RequestBody Member member) {
        EventContainer eventContainer = new EventContainer();
        System.out.println("Looking for events from: " + member.firstName + " " + member.lastName);
        try {
            member = members.findFirstByEmail(member.email);
            Iterable<Event> allEvents = events.findByOrganizerOrderByDateAsc(member);
            Long allEventsSize = allEvents.spliterator().getExactSizeIfKnown();
            if (allEventsSize == 0) {
                eventContainer.setErrorMessage("Event list was empty and therefore cannot be saved");
            } else {
                List<Event> eventList = new ArrayList<>();
                for (Event currentEvent : allEvents) {
                    eventList.add(currentEvent);
                    eventContainer.setEventList(eventList);
                    System.out.println("event id = " + eventList.indexOf(currentEvent));
                }
            }
            System.out.println("after iterable");
        } catch (Exception ex) {
            eventContainer.setErrorMessage("An exception occurred creating a event list");
            ex.printStackTrace();
        }
        return eventContainer;
    }

    @RequestMapping(path = "/event.json", method = RequestMethod.GET)
    public EventContainer getSpecificEvent(Integer eventID) {
        System.out.println("finding event with event id " + eventID);
        EventContainer myResponse = new EventContainer();
        Event myEvent = events.findById(eventID);
        try {
            if (myEvent == null) {
                myResponse.setErrorMessage("No event found");
            } else {
                System.out.println("Found event " + myEvent.name);
                myResponse.setResponseEvent(myEvent);
            }
        } catch (Exception ex){
            myResponse.setErrorMessage("An exception occurred while retrieving event. ");
            ex.printStackTrace();
        }
        return myResponse;
    }

    @RequestMapping(path = "/attendEvent.json", method = RequestMethod.POST)
    public MemberEventContainer checkInAtEvent(HttpSession session, @RequestBody Event event) throws Exception{
        MemberEventContainer myResponse = new MemberEventContainer();
        Member member = (Member) session.getAttribute("member");

        try {
            MemberEvent attendingEvent = new MemberEvent(member, event);

            memberevents.save(attendingEvent);

            myResponse.setEventList(memberevents.findMembersByEvent(event));

        } catch (Exception ex){
            myResponse.setErrorMessage("A problem occurred while trying to attend an event");
            ex.printStackTrace();
        }
        return myResponse;
    }


    @RequestMapping(path = "/sendInvitation.json", method = RequestMethod.POST)
    public InvitationContainer evite(HttpSession session, @RequestBody String invitedEmail) throws Exception {
        InvitationContainer myResponse = new InvitationContainer();
        Member member = (Member) session.getAttribute("member");
        try{
            if (invitedEmail == null){
                myResponse.setErrorMessage("Invited email was null");
            } else {
            myResponse.setSuccessMessage("Invitation sent successfully");
            }
        } catch (Exception ex) {
            myResponse.setErrorMessage("An error occurred while trying to send an invite");
            ex.printStackTrace();
        }
        return myResponse;
    }

    @RequestMapping (path= "/createOrganization.json", method = RequestMethod.POST)
    public OrganizationContainer createOrganization(HttpSession session, @RequestBody Organization organization) throws  Exception {
        Member member = (Member) session.getAttribute("member");
        OrganizationContainer organizationContainer = new OrganizationContainer();
        organization = new Organization(organization.name);
        try {
            if (organization == null) {
                organizationContainer.setErrorMessage("Organization name was empty and therefore cannot be saved");

            } else {
                organization = new Organization(organization.name);
                organizations.save(organization);
                organizationContainer.setResponseOrganization(organization);
                OrganizationMember newOrgMember = new OrganizationMember(organization, member);
                System.out.println("Organization id = " + organization.id);
            }
        } catch (Exception ex){
            organizationContainer.setErrorMessage("An exception occurred creating an organization");
            ex.printStackTrace();
        }
        return organizationContainer;
    }

    @RequestMapping (path= "/organizationProfile.json", method = RequestMethod.GET)
    public OrganizationContainer thisOrg(HttpSession session, @RequestBody Integer organizationId) throws Exception {
        OrganizationContainer myResponse = new OrganizationContainer();
        Organization myOrg = organizations.findOne(organizationId);
        try{
            if (myOrg == null){
                myResponse.setErrorMessage("Organization was null");
            } else {
                myResponse.setResponseOrganization(myOrg);
            }

        } catch (Exception ex){
            myResponse.setErrorMessage("Exception while accessing org profile");
            ex.printStackTrace();
        }
        return myResponse;
    }

    @RequestMapping (path= "/joinOrganization.json", method = RequestMethod.POST)
    public OrganizationMemberContainer joinOrganization(HttpSession session) throws Exception {
        OrganizationMemberContainer myResponse = new OrganizationMemberContainer();
        Member member = (Member) session.getAttribute("member");
        ArrayList<Invitation> allInvites =  invitations.findByInvitedEmail(member.getEmail());

        try {
            if(allInvites != null) {
                for (Invitation currentInvite: allInvites) {
                    Organization organization = currentInvite.getOrganization();
                    OrganizationMember organizationMemberAssociation = new OrganizationMember(organization, member);
                    organizationMemberAssociation.setOrganization(organization);
                    organizationMembers.save(organizationMemberAssociation);
                    myResponse.setOrganizationMemberList(organizationMembers.findMembersByOrganization(organization));
                    System.out.println("organization set");
                }
            } else {
                myResponse.setErrorMessage("User was not invited to join this organization");
            }
        } catch (Exception ex) {
            myResponse.setErrorMessage("A problem occurred while trying to join an organization");
            ex.printStackTrace();
        }
        return myResponse;
    }

    @RequestMapping (path= "/membersByOrg.json", method = RequestMethod.GET)
    public MemberOrganizationContainer theMembers(HttpSession session, @RequestBody Organization organization) throws Exception {
        MemberOrganizationContainer myResponse = new MemberOrganizationContainer();
        try {
            ArrayList<Member> organizationMembersArrayList = new ArrayList<>();
            ArrayList<OrganizationMember> allOrganizationMembers = organizationMembers.findMembersByOrganization(organization);

            for (OrganizationMember orgMem : allOrganizationMembers) {
                organizationMembersArrayList.add(orgMem.getMember());
                int aomSize = allOrganizationMembers.size();

                if (organizationMembersArrayList == null || aomSize == 0) {
                    myResponse.setErrorMessage("List of members was null");
                } else {
                    myResponse.setResponseMemberList(organizationMembersArrayList);
                }
            }
        } catch (Exception ex) {
            myResponse.setErrorMessage("An exception has occurred while trying to obtain members.");
        }
        return myResponse;
    }

    @RequestMapping (path= "/memberProfile.json", method = RequestMethod.GET)
    public MemberResponseContainer thisMember(HttpSession session, @RequestBody Integer memberId) throws Exception {
        MemberResponseContainer myResponse = new MemberResponseContainer();
        Member myMember = members.findOne(memberId);
        try{
            if (myMember == null){
                myResponse.setErrorMessage("Member was null");
            } else {
                myResponse.setResponseMember(myMember);
            }

        } catch (Exception ex){
            myResponse.setErrorMessage("Exception while accessing member profile");
            ex.printStackTrace();
        }
        return myResponse;
    }

    @RequestMapping(path = "/organizationsList.json", method = RequestMethod.GET)
    public List<Organization> getAllOrganizations() {
        Iterable<Organization> allOrganizations = organizations.findAll();
        List<Organization> organizationsList = new ArrayList<>();
        for (Organization thisOrganization : allOrganizations) {
            organizationsList.add(thisOrganization);
        }
        return organizationsList;
    }


    @RequestMapping (path= "/postsByOrg.json", method = RequestMethod.POST)
    public PostContainer getAllPosts(HttpSession session, @RequestBody Organization organization){
        PostContainer myResponse = new PostContainer();
        try {
            ArrayList<Post> postsByOrg = new ArrayList<>();
            postsByOrg= posts.findByOrganizationOrderByDateAsc(organization); //changing this to be ordered...
            if (postsByOrg == null){
                myResponse.setErrorMessage("This organization has no posts");
            } else {
                myResponse.setPostList(postsByOrg);
            }
        }catch (Exception ex){
            myResponse.setErrorMessage("An exception occurred in getting posts by organization");
            ex.printStackTrace();
        }
        return myResponse;
    }


    @RequestMapping (path= "/membersOrgs.json", method = RequestMethod.POST)
    public AnotherOrganizationContainer getAllPosts(HttpSession session, @RequestBody Member member){
        AnotherOrganizationContainer myResponse = new AnotherOrganizationContainer();
        try {
            ArrayList<OrganizationMember> membersByOrg = new ArrayList<>();
            membersByOrg= organizationMembers.findByMemberEmail(member.getEmail());
            ArrayList<Organization> alOfMembersToReturn = new ArrayList<>();
            if (membersByOrg == null){
                myResponse.setErrorMessage("This member has no organizations");
            } else {
                for(OrganizationMember currentOrgMember: membersByOrg){
                    alOfMembersToReturn.add(currentOrgMember.getOrganization());
                }
                    myResponse.setResponseOrganization(alOfMembersToReturn);
            }
        }catch (Exception ex){
            myResponse.setErrorMessage("An exception occurred in organizations by member.");
            ex.printStackTrace();
        }
        return myResponse;
    }

    @RequestMapping (path= "/eventsByOrg.json", method = RequestMethod.POST)
    public EventContainer getAllEvents(HttpSession session, @RequestBody Organization organization){
        EventContainer myResponse = new EventContainer();
        try {
            ArrayList<Event> eventsByOrg = new ArrayList<>();
            eventsByOrg = events.findByOrganizationOrderByDateAsc(organization); //changing this to be ordered...
            if (eventsByOrg == null){
                myResponse.setErrorMessage("This organization has no events");
            } else {
                myResponse.setEventList(eventsByOrg);
            }
        } catch (Exception ex){
            myResponse.setErrorMessage("An exception occurred in getting events by organization");
            ex.printStackTrace();
        }
        return myResponse;
    }

    @RequestMapping (path= "/postsByAllMembersOrgs.json", method = RequestMethod.POST)
    public PostContainer getAllPostsForMemebersOrgs(HttpSession session){
        PostContainer myResponse = new PostContainer();
        Member member = (Member) session.getAttribute("member");
        try {
            ArrayList<Post> postsByOrgForAllMembers = new ArrayList<>();
            ArrayList<OrganizationMember> orgMembers = organizationMembers.findByMemberId(member.getId());
            if (orgMembers == null){
                myResponse.setErrorMessage("This member has no organizations");
            } else {
                for (OrganizationMember currentOrgMember: orgMembers){
                    postsByOrgForAllMembers.addAll(posts.findByOrganizationOrderByDateAsc(currentOrgMember.organization)); //changing this to be ordered...
                    myResponse.setPostList(postsByOrgForAllMembers);
                }
            }
        }catch (Exception ex){
            myResponse.setErrorMessage("An exception occurred in getting posts in all member's organizations");
            ex.printStackTrace();
        }
        return myResponse;
    }

    @RequestMapping (path= "/eventsByAllMembersOrgs.json", method = RequestMethod.POST)
    public EventContainer getAllEventsForMemebersOrgs(HttpSession session){
        EventContainer myResponse = new EventContainer();
        Member member = (Member) session.getAttribute("member");
        try {
            ArrayList<Event> eventsByOrgForAllMembers = new ArrayList<>();
            ArrayList<OrganizationMember> orgMembers = organizationMembers.findByMemberId(member.getId());
            if (orgMembers == null){
                myResponse.setErrorMessage("This member has no organizations.");
            } else {
                for (OrganizationMember currentOrgMember: orgMembers){
                    eventsByOrgForAllMembers.addAll(events.findByOrganizationOrderByDateAsc(currentOrgMember.organization)); //changing this to be ordered...
                    myResponse.setEventList(eventsByOrgForAllMembers);
                }
            }
        }catch (Exception ex){
            myResponse.setErrorMessage("An exception occurred in getting events in all member's organizations");
            ex.printStackTrace();
        }
        return myResponse;
    }
}
