def call(String version) {
  if(env.BRANCH_NAME == 'develop') {
    version += '-SNAPSHOT'
  }
  if(env.BRANCH_NAME.startsWith('release/')) {
    version += '-rc-' + env.BUILD_NUMBER
  }
  if(env.BRANCH_NAME.startsWith('feature/')) {
    commit = "${GIT_COMMIT}"
    version = commit.substring(0, 7)
  }
  return version
}
