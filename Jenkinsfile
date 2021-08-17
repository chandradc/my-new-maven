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
                    archiveArtifacts artifacts: '**/target/*.war'
                }
                failure{
                    echo "========Build execution failed========"
                }
            }
        }
        stage("Deploy to staging"){
            steps{
               
                 echo "Deploying...."
                 build job: 'deploy-war'

            }
        }
    }
    
}