#!/bin/sh

set -e

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

