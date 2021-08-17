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
            }
        }
        stage("Deploy"){
            steps{
               
                 echo "Deploying...."

            }
        }
    }
    
}