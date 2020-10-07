# Jenkins Setup
It also installs [docker](https://docs.docker.com/get-docker/) and [terraform](https://www.terraform.io/downloads.html) in Jenkins container.

## Quick Setup
1. Clone this repository and move to jenkins_scripts folder and run the below command:
```
docker-compose up -d
```
2. If it runs successfully, you will see below message:
```
Creating jenkins   ... done
```
3. To see docker images run below command:
```
docker ps
```
4. Now you can access Jenkins using http://localhost:8080/ URL. You may need to follow regular Jenkins installation such as setting up the first-time user password and installing plugins. Once it's done you will be able to see the below screen.
![Jenkins localhost](https://github.com/erpushpinderrana/files/blob/master/Jenkins_8080.png)
