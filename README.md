# say-number

Takes an integer in the range 0 to 999,999,999 inclusive and returns the 
equivalent number, as a String, in British English words

The algorithm is based on the observation that the 3 digit groups between 
the thousand separators are said the same way e.g. 'one hundred and 2'. 
The final string is then built by appending the appropriate magnitude
('millions', 'thousands') between the groups and putting the 'and's in 
the correct place.

|Input|Ouput|
|-----|-----|
|0|zero|
|1|one|
|21|twenty one|
|105|one hundred and five|
|123|one hundred and twenty three|
|1005|one thousand and five|
|1042|one thousand and forty two|
|1105|one thousand one hundred and five|
|56945781|fifty six million nine hundred and forty five thousand seven hundred and eighty one|
|999999999|nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine|
