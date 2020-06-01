def call() {
    // load version from gradle.properties file
    // def properties = new Properties()
    // def propertiesFile = new File("${workspace}/gradle.properties")
    // def version = properties.load(propertiesFile.newDataInputStream())
    def version = '0.1.0'

    // determine the environment and repository name based on branch
    def environment = ''
    def repository = ''
    // if(env.BRANCH_NAME == 'master') {
    //     environment = 'integration'
    //     repository = 'rel'
    // }
    // if(env.BRANCH_NAME.startsWith('release/')) {
    //     environment = 'staging'
    //     repository = 'rc'
    //     version += "-rc-${BUILD_NUMBER}"
    // }
    // if(env.BRANCH_NAME == 'develop') {
    //     environment = 'develop'
    //     repository = 'develop'
    //     version += '-SNAPSHOT'
    // }
    // if(env.BRANCH_NAME.startsWith('feature/') || env.BRANCH_NAME.startsWith('bugfix/')) {
    //     repository = 'dev'
    //     def commit = "${GIT_COMMIT}"
    //     version = commit.substring(0, 7) 
    // }
    // if(env.BRANCH_NAME.startsWith('hotfix/')) {
    //     environment = 'integration'
    //     repository = 'rc'
    //     version += '-HOTFIX'
    // }

    // set determined values as environment variable
    // environment {
    //     VERSION = version
    //     ENV_NAME = environment
    //     REPO_NAME = repository
    // }
}