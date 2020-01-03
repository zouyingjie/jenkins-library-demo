
def info(message) {
    echo "INFO: ${message}"
}

def loadJson() {
    def config = libraryResource 'config.json'
    echo "${config}"
    echo "${config.config.minio}"
}