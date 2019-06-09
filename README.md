# Encryption
An English text needs to be encrypted using the following encryption scheme. 
First, the spaces are removed from the text. Let L be the length of this text. 

For example, the sentence s = if man was meant to stay on the ground god would have given us roots , after removing spaces is 54 characters long. 54^(1/2) is between 7 and 8, so it is written in the form of a grid with 7 rows and 8 columns.

Then, characters are written into a grid:

ifmanwas  
meanttos          
tayonthe  
groundgo  
dwouldha  
vegivenu  
sroots


### Sample Input
have a nice day

### Sample Output 
hae and via ecy

### Explanation 
L=12, 12^(1/2)  is between 3 and 4. 

Rewritten with 3 rows and 4 columns:

have

anic

eday

### Sample Input
feed the dog    

### Sample Output 
fto ehg ee dd

### Explanation 
L=10, 10^(1/2)  is between 3 and 4. 

Rewritten with 3 rows and 4 columns:

feed

thed

og

### Sample Input
chillout

### Sample Output 
clu hlt io

### Explanation 
L=8, 8^(1/2)  is between 2 and 3. 

Rewritten with 3 columns and 3 rows (2*3=6<8 so we have to use 3x3.) 

chi

llo

ut
