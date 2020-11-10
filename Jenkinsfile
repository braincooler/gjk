pipeline {

  agent any

  stages {

    stage('Checkout Source') {
      steps {
        git url:'https://github.com/braincooler/gjk', branch:'master'
      }
    }

      stage("Build image") {
            steps {
                script {
                    myapp = docker.build("gjk").push
                }
            }
        }

      stage("Push image") {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
                            myapp.push("latest")
                            myapp.push("${env.BUILD_ID}")
                    }
                }
            }
        }


    stage('Deploy App') {
      steps {
        script {
          kubernetesDeploy(configs: "webdeploy.yml", kubeconfigId: "kubeconfig3")
        }
      }
    }

  }
}