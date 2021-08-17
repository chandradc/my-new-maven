pipeline{
    agent{
        label "node"
    }
    stages{
        stage("Build"){
            steps{
                bat "mvn --version"
                bat "mvn clean install package"
            }
            post{
                always{
                   cleanWs()
                }
                success{
                    echo "========Build executed successfully========"
                }
                failure{
                    echo "========Build execution failed========"
                }
            }
        }
    }
    
}