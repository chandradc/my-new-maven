pipeline{
    agent {

     docker {
        image "maven:3-openjdk-11"
    
    }
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