# Jenkins Terraform AWS Pipeline

If Jenkins is already running and have Terraform installed then no need to spin up the Jenkins using jenkins_script. In case, if you need to setup the Jenkins too then you should follow the instructions in [Jenkins Setup](https://github.com/erpushpinderrana/jenkins-terraform-aws/tree/main/jenkins_scripts).

When Terraform is installed in Jenkins then we could use this demo code to spin up a new EC2 instance in AWS.

## Quick Setup
1. Configure Jenkins with [Jenkins Groovy](https://github.com/erpushpinderrana/jenkins-terraform-aws/blob/main/jenkins_scripts/pipeline.groovy) script.
![Jenkins Pipeline](https://github.com/erpushpinderrana/files/blob/master/Jenkins_pipeline.png)
2. Run the build.
![Jenkins Build](https://github.com/erpushpinderrana/files/blob/master/Jenkins_build.png)

## Important Notes
1. Update the correct AWS credentials in the provider.tf file.
