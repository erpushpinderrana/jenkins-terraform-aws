# Jenkins Terraform AWS Pipeline (Basic Demo)

If Jenkins is already running and have Terraform installed then no need to spin up the Jenkins using jenkins_script. In case, if you need to setup the Jenkins too then you should follow the instructions in [Jenkins Setup](https://github.com/erpushpinderrana/jenkins-terraform-aws/tree/master/jenkins_scripts).

When Terraform is installed in Jenkins then we could use this demo code to spin up a new EC2 instance in AWS.

## Prerequisites
Update the AWS access and secret keys in [provider.tf](https://github.com/erpushpinderrana/jenkins-terraform-aws/blob/master/provider.tf) file.

## Quick Setup
1. Configure Jenkins with [Jenkins Groovy](https://github.com/erpushpinderrana/jenkins-terraform-aws/blob/master/jenkins_scripts/pipeline.groovy) script.
![Jenkins Pipeline](https://github.com/erpushpinderrana/files/blob/master/Jenkins_pipeline.png)
2. Run the build.
![Jenkins Build](https://github.com/erpushpinderrana/files/blob/master/Jenkins_build.png)
3. If the build is successful then a new EC2 instance will be available in your AWS account.

## Important Notes
* Update the correct AWS credentials in the provider.tf file.
* We may try this terraform repo by installing terraform on local machine.

## Important Commands
* ``terraform init -input=false -var-file=vars.tfvars`` To initialize a working directory containing Terraform configuration files.
* ``terraform plan -input=false -var-file=vars.tfvars`` Create an execution plan.
* ``terraform apply -input=false -var-file=vars.tfvars`` To apply the changes required to reach the desired state of the configuration.
* ``terraform plan -input=false -var-file=vars.tfvars -out changes.terraform``the pre-determined set of actions generated by a terraform plan execution plan.
* ``terraform apply changes.terraform`` To apply the changes of pre-determined set of actions generated by a terraform plan execution plan.
* ``terraform apply changes.terraform`` Terminates resources defined in your Terraform configuration.

## References
* https://github.com/wardviaene/terraform-course
* https://github.com/wardviaene/jenkins-course
