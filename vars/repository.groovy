def call() {
  def repo
  if(env.BRANCH_NAME == 'master') {
    repo = 'rel'
  }
  if(env.BRANCH_NAME.startsWith('release/')) {
    repo = 'rc'
  }
  if(env.BRANCH_NAME == 'develop') {
    repo = 'develop'
  }
  if(env.BRANCH_NAME.startsWith('feature/')) {
    repo = 'dev'
  }
  return repo
}
