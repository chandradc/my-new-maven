pipeline{
    agent any

    stages{
        stage("Build"){
            steps{
                bat "mvn --version"
                bat "mvn clean package"
            }
            post{
                success{
                    echo "archiving artifacts ......."
                    archiveArtifacts artifacts: '**/*.war'
                }
                failure{
                    echo "========Build execution failed========"
                }
            }
        }
        stage("Deploy to staging"){
            steps{
                timeout(time:5, unit:'MINUTES'){
                    input message: 'Approve the deployment to PROCEED'
                }
               
                 echo "Deploying...."
                 build job: '1015-deployJob'

            }
            post{
                success{
                    echo "Code deployed to tomcat successfully"
                }
                failure{
                    echo "Deploy to staging failed"
                }
            }
        }
    }
}
