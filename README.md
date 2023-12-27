Docker: 
Docker is a platform which helps us build and run containers. Due to its wide spread name we often use it in conjunction with docker image and docker container.

Container: 
A container is a executable unit of code, which contains all the dependencies which are required to run it. 

Image:
Image is a blueprint of a container. It contains details of what are required to run a container.

DockerFile: 
This is a blueprint of an image, here user will mention what dependencies are required to run the code. Include all the code and dependency files. 

Every dockerfile should contain these
From: says whats the base image using which the code runs
RUN: to install any dependencies
ENV: to set any env variables
Add or COpy: to add external files using url or copy local files
CMD: command to run the code, the starting point

Lets understand everything one by one by trying to build a simple java application and run it as a container using docker. We are going to build a small java application which writes a line in a file and reads it, prints it.

in the example folder you will be able to find javaapp, which contains dockerfile, docker-compose, and the src folder for our Main.java

What we have done in dockerfile is we used base image of java11. Copied all our dependencies into app folder (this is local to the container). 

Then we used docker-compose file. this is used when we have microservices or dependent containers that need to be running. we have used it here for single service called java-app.

How to run:
Once you install docker application. go to javaapp folder and run

docker-compose --project-name myjavaapp up --build : this builds an image and runs a container

docker ps : to see running containers

docker ps -a: to see even the stopped containers

docker stop <container_ID>: to stop container

docker images: to see images

docker rm containerID : to remove container

docker rmi imageid: to remove image

docker logs containerID: to get the logs 
