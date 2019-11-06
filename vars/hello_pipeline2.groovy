#!/usr/bin/env groovy
import com.fechen.jenkins.util.HelpUtil

import static com.fechen.jenkins.util.HelpUtil.DockerImageFile
import static com.fechen.jenkins.util.HelpUtil.jenkinsAgentLabel

def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    def environment = config?.env ?: null
    println "Environment is: ${environment}!!!!!!!!!"

    def version = config.version ?:"0.0.1"
    println "Version is: ${version}!!!!!!!!!"

    def agentLabel = "docker || nprod-medium"
    println "Agent is: ${agentLabel}!!!!!!!!!"

    pipeline {
        agent {
            docker {
                image DockerImageFile
                label agentLabel
            }
        }

        stages {
            stage('Build') {
                steps {
                    script {
                        println "build stage"
                    }
                }
            }
            stage('Build - 2') {
                steps {
                    script {
                        println "build - 2 stage"
                    }
                }
            }
        }
    }
}
