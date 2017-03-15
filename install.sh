#!/bin/sh

set -e

uname=`uname`
# I need this because I'm using GNU utils with no alias, might change this later.
if [[ $uname == 'Darwin' ]]; then
  alias readlink='greadlink'
  alias ln='gln'
fi

echo 'updating submodules'
git submodule update --init --recursive

echo 'linking'
for file in .gitconfig .gitignore .tmux.conf .vimrc .vim .zshrc; do
  if  [ "$file" = '.gitconfig' ] && \
      [ "$USER" != 'schwar12' ] && \
      [ "$USER" != 'nonis' ] && \
      [ "$USER" != 'nawns' ]; then
    echo "not linking $file, it has my name in it!"
  else
    if [ "$(readlink -f "$HOME/$file")" != "$(readlink -f "$(pwd)/$file")" ]; then
      ln -i -s -T "$(pwd)/$file" "$HOME/$file"
      echo "linked $file"
    fi
  fi
done

cp z.sh ~/z.sh

