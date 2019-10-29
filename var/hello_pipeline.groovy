#!/usr/bin/env groovy
import com.fechen.jenkins.domain.BuildInfo

def call(body) {
    echo "Pipeline Start"

    def buildInfo = new BuildInfo(buildVersion: "0.0.1")

    echo "${buildInfo.buildVersion} is the target version."

    return this
}
