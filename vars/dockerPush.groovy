def call(String image, String repository) {
    sh "jfrog rt docker-push --build-name=${BUILD_NAME} --build-number=${BUILD_NUMBER} ${image} ${repository}"
}
