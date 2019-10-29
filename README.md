# JenkinsLib
##Pipeline Script: 

library identifier: 'JenkinsLib@master', retriever: modernSCM(
      [$class: 'GitSCMSource',
       remote: 'https://github.com/genfet/JenkinsLib.git',
       credentialsId: 'genfet.chen'])

stage('Print Build Info') {
    hello_pipeline {
        version = "2019-10-29"
    }
} stage('Print Build Info222222') {
    hello_pipeline2 {
        version = "2019-10-30"
    }
}
