#!/bin/bash
mvn compile
mvn package
sudo cp /home/ec2-user/music-analysis/musicA/target/musicA-1.0-SNAPSHOT.war /usr/local/tomcat7/webapps/musicA-1.0-SNAPSHOT.war   
