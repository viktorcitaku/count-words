# count-words
## Count Words Code Comparison

The idea behind this was to compare the two languages Java and Go.

Now with Java we have new programming paradigm the functional programming and the other hand is Go-lang from Google with a more procedural paradigm.

Main functionality of both codes is to read from file called `in`. The read is done per line and each line is splitten with space delimeter, after that we store the words into map as key and as value is store the appearence time!
In the end after the above steps are finished as described, we will write into a file called `out`.

Basicaly it should look similar like this in the end, maybe with a slight difference in order:
`
Word: is | Appeared: 2
Word: Hello | Appeared: 2
Word: World | Appeared: 2
Word: day | Appeared: 3
`

___

### How to execute the code!

For java execute in cli:

`javac Main.java`

and then

`java Main.java`

---

For GO execute in cli:

`go run main.go`

___

### Requirements!

For Java `version: 1.8.0_131`

For GO `version 1.8.3`
