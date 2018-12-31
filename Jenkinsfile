pipeline {
    agent {
        label 'selenium'
    }
    stages {
        stage('PLAN::Sources') {
            steps {
                echo 'Init planing activities.'
            }
        }
        stage('CODE::Sources') {
            steps {
                echo 'Init build sources here.'
            }
        }
        stage('BUILD::Products') {
            parallel {
                stage('Ezlo') {
                    steps {
                        echo 'Firmware build script here.'
                        echo 'NMA build script here.'
                        echo 'Web build script here.'
                        echo 'iOS build script here.'
                        echo 'Android build script here.'
                    }
                }
                stage('Zlink') {
                    steps {
                        echo 'Firmware build script here.'
                        echo 'NMA build script here.'
                        echo 'Web build script here.'
                        echo 'iOS build script here.'
                        echo 'Android build script here.'
                    }
                }
                stage('Vera') {
                    steps {
                        echo 'Firmware build script here.'
                        echo 'NMA build script here.'
                        echo 'Web build script here.'
                        echo 'iOS build script here.'
                        echo 'Android build script here.'
                    }
                }
                stage('Orange') {
                    steps {
                        echo 'Firmware build script here.'
                        echo 'NMA build script here.'
                        echo 'Web build script here.'
                        echo 'iOS build script here.'
                        echo 'Android build script here.'
                    }
                }
                stage('etc...') {
                    steps {
                        echo 'Firmware build script here.'
                        echo 'NMA build script here.'
                        echo 'Web build script here.'
                        echo 'iOS build script here.'
                        echo 'Android build script here.'
                    }
                }
                stage('AutomationFramework') {
                    steps {
                        sh(script: './gradlew clean')
                        sh(script: './gradlew build')
                    }
                }
            }
        }
        stage('TEST::AUTO::Unit') {
            parallel {
                stage("Framework") {
                    steps {
//                        build(job: "Linux_Unit_Framework_All__", propagate: false)
                        sh(script: './gradlew Linux_Unit_Framework_All__ --info', returnStatus: true)
                    }
                }
                stage("Firmware") {
                    steps {
                        echo 'Firmware unit tests.'
                    }
                }
                stage("NMA") {
                    steps {
                        echo 'NMA unit tests.'
                    }
                }
                stage("Web") {
                    steps {
                        echo 'AUTO::UI::Web unit tests.'
                    }
                }
                stage("iOS") {
                    steps {
                        echo 'AUTO::UI::iOS unit tests.'
                    }
                }
                stage("Android") {
                    steps {
                        echo 'AUTO::UI::Android unit tests.'
                    }
                }
            }
        }
        stage('TEST::AUTO::Integration') {
            parallel {
                stage("API::REST") {
                    steps {
                        sh(script: "./gradlew Api_REST_MMS_Demo --info", returnStatus: true)
                    }
                }
                stage("API::WebSocket") {
                    steps {
                        echo 'Run test.'
                        sh(script: "./gradlew Api_WS_NMA_Demo  --info", returnStatus: true)
                    }
                }
            }
        }
        stage('TEST::AUTO::System') {
            parallel {
                stage('UI::Windows') {
                    steps {
                        sh(script: './gradlew Win_CH_OCS2_All --info', returnStatus: true)
                        sh(script: './gradlew Win_FF_OCS2_All --info', returnStatus: true)
                        sh(script: './gradlew Win_IE_OCS2_All --info', returnStatus: true)
                        sh(script: './gradlew Win_DG_OCS2_All --info', returnStatus: true)
                    }
                }
                stage('UI::Linux') {
                    steps {
                        sh(script: './gradlew Linux_CH_OCS2_All --info', returnStatus: true)
                        sh(script: './gradlew Linux_FF_OCS2_All --info', returnStatus: true)
                    }
                }
                stage('UI::MacOS') {
                    steps {
                        sh(script: './gradlew Mac_CH_OCS2_All --info', returnStatus: true)
                        sh(script: './gradlew Mac_FF_OCS2_All --info', returnStatus: true)
                        sh(script: './gradlew Mac_SF_OCS2_All --info', returnStatus: true)
                    }
                }
                stage('UI::Android') {
                    steps {
                        echo 'Android browser tests.'
                        echo 'Android applications tests.'
                    }
                }
                stage('UI::iOS') {
                    steps {
                        echo 'iOS browser tests.'
                        echo 'iOS applications tests.'
                    }
                }
            }
        }
        stage('TEST::AUTO::Info') {
            steps {
                timeout(time: 5, unit: 'DAYS') {
                    input message: 'Approve - Automation tests @AUTO?'
                }
            }
        }
        stage('TEST::QA::Manual') {
            steps {
                echo 'Do we need a Jira integration here\n' +
                        'e.g. list of Issues from Jira, ha?' +
                        '- Of course we could! ;)'
                timeout(time: 5, unit: 'DAYS') {
                    input message: 'Approve - Functional manual tests @QA?'
                }
            }
        }
        stage('TEST::STAGE::System') {
            steps {
                echo 'End2End only tests on STAGING...'
                echo 'Regression tests on STAGING...'
                echo 'Performance tests on STAGING...'
            }
        }
        stage('TEST::STAGE::Info') {
            steps {
                timeout(time: 5, unit: 'DAYS') {
                    input message: 'Approve testing @STAGING?'
                }
            }
        }
        stage('TEST::PROD::Acceptance') {
            parallel {
                stage('UI::Windows') {
                    steps {
                        sh(script: './gradlew Win_CH_OCS2_Accept --info', returnStatus: true)
                        sh(script: './gradlew Win_FF_OCS2_Accept --info', returnStatus: true)
                        sh(script: './gradlew Win_IE_OCS2_Accept --info', returnStatus: true)
                        sh(script: './gradlew Win_DG_OCS2_Accept --info', returnStatus: true)
                    }
                }
                stage('UI::Linux') {
                    steps {
                        sh(script: './gradlew Linux_CH_OCS2_Accept --info', returnStatus: true)
                        sh(script: './gradlew Linux_FF_OCS2_Accept --info', returnStatus: true)
                    }
                }
                stage('UI::MacOS') {
                    steps {
                        sh(script: './gradlew Mac_CH_OCS2_Accept --info', returnStatus: true)
                        sh(script: './gradlew Mac_FF_OCS2_Accept --info', returnStatus: true)
                        sh(script: './gradlew Mac_SF_OCS2_Accept --info', returnStatus: true)
                    }
                }
                stage('UI::Android') {
                    steps {
                        echo 'Android browser tests.'
                        echo 'Android applications tests.'
                    }
                }
                stage('UI::iOS') {
                    steps {
                        echo 'iOS browser tests.'
                        echo 'iOS applications tests.'
                    }
                }
            }
        }
        stage('TEST::PROD::Regression') {
            steps {
                echo 'Regression tests.'
            }
        }
        stage('TEST::PROD::Performance') {
            steps {
                echo 'Performance tests.'
            }
        }
        stage('TEST::PROD::Info') {
            steps {
                timeout(time: 5, unit: 'DAYS') {
                    input message: 'Approve - Acceptance tests @PROD?'
                }
            }
        }
        stage('RELEASE::Activities') {
            parallel {
                stage('Tag products') {
                    steps {
                        echo 'Add tags to sources'
                    }
                }
                stage('Update the official site') {
                    steps {
                        echo 'Do smthng.'
                    }
                }
                stage('Update the docs') {
                    steps {
                        echo 'Do smthng.'
                    }
                }
                stage('Update the marketing articles') {
                    steps {
                        echo 'Do smthng.'
                    }
                }
            }
        }
        stage('DEPLOY::Activities') {
            parallel {
                stage('Web::AWS') {
                    steps {
                        echo 'Deliver the Product.'
                    }
                }
                stage('iOS::AppStore') {
                    steps {
                        echo 'Deliver the Product.'
                    }
                }
                stage('Android::PlayMarket') {
                    steps {
                        echo 'Deliver the Product.'
                    }
                }
            }
        }
    }
    post {
        always {
            echo 'Copy categories.json'
            sh(script: 'if [ ! -d ${WORKSPACE}/"allure-results" ]; then mkdir ${WORKSPACE}/"allure-results"; fi', returnStatus: true)
            sh(script: 'cp ${WORKSPACE}/"src/test/resources/categories.json" ${WORKSPACE}/"allure-results"', returnStatus: true)
            script {
                allure([
                        includeProperties: false,
                        jdk              : '/home/usr/lib/jvm/jdk-11.0.1',
                        properties       : [],
                        reportBuildPolicy: 'ALWAYS',
                        results          : [[path: 'allure-results']]
                ])
            }
        }
    }
}