# count-words
## Count Words Code Comparison

Now with Java, we have new programming paradigm the functional programming, and the other hand is Go with a more procedural paradigm.

The main functionality of both codes is to read from a file called `in`. The file is read line by line, and each line is split with space delimiter, after that we store the words into a map as key and as a value we store the appearance time!
In the end, we write into a file called `out`.

In the end, It should look similar like this, maybe with a slight difference in order:

```

Word: is | Appeared: 2

Word: Hello | Appeared: 2

Word: World | Appeared: 2

Word: day | Appeared: 3

```

___

### How to execute the code!

For Java execute in cli:

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
