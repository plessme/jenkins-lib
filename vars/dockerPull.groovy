def call(String image, String repository) {
    sh "jfrog rt docker-pull --build-name=${BUILD_NAME} --build-number=${BUILD_NUMBER} ${image} ${repository}"
}
