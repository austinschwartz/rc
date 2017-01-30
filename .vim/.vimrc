"Pathogen for easy bundle plugins
execute pathogen#infect()

"Syntax highlighting
syntax on

"Automatically indent, and turn on plugins
filetype plugin indent on

"Correct backspacing
set backspace=2

"Dracula theme
set t_Co=256
set background=dark
colorscheme dracula

"Display line numbers
set number

let g:neocomplete#enable_at_startup = 0

"Enable mouse and scrollwheel
set mouse=a
map <ScrollWheelUp> <C-Y>
map <ScrollWheelDown> <C-E>

"Set gutter/tab width
set expandtab
set tabstop=2
set shiftwidth=2

"Automatically indenting
set autoindent

"Alias W=w and Q=q and others
cnoreabbrev Q q
cnoreabbrev W w
cnoreabbrev WQ wq
cnoreabbrev wQ wq
cnoreabbrev Wq wq

"Turn on rainbow parens by default
"au VimEnter * RainbowParenthesesToggle
"au Syntax * RainbowParenthesesLoadRound
"au Syntax * RainbowParenthesesLoadSquare
"au Syntax * RainbowParenthesesLoadBraces

"Map jk to escape
inoremap jk <ESC>

"Hard mode
"autocmd VimEnter,BufNewFile,BufReadPost * silent! call HardMode()
"nnoremap <leader>h <Esc>:call ToggleHardMode()<CR>

"Bind backspace to flip between files
nnoremap <BS> <C-^>

"Remap split switch keys
nnoremap <C-J> <C-W><C-J>
nnoremap <C-K> <C-W><C-K>
nnoremap <C-L> <C-W><C-L>
nnoremap <C-H> <C-W><C-H>

"Map tab to tab complete in insert mode
"imap <Tab> <C-P>

"ctrl-p
let g:ctrlp_map = '<c-p>'
let g:ctrlp_cmd = 'CtrlP'

"Adds _ to word boundary list (so you can use ciw and get just one word in
"something like some_words_here)
set iskeyword-=_

"Show as much as possible of a wrapped line, instead of hiding it with @
"symbols
set display=lastline

"use w!! to go into sudo and save the file as root
cmap w!! w !sudo tee % >/dev/null

" Put plugins and dictionaries in this dir (also on Windows)
let vimDir = '$HOME/.vim'
let &runtimepath.=','.vimDir

" Keep undo history across sessions by storing it in a file
if has('persistent_undo')
  let myUndoDir = expand(vimDir . '/undodir')
  " Create dirs
  call system('mkdir ' . vimDir)
  call system('mkdir ' . myUndoDir)
  let &undodir = myUndoDir
  set undofile
endif

" Unbind the cursor keys in insert, normal and visual modes.
"for prefix in ['i', 'n', 'v']
  "for key in ['<Up>', '<Down>', '<Left>', '<Right>']
    "exe prefix . "noremap " . key . " <Nop>"
  "endfor
"endfor

" NerdTree stuff
map <C-n> :NERDTreeToggle<CR>

function! s:CloseIfOnlyControlWinLeft()
  if winnr("$") != 1
    return
  endif
  if (exists("t:NERDTreeBufName") && bufwinnr(t:NERDTreeBufName) != -1)
        \ || &buftype == 'quickfix'
    q
  endif
endfunction
augroup CloseIfOnlyControlWinLeft
  au!
  au BufEnter * call s:CloseIfOnlyControlWinLeft()
augroup END

let g:NERDTreeDirArrowExpandable = 'o'
let g:NERDTreeDirArrowCollapsible = 'x'
let g:NERDTreeWinPos = "right"
let g:NERDTreeDirArrows=0
" Start NERDTree
autocmd VimEnter * NERDTree
" " Go to previous (last accessed) window.
autocmd VimEnter * wincmd p

" needed for vimwiki
set nocompatible
filetype plugin on
