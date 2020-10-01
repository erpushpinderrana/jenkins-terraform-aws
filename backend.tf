terraform {
  backend "s3" {
    bucket = "ts3form"
    key    = "terraform/demo4"
  }
}
