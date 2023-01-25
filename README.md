# Team Draft Tool
This application is for simple team drafting outside of a fantasy football application. If can easily be forked and modified to accomodate a traditional fantasy football draft with a few changes to the model.

This is built using the [Spark](https://sparkjava.com/) micro-framework in Java 8 with a helping hand from a few java packages that are maintained using maven. Currently nothing is persisted once the application is shut down but connecting to a database can be done simply by leveraging the existing models.

The front end is built using [React](https://reactjs.org/) and consumes the Java API.

This project uses [Docker](https://www.docker.com/) and [Kubernetes])https://kubernetes.io/) for container management and [CircleCI](https://circleci.com/) for a CI/CD pipeline.

## Installation

```git clone https://github.com/RoryDeken/team-draft-tool.git```

```cd team-draft-tool```

```docker compose up -d```


This application should now be running on port 3000.


*This application is currently under development and no stable release has been published.  Check back for progress or fork this to roll your own simple draft tool*


