# Jenkins Terraform AWS Pipeline (Basic Demo)

If Jenkins is already running and have Terraform installed then no need to spin up the Jenkins using jenkins_script. In case, if you need to setup the Jenkins too then you should follow the instructions in [Jenkins Setup](https://github.com/erpushpinderrana/jenkins-terraform-aws/tree/master/jenkins_scripts).

When Terraform is installed in Jenkins then we could use this demo code to spin up a new EC2 instance in AWS.

## Quick Setup
1. Configure Jenkins with [Jenkins Groovy](https://github.com/erpushpinderrana/jenkins-terraform-aws/blob/master/jenkins_scripts/pipeline.groovy) script.
![Jenkins Pipeline](https://github.com/erpushpinderrana/files/blob/master/Jenkins_pipeline.png)
2. Run the build.
![Jenkins Build](https://github.com/erpushpinderrana/files/blob/master/Jenkins_build.png)
3. If the build is successful then a new EC2 instance will be available in your AWS account.

## Important Notes
* Update the correct AWS credentials in the provider.tf file.

## References
* https://github.com/wardviaene/terraform-course
* https://github.com/wardviaene/jenkins-course
