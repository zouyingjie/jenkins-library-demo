import groovy.json.JsonSlurper

def info(message) {
    echo "INFO: ${message}"
}

def loadJson() {
    def config_text = libraryResource 'config.json'
    def jsonSlurper = new JsonSlurper()
    def config_object = jsonSlurper.parseText(config_text)
    echo "${config_object}"
    echo "${config_object.config.minio}"

}