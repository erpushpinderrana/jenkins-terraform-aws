node {
  stage('Clone repository') {
    git branch: "master", url: "https://github.com/erpushpinderrana/jenkins-terraform-aws.git"
  }
  stage('Terraform Initialize') {
    sh "terraform init -input=false -var-file=vars.tfvars"
  }
  stage('Terraform Plan') {
    sh "terraform plan"
  }
  stage('Terraform Apply') {
    sh "terraform apply -auto-approve -input=false -var-file=vars.tfvars"
  }
}
