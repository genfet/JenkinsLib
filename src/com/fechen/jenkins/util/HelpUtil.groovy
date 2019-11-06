package com.fechen.jenkins.util

import com.fechen.jenkins.domain.SlackNotification

class HelpUtil {

    static String DockerImageFile = "dev-docker-reg.digitalriverws.net/payments/payments-jenkins-worker:1.0.16"

    static void sendSlackNotification(SlackNotification slackNotification) {

    }

     static String jenkinsAgentLabel(String environment) {
        def label
        switch (environment) {
            case "Production" || "PTE":
                label = "docker || prod-medium"
                break
            default:
                label = "docker || nprod-medium"
                break
        }
        println "It's ${environment} environment, set Jenkins docker worker to \"$label\""

        return label
    }

    static void main(String[] args) {
        jenkinsAgentLabel("123")
    }
}
