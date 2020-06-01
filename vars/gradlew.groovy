def call(String args = 'build') {
    sh "jfrog rt gradle --build-name=${BUILD_NAME} --build-number=${BUILD_NUMBER} -Pversion=${VERSION} -Porg.gradle.parallel=true ${args}"
}
