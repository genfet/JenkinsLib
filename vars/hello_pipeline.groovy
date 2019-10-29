#!/usr/bin/env groovy
import com.fechen.jenkins.domain.JenkinsLib.BuildInfo

def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    def version = getVersion(config)
    echo "Result Version: ${version}"

    def buildInfo = new BuildInfo(buildVersion: version)

    echo "${buildInfo.buildVersion} is the target version."

    return this
}

def getVersion(def config) {
    def version = config?.version?:"0.0.1"
    println "Version: $version"

    return version
}
