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

## Issues and Resolutions

**Issue:** Cannot connect to the Docker daemon at unix:///var/run/docker.sock. Is the docker daemon running?

**Resolution:** Make sure `docker.sock` exists in `/var/run/`. Since it's part of `docker-compose.yml` so it would be there else we should run docker using `docker run --rm -p 8080:8080 -p 4040:4040 -v /var/run/docker.sock:/var/run/docker.sock jenkins_jenkins`

**Issue:** `Got permission denied while trying to connect to the Docker daemon socket at unix:///var/run/docker.sock: permission denied`

**Resolution:** Follow the below steps and make sure that jenkins has access to `unix:///var/run/docker.sock`.
* Look for Jenkins container using the below command:
```
docker ps
```
| CONTAINER ID | IMAGE | COMMAND | CREATED | STATUS | PORTS | NAMES |
| -------------| ------ | ------ | ------- | ------ | ----- | -----|
| 0b79e8cf5b69 | jenkins_jenkins | "/sbin/tini -- /usr/…" | 32 seconds ago | Up 30 seconds | 0.0.0.0:5000->5000/tcp, 0.0.0.0:8080->8080/tcp, 50000/tcp | jenkins_jenkins_1 |

* Login to the container using root user so that we could change the ownership accordingly.
```
docker exec -it -uroot 0b79e8cf5b69 /bin/bash
```
* Check the ownership of `docker.sock` in `/var/run` directory.

| Permission | User| User | Timestamp | Date | Timestamp | File |
| -----------| --- | ---- | --------- | ---- | --------- | -----|
| srw-rw---- 1 | root | root | 0 | Oct  7 | 19:26 | docker.sock |

* Change the ownership to Jenkins user for `docker.sock` in `/var/run` directory.
```
chown jenkins docker.sock
```
**Issue:** Error happens during the Jenkins build: `groovy.lang.MissingPropertyException: No such property: docker for class: groovy.lang.Binding`

**Resolution:** Install the Docker Pipeline plugin in Jenkins.

**Issue:** Error happens during the Jenkins build: `ERROR: Could not find credentials matching ecr:us-east-`

**Resolution:** Install the Amazon ECR installed plugin in Jenkins.
