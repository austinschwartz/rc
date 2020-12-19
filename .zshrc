#Z script for directory traversal
source ~/rc/z.sh

#Antigen
source ~/rc/antigen.zsh

antigen use oh-my-zsh

antigen bundle git
antigen bundle heroku
antigen bundle pip
antigen bundle lein
antigen bundle command-not-found

antigen bundle zsh-users/zsh-syntax-highlighting
antigen bundle zsh-users/zsh-history-substring-search

antigen theme dracula/zsh dracula

antigen apply
export PGDATA=/usr/local/var/postgres

# Find MEM hogs
alias mht='top -l 1 -o rsize | head -20'
alias mhp='ps wwaxm -o pid,stat,vsize,rss,time,command | head -10'
 
# Find CPU hogs
alias ch='ps wwaxr -o pid,stat,%cpu,time,command | head -10'

alias tmux tmux -u

function give-template() {
  MAIN="https://raw.githubusercontent.com/nonis3/Competitive-Programming/master/UVA/Main.java"
  OUTFILE="Main.java"
  if [ "$#" -eq 1 ]; then
    OUTFILE=$1
  fi
  curl "$MAIN" 2> /dev/null > "$OUTFILE"
  echo "$OUTFILE made! :)"
}
