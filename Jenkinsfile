pipeline{
    agent any

    stages{
        stage("Build"){
            steps{
                bat "mvn --version"
                bat "mvn clean package"
            }
            post{
                always{
                   cleanWs()
                }
                success{
                    echo "archiving artifacts ......."
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }
        stage("Deploy"){
            steps{
               
                 echo "Deploying...."

            }
        }
    }
    
}