"Pathogen for easy bundle plugins
execute pathogen#infect()

"Syntax highlighting
syntax on

"Automatically indent, and turn on plugins
filetype plugin indent on

"Dracula theme
set background=dark
colorscheme dracula

"Auto completion
let g:neocomplete#enable_at_startup = 1
set completeopt-=preview

"Display line numbers
set number

"Enable mouse and scrollwheel
set mouse=a
map <ScrollWheelUp> <C-Y>
map <ScrollWheelDown> <C-E>

"Set gutter/tab width
set expandtab
set tabstop=2
set shiftwidth=2

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

"NerdTree mapping
map <C-n> :NERDTreeToggle<CR>

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

"VimClojure stuff
let g:vimclojure#HighlightBuiltins = 1
let g:vimclojure#ParenRainbow = 1
