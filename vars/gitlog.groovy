def call() {
    sh "git --no-pager log $(git describe --tags --abbrev=0)..HEAD --pretty=oneline --no-decorate | awk '{$1=\"\"}1' | awk '{$1=$1}1'"
}