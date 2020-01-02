def call() {
    pipeline {
        agent any
    }

    stages {
        stage ("First Stage"){
            steps {
                echo "This is First Stage"
            }
        }

        stage ("Second Stage"){
            steps {
                echo "This is Second Stage"
            }
        }
    }
}