def call(Map params) {
    sh "docker build -t \${APP_NAME}:\${BUILD_NUMBER} ."
}
