def call() {
  def environment
  if(env.BRANCH_NAME == 'master') {
    environment = 'integration'
  }
  if(env.BRANCH_NAME.startsWith('release/')) {
    environment = 'staging'
  }
  if(env.BRANCH_NAME == 'develop') {
    environment = 'develop'
  }
  return environment
}
