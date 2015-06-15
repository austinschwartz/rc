#Z script for directory traversal
source z.sh

#Antigen
source ~/Documents/rc/antigen.zsh

antigen use oh-my-zsh

antigen bundle git
antigen bundle heroku
antigen bundle pip
antigen bundle lein
antigen bundle command-not-found

antigen bundle zsh-users/zsh-syntax-highlighting
antigen bundle zsh-users/zsh-history-substring-search

#Vim mode in the shell
antigen bundle sharat87/zsh-vim-mode
bindkey -v
#Binds jj to escape
bindkey -M viins ‘jj’ vi-cmd-mode

antigen theme dracula

antigen apply
